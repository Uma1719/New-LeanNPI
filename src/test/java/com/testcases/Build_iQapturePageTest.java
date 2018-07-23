package com.testcases;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.Build_iQapturesPage;
import com.pages.DashBoardPage;
import com.pages.LoginPage;
import com.util.TestUtil;

public class Build_iQapturePageTest extends TestBase{
	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	TestUtil testUtil;
	Build_iQapturesPage iQapturePage;

	public Build_iQapturePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		dashBoardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		iQapturePage= new Build_iQapturesPage();
	}

	@Test
	public void iQapturePage_Verification_Test() {
		dashBoardPage.clickOniQaptureslink();
		iQapturePage.verify_iQapturePage();
		Reporter.log("iQapture Page Verified Successfully",true);
	}

	@Test(dependsOnMethods="iQapturePage_Verification_Test")
	public void Create_Questionnaire_Test() {
		dashBoardPage.clickOniQaptureslink();
		iQapturePage.verify_Create_Questionnaire("Test Questionnaire", "Test Questionnaire");
		Reporter.log("Questionnaire Created Successfully", true);
	}

	@Test(dependsOnMethods="iQapturePage_Verification_Test")
	public void verify_error_message_on_creating_questionnaire_without_entering_name_Test() {
		dashBoardPage.clickOniQaptureslink();
		iQapturePage.verify_error_message_on_creating_questionnaire_without_entering_name();
		Reporter.log("'Please enter Questionnaires Name.' error message verified successfully", true);
	}

	@Test(dependsOnMethods="iQapturePage_Verification_Test")
	public void Upload_image_to_questionnaire_Test() throws Exception {
		dashBoardPage.clickOniQaptureslink();
		iQapturePage.verify_Upload_image_to_questionnaire("Q/Upload Image", "D:\\Value chain\\Images\\test.jpeg");
		Reporter.log("Image uploaded to the Questionnaire successfully", true);
	}

	@Test(dependsOnMethods="iQapturePage_Verification_Test")
	public void Create_fields_to_questionnaire_Test() throws Exception {
		dashBoardPage.clickOniQaptureslink();
		iQapturePage.verify_Create_fields("Q/Create Fields", "Text_SmallBox", "Text_LargeBox", "Date", "Upload File", 
				"Advanced", "Section", "Number", "MultiChoice", "Activity");
		Reporter.log("Fields created to the Questionnaire successfully", true);
	}

	@Test(dependsOnMethods="iQapturePage_Verification_Test")
	public void Text_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOniQaptureslink();
		iQapturePage.verify_Text_Questionnaire("Q/Text", "Text_SmallBox", "Text_LargeBox");
		Reporter.log("Text Questionnaire created successfully", true);
	}

	@Test(dependsOnMethods="iQapturePage_Verification_Test")
	public void Advanced_settings_for_Text_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOniQaptureslink();
		iQapturePage.verify_Advanced_settings_for_Text("Q/Text/Advanced Settings", "Level 1", "L1 Hint", "Level 2", "L2 Hint", 
				"Level 3", "L3 Hint", "Level 4", "L4 Hint", "Level 5", "L5 Hint", "Number Manual", "Q6", "Hint", "Number None", "Hint");
		Reporter.log("Advanced settings for Text Questionnaire are functional", true);
	}

	@Test(dependsOnMethods="iQapturePage_Verification_Test")
	public void MultiChoice_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOniQaptureslink();
		iQapturePage.verify_MultiChoice_Questionnaire("Q/MultiChoice", "Radio - HML", "Radio - YesNoNa", 
				"DropDowns - HML", "DropDowns - YesNoNa", "CheckBoxes - HML", "CheckBoxes - YeNoNa");
		Reporter.log("MultiChoice Questionnaire created successfully", true);
	}

	@Test(dependsOnMethods="iQapturePage_Verification_Test")
	public void Date_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOniQaptureslink();
		iQapturePage.verify_Date_Questionnaire("Q/Date", "Date", "Date and Time", "Time", "Week and Date");
		Reporter.log("Date Questionnaire created successfully", true);
	}

	@Test(dependsOnMethods="iQapturePage_Verification_Test")
	public void Advanced_Settings_for_Date_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOniQaptureslink();
		iQapturePage.verify_Advanced_Settings_for_Date("Q/Date/Advanced Settings","Level 1", "L1 Hint", "Level 2", "L2 Hint", 
				"Level 3", "L3 Hint", "Level 4", "L4 Hint", "Level 5", "L5 Hint", "Number Manual", "Q6", "Hint", "Number None", "Hint");
		Reporter.log("Advanced settings for date questionnaire are functional", true);
	}
	
	@Test(dependsOnMethods="iQapturePage_Verification_Test")
	public void Number_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOniQaptureslink();
		iQapturePage.verify_Number_Questionnaire("Q/Number", "Integer", "Float", "Percentage", "Currency", "Slider", "1", "5", "3");
		Reporter.log("Number questionnaire created successfully", true);
	}
	
	@Test(dependsOnMethods="iQapturePage_Verification_Test")
	public void Advanced_settings_for_Number_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOniQaptureslink();
		iQapturePage.verify_Advanced_settings_for_Number("Q/Number/Advanced Settings","Level 1", "L1 Hint", "Level 2", "L2 Hint", 
				"Level 3", "L3 Hint", "Level 4", "L4 Hint", "Level 5", "L5 Hint", "Number Manual", "Q6", "Hint", "Number None", "Hint");
		Reporter.log("Advanced settings for number questionnaire are functional", true);
	}
	
	@Test(dependsOnMethods="iQapturePage_Verification_Test")
	public void Upload_File_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOniQaptureslink();
		iQapturePage.verify_Upload_File_Questionnaire("Q/Upload File", "Upload file");
		Reporter.log("Upload File questionnaire created successfully", true);
	}
	
	@Test(dependsOnMethods="iQapturePage_Verification_Test")
	public void Advanced_settings_for_Upload_File_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOniQaptureslink();
		iQapturePage.verify_Advanced_settings_for_Upload_File("Q/Upload File/Advanced Settings","Level 1", "L1 Hint", "Level 2", "L2 Hint", 
				"Level 3", "L3 Hint", "Level 4", "L4 Hint", "Level 5", "L5 Hint", "Number Manual", "Q6", "Hint", "Number None", "Hint");
		Reporter.log("Advanced settings for upload file questionnaire are functional", true);
	}
	
	@Test(dependsOnMethods="iQapturePage_Verification_Test")
	public void Activity_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOniQaptureslink();
		iQapturePage.verify_Activity_Questionnaire("Q/Activity", "My Activity", "Sample Activity", "Activity");
		Reporter.log("Activity questionnaire created successfully", true);
	}
	
	@Test(dependsOnMethods="iQapturePage_Verification_Test")
	public void Advanced_settings_for_Activity_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOniQaptureslink();
		iQapturePage.verify_Advanced_settings_for_Activity("Q/Activity/Advanced Settings","Level 1", "L1 Hint", "Level 2", "L2 Hint", 
				"Level 3", "L3 Hint", "Level 4", "L4 Hint", "Level 5", "L5 Hint", "Number Manual", "Q6", "Hint", "Number None", "Hint");
		Reporter.log("Advanced settings for activity questionnaire are functional", true);
	}
	
	@Test(dependsOnMethods="iQapturePage_Verification_Test")
	public void Advanced_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOniQaptureslink();
		iQapturePage.verify_Advanced_Questionnaire("Q/Advanced", "Sl.No.", "Description Added", "Table", "Property", "Wizard");
		Reporter.log("Advanced - Table, Property and Wizard Questionnaires created successfully", true);
	}
	
	@Test(dependsOnMethods="iQapturePage_Verification_Test")
	public void Section_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOniQaptureslink();
		iQapturePage.verify_Section_Questionnaire("Q/Section", "Section");
		Reporter.log("Section questionnaire created successfully", true);
	}
	
	@Test(dependsOnMethods="iQapturePage_Verification_Test")
	public void Advanced_settings_for_Section_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOniQaptureslink();
		iQapturePage.verify_Advanced_settings_for_Section("Q/Section/Advanced Settings","Level 1", "L1 Description", "L1 Hint", 
				"Level 2", "L2 Description", "L2 Hint", "Level 3", "L1 Description", "L3 Hint", "Level 4", "L1 Description", "L4 Hint", 
				"Level 5", "L1 Description", "L5 Hint", "Number Manual", "Q6",  "Number Manual Description", "Hint6", 
				"Number None", "Number None Description", "Hint7");
		Reporter.log("Advanced settings for section questionnaire are functional", true);
	}
	
	@Test(dependsOnMethods="iQapturePage_Verification_Test")
	public void Advanced_settings_for_MiltiChoice_Radio_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOniQaptureslink();
		iQapturePage.verify_Advanced_settings_for_MiltiChoice_Radio("Q/MultiChoice-Radio/Advanced Settings","Level 1", "L1 Hint", "Level 2", "L2 Hint", 
				"Level 3", "L3 Hint", "Level 4", "L4 Hint", "Level 5", "L5 Hint", "Number Manual", "Q6", "Hint", "Number None", "Hint");
		Reporter.log("Advanced settings for MutiChoice-Radio questionnaire are functional", true);
	}
	
	@Test(dependsOnMethods="iQapturePage_Verification_Test")
	public void Advanced_settings_for_MiltiChoice_DropDown_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOniQaptureslink();
		iQapturePage.verify_Advanced_settings_for_MiltiChoice_DropDown("Q/MultiChoice-DropDown/Advanced Settings","Level 1", "L1 Hint", "Level 2", "L2 Hint", 
				"Level 3", "L3 Hint", "Level 4", "L4 Hint", "Level 5", "L5 Hint", "Number Manual", "Q6", "Hint", "Number None", "Hint");
		Reporter.log("Advanced settings for MutiChoice-DropDown questionnaire are functional", true);
	}
	
	@Test(dependsOnMethods="iQapturePage_Verification_Test")
	public void Advanced_settings_for_MiltiChoice_CheckBox_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOniQaptureslink();
		iQapturePage.verify_Advanced_settings_for_MiltiChoice_CheckBox("Q/MultiChoice-CheckBox/Advanced Settings","Level 1", "1", "20", "L1 Hint", 
				"Level 2", "1", "20", "L2 Hint", "Level 3", "1", "20", "L3 Hint", "Level 4", "1", "20", "L4 Hint", "Level 5", "1", "20", "L5 Hint", 
				"Number Manual", "Q6", "1", "20", "Hint", "Number None", "1", "20", "Hint");
		Reporter.log("Advanced settings for MutiChoice-CheckBox questionnaire are functional", true);
	}
	
	@Test(dependsOnMethods="iQapturePage_Verification_Test")
	public void verify_Create_Answers_for_MultiChoice_Test() throws Exception {
		dashBoardPage.clickOniQaptureslink();
		iQapturePage.verify_Create_Answers_for_MultiChoice("Q/MultiChoice/Create Answers", "Radio", "Ans 1", "Hint 1", "100", 
				"Ans 2", "Hint 2", "50", "DropDown_HML", "CheckBox_YesNoNa");
		Reporter.log("Answers Created for MultiChoice successfully", true);
	}
	
	@Test(dependsOnMethods="iQapturePage_Verification_Test")
	public void MultiChoice_Copy_Questions_functionality_Test() throws Exception {
		dashBoardPage.clickOniQaptureslink();
		iQapturePage.verify_MultiChoice_Copy_Questions_functionality("Q/MultiChoice/Copy Questions", "Radio_HML", "DropDown_YesNoNa", "Copy From", "DropDown_YesNoNa", "Copied Question from DropDown"); 
		Reporter.log("Copy functionality in MultiChoice is functional", true);
	}
	
	@Test(dependsOnMethods="iQapturePage_Verification_Test")
	public void Download_Template_For_MultiChoice_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOniQaptureslink();
		iQapturePage.verify_Download_Template_For_MultiChoice_Questionnaire("Q/MultiChoice/Download Template", "Radio - HML", "Radio - YesNoNa", 
				"DropDowns - HML", "DropDowns - YesNoNa", "CheckBoxes - HML", "CheckBoxes - YeNoNa");
		Reporter.log("Download Template for MultiChoice Questionnaire is functional", true);
	}
	
	@Test(dependsOnMethods="iQapturePage_Verification_Test")
	public void Upload_Template_For_MultiChoice_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOniQaptureslink();
		iQapturePage.verify_Upload_Template_For_MultiChoice_Questionnaire("Q/MultiChoice/Upload Template",
				"D:\\Value chain\\Images\\Questions Template.xlsx", "Uploaded Question");
		Reporter.log("Upload Template for MultiChoice Questionnaire is functional", true);
	}
	
	@Test(dependsOnMethods="Create_Questionnaire_Test")
	public void Rename_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOniQaptureslink();
		iQapturePage.verify_Rename_Questionnaire("Test Questionnaire", "Renamed Questionnaire", "Renamed");
		Reporter.log("Questionnaire Renamed Successfully", true);
	}
	
	@Test(dependsOnMethods="iQapturePage_Verification_Test")
	public void Removing_Questions_From_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOniQaptureslink();
		iQapturePage.verify_Removing_Questions_From_Questionnaire("Q/Removing Questions", "Radio", "DropDown");
		Reporter.log("Questions removed from the questionnaire Successfully", true);
	}
	
	@Test(dependsOnMethods="iQapturePage_Verification_Test")
	public void Comment_Adding_Updating_Deleting_Test() throws Exception {
		dashBoardPage.clickOniQaptureslink();
		iQapturePage.verify_Comment_Adding_Updating_Deleting("Q/Comment", "Q1");
		Reporter.log("Comment Deleted Successfully", true);
	}
	
	@Test(dependsOnMethods= {"iQapturePage_Verification_Test","Removing_Questions_From_Questionnaire_Test"})
	public void Delete_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOniQaptureslink();
		iQapturePage.verify_Delete_Questionnaire("Removing");
		Reporter.log("Questionnaire deleted successfully", true);
	}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
