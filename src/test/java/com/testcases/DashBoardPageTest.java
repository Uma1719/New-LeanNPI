package com.testcases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.DashBoardPage;
import com.pages.LoginPage;
import com.util.TestUtil;

public class DashBoardPageTest extends TestBase {
	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	TestUtil testUtil;

	public DashBoardPageTest() {
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
	}
	
	@Test
	public void Verify_HomePage_TitleTest(){
		String dashBoardTitle = dashBoardPage.verifyHomePageTitle();
		Assert.assertEquals(dashBoardTitle, "Valuechain.com","Home page title not matched");
		Reporter.log("Title Verified - Test PASS", true);
	}
	
	@Test(dependsOnMethods="Verify_HomePage_TitleTest")
	public void Verify_DashBoardPage(){
		Assert.assertTrue(dashBoardPage.verifyDashboard(), "Dashboard Page Not Present - Test FAIL");
		Reporter.log("DashBoard Page Verified - Test PASS", true);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	

}
