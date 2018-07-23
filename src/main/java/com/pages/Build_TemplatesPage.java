package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.base.TestBase;
import com.util.GenericLibrary;
import com.util.JavascriptLibrary;

public class Build_TemplatesPage extends TestBase {

	// Objects Repository(OR):........................................................................
	// Page verification
	@FindBy(xpath="//a[text()='Template']")
	WebElement templateLink;
	
	// Create template
	@FindBy(xpath=".//*[@id='btnAdd']/span/span[2]")
	WebElement createNewTemplateBtn;
	
	@FindBy(xpath=".//*[@id='T_NAME']")
	WebElement templateNameTextBox;
	
	@FindBy(xpath=".//*[@id='btnEdit']/span/span[2]")
	WebElement templateSaveBtn;
	
	@FindBy(xpath=".//*[@id='btnStageNew']/span/span[2]")
	WebElement addGateBtn;
	
	@FindBy(xpath=".//*[@id='S_NAME']")
	WebElement gateNameTextBox;
	
	@FindBy(xpath="//label[text()='Milestone']//following::span[3]")
	WebElement milestone_ON;
	
	@FindBy(xpath="//label[text()='Complete all parts']//following::span[3]")
	WebElement completeAllParts_ON;
	
	@FindBy(xpath=".//*[@id='S_LEADTIME']")
	WebElement leadTimeTextBox;
	
	@FindBy(xpath=".//*[@id='S_WORKLOAD']")
	WebElement workLoadTextBox;
	
	@FindBy(xpath="//label[text()='People']//following::i[1]")
	WebElement peopleBtn;
	
	@FindBy(xpath="//label[contains(text(), 'Add iQapture')]//preceding::i[1]")
	WebElement addiQaptureBtn;
	
	@FindBy(xpath=".//*[@id='btnStageSave']/span/span[2]")
	WebElement gateSaveBtn;
	
	@FindBy(xpath="//label[contains(text(),'Add iQapture')]//following::button[1]")
	WebElement gatePageCloseBtn;
	
	@FindBy(xpath="//li[contains(text(),'Add iQapture')]//following::button")
	WebElement iQapturePageCloseBtn;
	
	@FindBy(xpath="//*[text()='Multi-choice-Radio']")
	WebElement iQapture_MultichoiceRadio;
	
	@FindBy(xpath="//*[text()='New Questionnaire']")
	WebElement iQapture_NewiQapture;
	
	@FindBy(xpath="//div[@title='Multi-choice-Radio']")
	WebElement addediQapture_MultichoiceRadio;
	
	@FindBy(xpath="//div[@title='New Questionnaire']")
	WebElement addediQapture_NewQuestionnaire;
	
	@FindBy(xpath="//span[text()='Gate 1']")
	WebElement addedGate1;
	
	@FindBy(css=".fa.fa-search")
	WebElement iQaptureSearchBtn;
	
	@FindBy(css=".form-control.searcher-text")
	WebElement iQaptureSearchBox;
	
	// Edit Gate
	@FindBy(xpath=".//*[@id='btnAdd']/span/span[2]//following::span[3]")
	WebElement templateSearchBtn;
	
	@FindBy(xpath=".//*[@id='btnAdd']/span/span[2]//following::input[1]")
	WebElement templateSearchBox;
	
	@FindBy(xpath="//td[text()='Template 1']")
	WebElement template1;
	
	@FindBy(xpath=".//*[@id='divS_NAME']")
	WebElement filledInGateNameTextBox;
	
	@FindBy(xpath="//span[text()='New Gate 1']")
	WebElement updatedGate1;
	
	// Delete Gate 
	@FindBy(xpath=".//*[@id='btnSatgeDelete']/span/span[2]")
	WebElement deleteGateBtn;
	
	@FindBy(xpath="//button[text()='OK']")
	WebElement deleteConfirmationBtn;
	
	// Rename Template
	@FindBy(xpath=".//*[@id='divT_NAME']")
	WebElement filledInTemplateNameTextBox;
	
	@FindBy(xpath=".//*[@id='btnPageBack']/span/span[2]")
	WebElement backBtn;
	
	@FindBy(xpath="//td[text()='New Template 1']")
	WebElement updatedTemplate1;
	
	// Delete Template
	@FindBy(xpath=".//*[@id='btnDelete']/span/span[2]")
	WebElement deleteTemplateBtn;
	

	// Initializing the Page Objects:................................................................
	public Build_TemplatesPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:......................................................................................

	public void verify_TemplatesPage() {
		GenericLibrary.waitForElementVisibility(driver, templateLink);
		Assert.assertTrue(templateLink.isDisplayed(), "Unable to Navigate Template Page");
	}

