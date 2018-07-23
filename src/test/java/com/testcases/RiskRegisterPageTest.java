package com.testcases;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.DashBoardPage;
import com.pages.LoginPage;
import com.pages.RiskRegisterPage;
import com.util.TestUtil;

public class RiskRegisterPageTest extends TestBase{
	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	TestUtil testUtil;
	RiskRegisterPage riskRegisterPage;

	public RiskRegisterPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		dashBoardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		riskRegisterPage= new RiskRegisterPage();
	}
	
	@Test
	public void RiskRegister_Verification_Test() {
		dashBoardPage.clickOnRiskRegisterLink();
		riskRegisterPage.verify_RiskRegisterPage();
		Reporter.log("Risk Register Page Verified Successfully",true);
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
