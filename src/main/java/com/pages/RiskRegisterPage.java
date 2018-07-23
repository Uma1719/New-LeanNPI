package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.TestBase;
import com.util.GenericLibrary;

public class RiskRegisterPage extends TestBase {
	// Objects Repository(OR):........................................................................
	@FindBy(xpath="//a[text()='Risk Register']")
	WebElement riskRegister;


	// Initializing the Page Objects:................................................................
	public RiskRegisterPage() {
		PageFactory.initElements(driver, this);
	}


	// Actions:......................................................................................
	public void verify_RiskRegisterPage() {
		GenericLibrary.waitForElementVisibility(driver, riskRegister);
		Assert.assertTrue(riskRegister.isDisplayed(), "Unable to Navigate Risk Register Page");
	}
}