	public void verify_Create_Template(String tempName, String gateName, String leadTime, String workLoad, String search1, String search2) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, createNewTemplateBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewTemplateBtn);
		GenericLibrary.waitForElementVisibility(driver, templateNameTextBox);
		JavascriptLibrary.javascriptType(driver, templateNameTextBox, tempName);
		JavascriptLibrary.javascriptClickElement(driver, templateSaveBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, addGateBtn);
		GenericLibrary.waitForElementVisibility(driver, gateNameTextBox);
		JavascriptLibrary.javascriptType(driver, gateNameTextBox, gateName);
		JavascriptLibrary.javascriptClickElement(driver, milestone_ON);
		JavascriptLibrary.javascriptClickElement(driver, completeAllParts_ON);
		JavascriptLibrary.javascriptType(driver, leadTimeTextBox, leadTime);
		JavascriptLibrary.javascriptType(driver, workLoadTextBox, workLoad);
		JavascriptLibrary.javascriptClickElement(driver, addiQaptureBtn);
		GenericLibrary.waitForElementVisibility(driver, iQaptureSearchBtn);
		JavascriptLibrary.javascriptClickElement(driver, iQaptureSearchBtn);
		iQaptureSearchBox.sendKeys(search1);
		GenericLibrary.waitForElementVisibility(driver, iQapture_MultichoiceRadio);
		JavascriptLibrary.javascriptClickElement(driver, iQapture_MultichoiceRadio);
		Thread.sleep(1000);
		iQaptureSearchBox.clear();
		iQaptureSearchBox.sendKeys(search2);
		GenericLibrary.waitForElementVisibility(driver, iQapture_NewiQapture);
		JavascriptLibrary.javascriptClickElement(driver, iQapture_NewiQapture);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, iQapturePageCloseBtn);
		GenericLibrary.waitForElementVisibility(driver, addediQapture_MultichoiceRadio);
		Assert.assertTrue(addediQapture_MultichoiceRadio.isDisplayed(), "iQapture 1 Not Added");
		Assert.assertTrue(addediQapture_NewQuestionnaire.isDisplayed(), "iQapture 2 Not Added");
		Reporter.log("iQaptures Added Successfully", true);
		JavascriptLibrary.javascriptClickElement(driver, gatePageCloseBtn);
		Assert.assertTrue(addedGate1.isDisplayed(), "Gate Not Added");
		Reporter.log("Gate created to the template successfully", true);
	}
	
	public void verify_Edit_Gate(String templateName, String newName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, templateSearchBtn);
		JavascriptLibrary.javascriptClickElement(driver, templateSearchBtn);
		templateSearchBox.sendKeys(templateName);
		GenericLibrary.waitForElementVisibility(driver, template1);
		JavascriptLibrary.javascriptClickElement(driver, template1);
		GenericLibrary.waitForElementVisibility(driver, addedGate1);
		JavascriptLibrary.javascriptClickElement(driver, addedGate1);
		GenericLibrary.waitForElementVisibility(driver, filledInGateNameTextBox);
		filledInGateNameTextBox.click();
		Thread.sleep(1000);
		gateNameTextBox.clear();
		gateNameTextBox.sendKeys(newName);
		gateNameTextBox.sendKeys(Keys.TAB);
		JavascriptLibrary.javascriptClickElement(driver, gatePageCloseBtn);
		GenericLibrary.waitForElementVisibility(driver, updatedGate1);
		Assert.assertTrue(updatedGate1.isDisplayed(),"Gate Not Updated");
	}
	
	public void verify_Delete_Gate(String templateName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, templateSearchBtn);
		JavascriptLibrary.javascriptClickElement(driver, templateSearchBtn);
		templateSearchBox.sendKeys(templateName);
		GenericLibrary.waitForElementVisibility(driver, template1);
		JavascriptLibrary.javascriptClickElement(driver, template1);
		GenericLibrary.waitForElementVisibility(driver, updatedGate1);
		JavascriptLibrary.javascriptClickElement(driver, updatedGate1);
		GenericLibrary.waitForElementVisibility(driver, deleteGateBtn);
		JavascriptLibrary.javascriptClickElement(driver, deleteGateBtn);
		JavascriptLibrary.javascriptClickElement(driver, deleteConfirmationBtn);
	}
	
	public void verify_Rename_Template(String templateName, String updatedName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, templateSearchBtn);
		JavascriptLibrary.javascriptClickElement(driver, templateSearchBtn);
		templateSearchBox.sendKeys(templateName);
		GenericLibrary.waitForElementVisibility(driver, template1);
		JavascriptLibrary.javascriptClickElement(driver, template1);
		GenericLibrary.waitForElementVisibility(driver, filledInTemplateNameTextBox);
		filledInTemplateNameTextBox.click();
		Thread.sleep(1000);
		templateNameTextBox.clear();
		templateNameTextBox.sendKeys(updatedName);
		templateNameTextBox.sendKeys(Keys.TAB);
		JavascriptLibrary.javascriptClickElement(driver, backBtn);
		GenericLibrary.waitForElementVisibility(driver, templateSearchBtn);
		JavascriptLibrary.javascriptClickElement(driver, templateSearchBtn);
		templateSearchBox.sendKeys(templateName);
		GenericLibrary.waitForElementVisibility(driver, updatedTemplate1);
		Assert.assertTrue(updatedTemplate1.isDisplayed(), "Template Renamed Successfully");
	}
	
	public void verify_Delete_Template(String templateName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, templateSearchBtn);
		JavascriptLibrary.javascriptClickElement(driver, templateSearchBtn);
		templateSearchBox.sendKeys(templateName);
		GenericLibrary.waitForElementVisibility(driver, updatedTemplate1);
		JavascriptLibrary.javascriptClickElement(driver, updatedTemplate1);
		GenericLibrary.waitForElementVisibility(driver, deleteTemplateBtn);
		JavascriptLibrary.javascriptClickElement(driver, deleteTemplateBtn);
		JavascriptLibrary.javascriptClickElement(driver, deleteConfirmationBtn);
	}
}












