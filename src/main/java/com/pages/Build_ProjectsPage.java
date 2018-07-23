package com.pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.base.TestBase;
import com.util.GenericLibrary;
import com.util.JavascriptLibrary;

public class Build_ProjectsPage extends TestBase {

	// Objects Repository(OR):........................................................................
	// Page verification
	@FindBy(xpath="//a[text()='Project']")
	WebElement projectLink;

	// Create project
	@FindBy(xpath=".//*[@id='btnAdd']/span/span[2]")
	WebElement addButton;

	@FindBy(xpath=".//*[@id='WP_NAME']")
	WebElement projectNameTextBox;

	@FindBy(xpath="//span[@role='combobox']")
	WebElement customerFieldTextBox;

	@FindBy(xpath="//input[@type='search']")
	WebElement customerSearchBox;

	@FindBy(xpath="//div[text()='AIRBUS']")
	WebElement airbusCustomer;

	@FindBy(xpath="//textarea[@id='WP_REMARK']")
	WebElement descriptionTextBox;

	@FindBy(xpath=".//*[@id='divWP_REQDATE']/span/span")
	WebElement dateButton;

	@FindBy(xpath=".//*[@id='WP_VALUE']")
	WebElement currencyValueTextBox;

	@FindBy(xpath=".//*[@id='WPFiles2']/i")
	WebElement uploadFileButton;

	@FindBy(xpath=".//*[@id='docsDropzone']")
	WebElement fileBrowseButton;

	@FindBy(xpath=".//*[@id='btnStageNew']/span/span[2]")
	WebElement addStageButoon;

	@FindBy(xpath=".//*[@id='StageClose']")
	WebElement stageCloseButton;

	@FindBy(xpath="//button[text()='OK']")
	WebElement stageCloseConfirmButton;

	@FindBy(xpath=".//*[@id='btnNew']/span/span[2]")
	WebElement addPartsButton;

	@FindBy(xpath=".//*[@id='divPartInfoDlg']/div/div/div[3]/button")
	WebElement partsCloseButton;

	@FindBy(xpath=".//*[@id='btnPageBack']/span/span[2]")
	WebElement pageBackButton;

	@FindBy(xpath=".//*[@id='divSearcher']/div/div/a/span/span[2]")
	WebElement projectSearchButton;

	@FindBy(xpath=".//*[@id='divSearcher']/div/div/div/input")
	WebElement projectSearchBox;

	@FindBy(xpath="//a[text()='Demo Project']")
	WebElement createdProject;


	// Add people
	@FindBy(xpath="//label[text()='People']//following::i[1]")
	WebElement addPeopleBtn;

	@FindBy(css=".l-btn-icon.icon-blue-search2-round-32")
	WebElement peoplesSearchButton;

	@FindBy(xpath="//input[@style='width:350px;']")
	WebElement peoplesSearchBox;

	@FindBy(xpath="//span[text()='Aerospace Engineering Ltd']//following::span[1]")
	WebElement aerospaceEngineeringCompanyAddBtn;

	@FindBy(xpath=".//*[@id='divPeopleDlg']/div/div/div[3]/button")
	WebElement closeButton;

	// Add stages to project
	@FindBy(xpath=".//*[@id='S_NAME']")
	WebElement stageNametextBox;

	@FindBy(xpath=".//*[@id='divS_STARTDATE']/span/span")
	WebElement startDateCalendar;

	@FindBy(xpath=".//*[@id='divS_REQDATE']/span/span")
	WebElement endDateCalendar;

	@FindBy(xpath="//label[text()='Milestone']//following::span[3]")
	WebElement mileStoneON;

	@FindBy(xpath="//label[text()='Complete all parts']//following::span[3]")
	WebElement completeAllPartsON;

	@FindBy(xpath=".//*[@id='S_LEADTIME']")
	WebElement leadTimeTextBox;

	@FindBy(xpath=".//*[@id='S_WORKLOAD']")
	WebElement workLoadTextBox;

	@FindBy(xpath=".//*[@id='stagePeopleInfo']/div/div[3]/button")	
	WebElement stageAddPeopleCloseButton;

	@FindBy(xpath=".//*[@id='FileCount2']/i")
	WebElement stageFileUploadButton;

	@FindBy(xpath=".//*[@id='docsDropzone']")
	WebElement stageFileBrowseButton;

	@FindBy(xpath="//label[text()='Add iQapture ']//preceding::i[1]")
	WebElement addiQaptureButton;

	@FindBy(xpath="//h3[text()='Multi-choice-Radio']")
	WebElement selectiQapture1;

	@FindBy(xpath="//h3[text()='New Questionnaire']")
	WebElement selectiQapture2;

	@FindBy(xpath=".//*[@id='btnStageSave']/span/span[2]")
	WebElement stageSaveButton;

	@FindBy(xpath="//div[text()='Multi-choice-Radio']")
	WebElement addediQapture1;

	@FindBy(xpath="//div[text()='New Questionnaire']")
	WebElement addediQapture2;

	@FindBy(xpath="//span[text()='Stage 1']")
	WebElement addedStage;

	// Add people to Project and Stage
	@FindBy(xpath=".//*[@id='lblSimplePeople']")
	WebElement peopleCount;

	@FindBy(xpath="//div[text()='Company']//following::span[1]")
	WebElement airbusFR;

	@FindBy(xpath="//div[text()='Company']//following::span[2]")
	WebElement airbusFRAddBtn;

	@FindBy(xpath="//span[text()='CONTACTS']")
	WebElement contactsHeadder;

	@FindBy(xpath=".//*[@id='StageClose']//preceding::i[4]")
	WebElement AddStagePeoplesBtn;

	// Upload files to Project
	@FindBy(xpath=".//*[@id='lblAttachmentCount']")
	WebElement uploadCount;

	// Delete Added peoples from the project
	@FindBy(xpath="//*[text()='Project/Add People']")
	WebElement Project_AddPeople;

	@FindBy(xpath="//*[text()='People Added']")
	WebElement peopleAddedHeadder;

	@FindBy(xpath="//*[text()='People Added']//following::*[text()='Valuechain']//following::i[1]")
	WebElement valueChainRemovePeopleBtn;
	
	@FindBy(xpath="//button[text()='Yes']")
	WebElement YesBtn;

	// Delete uploaded files from the project
	@FindBy(xpath="//*[text()='Project/Upload Files']")
	WebElement Project_UploadFiles;

	@FindBy(xpath=".//*[@id='WPFiles1']/i")
	WebElement uploadedFilesBtn;

	@FindBy(xpath="//*[text()='FILES']//following::i[1]")
	WebElement deleteUploadedFileBtn;

	// Export stages into templates
	@FindBy(xpath="//*[text()='Project/Stages']")
	WebElement Project_Stages;

	@FindBy(xpath="//span[text()='Stage']//following::span[6]")
	WebElement saveAsTemplateBtn;

	@FindBy(xpath=".//*[@id='txtNewTmpName']")
	WebElement templateNameTextBox;

	@FindBy(xpath="//h4[text()='New Tempate']//following::button")
	WebElement submitBtn;

	@FindBy(xpath="//span[contains(text(),'Build')]")
	WebElement build;

	@FindBy(xpath="//span[text()='Templates']")
	WebElement templates;

