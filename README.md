# MBRP
Model-Based Requirements Prioritization using PageRank

This work resulted in the following publications:

[1] Abbas, M., Inayat, I., Saadatmand, M., & Jan, N. (2019, April). Requirements Dependencies-Based Test Case Prioritization for Extra-Functional Properties. In 2019 IEEE International Conference on Software Testing, Verification and Validation Workshops (ICSTW) (pp. 159-163). IEEE.

[2] Abbas, M., Inayat, I., Jan, N., Saadatmand, M., Paul, E., & Sundmark, D. (2019) MBRP: Model-based Requirements Prioritization Using PageRank Algorithm. Accepted In 2019 APSEC: The 26th Asia-Pacific Software Engineering Conference

IDE Used:    
	
	Eclipse Modeling Tools, Version: Photon Release (4.8.0), Build id: 20180619-1200 with 
	Sirius Properties Views - Specifier Support	6.0.1.201808231529
    Sirius Samples	6.0.1.201808231529
    Sirius Specifier Environment	6.0.1.201808231529

# Concrete Syntax Setup
1) Import the pk.nu.mbrp meta-model project into your eclipse workspace
2) Generate code for the meta-model (by clicking on generate code for all in properties window of the meta-model)
3) Run the editor (se.nu.mbrp.editior) code as an eclipse application (this action will launch the Runtime workspace (RW))
4) In the RW import the concrete syntax specification project (pk.nu.mbrp.design project) 
5) In the RW import the samples.cs project and open the sample concrete syntax

# MBRP in Action
1) Import the pk.nu.mbrp.ranker into your workspace
2) Run the GUIController.java as java application
3) A GUI will pop up
4) Type the path of your desired model and click the Rank button to rank the requirements

# Generating Models from CSV File
A sample CSV file can be found in the models directory. The CSV file is parsed by the tool and a model is generated in the desired folder. Note that all the paths are relative to the current project (pk.nu.mbrp.ranker).
