package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.TestBase;
import com.util.GenericLibrary;

public class CompaniesPage extends TestBase{
	// Objects Repository(OR):........................................................................
	// Page verification
	@FindBy(xpath="//a[text()='Companies']")
	WebElement companieslink;
	

	// Initializing the Page Objects:................................................................
	public CompaniesPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:......................................................................................
	
	public void verify_CompaniesPage() {
		GenericLibrary.waitForElementVisibility(driver, companieslink);
		Assert.assertTrue(companieslink.isDisplayed(), "Unable to Navigate Companies Page");
	}
	
	
}