	@FindBy(xpath="//*[text()='Temp1']")
	WebElement createdTemplate;

	// Please enter template name error message 
	@FindBy(xpath="//*[text()='Please enter Template Name.']")
	WebElement errorMessage;

	// Import template
	@FindBy(xpath="//span[text()='Stage']//following::span[9]")
	WebElement importTemplateBtn;

	@FindBy(xpath="//select[@id='ImportTemplate']")
	WebElement templatesDropDown;

	@FindBy(xpath="//button[text()='Copy']")
	WebElement copyBtn;

	@FindBy(xpath="//*[text()='Stage 1']")
	WebElement addedTemplate;

	// Add stages to project
	@FindBy(xpath=".//*[@id='P_PARTNO']")
	WebElement partNoTextBox;

	@FindBy(xpath=".//*[@id='P_DRAWINGISSUE']")
	WebElement drawingIssuesTextBox;

	@FindBy(xpath=".//*[@id='P_PRODUCTSPEC']")
	WebElement productSpecTextBox;

	@FindBy(xpath=".//*[@id='P_SALESORDER']")
	WebElement salesOrderTextBox;

	@FindBy(xpath=".//*[@id='divP_REQUIREDATE']/span/span")
	WebElement calenderButton;

	@FindBy(xpath=".//*[@id='P_PRICE']")
	WebElement pricePerPartTextBox;

	@FindBy(xpath=".//*[@id='P_DISCIPLINE']")
	WebElement disciplineTextBox;

	@FindBy(xpath=".//*[@id='P_PONUMBER']")
	WebElement PoNumberTextBox;

	@FindBy(xpath=".//*[@id='lblCompanies']//following::span[1]")
	WebElement companiesTextBox;

	@FindBy(xpath="//input[@type='search']")
	WebElement companiesSearchBox;

	@FindBy(xpath=".//*[@id='P_PARTISSUE']")
	WebElement partIssuetextBox;

	@FindBy(xpath=".//*[@id='P_DESC']")
	WebElement partDescription;

	@FindBy(xpath=".//*[@id='P_QTY']")
	WebElement partQuantityTextBox;

	@FindBy(xpath=".//*[@id='P_RISK']")
	WebElement riskDropDown;

	@FindBy(xpath=".//*[@id='P_PROCESSISSUE']")
	WebElement processIssueTextBox;

	@FindBy(xpath=".//*[@id='ddlLiveStatus']")
	WebElement liveStatusDropDown;

	@FindBy(xpath="//a[contains(text(),'Documents')]")
	WebElement documentsLink;

	@FindBy(xpath=".//*[@id='PartdocsDropzone']")
	WebElement partsBrowseBtn;

	@FindBy(xpath="//button[text()='Add Link']")
	WebElement addLinkBtn;

	@FindBy(xpath=".//*[@id='LinkName']")
	WebElement linkName;

	@FindBy(xpath=".//*[@id='LinkUrl']")
	WebElement linkUrl;

	@FindBy(xpath=".//*[@id='LinkUrl']//following::button[2]")
	WebElement linkSubmitBtn;

	@FindBy(xpath="//a[text()='Google']")
	WebElement addedLink;

	@FindBy(xpath="//a[contains(text(),'Documents')]//following::button[text()='Close']")
	WebElement newPartCloseButton;

	@FindBy(xpath="//*[text()='PARTS']//following::a[6][text()='PART 1']")
	WebElement PART_1;

	// Verifying error message while uploading file or adding link without part no.
	@FindBy(xpath="//*[text()='Parse failed:Invalid \"Part\" No.']")
	WebElement errorMessageWithoutPartNo;

	// Delete added img and link
	@FindBy(xpath="//a[text()='Project/Add Parts']")
	WebElement Project_AddParts;

	@FindBy(xpath=".//*[@id='PartdocsDropzone']//following::i[1]")
	WebElement deleteBtn;
	
	@FindBy(xpath="//button[text()='OK']")
	WebElement OkBtn;

	// Download parts template
	@FindBy(xpath="//*[text()='PARTS']//following::a[2]")
	WebElement uploadBtn;

	@FindBy(css=".l-btn-icon.icon-green-excel-round-32")
	WebElement downloadPartsTemplateButton;

	@FindBy(css=".l-btn-icon.icon-blue-upload-round-32")
	WebElement uploadPartsTemplateButton;

	// export Report table to excel
	@FindBy(xpath="//span[text()='PARTS']//following::div[1]")
	WebElement uploadIcon;
	
	@FindBy(css=".l-btn-icon.icon-green-excel-round-32")
	WebElement exportToExcelBtn;

	// Edit parts 
	@FindBy(xpath="//tr[1]/td[3]")
	WebElement part_1_PoNo;

	@FindBy(xpath=".//*[@id='divP_PONUMBER']")
	WebElement filledPONoTextBox;

	// Delete part
	@FindBy(xpath=".//*[@id='PartDel']/span/span[2]")
	WebElement deletePartBtn;

	// Edit Stage
	@FindBy(xpath="//*[text()='Stage 1']")
	WebElement Stage_1;

	@FindBy(xpath=".//*[@id='divS_NAME']")
	WebElement filledStageNameTextBox;

	@FindBy(xpath="//*[text()='Stage 2']")
	WebElement editedStage;

	// Delete Stage 
	@FindBy(xpath=".//*[@id='btnSatgeDelete']/span/span[2]")
	WebElement stageDeleteBtn;

	@FindBy(xpath="//*[text()='OK']")
	WebElement confirmStageDeleteBtn;

	// Edit Project
	@FindBy(xpath="//a[text()='Demo Project']")
	WebElement Demo_Project;

	@FindBy(xpath="//tr/td[4]")
	WebElement projectDate;

	// Launch Project
	@FindBy(xpath=".//*[@id='btnLaunch']")
	WebElement launchBtn;

	@FindBy(xpath="//*[text()='An notification email has been sent.']")
	WebElement launchConfirmationMessage;

	// Delete Project
	@FindBy(xpath=".//*[@id='btnDelete']/span/span[2]")
	WebElement projectDeleteBtn;	

	// Filter Option
	@FindBy(xpath=".//*[@id='btnShowFilter']/span/span[2]")
	WebElement filterBtn;

	@FindBy(xpath=".//*[@id='ddlStatus']")
	WebElement filterOptions;



	// Initializing the Page Objects:................................................................
	public Build_ProjectsPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:......................................................................................

	public void verify_ProjectsPage() {
		GenericLibrary.waitForElementVisibility(driver, projectLink);
		Assert.assertTrue(projectLink.isDisplayed(), "Unable to Navigate Projects Page");
	}

