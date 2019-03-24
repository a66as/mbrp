package pk.nu.mbrp.ranker;
/*
 * @author Muhammad Abbas
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import se.nu.mbrp.MbrpFactory;
import se.nu.mbrp.MbrpPackage;
import se.nu.mbrp.Requirement;
import se.nu.mbrp.RequirementRelationship;
import se.nu.mbrp.RequirementRelationshipType;
import se.nu.mbrp.RequirementsModel;
import se.nu.mbrp.StakeholderPriority;

public class ModelHelper {
private static ModelHelper ins=null;
private static RequirementsModel loadedModel;
private static String loadedModelPath="";
private static ResourceSet RESOURCE_SET=new ResourceSetImpl();
	private ModelHelper()
	{
		
	}
	public static ModelHelper getIns()
	{
		if(ins==null)
		{
			ins= new ModelHelper();
		}
		return ins;
	}
	public String getLoadedModelPath()
	{
		return loadedModelPath;
	}
	public boolean loadModel(String mbrpPath) {
		if(loadedModel!=null && loadedModelPath!="")
		{
			dispose();
		}
		URI modelUri = URI.createURI(mbrpPath);
		registerPackages(RESOURCE_SET);
		registerResourceFactories();
		String relPath = null;
		try {
			relPath = new File(".").getCanonicalPath();
		} catch (IOException e1) {
			return false;
		}
		org.eclipse.emf.ecore.resource.Resource resource = null;
		try {	
			resource = RESOURCE_SET.getResource(modelUri, true);
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}


		RequirementsModel _model = (RequirementsModel) EcoreUtil.getObjectByType(resource.getContents(), MbrpPackage.Literals.REQUIREMENTS_MODEL);
		if (_model == null) {
			loadedModel = (RequirementsModel) resource.getContents().get(0);
		}
		else
		{
			loadedModel= _model;
		}
		loadedModelPath=mbrpPath;
		return true;
	}
	private static void registerResourceFactories() 
	{
		Map extensionFactoryMap = org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();		  
		extensionFactoryMap.put("mbrp", new XMIResourceFactoryImpl());
	}

	private static void registerPackages(ResourceSet resourceSet) 
	{
		Map packageRegistry = resourceSet.getPackageRegistry();
		packageRegistry.put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		packageRegistry.put(MbrpPackage.eNS_URI, MbrpPackage.eINSTANCE);
	}
	private static void printLoadedModel()
	{
		System.out.println("Requirements");
		for(Requirement r: loadedModel.getOwnedRequirement())
		{
			System.out.print(r.getId()+": "+r.getDescription()+" ");
			System.out.print(" -> Links: ");
			for(RequirementRelationship rl:r.getRelatedRequirements())
			{
				System.out.print("--"+rl.getType().getLiteral()+"-->"+rl.getTargetRequirement().getId());
			}
			System.out.println();
		}
	}
	public boolean prioritizePageRank() throws IOException
	{
		if(loadedModel==null)
			return false;
		else
		{
			for(Requirement r: loadedModel.getOwnedRequirement())
			{
				double sizeby=loadedModel.getOwnedRequirement().size()/1.6;
				double sizeFactor= loadedModel.getOwnedRequirement().size()*sizeby;
				r.setMbrpPriority(r.getMbrpPriority()+sizeFactor/loadedModel.getOwnedRequirement().size());
				double moscowp=1.0;
				double riskContribution=1.0;
				double costContribution=1.0;
				if(r.getPriority().getLiteral().toString().equals(new String("MustHave")))
					moscowp=9.0;
				else if(r.getPriority().getLiteral().toString().equals(new String("ShouldHave")))
					moscowp=6.0;
				else if(r.getPriority().getLiteral().toString().equals(new String("CouldHave")))
					moscowp=3.0;
				riskContribution=(1.0+r.getBusinessValue())/(r.getRiskFactor()+1.0);
				costContribution=(1.0+r.getBusinessValue())/(1.0+r.getCost());
				double tempTotal= riskContribution+costContribution+moscowp;
				r.setMbrpPriority(r.getMbrpPriority()+tempTotal);
				
			}
			
			for(Requirement r: loadedModel.getOwnedRequirement())
			{
				for(RequirementRelationship link: r.getRelatedRequirements())
				{
					double linkContribution=r.getMbrpPriority()/r.getRelatedRequirements().size();
					if(link.getType().getLiteral().toString().equals(new String("Conflicts")))
					{
						if(r.getMbrpPriority()>link.getTargetRequirement().getMbrpPriority())
							link.getTargetRequirement().setMbrpPriority(link.getTargetRequirement().getMbrpPriority()-(linkContribution/2));
						else
						{
							linkContribution=linkContribution/2;
							r.setMbrpPriority(r.getMbrpPriority()+linkContribution);
						}
					}
					else
					{
						link.getTargetRequirement().setMbrpPriority(link.getTargetRequirement().getMbrpPriority()+linkContribution);
					}
				}
			}
			if(physicalSave(loadedModel, URI.createURI(loadedModelPath)))
				return true;
			else return false;
		}
	}
	public boolean resetModelPriorities() throws IOException {
		if(loadedModel==null)
			return false;
		else
		{
			for(Requirement r: loadedModel.getOwnedRequirement())
			{
				r.setMbrpPriority(0.0);
			}
			if(physicalSave(loadedModel, URI.createURI(loadedModelPath)))
				return true;
			else return false;
		}
		
	}
	@SuppressWarnings("deprecation")
	public boolean loadModelFromCSV(String csvFile, String outputPath)
	{
		if(loadedModel!=null && loadedModelPath!="")
		{
			dispose();
		}
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
        	ArrayList<String> ids= new ArrayList<String>();
        	ArrayList<ReqLink> links= new ArrayList<ReqLink>();
        	MbrpFactory factory= MbrpFactory.eINSTANCE;
        	loadedModel= factory.createRequirementsModel();
            while ((line = br.readLine()) != null) {
            	if(!line.startsWith("ID")&&!line.endsWith("Value") && line.length()>8)
            	{
            		Requirement tobe=null;
            		String[] lineParts = line.split(cvsSplitBy);
            		if(lineParts[4].equals(new String("Functional")))
            		{
            			tobe=factory.createFunctionalRequirement();
            		}
            		else if(lineParts[4].equals(new String("SecurityRequirement")))
            		{
            			 tobe=factory.createSecurityRequirement();
            		}
            		else if(lineParts[4].equals(new String("PerformanceRequirement")))
            		{
            			 tobe=factory.createPerformanceRequirement();
            		}
            		else if(lineParts[4].equals(new String("RobustnessRequirement")))
            		{
            			 tobe=factory.createRobustnessRequirement();
            		}
            		else if(lineParts[4].equals(new String("SafetyRequirement")))
            		{
            			 tobe=factory.createSafetyRequirement();
            		}
            		if(tobe==null)
            			return false;
            		if(ids.contains(new String(lineParts[0])))
            		{
            			System.out.println("Duplicate IDs Detected...");
            			return false;
            		}
            		tobe.setId(lineParts[0]);
            		ids.add(lineParts[0]);
            		//index 1 title
            		tobe.setTitle(lineParts[1]);
            		// index 2 Dependencies to be coded latter
            		String relationShips[]=lineParts[2].split("/");
            		if(relationShips.length>0)
            		{
            			for(String s:relationShips)
            			{
            				ReqLink tobeLink= new ReqLink();
            				if(s.length()>6)
            				{
            					if(s.contains("Derives ") || s.contains("Conflicts ") || s.contains("Depends ") || s.contains("Refines "))
            					{
            						tobeLink.srcID= tobe.getId();
            						String sParts[]=s.split(" ");
            						if(sParts[0]!=null && sParts[0].equals(new String("Derives")) && sParts[1]!=null)
            						{
            							tobeLink.dstID=sParts[1];
            							tobeLink.type=RequirementRelationshipType.DERIVES;
            						}
            						else if(sParts[0]!=null && sParts[0].equals(new String("Depends")) && sParts[1]!=null)
            						{
            							tobeLink.dstID=sParts[1];
            							tobeLink.type=RequirementRelationshipType.DEPENDS;
            						}
            						else if(sParts[0]!=null && sParts[0].equals(new String("Conflicts")) && sParts[1]!=null)
            						{
            							tobeLink.dstID=sParts[1];
            							tobeLink.type=RequirementRelationshipType.CONFLICTS;
            						}
            						else if(sParts[0]!=null && sParts[0].equals(new String("Refines")) && sParts[1]!=null)
            						{
            							tobeLink.dstID=sParts[1];
            							tobeLink.type=RequirementRelationshipType.REFINES;
            						}
            						if(tobeLink.srcID!="" && tobeLink.dstID!="" && tobeLink.dstID.length()>1)
            						{
            							links.add(tobeLink);
            						}
            					}
            				}
            			}
            		}
            		//index 3 desc.
            		tobe.setDescription(lineParts[3]);
            		//index 4 is type and is checked
            		//index 5 Stakeholder Priority
            		if(lineParts[5].equals(new String("MustHave")))
            			tobe.setPriority(StakeholderPriority.MUST_HAVE);
            		else if(lineParts[5].equals(new String("CouldHave")))
            			tobe.setPriority(StakeholderPriority.COULD_HAVE);
            		else if(lineParts[5].equals(new String("ShouldHave")))
            			tobe.setPriority(StakeholderPriority.SHOULD_HAVE);
            		Double temp=0.0;
            		// index 6 risk
            		if(lineParts[6]!=null && lineParts[6]!="")
            			temp= new Double(lineParts[6]);
            		if(temp>0.0 && temp<10.0)
            			tobe.setRiskFactor(temp);
            		//index 7 Cost
            		temp=0.0;
            		if(lineParts[7]!=null && lineParts[7]!="")
            			temp= new Double(lineParts[7]);
            		if(temp>0.0 && temp<10.0)
            			tobe.setCost(temp);
            		// index 8 business value
            		temp=0.0;
            		if(lineParts[8]!=null && lineParts[8]!="")
            			temp= new Double(lineParts[8]);
            		if(temp>0.0 && temp<10.0)
            			tobe.setBusinessValue(temp);
            		loadedModel.getOwnedRequirement().add(tobe);
            	}
            }
            loadedModelPath=outputPath+".mbrp";
            br.close();
            //populating relationships to its sources and targeting the links
            for(ReqLink link:links)
            {
            	for(Requirement r: loadedModel.getOwnedRequirement())
            	{
            		if(r.getId().equals(link.srcID))
					{
						for(Requirement rr:loadedModel.getOwnedRequirement())
						{
							if(rr.getId().equals(link.dstID))
							{
								RequirementRelationship linkTobe= factory.createRequirementRelationship();
								linkTobe.setTargetRequirement(rr);
								linkTobe.setType(link.type);
								r.getRelatedRequirements().add(linkTobe);
							}
						}
					}
            	}
            }
            if(physicalSave(loadedModel, URI.createURI(loadedModelPath)))
            	return true;
            else
            	return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

	}
	private static boolean physicalSave(RequirementsModel rm, URI uri) throws IOException {
		File file= new File(uri.toString());
		if(!file.createNewFile())
		{
			file.delete();
		}
		file.createNewFile();
		Resource resource = new ResourceSetImpl().createResource(uri);
		if(resource==null)
		{
			resource=new XMIResourceImpl(uri);
		}
		resource.getContents().add(rm);
		try {
			resource.save(null);
			System.out.println("Saved .....");
			return true;
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return false;
		}
	}
	public static void dispose()
	{
		loadedModelPath="";
		loadedModel=null;
		RESOURCE_SET=new ResourceSetImpl();
	}
	public void printSortedList() {
		if(loadedModel!=null && loadedModelPath!="")
		{
			ECollections.sort(loadedModel.getOwnedRequirement(), new Comparator<Requirement>() {

				@Override
				public int compare(Requirement r1, Requirement r2) {
					if(r1.getMbrpPriority()==r2.getMbrpPriority())  
						return 0;  
					else if(r1.getMbrpPriority()>r2.getMbrpPriority())  
						return -1;  
					else  
						return 1;  
				}
			});
			for(Requirement r:loadedModel.getOwnedRequirement())
			{
				System.out.println(r.getId()+": "+r.getMbrpPriority());
			}
		}
		
	}
}
