package com.testcases;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pages.DashBoardPage;
import com.pages.LoginPage;
import com.pages.SettingsPage;
import com.util.TestUtil;

public class SettingsPageTest extends TestBase{
	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	TestUtil testUtil;
	SettingsPage settingsPage;

	public SettingsPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		dashBoardPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		settingsPage = new SettingsPage();
	}

	@Test
	public void SettingsPage_Verification_Test() {
		dashBoardPage.clickOnSettingsLink();
		settingsPage.verify_SettingsPage();
		Reporter.log("Settings Page Verified Successfully",true);
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
