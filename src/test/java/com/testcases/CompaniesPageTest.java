package com.testcases;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.CompaniesPage;
import com.pages.DashBoardPage;
import com.pages.LoginPage;
import com.util.TestUtil;

public class CompaniesPageTest extends TestBase{
	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	TestUtil testUtil;
	CompaniesPage companiesPage;

	public CompaniesPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		dashBoardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		companiesPage = new CompaniesPage();
	}
	
	@Test
	public void CompaniesPage_Verification_Test() {
		dashBoardPage.clickOnCompaniesLink();
		companiesPage.verify_CompaniesPage();
		Reporter.log("Companies Page Verified Successfully",true);
	}

	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
