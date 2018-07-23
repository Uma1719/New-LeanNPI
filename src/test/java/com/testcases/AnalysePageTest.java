package com.testcases;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.AnalysePage;
import com.pages.DashBoardPage;
import com.pages.LoginPage;
import com.util.TestUtil;

public class AnalysePageTest extends TestBase {
	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	TestUtil testUtil;
	AnalysePage analysePage;

	public AnalysePageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		dashBoardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		analysePage= new AnalysePage();
	}

	@Test
	public void AnalysePage_Verification_Test() {
		dashBoardPage.clickOnAnalyseLink();
		analysePage.verify_AnalysePage();
		Reporter.log("Analyse Page Verified Successfully",true);
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
