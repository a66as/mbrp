package pk.nu.mbrp.ranker;
/*
 * @author Muhammad Abbas
 */
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import pk.nu.mbrp.ranker.ModelHelper;
public class GUIController extends Frame implements ActionListener,WindowListener {
	private static final long serialVersionUID = -6192429516073133029L;
	private Label lblCsv;    // Declare a Label component 
	private TextField tfLinkCsv; // Declare a TextField component
	private TextField tfLinkModel;
	private Button btnLoadCsv;   // Declare a Button component
	private Button btnLoadModel;
	private Label lblModel;
	private Button btnPageRank;
	private Button btnReset;
	private Button btnPrintSortedList;
	private Label lblLoadedModel;
	private Label lblOutput;
	private TextField tfOutput;
	private Label lblLoadStatus;
	private ModelHelper helper;
	public static void main(String[] args) {
		GUIController gui= new GUIController();

	}
	private GUIController() {
		helper=ModelHelper.getIns();
		setLayout(new GridLayout(8, 2));
		Panel row1= new Panel();
		Panel row1_1= new Panel();
		Panel sep1= new Panel();
		Panel sep2= new Panel();
		Panel row2= new Panel();
		Panel row3= new Panel();
		Panel sep3= new Panel();
		lblCsv= new Label("Create Model from CSV:");
		row1.add(lblCsv);
		tfLinkCsv= new TextField("models/test.csv", 30);
		row1.add(tfLinkCsv);
		btnLoadCsv= new Button("Create");
		lblOutput= new Label("Output Path with out extension:");
		row1_1.add(lblOutput);
		tfOutput=new TextField("models/output");
		row1_1.add(tfOutput);
		row1_1.add(btnLoadCsv);
		lblModel= new Label("Load MBRP Model File:");
		row2.add(lblModel);
		tfLinkModel= new TextField("models/tests.mbrp", 30);
		row2.add(tfLinkModel);
		btnLoadModel= new Button("Load");
		row2.add(btnLoadModel);
		add(row1);
		add(row1_1);
		sep1.add(new Label("------------------------------------------------------------------------------------------------------------------"));
		add(sep1);
		add(row2);
		sep2.add(new Label("------------------------------------------------------------------------------------------------------------------"));
		add(sep2);
		lblLoadedModel= new Label("Actions on Loaded Model:");
		btnPageRank= new Button("PageRank");
		btnReset= new Button("Reset");
		row3.add(lblLoadedModel);
		row3.add(btnPageRank);
		btnPrintSortedList= new Button("Print");
		row3.add(btnPrintSortedList);
		row3.add(btnReset);
		add(row3);
		sep3.add(new Label("------------------------------------------------------------------------------------------------------------------"));
		add(sep3);
		Panel row4= new Panel();
		lblLoadStatus= new Label("Loaded Model: NULL                          ");
		row4.add(lblLoadStatus);
		add(row4);
		disableActions();
		btnLoadModel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				helper.dispose();
				if(helper.loadModel(tfLinkModel.getText()))
	            {
					enableActions();
	            	btnPageRank.setEnabled(true);
	            	btnReset.setEnabled(true);
		    	 	JOptionPane.showMessageDialog(null, "Model Loaded, Actions can be performed now!", "Loaded", JOptionPane.INFORMATION_MESSAGE);
		    	 	lblLoadStatus.setText("Loaded Model: "+helper.getLoadedModelPath());
	            }
	            else
	            {
	            	disableActions();
	            	JOptionPane.showMessageDialog(null, "ERROR! While loading the model.", "ERROR", JOptionPane.ERROR_MESSAGE);
	            }
			}
		});
		
		btnPageRank.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					helper.prioritizePageRank();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		});
		
		btnReset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					helper.resetModelPriorities();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		});
		btnLoadCsv.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				helper.dispose();
				String csv= tfLinkCsv.getText();
				String output= tfOutput.getText();
				helper.loadModelFromCSV(csv, output);
			}
		});
		btnPrintSortedList.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				helper.printSortedList();
				
			}
		});
		this.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent arg0) {
				
			}
			
			@Override
			public void windowIconified(WindowEvent arg0) {
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent arg0) {
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent arg0) {
				
			}
			
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
			}
			
			@Override
			public void windowClosed(WindowEvent arg0) {
				
			}
			
			@Override
			public void windowActivated(WindowEvent arg0) {
				
			}
		});
		setTitle("MBRP GUI");  // "super" Frame sets its title
		setSize(500, 200); // "super" Frame sets its initial window size
		pack();
		setVisible(true);
	}
	@Override
	public void windowActivated(WindowEvent arg0) {
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
	@Override
	public void windowClosing(WindowEvent arg0) {
		
	}
	private void enableActions() {
		btnPageRank.setEnabled(true);
    	btnReset.setEnabled(true);	
    	btnPrintSortedList.setEnabled(true);
	}
	private void disableActions() {
		btnPageRank.setEnabled(false);
    	btnReset.setEnabled(false);	
    	btnPrintSortedList.setEnabled(false);
	}
}
