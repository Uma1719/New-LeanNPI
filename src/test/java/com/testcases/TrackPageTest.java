package com.testcases;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.DashBoardPage;
import com.pages.LoginPage;
import com.pages.TrackPage;
import com.util.TestUtil;

public class TrackPageTest extends TestBase {
	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	TestUtil testUtil;
	TrackPage trackPage;
	
	public TrackPageTest() {
		super();
	}

	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	//@test -- execute test case
	//after each test case -- close the browser

	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		dashBoardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		trackPage = new TrackPage();
	}

	@Test
	public void TrackPage_Verification_Test() {
		dashBoardPage.clickOnTrackLink();
		trackPage.verify_TrackPage();
		Reporter.log("Track Page Verified Successfully",true);
	}

	@Test(dependsOnMethods="TrackPage_Verification_Test")
	public void Open_Project_From_Track_Test() {
		dashBoardPage.clickOnTrackLink();
		trackPage.verify_open_project_from_track_section("DEMO");
		Reporter.log("Project opened successfully", true);
	}
	
	@Test(dependsOnMethods="TrackPage_Verification_Test")
	public void View_parts_info_Test() throws Exception {
		dashBoardPage.clickOnTrackLink();
		trackPage.verify_view_parts_info("DEMO");
		Reporter.log("Part info displayed successfully", true);
	}
	
	@Test(dependsOnMethods="TrackPage_Verification_Test")
	public void Update_part_info_Test() throws Exception {
		dashBoardPage.clickOnTrackLink();
		trackPage.verify_update_part_info("DEMO", "Issue Resolved", "2000", "4321", "No Issue", "20000");
		Reporter.log("Info updated successfully", true);
	}
	
	@Test(dependsOnMethods="TrackPage_Verification_Test")
	public void Add_activities_to_Gate_Test() throws Exception {
		dashBoardPage.clickOnTrackLink();
		trackPage.verify_Add_activities_to_Gate("DEMO", "AIRBUS", "ACT 1", "D:\\Value chain\\Images\\aeroindia.jpg", "Comment 1", "Active");
		Reporter.log("Activity added to the Gate successfully", true);
	}
	
	@Test(dependsOnMethods= {"TrackPage_Verification_Test", "Add_activities_to_Gate_Test"})
	public void Download_file_from_Activity_Test() throws Exception {
		dashBoardPage.clickOnTrackLink();
		trackPage.verify_Download_file_from_Activity("DEMO");
		Reporter.log("Image downloaded from activity successfully", true);
	}
	
	@Test(dependsOnMethods= "Download_file_from_Activity_Test")
	public void Delete_file_from_Activity_Test() throws Exception {
		dashBoardPage.clickOnTrackLink();
		trackPage.verify_Delete_uploaded_image_from_Activity("DEMO");
		Reporter.log("Image deleted from activity successfully", true);
	}
	
	@Test(dependsOnMethods= "Delete_file_from_Activity_Test")
	public void Delete_added_Tag_from_Activity_Test() throws Exception {
		dashBoardPage.clickOnTrackLink();
		trackPage.verify_Delete_added_Tag_from_Activity("DEMO");
		Reporter.log("Tag deleted from activity successfully", true);
	}
	
	@Test(dependsOnMethods= {"TrackPage_Verification_Test", "Add_activities_to_Gate_Test"})
	public void Edit_Activity_Test() throws Exception {
		dashBoardPage.clickOnTrackLink();
		trackPage.verify_Edit_Activity("DEMO", "D:\\Value chain\\Images\\aeroindia.jpg");
		Reporter.log("Activity Edited Successfully", true);
	}
	
	@Test(dependsOnMethods= {"TrackPage_Verification_Test", "Add_activities_to_Gate_Test"})
	public void Send_Activity_email_Test() throws Exception {
		dashBoardPage.clickOnTrackLink();
		trackPage.verify_Send_Activity_email("DEMO");
		Reporter.log("Activity Email Sent Successfully", true);
	}
	
	@Test(dependsOnMethods= "Delete_added_Tag_from_Activity_Test")
	public void Complete_Activity_Test() throws Exception {
		dashBoardPage.clickOnTrackLink();
		trackPage.verify_Complete_Activity("DEMO");
		Reporter.log("Activity Completed Successfully", true);
	}
	
	@Test(dependsOnMethods= "Complete_Activity_Test")
	public void Delete_Activity_Test() throws Exception {
		dashBoardPage.clickOnTrackLink();
		trackPage.verify_Delete_Activity("DEMO");
		Reporter.log("Activity Deleted Successfully", true);
	}
	
	@Test(dependsOnMethods= {"TrackPage_Verification_Test", "Add_activities_to_Gate_Test"})
	public void Add_Comment_to_Gate_Test() throws Exception {
		dashBoardPage.clickOnTrackLink();
		trackPage.verify_Add_Comment_to_Gate("DEMO", "My Comment");
		Reporter.log("Comment Added to Gate Successfully", true);
	}
	
	@Test(dependsOnMethods= {"TrackPage_Verification_Test", "Add_activities_to_Gate_Test"})
	public void Fill_The_Questionnaire_in_the_Gate_Test() throws Exception {
		dashBoardPage.clickOnTrackLink();
		trackPage.verify_Fill_The_Questionnaire_in_the_Gate("DEMO", "14", "12", "D:\\Value chain\\Images\\aeroindia.jpg");
		Reporter.log("Questionnaire filled in the Gate Successfully", true);
	}
	
	@Test(dependsOnMethods= {"TrackPage_Verification_Test", "Add_activities_to_Gate_Test"})
	public void View_log_of_Questionnaire_Test() throws Exception {
		dashBoardPage.clickOnTrackLink();
		trackPage.verify_View_log_of_Questionnaire("DEMO");
		Reporter.log("Logs displayed for the Questionnaire Successfully", true);
	}
	
	@Test(dependsOnMethods= {"TrackPage_Verification_Test", "Add_activities_to_Gate_Test"})
	public void Approve_this_stage_as_Completed_Test() throws Exception {
		dashBoardPage.clickOnTrackLink();
		trackPage.verify_Approve_this_stage_as_Completed("DEMO");
		Reporter.log("Stage approved as completed Successfully", true);
	}
	
	@Test(dependsOnMethods= "TrackPage_Verification_Test")
	public void Unconditional_Completion_Test() throws Exception {
		dashBoardPage.clickOnTrackLink();
		trackPage.verify_Unconditional_Completion("COMPLETE");
		Reporter.log("Unconditional completion of stage is functional", true);
	}
	
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}



}
