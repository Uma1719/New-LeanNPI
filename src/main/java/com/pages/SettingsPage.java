package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.TestBase;
import com.util.GenericLibrary;

public class SettingsPage extends TestBase{
	// Objects Repository(OR):........................................................................
	@FindBy(xpath="//span[text()='Duplicated Part Number']")
	WebElement duplicatePartNumberSettings;
	
	

	// Initializing the Page Objects:................................................................
	public SettingsPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:......................................................................................
	
	public void verify_SettingsPage() {
		GenericLibrary.waitForElementVisibility(driver, duplicatePartNumberSettings);
		Assert.assertTrue(duplicatePartNumberSettings.isDisplayed(), "Unable to Navigate Analyse Page");
	}
	
	
	
}
