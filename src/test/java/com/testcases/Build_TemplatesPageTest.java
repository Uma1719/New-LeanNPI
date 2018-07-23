package com.testcases;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.Build_TemplatesPage;
import com.pages.DashBoardPage;
import com.pages.LoginPage;
import com.util.TestUtil;

public class Build_TemplatesPageTest extends TestBase{
	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	TestUtil testUtil;
	Build_TemplatesPage templatesPage;

	public Build_TemplatesPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		dashBoardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		templatesPage= new Build_TemplatesPage();
	}

	@Test
	public void TemplatesPage_Verification_Test() throws Exception {
		dashBoardPage.clickOnTempaltesLink();
		templatesPage.verify_TemplatesPage();
		Reporter.log("Templates Page Verified Successfully",true);
	}
	
	@Test(dependsOnMethods="TemplatesPage_Verification_Test")
	public void Craete_Template_Test() throws Exception {
		dashBoardPage.clickOnTempaltesLink();
		templatesPage.verify_Create_Template("Template 1", "Gate 1", "10", "14", "Multi", "New");
		Reporter.log("Template created successfully", true);
	}
	
	@Test(dependsOnMethods="Craete_Template_Test")
	public void Edit_Gate_Test() throws Exception {
		dashBoardPage.clickOnTempaltesLink();
		templatesPage.verify_Edit_Gate("Template 1", "New Gate 1");
		Reporter.log("Gate Updated Successfully", true);
	}
	
	@Test(dependsOnMethods="Edit_Gate_Test")
	public void Delete_Gate_Test() throws Exception {
		dashBoardPage.clickOnTempaltesLink();
		templatesPage.verify_Delete_Gate("Template 1");
		Reporter.log("Gate Deleted Successfully", true);
	}
	
	@Test(dependsOnMethods="Delete_Gate_Test")
	public void Rename_Template_Test() throws Exception {
		dashBoardPage.clickOnTempaltesLink();
		templatesPage.verify_Rename_Template("Template 1", "New Template 1");
		Reporter.log("Template Renamed Successfully", true);
	}
	
	@Test(dependsOnMethods="Rename_Template_Test")
	public void Delete_Template_Test() throws Exception {
		dashBoardPage.clickOnTempaltesLink();
		templatesPage.verify_Delete_Template("New Template 1");
		Reporter.log("Template Deleted Successfully", true);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
