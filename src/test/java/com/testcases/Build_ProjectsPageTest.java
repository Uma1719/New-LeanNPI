package com.testcases;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.Build_ProjectsPage;
import com.pages.DashBoardPage;
import com.pages.LoginPage;
import com.util.TestUtil;

public class Build_ProjectsPageTest extends TestBase{
	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	TestUtil testUtil;
	Build_ProjectsPage projectsPage;

	public Build_ProjectsPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		dashBoardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		projectsPage= new Build_ProjectsPage();
	}

	@Test
	public void ProjectsPage_Verification_Test() {
		dashBoardPage.clickOnProjectsLink();
		projectsPage.verify_ProjectsPage();
		Reporter.log("Projects Page Verified Successfully",true);
	}
	
	@Test
	public void Create_Project_Test() throws Exception {
		dashBoardPage.clickOnProjectsLink();
		projectsPage.verify_Create_Project("Demo Project", "AIRBUS", "This is test project", "5000", "Demo Project");
		Reporter.log("Project created successfully", true);
	}
	
	@Test
	public void Add_Stages_to_Project_Test() throws Exception {
		dashBoardPage.clickOnProjectsLink();
		projectsPage.verify_add_Stages_to_project("Project/Stages", "AIRBUS", "Project with stages", "Stage 1", "10", "8");
		Reporter.log("Stage Added successfully", true);
	}
	
	@Test
	public void Add_Peoples_to_Project_Test() throws Exception {
		dashBoardPage.clickOnProjectsLink();
		projectsPage.verify_Add_People_to_Project_and_Stage("Project/Add People", "Adding peoples to project", "Airbus", "Stage 1", "valuechain");
		Reporter.log("People Added to Project and Stage successfully", true);
	}
	
	@Test
	public void Upload_Files_to_Project_Test() throws Exception {
		dashBoardPage.clickOnProjectsLink();
		projectsPage.verify_Upload_File_to_Project("Project/Upload Files", "uploading files to project");
		Reporter.log("Files Uploaded to the project successfully", true);
	}
	
	@Test(dependsOnMethods="Add_Peoples_to_Project_Test")
	public void Delete_Added_Peoples_to_Project_Test() throws Exception {
		dashBoardPage.clickOnProjectsLink();
		projectsPage.verify_Delete_Added_Peoples_from_Project("Add People");
		Reporter.log("Peoples deleted from the project is functional", true);
	}
	
	@Test(dependsOnMethods="Add_Peoples_to_Project_Test")
	public void Remove_Uploaded_Files_from_Project_Test() throws Exception {
		dashBoardPage.clickOnProjectsLink();
		projectsPage.verify_Remove_Uploaded_Files_from_Project("Upload Files");
		Reporter.log("Uploaded files deleted from the project is functional", true);
	}
	
	@Test(dependsOnMethods="Add_Stages_to_Project_Test")
	public void Export_Stages_into_Templates_Test() {
		dashBoardPage.clickOnProjectsLink();
		projectsPage.verify_Export_Stages_into_Templates("Stages", "Temp1");
		Reporter.log("Stages exported into templates successfully", true);
	}
	
	@Test(dependsOnMethods="Add_Stages_to_Project_Test")
	public void Please_enter_template_name_error_message_Test() throws Exception {
		dashBoardPage.clickOnProjectsLink();
		projectsPage.verify_Please_enter_template_name_error_message("Stages");
		Reporter.log("'Please enter template name' error message displayed successfully", true);
	}
	
	@Test(dependsOnMethods="Export_Stages_into_Templates_Test")
	public void Import_Template_Functionality_Test() throws Exception {
		dashBoardPage.clickOnProjectsLink();
		projectsPage.verify_Import_Template_Functionality("Project/Import Templates", "Stages importing from template", "Temp1");
		Reporter.log("Template Imported Successfully", true);
	}
	
	@Test
	public void Add_Parts_to_the_Project_Test() throws Exception {
		dashBoardPage.clickOnProjectsLink();
		projectsPage.verify_Add_Parts_to_the_Project("Project/Add Parts", "Addings Parts to Projects", "PART 1", "Dimensions Issue", "Fixing", "Order Confirmed",
				"5000", "Part Discipline", "1234", "Airbus", "Damaged", "New Part", "10000", "Medium", "Delayed", "Google", "https://www.google.com/");
		Reporter.log("Parts Added to the Project Successfully", true);
	}
	
	@Test
	public void Error_Message_When_Upload_File_and_Add_Link_without_Part_No_Test() throws Exception {
		dashBoardPage.clickOnProjectsLink();
		projectsPage.verify_Error_Message_When_Upload_File_and_Add_Link_without_Part_No("Project/Adding File or Link without Part No.", 
				"Verifying error message when uploading img or adding link without part no.", 
				"Google", "https://www.google.com/");
		Reporter.log("Error message verified successfully while Uploading file or Adding link without part no.", true);
	}
	
	@Test(dependsOnMethods="Add_Parts_to_the_Project_Test")
	public void Delete_Uploaded_img_and_Added_Link_Test() throws Exception {
		dashBoardPage.clickOnProjectsLink();
		projectsPage.verify_Delete_Uploaded_img_and_Added_Link("Add Parts");
		Reporter.log("Added Immage and Link Deleted Successfully", true);
	}
	
	@Test(dependsOnMethods="Add_Parts_to_the_Project_Test")
	public void Download_Parts_Template_Test() throws Exception {
		dashBoardPage.clickOnProjectsLink();
		projectsPage.verify_Download_Parts_Template("Add Parts");
		Reporter.log("Parts Template Downloaded Successfully", true);
	}
	
	@Test(dependsOnMethods="Add_Parts_to_the_Project_Test")
	public void Upload_Parts_Template_Test() throws Exception {
		dashBoardPage.clickOnProjectsLink();
		projectsPage.verify_Upload_Parts_Template("Add Parts");
		Reporter.log("Parts Template Uploaded Successfully", true);
	}
	
	@Test(dependsOnMethods="Upload_Parts_Template_Test")
	public void Export_Parts_Table_To_Excel_Test() throws Exception {
		dashBoardPage.clickOnProjectsLink();
		projectsPage.verify_Export_Parts_Table_To_Excel("Add Parts");
		Reporter.log("Parts table exported to excel successfully", true);
	}
	
	@Test(dependsOnMethods="Add_Parts_to_the_Project_Test")
	public void Edit_Parts_functionality_Test() throws Exception {
		dashBoardPage.clickOnProjectsLink();
		projectsPage.verify_Edit_Parts_functionality("Add Parts", "4321");
		Reporter.log("Parts edited Successfully", true);
	}
	
	@Test(dependsOnMethods="Upload_Parts_Template_Test")
	public void Delete_Parts_functionality_Test() throws Exception {
		dashBoardPage.clickOnProjectsLink();
		projectsPage.verify_Delete_Parts_functionality("Add Parts");
		Reporter.log("Part Deleted Successfully", true);
	}
	
	@Test(dependsOnMethods={"Add_Stages_to_Project_Test","Export_Stages_into_Templates_Test","Please_enter_template_name_error_message_Test"})
	public void Edit_Stage_Test() throws Exception {
		dashBoardPage.clickOnProjectsLink();
		projectsPage.verify_Edit_Stage("Stages", "Stage 2");
		Reporter.log("Stages Edited Successfully", true);
	}
	
	@Test(dependsOnMethods="Edit_Stage_Test")
	public void Delete_Stage_Test() throws Exception {
		dashBoardPage.clickOnProjectsLink();
		projectsPage.verify_Delete_Stage("Stages");
		Reporter.log("Stages Deleted Successfully", true);
	}
	
	@Test(dependsOnMethods="Create_Project_Test")
	public void Edit_Project_Test() throws Exception {
		dashBoardPage.clickOnProjectsLink();
		projectsPage.verify_Edit_Project("Demo Project");
		Reporter.log("Stages Deleted Successfully", true);
	}
	
	@Test(dependsOnMethods="Edit_Project_Test")
	public void Launch_Project_Test() throws Exception {
		dashBoardPage.clickOnProjectsLink();
		projectsPage.verify_Launch_Project("Demo Project");
		Reporter.log("Project Launched Successfully and Notification email has been sent", true);
	}
	
	@Test(dependsOnMethods="Launch_Project_Test")
	public void Delete_Project_Test() throws Exception {
		dashBoardPage.clickOnProjectsLink();
		projectsPage.verify_Delete_Project("Demo Project");
		Reporter.log("Project Deleted Successfully", true);
	}
	
	@Test
	public void Filter_Option_Test() throws Exception {
		dashBoardPage.clickOnProjectsLink();
		projectsPage.verify_Filter_Option();
		Reporter.log("All Filter Options are Functional", true);
	}
	
	@Test
	public void Project_for_Track_test() throws Exception {
		dashBoardPage.clickOnProjectsLink();
		projectsPage.Create_project_for_Track("DEMO", "AIRBUS", "This is test project", "5000", "D:\\Value chain\\Images\\test.jpeg", 
				"Stage 1", "10", "8", "D:\\Value chain\\Images\\Aerospace Engineering.jpg", 
				"PART 1", "Dimensions Issue", "Fixing", "Order Confirmed", "5000", "Part Discipline", "1234", "Airbus", "Damaged", 
				"New Part", "10000", "Medium", "Delayed", "Google", "https://www.google.com/", "D:\\Value chain\\Images\\aeroindia.jpg");
		Reporter.log("Project for Track is created successfully", true);
	}
	
	@Test
	public void Create_project_for_Unconditional_completion_Test() throws Exception {
		dashBoardPage.clickOnProjectsLink();
		projectsPage.verify_Create_project_for_Unconditional_completion("Complete me", "Project for Unconditional completion", "S1", "P1");
		Reporter.log("Project created for Unconditional completion", true);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