	public void verify_Create_Project(String projectName, String company, String description,
			String currency, String searchProject) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, projectLink);
		Assert.assertTrue(addButton.isDisplayed(), "Project Page not Opened");
		Reporter.log("Project Page Opened Successfully", true);
		JavascriptLibrary.javascriptClickElement(driver, addButton);
		GenericLibrary.waitForElementVisibility(driver, projectNameTextBox);
		Assert.assertTrue(projectNameTextBox.isDisplayed(), "Create new project page not opened");
		Reporter.log("Create new project page opened successfully", true);
		JavascriptLibrary.javascriptType(driver, projectNameTextBox, projectName);
		customerFieldTextBox.sendKeys(Keys.ENTER);
		customerSearchBox.sendKeys(company);
		airbusCustomer.click();
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, description);
		JavascriptLibrary.javascriptClickElement(driver, dateButton);
		List<WebElement> dayList = driver.findElements(By.cssSelector(".day"));
		for (WebElement ele : dayList) {
			String text = ele.getText();
			if(text.contains("30")) {
				ele.click();
				break;
			}
		}
		JavascriptLibrary.javascriptClickElement(driver, addPeopleBtn);
		GenericLibrary.waitForElementVisibility(driver, peoplesSearchButton);
		Assert.assertTrue(peoplesSearchButton.isDisplayed(), "Peoples suspension box is not opened");
		Reporter.log("Peoples suspension box is opened successfully", true);
		JavascriptLibrary.javascriptClickElement(driver, closeButton);
		currencyValueTextBox.sendKeys(currency);
		JavascriptLibrary.javascriptClickElement(driver, uploadFileButton);
		GenericLibrary.waitForElementVisibility(driver, fileBrowseButton);
		Assert.assertTrue(fileBrowseButton.isDisplayed(),"File browse field is not displayed");
		Reporter.log("File browse option is functional", true);
		JavascriptLibrary.javascriptClickElement(driver, addStageButoon);
		GenericLibrary.waitForElementVisibility(driver, stageCloseButton);
		Assert.assertTrue(stageCloseButton.isDisplayed(), "Add stage window is not displayed");
		Reporter.log("Add stages window opened successfully", true);
		JavascriptLibrary.javascriptClickElement(driver, stageCloseButton);
		JavascriptLibrary.javascriptClickElement(driver, stageCloseConfirmButton);
		JavascriptLibrary.javascriptClickElement(driver, addPartsButton);
		GenericLibrary.waitForElementVisibility(driver, partsCloseButton);
		Assert.assertTrue(partsCloseButton.isDisplayed(), "Add parts window is not displayed");
		Reporter.log("Add parts window opened successfully", true);
		JavascriptLibrary.javascriptClickElement(driver, pageBackButton);
		GenericLibrary.waitForElementVisibility(driver, projectSearchButton);
		JavascriptLibrary.javascriptClickElement(driver, projectSearchButton);
		JavascriptLibrary.javascriptType(driver, projectSearchBox, searchProject);
		projectSearchBox.sendKeys(Keys.ENTER);
		Assert.assertTrue(createdProject.isDisplayed(), "Project not created");
	}

	public void verify_add_Stages_to_project(String projectName, String company, String description, 
			String stageName, String leadTime, String workLoad) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, projectLink);
		JavascriptLibrary.javascriptClickElement(driver, addButton);
		GenericLibrary.waitForElementVisibility(driver, projectNameTextBox);
		JavascriptLibrary.javascriptType(driver, projectNameTextBox, projectName);
		Thread.sleep(1000);
		customerFieldTextBox.sendKeys(Keys.ENTER);
		customerSearchBox.sendKeys(company);
		airbusCustomer.click();
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, description);
		JavascriptLibrary.javascriptClickElement(driver, addStageButoon);
		GenericLibrary.waitForElementVisibility(driver, stageNametextBox);
		stageNametextBox.sendKeys(stageName);
		Thread.sleep(1000);
		// start date
		JavascriptLibrary.javascriptClickElement(driver, startDateCalendar);
		List<WebElement> switchToYear = driver.findElements(By.cssSelector(".picker-switch"));
		for (WebElement ele : switchToYear) {
			String text = ele.getText();
			if(text.contains("2018")) {
				ele.click();
				break;
			}
		}
		List<WebElement> switchToYear2 = driver.findElements(By.cssSelector(".picker-switch"));
		for (WebElement ele : switchToYear2) {
			String text = ele.getText();
			if(text.contains("2018")) {
				ele.click();
				break;
			}
		}
		Thread.sleep(1000);
		List<WebElement> yearsList = driver.findElements(By.cssSelector(".year"));
		for (WebElement ele : yearsList) {
			String text = ele.getText();
			if(text.contains("2018")) {
				ele.click();
				break;
			}
		}
		List<WebElement> monthsList = driver.findElements(By.cssSelector(".month"));
		for (WebElement ele : monthsList) {
			String text = ele.getText();
			if(text.contains("May")) {
				ele.click();
				break;
			}
		}
		List<WebElement> dayList = driver.findElements(By.cssSelector(".day"));
		for (WebElement ele : dayList) {
			String text = ele.getText();
			if(text.contains("1")) {
				ele.click();
				break;
			}
		}
		// end date
		endDateCalendar.click();
		List<WebElement> switchToYearEnd = driver.findElements(By.cssSelector(".picker-switch"));
		for (WebElement ele : switchToYearEnd) {
			String text = ele.getText();
			if(text.contains("2018")) {
				ele.click();
				break;
			}
		}
		List<WebElement> switchToYearEnd2 = driver.findElements(By.cssSelector(".picker-switch"));
		for (WebElement ele : switchToYearEnd2) {
			String text = ele.getText();
			if(text.contains("2018")) {
				ele.click();
				break;
			}
		}
		List<WebElement> yearsListEnd = driver.findElements(By.cssSelector(".year"));
		for (WebElement ele : yearsListEnd) {
			String text = ele.getText();
			if(text.contains("2018")) {
				ele.click();
				break;
			}
		}
		List<WebElement> monthsListEnd = driver.findElements(By.cssSelector(".month"));
		for (WebElement ele : monthsListEnd) {
			String text = ele.getText();
			if(text.contains("Jun")) {
				ele.click();
				break;
			}
		}
		List<WebElement> dayListEnd = driver.findElements(By.cssSelector(".day"));
		for (WebElement ele : dayListEnd) {
			String text = ele.getText();
			if(text.contains("30")) {
				ele.click();
				break;
			}
		}
		JavascriptLibrary.javascriptClickElement(driver, mileStoneON);
		JavascriptLibrary.javascriptClickElement(driver, completeAllPartsON);
		JavascriptLibrary.javascriptType(driver, leadTimeTextBox, leadTime);
		JavascriptLibrary.javascriptType(driver, workLoadTextBox, workLoad);
		JavascriptLibrary.javascriptClickElement(driver, addPeopleBtn);
		GenericLibrary.waitForElementVisibility(driver, peoplesSearchButton);
		JavascriptLibrary.javascriptClickElement(driver, stageAddPeopleCloseButton);
		JavascriptLibrary.javascriptClickElement(driver, stageFileUploadButton);
		GenericLibrary.waitForElementVisibility(driver, stageFileBrowseButton);
		JavascriptLibrary.javascriptClickElement(driver, addiQaptureButton);
		GenericLibrary.waitForElementVisibility(driver, selectiQapture1);
		JavascriptLibrary.javascriptClickElement(driver, selectiQapture1);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, selectiQapture2);
		Thread.sleep(1000);
		GenericLibrary.waitForElementVisibility(driver, addediQapture1);
		Assert.assertTrue(addediQapture1.isDisplayed(), "iQapture1 Not added");
		GenericLibrary.waitForElementVisibility(driver, addediQapture2);
		Assert.assertTrue(addediQapture2.isDisplayed(), "iQapture Not added");
		Reporter.log("Selected iQaptures Added to the stage successfully", true);
		JavascriptLibrary.javascriptClickElement(driver, stageSaveButton);
		JavascriptLibrary.javascriptClickElement(driver, stageCloseButton);
		Assert.assertTrue(addedStage.isDisplayed(), "Stage Not Added");
	}

	public void verify_Add_People_to_Project_and_Stage(String projectName, String description, String company, String stageName, String company2) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, addButton);
		JavascriptLibrary.javascriptClickElement(driver, addButton);
		GenericLibrary.waitForElementVisibility(driver, projectNameTextBox);
		JavascriptLibrary.javascriptType(driver, projectNameTextBox, projectName);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, description);
		Reporter.log("Before Adding People to Project Count is: "+peopleCount.getText(),true);
		JavascriptLibrary.javascriptClickElement(driver, addPeopleBtn);
		GenericLibrary.waitForElementVisibility(driver, peoplesSearchButton);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, peoplesSearchButton);
		peoplesSearchBox.sendKeys(company);
		JavascriptLibrary.javascriptClickElement(driver, airbusFRAddBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, closeButton);
		driver.navigate().refresh();
		Reporter.log("After Adding People to Project Count is: "+peopleCount.getText(),true);
		// Adding Peoples to stage
		JavascriptLibrary.javascriptClickElement(driver, addStageButoon);
		GenericLibrary.waitForElementVisibility(driver, stageNametextBox);
		stageNametextBox.sendKeys(stageName);
		Thread.sleep(1000);
		Reporter.log("Before Adding People to Stage Count is: "+peopleCount.getText(),true);
		JavascriptLibrary.javascriptClickElement(driver, AddStagePeoplesBtn);
		GenericLibrary.waitForElementVisibility(driver, peoplesSearchButton);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, peoplesSearchButton);
		peoplesSearchBox.sendKeys(company2);
		JavascriptLibrary.javascriptClickElement(driver, airbusFRAddBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, closeButton);
		driver.navigate().refresh();
		Reporter.log("After Adding People to Stage Count is: "+peopleCount.getText(),true);
	}

	public void verify_Upload_File_to_Project(String projectName, String description) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, addButton);
		JavascriptLibrary.javascriptClickElement(driver, addButton);
		GenericLibrary.waitForElementVisibility(driver, projectNameTextBox);
		JavascriptLibrary.javascriptType(driver, projectNameTextBox, projectName);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, description);
		JavascriptLibrary.javascriptClickElement(driver, uploadFileButton);
		// File 1
		StringSelection sel = new StringSelection("D:\\Value chain\\Images\\test.jpeg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		System.out.println("selection" +sel);
		Thread.sleep(1000);
		fileBrowseButton.click();
		System.out.println("Browse button clicked");
		Robot robot = new Robot();
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		// File 2
		StringSelection sel2 = new StringSelection("D:\\Value chain\\Images\\Aerospace Engineering.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel2,null);
		System.out.println("selection" +sel2);
		Thread.sleep(1000);
		fileBrowseButton.click();
		System.out.println("Browse button clicked");
		Robot robot2 = new Robot();
		Thread.sleep(1000);
		robot2.keyPress(KeyEvent.VK_ENTER);
		robot2.keyRelease(KeyEvent.VK_ENTER);
		robot2.keyPress(KeyEvent.VK_CONTROL);
		robot2.keyPress(KeyEvent.VK_V);
		robot2.keyRelease(KeyEvent.VK_CONTROL);
		robot2.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot2.keyPress(KeyEvent.VK_ENTER);
		robot2.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

		driver.navigate().refresh();
		Reporter.log("Uploaded files Count is: "+uploadCount.getText(),true);
	}

	public void verify_Delete_Added_Peoples_from_Project(String searchProject) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, projectSearchButton);
		JavascriptLibrary.javascriptClickElement(driver, projectSearchButton);
		projectSearchBox.sendKeys(searchProject);
		GenericLibrary.waitForElementVisibility(driver, Project_AddPeople);
		JavascriptLibrary.javascriptClickElement(driver, Project_AddPeople);
		GenericLibrary.waitForElementVisibility(driver, addPeopleBtn);
		Reporter.log("Initial People Count is: "+peopleCount.getText(),true);
		JavascriptLibrary.javascriptClickElement(driver, addPeopleBtn);
		JavascriptLibrary.javascriptClickElement(driver, peopleAddedHeadder);
		GenericLibrary.waitForElementVisibility(driver, valueChainRemovePeopleBtn);
		JavascriptLibrary.javascriptClickElement(driver, valueChainRemovePeopleBtn);
		GenericLibrary.waitForElementVisibility(driver, YesBtn);
		JavascriptLibrary.javascriptClickElement(driver, YesBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeButton);
		driver.navigate().refresh();
		Reporter.log("People Count after deleting people from project is: "+peopleCount.getText(),true);
	}

	public void verify_Remove_Uploaded_Files_from_Project(String searchProject) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, projectSearchButton);
		JavascriptLibrary.javascriptClickElement(driver, projectSearchButton);
		projectSearchBox.sendKeys(searchProject);
		GenericLibrary.waitForElementVisibility(driver, Project_UploadFiles);
		JavascriptLibrary.javascriptClickElement(driver, Project_UploadFiles);
		GenericLibrary.waitForElementVisibility(driver, uploadedFilesBtn);
		Reporter.log("Initially Uploaded files Count is: "+uploadCount.getText(),true);
		JavascriptLibrary.javascriptClickElement(driver, uploadedFilesBtn);
		GenericLibrary.waitForElementVisibility(driver, deleteUploadedFileBtn);
		JavascriptLibrary.javascriptClickElement(driver, deleteUploadedFileBtn);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Reporter.log("Uploaded files Count After deletion is: "+uploadCount.getText(),true);
	}

	public void verify_Export_Stages_into_Templates(String searchProject, String templateName) {
		GenericLibrary.waitForElementVisibility(driver, projectSearchButton);
		JavascriptLibrary.javascriptClickElement(driver, projectSearchButton);
		projectSearchBox.sendKeys(searchProject);
		GenericLibrary.waitForElementVisibility(driver, Project_Stages);
		JavascriptLibrary.javascriptClickElement(driver, Project_Stages);
		GenericLibrary.waitForElementVisibility(driver, saveAsTemplateBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveAsTemplateBtn);
		JavascriptLibrary.javascriptType(driver, templateNameTextBox, templateName);
		JavascriptLibrary.javascriptClickElement(driver, submitBtn);
		JavascriptLibrary.javascriptClickElement(driver, build);
		GenericLibrary.waitForElementVisibility(driver, templates);
		JavascriptLibrary.javascriptClickElement(driver, templates);
		Assert.assertTrue(createdTemplate.isDisplayed(), "Template Not Added");
	}

	public void verify_Please_enter_template_name_error_message(String searchProject) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, projectSearchButton);
		JavascriptLibrary.javascriptClickElement(driver, projectSearchButton);
		projectSearchBox.sendKeys(searchProject);
		GenericLibrary.waitForElementVisibility(driver, Project_Stages);
		JavascriptLibrary.javascriptClickElement(driver, Project_Stages);
		GenericLibrary.waitForElementVisibility(driver, saveAsTemplateBtn);
		JavascriptLibrary.javascriptClickElement(driver, saveAsTemplateBtn);
		JavascriptLibrary.javascriptClickElement(driver, submitBtn);
		Thread.sleep(1000);
		Assert.assertTrue(errorMessage.isDisplayed(),"Error message not displaying");
	}

	public void verify_Import_Template_Functionality(String projectName, String description, String template) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, addButton);
		JavascriptLibrary.javascriptClickElement(driver, addButton);
		GenericLibrary.waitForElementVisibility(driver, projectNameTextBox);
		JavascriptLibrary.javascriptType(driver, projectNameTextBox, projectName);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, description);
		JavascriptLibrary.javascriptClickElement(driver, importTemplateBtn);
		GenericLibrary.waitForElementVisibility(driver, templatesDropDown);
		GenericLibrary.selectElementByVisibleText(templatesDropDown, template);
		JavascriptLibrary.javascriptClickElement(driver, copyBtn);
		Assert.assertTrue(addedTemplate.isDisplayed(), "Template Not Added");
	}

	public void verify_Add_Parts_to_the_Project(String projectName, String description, 
			String partNumber, String drawingIssue, String productSpec, String salesOrder, String pricePerPart, String discipline, String PoNo,
			String company, String partIssue, String partDesc, String quantity, String risk, String processIssue, String link, String url) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, addButton);
		JavascriptLibrary.javascriptClickElement(driver, addButton);
		GenericLibrary.waitForElementVisibility(driver, projectNameTextBox);
		JavascriptLibrary.javascriptType(driver, projectNameTextBox, projectName);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, description);
		JavascriptLibrary.javascriptClickElement(driver, addPartsButton);
		GenericLibrary.waitForElementVisibility(driver, partNoTextBox);
		JavascriptLibrary.javascriptType(driver, partNoTextBox, partNumber);
		JavascriptLibrary.javascriptType(driver, drawingIssuesTextBox, drawingIssue);
		JavascriptLibrary.javascriptType(driver, productSpecTextBox, productSpec);
		JavascriptLibrary.javascriptType(driver, salesOrderTextBox, salesOrder);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, calenderButton);
		List<WebElement> switchToYear = driver.findElements(By.cssSelector(".picker-switch"));
		for (WebElement ele : switchToYear) {
			String text = ele.getText();
			if(text.contains("2018")) {
				ele.click();
				break;
			}
		}
		List<WebElement> switchToYear2 = driver.findElements(By.cssSelector(".picker-switch"));
		for (WebElement ele : switchToYear2) {
			String text = ele.getText();
			if(text.contains("2018")) {
				ele.click();
				break;
			}
		}
		Thread.sleep(1000);
		List<WebElement> yearsList = driver.findElements(By.cssSelector(".year"));
		for (WebElement ele : yearsList) {
			String text = ele.getText();
			if(text.contains("2018")) {
				ele.click();
				break;
			}
		}
		List<WebElement> monthsList = driver.findElements(By.cssSelector(".month"));
		for (WebElement ele : monthsList) {
			String text = ele.getText();
			if(text.contains("Jun")) {
				ele.click();
				break;
			}
		}
		List<WebElement> dayList = driver.findElements(By.cssSelector(".day"));
		for (WebElement ele : dayList) {
			String text = ele.getText();
			if(text.contains("25")) {
				ele.click();
				break;
			}
		}
		pricePerPartTextBox.sendKeys(pricePerPart);
		disciplineTextBox.sendKeys(discipline);
		Thread.sleep(1000);
		PoNumberTextBox.sendKeys(PoNo);
		Thread.sleep(1000);
		companiesTextBox.click();
		companiesSearchBox.sendKeys(company);
		airbusCustomer.click();
		partIssuetextBox.sendKeys(partIssue);
		partDescription.sendKeys(partDesc);
		partQuantityTextBox.sendKeys(quantity);
		Thread.sleep(1000);
		GenericLibrary.selectElementByVisibleText(riskDropDown, risk);
		Thread.sleep(1000);
		processIssueTextBox.sendKeys(processIssue);
		Thread.sleep(1000);
		documentsLink.click();
		Thread.sleep(1000);
		StringSelection sel2 = new StringSelection("D:\\Value chain\\Images\\aeroindia.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel2,null);
		System.out.println("selection" +sel2);
		Thread.sleep(1000);
		partsBrowseBtn.click();
		System.out.println("Browse button clicked");
		Robot robot2 = new Robot();
		Thread.sleep(1000);
		robot2.keyPress(KeyEvent.VK_ENTER);
		robot2.keyRelease(KeyEvent.VK_ENTER);
		robot2.keyPress(KeyEvent.VK_CONTROL);
		robot2.keyPress(KeyEvent.VK_V);
		robot2.keyRelease(KeyEvent.VK_CONTROL);
		robot2.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot2.keyPress(KeyEvent.VK_ENTER);
		robot2.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		addLinkBtn.click();
		linkName.sendKeys(link);
		linkUrl.sendKeys(url);
		linkSubmitBtn.click();
		Assert.assertTrue(addedLink.isDisplayed(), "Link Not Added");
		Reporter.log("Link Added Successfully", true);
		newPartCloseButton.click();
		Assert.assertTrue(PART_1.isDisplayed(), "Part Not Added");
	}

	public void verify_Error_Message_When_Upload_File_and_Add_Link_without_Part_No(String projectName, String description, 
			String link, String url) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, addButton);
		JavascriptLibrary.javascriptClickElement(driver, addButton);
		GenericLibrary.waitForElementVisibility(driver, projectNameTextBox);
		JavascriptLibrary.javascriptType(driver, projectNameTextBox, projectName);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, description);
		JavascriptLibrary.javascriptClickElement(driver, addPartsButton);
		GenericLibrary.waitForElementVisibility(driver, documentsLink);
		documentsLink.click();
		Thread.sleep(1000);
		StringSelection sel2 = new StringSelection("D:\\Value chain\\Images\\aeroindia.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel2,null);
		System.out.println("selection" +sel2);
		Thread.sleep(1000);
		partsBrowseBtn.click();
		System.out.println("Browse button clicked");
		Robot robot2 = new Robot();
		Thread.sleep(1000);
		robot2.keyPress(KeyEvent.VK_ENTER);
		robot2.keyRelease(KeyEvent.VK_ENTER);
		robot2.keyPress(KeyEvent.VK_CONTROL);
		robot2.keyPress(KeyEvent.VK_V);
		robot2.keyRelease(KeyEvent.VK_CONTROL);
		robot2.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot2.keyPress(KeyEvent.VK_ENTER);
		robot2.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		Assert.assertTrue(errorMessageWithoutPartNo.isDisplayed(),"Error message not displaying");
		Reporter.log("Parse failed:Invalid Part No. - Message Displayed successfully", true);
		addLinkBtn.click();
		linkName.sendKeys(link);
		linkUrl.sendKeys(url);
		linkSubmitBtn.click();
		Thread.sleep(1000);
		Assert.assertTrue(errorMessageWithoutPartNo.isDisplayed(),"Error message not displaying");
		Reporter.log("Parse failed:Invalid Part No. - Message Displayed successfully", true);
	}

	public void verify_Delete_Uploaded_img_and_Added_Link(String searchProject) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, projectSearchButton);
		JavascriptLibrary.javascriptClickElement(driver, projectSearchButton);
		projectSearchBox.sendKeys(searchProject);
		GenericLibrary.waitForElementVisibility(driver, Project_AddParts);
		JavascriptLibrary.javascriptClickElement(driver, Project_AddParts);
		GenericLibrary.waitForElementVisibility(driver, PART_1);
		JavascriptLibrary.javascriptClickElement(driver, PART_1);
		JavascriptLibrary.javascriptClickElement(driver, documentsLink);
		JavascriptLibrary.javascriptClickElement(driver, deleteBtn);
		GenericLibrary.waitForElementVisibility(driver, OkBtn);
		JavascriptLibrary.javascriptClickElement(driver, OkBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, deleteBtn);
		GenericLibrary.waitForElementVisibility(driver, OkBtn);
		JavascriptLibrary.javascriptClickElement(driver, OkBtn);
		Thread.sleep(1000);
	}

	public void verify_Download_Parts_Template(String searchProject) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, projectSearchButton);
		JavascriptLibrary.javascriptClickElement(driver, projectSearchButton);
		projectSearchBox.sendKeys(searchProject);
		GenericLibrary.waitForElementVisibility(driver, Project_AddParts);
		JavascriptLibrary.javascriptClickElement(driver, Project_AddParts);
		GenericLibrary.waitForElementVisibility(driver, PART_1);
		GenericLibrary.hoverWebelement(driver, uploadBtn);
		JavascriptLibrary.javascriptClickElement(driver, downloadPartsTemplateButton);
		Thread.sleep(2000);
	}

	public void verify_Upload_Parts_Template(String searchProject) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, projectSearchButton);
		JavascriptLibrary.javascriptClickElement(driver, projectSearchButton);
		projectSearchBox.sendKeys(searchProject);
		GenericLibrary.waitForElementVisibility(driver, Project_AddParts);
		JavascriptLibrary.javascriptClickElement(driver, Project_AddParts);
		GenericLibrary.waitForElementVisibility(driver, PART_1);
		GenericLibrary.hoverWebelement(driver, uploadBtn);
		GenericLibrary.uploadFile(uploadPartsTemplateButton, "D:\\Value chain\\Images\\WorkPackage Parts Template2.xlsx");
	}

	public void verify_Export_Parts_Table_To_Excel(String searchProject) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, projectSearchButton);
		JavascriptLibrary.javascriptClickElement(driver, projectSearchButton);
		projectSearchBox.sendKeys(searchProject);
		GenericLibrary.waitForElementVisibility(driver, Project_AddParts);
		JavascriptLibrary.javascriptClickElement(driver, Project_AddParts);
		GenericLibrary.waitForElementVisibility(driver, uploadIcon);
		GenericLibrary.moveToElement(driver, uploadIcon);
		exportToExcelBtn.click();
		Thread.sleep(2000);
	}


	public void verify_Edit_Parts_functionality(String searchProject, String PoNo) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, projectSearchButton);
		JavascriptLibrary.javascriptClickElement(driver, projectSearchButton);
		projectSearchBox.sendKeys(searchProject);
		GenericLibrary.waitForElementVisibility(driver, Project_AddParts);
		JavascriptLibrary.javascriptClickElement(driver, Project_AddParts);
		GenericLibrary.waitForElementVisibility(driver, PART_1);
		Reporter.log("PO number before editing: "+part_1_PoNo.getText(),true);
		JavascriptLibrary.javascriptClickElement(driver, PART_1);
		GenericLibrary.waitForElementVisibility(driver, filledPONoTextBox);
		filledPONoTextBox.click();
		PoNumberTextBox.clear();
		PoNumberTextBox.sendKeys(PoNo);
		partsCloseButton.click();
		Thread.sleep(1000);
		String after = part_1_PoNo.getText();
		Reporter.log("PO number after editing: "+after,true);
		Assert.assertEquals(PoNo, after,"Editing Not Done");
	}

	public void verify_Delete_Parts_functionality(String searchProject) {
		GenericLibrary.waitForElementVisibility(driver, projectSearchButton);
		JavascriptLibrary.javascriptClickElement(driver, projectSearchButton);
		projectSearchBox.sendKeys(searchProject);
		GenericLibrary.waitForElementVisibility(driver, Project_AddParts);
		JavascriptLibrary.javascriptClickElement(driver, Project_AddParts);
		GenericLibrary.waitForElementVisibility(driver, PART_1);
		JavascriptLibrary.javascriptClickElement(driver, PART_1);
		GenericLibrary.waitForElementVisibility(driver, deletePartBtn);
		JavascriptLibrary.javascriptClickElement(driver, deletePartBtn);
		GenericLibrary.waitForElementVisibility(driver, OkBtn);
		JavascriptLibrary.javascriptClickElement(driver, OkBtn);
	}

	public void verify_Edit_Stage(String searchProject, String newStageName) {
		GenericLibrary.waitForElementVisibility(driver, projectSearchButton);
		JavascriptLibrary.javascriptClickElement(driver, projectSearchButton);
		projectSearchBox.sendKeys(searchProject);
		GenericLibrary.waitForElementVisibility(driver, Project_Stages);
		JavascriptLibrary.javascriptClickElement(driver, Project_Stages);
		GenericLibrary.waitForElementVisibility(driver, Stage_1);
		Reporter.log("Stage name before editing: "+Stage_1.getText(),true);
		JavascriptLibrary.javascriptClickElement(driver, Stage_1);
		GenericLibrary.waitForElementVisibility(driver, filledStageNameTextBox);
		filledStageNameTextBox.click();
		stageNametextBox.clear();
		stageNametextBox.sendKeys(newStageName);
		stageNametextBox.sendKeys(Keys.TAB);
		JavascriptLibrary.javascriptClickElement(driver, stageCloseButton);
		GenericLibrary.waitForElementVisibility(driver, editedStage);
		String sn = editedStage.getText();
		Reporter.log("Stage name after editing: "+sn,true);
		Assert.assertEquals(newStageName, sn, "Stage Not Edited");
	}

	public void verify_Delete_Stage(String searchProject) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, projectSearchButton);
		JavascriptLibrary.javascriptClickElement(driver, projectSearchButton);
		projectSearchBox.sendKeys(searchProject);
		GenericLibrary.waitForElementVisibility(driver, Project_Stages);
		JavascriptLibrary.javascriptClickElement(driver, Project_Stages);
		GenericLibrary.waitForElementVisibility(driver, editedStage);
		JavascriptLibrary.javascriptClickElement(driver, editedStage);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, stageDeleteBtn);
		JavascriptLibrary.javascriptClickElement(driver, confirmStageDeleteBtn);
		Thread.sleep(2000);
	}

	public void verify_Edit_Project(String searchProject) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, projectSearchButton);
		JavascriptLibrary.javascriptClickElement(driver, projectSearchButton);
		projectSearchBox.sendKeys(searchProject);
		GenericLibrary.waitForElementVisibility(driver, Demo_Project);
		Thread.sleep(1000);
		Reporter.log("Date before Updating: "+projectDate.getText(), true);
		JavascriptLibrary.javascriptClickElement(driver, Demo_Project);
		GenericLibrary.waitForElementVisibility(driver, dateButton);
		JavascriptLibrary.javascriptClickElement(driver, dateButton);
		List<WebElement> switchToYear = driver.findElements(By.cssSelector(".picker-switch"));
		for (WebElement ele : switchToYear) {
			String text = ele.getText();
			if(text.contains("2018")) {
				ele.click();
				break;
			}
		}
		List<WebElement> switchToYear2 = driver.findElements(By.cssSelector(".picker-switch"));
		for (WebElement ele : switchToYear2) {
			String text = ele.getText();
			if(text.contains("2018")) {
				ele.click();
				break;
			}
		}
		Thread.sleep(1000);
		List<WebElement> yearsList = driver.findElements(By.cssSelector(".year"));
		for (WebElement ele : yearsList) {
			String text = ele.getText();
			if(text.contains("2018")) {
				ele.click();
				break;
			}
		}
		List<WebElement> monthsList = driver.findElements(By.cssSelector(".month"));
		for (WebElement ele : monthsList) {
			String text = ele.getText();
			if(text.contains("Jun")) {
				ele.click();
				break;
			}
		}
		List<WebElement> dayList = driver.findElements(By.cssSelector(".day"));
		for (WebElement ele : dayList) {
			String text = ele.getText();
			if(text.contains("10")) {
				ele.click();
				break;
			}
		}
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, pageBackButton);
		GenericLibrary.waitForElementVisibility(driver, projectSearchButton);
		JavascriptLibrary.javascriptClickElement(driver, projectSearchButton);
		projectSearchBox.sendKeys(searchProject);
		GenericLibrary.waitForElementVisibility(driver, Demo_Project);
		Thread.sleep(1000);
		Reporter.log("Date After Updating: "+projectDate.getText(), true);
	}

	public void verify_Launch_Project(String searchProject) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, projectSearchButton);
		JavascriptLibrary.javascriptClickElement(driver, projectSearchButton);
		projectSearchBox.sendKeys(searchProject);
		GenericLibrary.waitForElementVisibility(driver, Demo_Project);
		JavascriptLibrary.javascriptClickElement(driver, Demo_Project);
		GenericLibrary.waitForElementVisibility(driver, launchBtn);
		JavascriptLibrary.javascriptClickElement(driver, launchBtn);
		Thread.sleep(1000);
		Assert.assertTrue(launchConfirmationMessage.isDisplayed(),"Project Not Launched");
	}

	public void verify_Delete_Project(String searchProject) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, projectSearchButton);
		JavascriptLibrary.javascriptClickElement(driver, projectSearchButton);
		projectSearchBox.sendKeys(searchProject);
		GenericLibrary.waitForElementVisibility(driver, Demo_Project);
		JavascriptLibrary.javascriptClickElement(driver, Demo_Project);
		GenericLibrary.waitForElementVisibility(driver, projectDeleteBtn);
		JavascriptLibrary.javascriptClickElement(driver, projectDeleteBtn);
		GenericLibrary.waitForElementVisibility(driver, OkBtn);
		JavascriptLibrary.javascriptClickElement(driver, OkBtn);
		Thread.sleep(2000);
	}

	public void verify_Filter_Option() throws Exception {
		GenericLibrary.waitForElementVisibility(driver, filterBtn);
		JavascriptLibrary.javascriptClickElement(driver, filterBtn);
		// All
		GenericLibrary.selectElementByVisibleText(filterOptions, "All");
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript("scroll(0, 2000)");
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("scroll(0, 2000)");
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("scroll(0, 2000)");
		Thread.sleep(3000);
		List<WebElement> allProjectsList = driver.findElements(By.xpath("//tr/td[1]"));
		Reporter.log("All Projects Counts is: "+allProjectsList.size(), true);
		// Live
		GenericLibrary.selectElementByVisibleText(filterOptions, "Live");
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript("scroll(0, 2000)");
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("scroll(0, 2000)");
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("scroll(0, 2000)");
		Thread.sleep(3000);
		List<WebElement> liveProjectsList = driver.findElements(By.xpath("//tr/td[1]"));
		Reporter.log("Live Projects Counts is: "+liveProjectsList.size(), true);
		// Completed
		GenericLibrary.selectElementByVisibleText(filterOptions, "Completed");
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript("scroll(0, 2000)");
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("scroll(0, 2000)");
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("scroll(0, 2000)");
		Thread.sleep(3000);
		List<WebElement> completedProjectsList = driver.findElements(By.xpath("//tr/td[1]"));
		Reporter.log("Completed Projects Counts is: "+completedProjectsList.size(), true);
		// Created
		GenericLibrary.selectElementByVisibleText(filterOptions, "Created");
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript("scroll(0, 2000)");
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("scroll(0, 2000)");
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("scroll(0, 2000)");
		Thread.sleep(3000);
		List<WebElement> createdProjectsList = driver.findElements(By.xpath("//tr/td[1]"));
		Reporter.log("Created Projects Counts is: "+createdProjectsList.size(), true);
		// No Bid
		GenericLibrary.selectElementByVisibleText(filterOptions, "No Bid");
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript("scroll(0, 2000)");
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("scroll(0, 2000)");
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("scroll(0, 2000)");
		Thread.sleep(3000);
		List<WebElement> noBidProjectsList = driver.findElements(By.xpath("//tr/td[1]"));
		Reporter.log("No Bid Projects Counts is: "+noBidProjectsList.size(), true);
		// Cancelled
		GenericLibrary.selectElementByVisibleText(filterOptions, "Cancelled");
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript("scroll(0, 2000)");
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("scroll(0, 2000)");
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("scroll(0, 2000)");
		Thread.sleep(3000);
		List<WebElement> cancelledProjectsList = driver.findElements(By.xpath("//tr/td[1]"));
		Reporter.log("Cancelled Projects Counts is: "+cancelledProjectsList.size(), true);
		// Lost
		GenericLibrary.selectElementByVisibleText(filterOptions, "Lost");
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript("scroll(0, 2000)");
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("scroll(0, 2000)");
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("scroll(0, 2000)");
		Thread.sleep(3000);
		List<WebElement> lostProjectsList = driver.findElements(By.xpath("//tr/td[1]"));
		Reporter.log("Lost Projects Counts is: "+lostProjectsList.size(), true);
	}

	public void Create_project_for_Track(String projectName, String company, String description, String currency,
			String filePath, String stageName, String leadTime, String workLoad, String filePath2,
			String partNumber, String drawingIssue, String productSpec, String salesOrder, String pricePerPart,
			String discipline, String PoNo, String company2, String partIssue, String partDesc, String quantity,
			String risk, String processIssue, String link, String url, String doc) throws Exception {
		// Project
		GenericLibrary.waitForElementVisibility(driver, projectLink);
		JavascriptLibrary.javascriptClickElement(driver, addButton);
		GenericLibrary.waitForElementVisibility(driver, projectNameTextBox);
		JavascriptLibrary.javascriptType(driver, projectNameTextBox, projectName);
		customerFieldTextBox.sendKeys(Keys.ENTER);
		customerSearchBox.sendKeys(company);
		airbusCustomer.click();
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, description);
		JavascriptLibrary.javascriptClickElement(driver, dateButton);
		List<WebElement> dayList = driver.findElements(By.cssSelector(".day"));
		for (WebElement ele : dayList) {
			String text = ele.getText();
			if(text.contains("30")) {
				ele.click();
				break;
			}
		}
		currencyValueTextBox.sendKeys(currency);
		JavascriptLibrary.javascriptClickElement(driver, addPeopleBtn);
		GenericLibrary.waitForElementVisibility(driver, peoplesSearchButton);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, peoplesSearchButton);
		peoplesSearchBox.sendKeys(company);
		JavascriptLibrary.javascriptClickElement(driver, airbusFRAddBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, closeButton);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, uploadFileButton);
		GenericLibrary.uploadFile(fileBrowseButton, filePath);
		// Stage
		JavascriptLibrary.javascriptClickElement(driver, addStageButoon);
		GenericLibrary.waitForElementVisibility(driver, stageNametextBox);
		stageNametextBox.sendKeys(stageName);
		Thread.sleep(1000);
		// start date
		JavascriptLibrary.javascriptClickElement(driver, startDateCalendar);
		List<WebElement> switchToYear = driver.findElements(By.cssSelector(".picker-switch"));
		for (WebElement ele : switchToYear) {
			String text = ele.getText();
			if (text.contains("2018")) {
				ele.click();
				break;
			}
		}
		List<WebElement> switchToYear2 = driver.findElements(By.cssSelector(".picker-switch"));
		for (WebElement ele : switchToYear2) {
			String text = ele.getText();
			if (text.contains("2018")) {
				ele.click();
				break;
			}
		}
		Thread.sleep(1000);
		List<WebElement> yearsList = driver.findElements(By.cssSelector(".year"));
		for (WebElement ele : yearsList) {
			String text = ele.getText();
			if (text.contains("2018")) {
				ele.click();
				break;
			}
		}
		List<WebElement> monthsList = driver.findElements(By.cssSelector(".month"));
		for (WebElement ele : monthsList) {
			String text = ele.getText();
			if (text.contains("May")) {
				ele.click();
				break;
			}
		}
		List<WebElement> dayListStart = driver.findElements(By.cssSelector(".day"));
		for (WebElement ele : dayListStart) {
			String text = ele.getText();
			if (text.contains("1")) {
				ele.click();
				break;
			}
		}
		// end date
		endDateCalendar.click();
		List<WebElement> switchToYearEnd = driver.findElements(By.cssSelector(".picker-switch"));
		for (WebElement ele : switchToYearEnd) {
			String text = ele.getText();
			if (text.contains("2018")) {
				ele.click();
				break;
			}
		}
		List<WebElement> switchToYearEnd2 = driver.findElements(By.cssSelector(".picker-switch"));
		for (WebElement ele : switchToYearEnd2) {
			String text = ele.getText();
			if (text.contains("2018")) {
				ele.click();
				break;
			}
		}
		List<WebElement> yearsListEnd = driver.findElements(By.cssSelector(".year"));
		for (WebElement ele : yearsListEnd) {
			String text = ele.getText();
			if (text.contains("2018")) {
				ele.click();
				break;
			}
		}
		List<WebElement> monthsListEnd = driver.findElements(By.cssSelector(".month"));
		for (WebElement ele : monthsListEnd) {
			String text = ele.getText();
			if (text.contains("Jun")) {
				ele.click();
				break;
			}
		}
		List<WebElement> dayListEnd = driver.findElements(By.cssSelector(".day"));
		for (WebElement ele : dayListEnd) {
			String text = ele.getText();
			if (text.contains("30")) {
				ele.click();
				break;
			}
		}
		JavascriptLibrary.javascriptClickElement(driver, mileStoneON);
		JavascriptLibrary.javascriptClickElement(driver, completeAllPartsON);
		JavascriptLibrary.javascriptType(driver, leadTimeTextBox, leadTime);
		JavascriptLibrary.javascriptType(driver, workLoadTextBox, workLoad);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, stageFileUploadButton);
		GenericLibrary.uploadFile(stageFileBrowseButton, filePath2);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, addiQaptureButton);
		GenericLibrary.waitForElementVisibility(driver, selectiQapture1);
		JavascriptLibrary.javascriptClickElement(driver, selectiQapture1);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, selectiQapture2);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, stageSaveButton);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, stageCloseButton);
		Thread.sleep(1000);
		// Parts
		JavascriptLibrary.javascriptClickElement(driver, addPartsButton);
		GenericLibrary.waitForElementVisibility(driver, partNoTextBox);
		JavascriptLibrary.javascriptType(driver, partNoTextBox, partNumber);
		JavascriptLibrary.javascriptType(driver, drawingIssuesTextBox, drawingIssue);
		JavascriptLibrary.javascriptType(driver, productSpecTextBox, productSpec);
		JavascriptLibrary.javascriptType(driver, salesOrderTextBox, salesOrder);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, calenderButton);
		Thread.sleep(1000);
		List<WebElement> dayListParts = driver.findElements(By.cssSelector(".day"));
		for (WebElement ele : dayListParts) {
			String text = ele.getText();
			if(text.contains("20")) {
				ele.click();
				break;
			}
		}

		pricePerPartTextBox.sendKeys(pricePerPart);
		disciplineTextBox.sendKeys(discipline);
		Thread.sleep(1000);
		PoNumberTextBox.sendKeys(PoNo);
		Thread.sleep(1000);
		companiesTextBox.click();
		companiesSearchBox.sendKeys(company2);
		airbusCustomer.click();
		partIssuetextBox.sendKeys(partIssue);
		partDescription.sendKeys(partDesc);
		partQuantityTextBox.sendKeys(quantity);
		Thread.sleep(1000);
		GenericLibrary.selectElementByVisibleText(riskDropDown, risk);
		Thread.sleep(1000);
		processIssueTextBox.sendKeys(processIssue);
		Thread.sleep(1000);
		GenericLibrary.uploadFile(documentsLink, doc);
		addLinkBtn.click();
		linkName.sendKeys(link);
		linkUrl.sendKeys(url);
		linkSubmitBtn.click();
		Thread.sleep(1000);
		newPartCloseButton.click();
		GenericLibrary.waitForElementVisibility(driver, launchBtn);
		JavascriptLibrary.javascriptClickElement(driver, launchBtn);
	}
	
	public void verify_Create_project_for_Unconditional_completion(String projectName, String description, String stageName, String partNumber) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, projectLink);
		JavascriptLibrary.javascriptClickElement(driver, addButton);
		GenericLibrary.waitForElementVisibility(driver, projectNameTextBox);
		JavascriptLibrary.javascriptType(driver, projectNameTextBox, projectName);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, description);
		JavascriptLibrary.javascriptClickElement(driver, addStageButoon);
		GenericLibrary.waitForElementVisibility(driver, stageNametextBox);
		stageNametextBox.sendKeys(stageName);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, stageSaveButton);
		JavascriptLibrary.javascriptClickElement(driver, stageCloseButton);
		JavascriptLibrary.javascriptClickElement(driver, addPartsButton);
		GenericLibrary.waitForElementVisibility(driver, partNoTextBox);
		JavascriptLibrary.javascriptType(driver, partNoTextBox, partNumber);
		partNoTextBox.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		newPartCloseButton.click();
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, launchBtn);
		Thread.sleep(1000);
	}
}















