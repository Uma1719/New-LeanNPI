package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.TestBase;
import com.util.GenericLibrary;
import com.util.JavascriptLibrary;

public class TrackPage extends TestBase{
	// Objects Repository(OR):........................................................................
	@FindBy(xpath="//a[text()='Track']")
	WebElement trackLink;
	
	// Open project from track section
	@FindBy(css=".l-btn-icon.icon-blue-search2-round-32")
	WebElement searchBtn;
	
	@FindBy(css=".searcher-text")
	WebElement searchBox;
	
	@FindBy(xpath="//a[text()='DEMO']")
	WebElement demoProject;
	
	@FindBy(xpath="//div[5]/table/tbody/tr/td[3]/a")
	WebElement part1;
	
	// View parts info
	@FindBy(xpath="//a[text()='Part Info ']")
	WebElement partInfoTab;
	
	// Update info box
	@FindBy(xpath=".//*[@id='divP_DRAWINGISSUE']")
	WebElement drawingIssue_Out;
	
	@FindBy(xpath=".//*[@id='P_DRAWINGISSUE']")
	WebElement drawingIssue_In;
	
	@FindBy(xpath=".//*[@id='divP_REQUIREDATE']/span/span")
	WebElement requirementDate;
	
	@FindBy(xpath=".//*[@id='divP_PRICE']")
	WebElement pricePerPart_Out;
	
	@FindBy(xpath=".//*[@id='P_PRICE']")
	WebElement pricePerPart_In;
	
	@FindBy(xpath=".//*[@id='divP_PONUMBER']")
	WebElement poNumber_Out;
	
	@FindBy(xpath=".//*[@id='P_PONUMBER']")
	WebElement poNumber_In;
	
	@FindBy(xpath=".//*[@id='divP_PARTISSUE']")
	WebElement partIssue_Out;
	
	@FindBy(xpath=".//*[@id='P_PARTISSUE']")
	WebElement partIssue_In;
	
	@FindBy(xpath=".//*[@id='divP_QTY']")
	WebElement quantity_Out;
	
	@FindBy(xpath=".//*[@id='P_QTY']")
	WebElement quantity_In;
	
	@FindBy(xpath="//a[text()='Part Info ']//following::button[2]")
	WebElement partCloseBtn;
	
	// Add activities to gate
	@FindBy(xpath="//td[5]/div[1]/span[1]")
	WebElement gateBtn;
	
	@FindBy(xpath=".//*[@id='btnAddActivity']/span/span[2]")
	WebElement addActivityBtn;
	
	@FindBy(xpath=".//*[@id='PSA_DESC']")
	WebElement activityDescrptionTextBox;
	
	@FindBy(xpath=".//*[@id='btnActPeople']")
	WebElement addPeopleBtn;
	
	@FindBy(css=".l-btn-icon.icon-blue-search2-round-32")
	WebElement peoplesSearchButton;

	@FindBy(xpath="//input[@style='width:350px;']")
	WebElement peoplesSearchBox;
	
	@FindBy(xpath="//div[text()='Company']//following::span[2]")
	WebElement airbusFRAddBtn;
	
	@FindBy(xpath=".//*[@id='divPeopleDlg']/div/div/div[3]/button")
	WebElement gatePeopleCloseBtn;
	
	@FindBy(xpath=".//*[@id='btnPSA_STARTTIME']/span/button")
	WebElement startDateBtn;
	
	@FindBy(xpath=".//*[@id='btnPSActDate']/span/button")
	WebElement endDateBtn;
	
	@FindBy(xpath=".//*[@id='ImgDropzone']/div")
	WebElement attachFileBtn;
	
	@FindBy(xpath=".//*[@id='txtNote']")
	WebElement commentBox;
	
	@FindBy(xpath=".//*[@id='submitNote']")
	WebElement submitCommentBtn;
	
	@FindBy(xpath="//span[text()='+']")
	WebElement addTagBtn;
	
	@FindBy(xpath="//input[@type='search']")
	WebElement tageSearchBox;
	
	@FindBy(xpath="//h4[text()='Tags']//following::button[2]")
	WebElement tagCloseBtn;
	
	@FindBy(xpath=".//*[@id='ActivityInfocontent']/div[3]/button")
	WebElement activityCloseBtn;
	
	@FindBy(xpath="//div[text()='ACT 1']")
	WebElement createdActivity;
	
	// Download uploaded image 
	@FindBy(xpath=".//*[@id='ImgDropzone']//following::img[1]")
	WebElement uploadedImage;
	
	// Delete uploaded image from activity
	@FindBy(xpath=".//*[@id='ImgDropzone']//following::i[1]")
	WebElement imageDeleteBtn;
	
	@FindBy(xpath="//button[text()='OK']")
	WebElement imageDelete_OK;
	
	// Delete added tags
	@FindBy(xpath="//h4[text()='Tags']//following::span[text()='×'][1]")
	WebElement tagDeleteBtn;
	
	// Send activity email
	@FindBy(xpath=".//*[@id='btnPSSendEmail']")
	WebElement sendEmailBtn;
	
	@FindBy(xpath="//*[text()='An notification email has been sent.']")
	WebElement notificationMessage;
	
	// Complete Activity
	@FindBy(xpath=".//*[@id='btnActivityComplete']/span/span[2]")
	WebElement completeActivityBtn;
	
	// Delete Activity
	@FindBy(xpath=".//*[@id='btnActivityDelete']/span/span[2]")
	WebElement deleteActivityBtn;
	
	@FindBy(xpath="//button[text()='OK']")
	WebElement activityDeleteConfirm_OK;
	
	// Add Comments to Gate
	@FindBy(xpath=".//*[@id='noteText']")
	WebElement gateCommentTextBox;
	
	@FindBy(xpath=".//*[@id='noteText']//following::a[1]")
	WebElement addCommentBtn;
	
	@FindBy(xpath="//h5[text()='My Comment']")
	WebElement addedComment;
	
	// Fill the Questionnaire in the Gate
	@FindBy(xpath=".//*[@id='divPS_LEADTIME']")
	WebElement leadTimeTextBox_Out;
	
	@FindBy(xpath=".//*[@id='PS_LEADTIME']")
	WebElement leadTimeTextBox_In;
	
	@FindBy(xpath=".//*[@id='divPS_WORKLOAD']")
	WebElement workLoad_Out;
	
	@FindBy(xpath=".//*[@id='PS_WORKLOAD']")
	WebElement workLoad_In;
	
	@FindBy(xpath="//label[text()='Files']//following::span[3]")
	WebElement fileBtn;
	
	@FindBy(xpath=".//*[@id='docsDropzone']")
	WebElement fileBrowseBtn;
	
	@FindBy(xpath="//label[text()='Files']")
	WebElement FilesText;
	
	// View logs of Questionnaire
	@FindBy(xpath=".//*[@id='LogsBtn']/span/span[2]")
	WebElement logsBtn;
	
	@FindBy(xpath="//span[text()='LOGS']")
	WebElement logsTab;
	
	// Approve this stage as completed
	@FindBy(xpath=".//*[@id='btnComplete']/span/span[2]")
	WebElement approveStageAsCompletedBtn;
	
	@FindBy(xpath="//button[text()='OK']")
	WebElement confirmStageCompletion_OK;
	
	// Unconditional completion 
	@FindBy(xpath="//a[text()='Complete me']")
	WebElement completeMeProject;
	
	@FindBy(xpath="//td[5]/div[1]/span[1]")
	WebElement gateToBeCompletedBtn;
	
	@FindBy(xpath=".//*[@id='divToolbar_left']/a[3]/span/span[2]")
	WebElement unconditionalCompletion;
	
	
	
	
	
	
	
	
	

	// Initializing the Page Objects:................................................................
	public TrackPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:......................................................................................
	
	public void verify_TrackPage() {
		GenericLibrary.waitForElementVisibility(driver, trackLink);
		Assert.assertTrue(trackLink.isDisplayed(), "Unable to Navigate Track Page");
	}
	
	public void verify_open_project_from_track_section(String projectName) {
		GenericLibrary.waitForElementVisibility(driver, searchBtn);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		JavascriptLibrary.javascriptType(driver, searchBox, projectName);
		GenericLibrary.waitForElementVisibility(driver, demoProject);
		JavascriptLibrary.javascriptClickElement(driver, demoProject);
		GenericLibrary.waitForElementVisibility(driver, part1);
		Assert.assertTrue(part1.isDisplayed(), "Project Not Opened");
	}
	
	public void verify_view_parts_info(String projectName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, searchBtn);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		JavascriptLibrary.javascriptType(driver, searchBox, projectName);
		GenericLibrary.waitForElementVisibility(driver, demoProject);
		JavascriptLibrary.javascriptClickElement(driver, demoProject);
		GenericLibrary.waitForElementVisibility(driver, part1);
		JavascriptLibrary.javascriptClickElement(driver, part1);
		GenericLibrary.waitForElementVisibility(driver, partInfoTab);
		Assert.assertTrue(partInfoTab.isDisplayed(), "Part Info Not Displaying");
	}
	
	public void verify_update_part_info(String projectName, String drawingIssue, String pricePerPart,
			String poNumber, String partIssue, String quantity) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, searchBtn);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		JavascriptLibrary.javascriptType(driver, searchBox, projectName);
		GenericLibrary.waitForElementVisibility(driver, demoProject);
		JavascriptLibrary.javascriptClickElement(driver, demoProject);
		GenericLibrary.waitForElementVisibility(driver, part1);
		JavascriptLibrary.javascriptClickElement(driver, part1);
		GenericLibrary.waitForElementVisibility(driver, partInfoTab);
		JavascriptLibrary.javascriptClickElement(driver, drawingIssue_Out);
		JavascriptLibrary.javascriptType(driver, drawingIssue_In, drawingIssue);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, requirementDate);
		Thread.sleep(1000);
		List<WebElement> dayList = driver.findElements(By.cssSelector(".day"));
		for (WebElement ele : dayList) {
			String text = ele.getText();
			if (text.contains("30")) {
				ele.click();
				break;
			}
		}
		JavascriptLibrary.javascriptClickElement(driver, pricePerPart_Out);
		JavascriptLibrary.javascriptType(driver, pricePerPart_In, pricePerPart);
		JavascriptLibrary.javascriptClickElement(driver, poNumber_Out);
		JavascriptLibrary.javascriptType(driver, poNumber_In, poNumber);
		JavascriptLibrary.javascriptClickElement(driver, partIssue_Out);
		JavascriptLibrary.javascriptType(driver, partIssue_In, partIssue);
		JavascriptLibrary.javascriptClickElement(driver, quantity_Out);
		JavascriptLibrary.javascriptType(driver, quantity_In, quantity);
		JavascriptLibrary.javascriptClickElement(driver, partCloseBtn);
		Thread.sleep(1000);
	} 
	
	public void verify_Add_activities_to_Gate(String projectName, String company, String description,
			String filePath, String comment, String tag) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, searchBtn);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		JavascriptLibrary.javascriptType(driver, searchBox, projectName);
		GenericLibrary.waitForElementVisibility(driver, demoProject);
		JavascriptLibrary.javascriptClickElement(driver, demoProject);
		GenericLibrary.waitForElementVisibility(driver, gateBtn);
		JavascriptLibrary.javascriptClickElement(driver, gateBtn);
		GenericLibrary.waitForElementVisibility(driver, addActivityBtn);
		JavascriptLibrary.javascriptClickElement(driver, addActivityBtn);
		GenericLibrary.waitForElementVisibility(driver, activityDescrptionTextBox);
		JavascriptLibrary.javascriptType(driver, activityDescrptionTextBox, description);
		JavascriptLibrary.javascriptClickElement(driver, addPeopleBtn);
		GenericLibrary.waitForElementVisibility(driver, peoplesSearchButton);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, peoplesSearchButton);
		peoplesSearchBox.sendKeys(company);
		JavascriptLibrary.javascriptClickElement(driver, airbusFRAddBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, gatePeopleCloseBtn);
		JavascriptLibrary.javascriptClickElement(driver, startDateBtn);
		List<WebElement> startDayList = driver.findElements(By.cssSelector(".day"));
		for (WebElement ele : startDayList) {
			String text = ele.getText();
			if (text.contains("15")) {
				ele.click();
				break;
			}
		}
		JavascriptLibrary.javascriptClickElement(driver, endDateBtn);
		List<WebElement> endDayList = driver.findElements(By.cssSelector(".day"));
		for (WebElement ele : endDayList) {
			String text = ele.getText();
			if (text.contains("21")) {
				ele.click();
				break;
			}
		}
		GenericLibrary.uploadFile(attachFileBtn, filePath);
		JavascriptLibrary.javascriptType(driver, commentBox, comment);
		JavascriptLibrary.javascriptClickElement(driver, submitCommentBtn);
		JavascriptLibrary.javascriptClickElement(driver, addTagBtn);
		GenericLibrary.waitForElementVisibility(driver, tageSearchBox);
		JavascriptLibrary.javascriptType(driver, tageSearchBox, tag);
		Thread.sleep(1000);
		tageSearchBox.sendKeys(Keys.ENTER);
		JavascriptLibrary.javascriptClickElement(driver, tagCloseBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, activityCloseBtn);
		GenericLibrary.waitForElementVisibility(driver, createdActivity);
		Assert.assertTrue(createdActivity.isDisplayed(), "Activity Not Added");
	}
	
	public void verify_Download_file_from_Activity(String projectName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, searchBtn);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		JavascriptLibrary.javascriptType(driver, searchBox, projectName);
		GenericLibrary.waitForElementVisibility(driver, demoProject);
		JavascriptLibrary.javascriptClickElement(driver, demoProject);
		GenericLibrary.waitForElementVisibility(driver, gateBtn);
		JavascriptLibrary.javascriptClickElement(driver, gateBtn);
		GenericLibrary.waitForElementVisibility(driver, createdActivity);
		JavascriptLibrary.javascriptClickElement(driver, createdActivity);
		GenericLibrary.waitForElementVisibility(driver, uploadedImage);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, uploadedImage);
		Thread.sleep(2000);
	}
	
	public void verify_Delete_uploaded_image_from_Activity(String projectName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, searchBtn);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		JavascriptLibrary.javascriptType(driver, searchBox, projectName);
		GenericLibrary.waitForElementVisibility(driver, demoProject);
		JavascriptLibrary.javascriptClickElement(driver, demoProject);
		GenericLibrary.waitForElementVisibility(driver, gateBtn);
		JavascriptLibrary.javascriptClickElement(driver, gateBtn);
		GenericLibrary.waitForElementVisibility(driver, createdActivity);
		JavascriptLibrary.javascriptClickElement(driver, createdActivity);
		GenericLibrary.waitForElementVisibility(driver, imageDeleteBtn);
		JavascriptLibrary.javascriptClickElement(driver, imageDeleteBtn);
		JavascriptLibrary.javascriptClickElement(driver, imageDelete_OK);
	}
	
	public void verify_Delete_added_Tag_from_Activity(String projectName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, searchBtn);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		JavascriptLibrary.javascriptType(driver, searchBox, projectName);
		GenericLibrary.waitForElementVisibility(driver, demoProject);
		JavascriptLibrary.javascriptClickElement(driver, demoProject);
		GenericLibrary.waitForElementVisibility(driver, gateBtn);
		JavascriptLibrary.javascriptClickElement(driver, gateBtn);
		GenericLibrary.waitForElementVisibility(driver, createdActivity);
		JavascriptLibrary.javascriptClickElement(driver, createdActivity);
		GenericLibrary.waitForElementVisibility(driver, addTagBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, addTagBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, tagDeleteBtn);
		JavascriptLibrary.javascriptClickElement(driver, tagCloseBtn);
	}
	
	public void verify_Edit_Activity(String projectName, String filePath) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, searchBtn);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		JavascriptLibrary.javascriptType(driver, searchBox, projectName);
		GenericLibrary.waitForElementVisibility(driver, demoProject);
		JavascriptLibrary.javascriptClickElement(driver, demoProject);
		GenericLibrary.waitForElementVisibility(driver, gateBtn);
		JavascriptLibrary.javascriptClickElement(driver, gateBtn);
		GenericLibrary.waitForElementVisibility(driver, createdActivity);
		JavascriptLibrary.javascriptClickElement(driver, createdActivity);
		GenericLibrary.waitForElementVisibility(driver, attachFileBtn);
		GenericLibrary.uploadFile(attachFileBtn, filePath);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, activityCloseBtn);
	}
	
	public void verify_Send_Activity_email(String projectName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, searchBtn);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		JavascriptLibrary.javascriptType(driver, searchBox, projectName);
		GenericLibrary.waitForElementVisibility(driver, demoProject);
		JavascriptLibrary.javascriptClickElement(driver, demoProject);
		GenericLibrary.waitForElementVisibility(driver, gateBtn);
		JavascriptLibrary.javascriptClickElement(driver, gateBtn);
		GenericLibrary.waitForElementVisibility(driver, createdActivity);
		JavascriptLibrary.javascriptClickElement(driver, createdActivity);
		GenericLibrary.waitForElementVisibility(driver, sendEmailBtn);
		JavascriptLibrary.javascriptClickElement(driver, sendEmailBtn);
		GenericLibrary.waitForElementVisibility(driver, notificationMessage);
		Assert.assertTrue(notificationMessage.isDisplayed(), "Email Not Sent");
		JavascriptLibrary.javascriptClickElement(driver, activityCloseBtn);
	}
	
	public void verify_Complete_Activity(String projectName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, searchBtn);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		JavascriptLibrary.javascriptType(driver, searchBox, projectName);
		GenericLibrary.waitForElementVisibility(driver, demoProject);
		JavascriptLibrary.javascriptClickElement(driver, demoProject);
		GenericLibrary.waitForElementVisibility(driver, gateBtn);
		JavascriptLibrary.javascriptClickElement(driver, gateBtn);
		GenericLibrary.waitForElementVisibility(driver, createdActivity);
		JavascriptLibrary.javascriptClickElement(driver, createdActivity);
		GenericLibrary.waitForElementVisibility(driver, completeActivityBtn);
		JavascriptLibrary.javascriptClickElement(driver, completeActivityBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, activityCloseBtn);
	}
	
	public void verify_Delete_Activity(String projectName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, searchBtn);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		JavascriptLibrary.javascriptType(driver, searchBox, projectName);
		GenericLibrary.waitForElementVisibility(driver, demoProject);
		JavascriptLibrary.javascriptClickElement(driver, demoProject);
		GenericLibrary.waitForElementVisibility(driver, gateBtn);
		JavascriptLibrary.javascriptClickElement(driver, gateBtn);
		GenericLibrary.waitForElementVisibility(driver, createdActivity);
		JavascriptLibrary.javascriptClickElement(driver, createdActivity);
		GenericLibrary.waitForElementVisibility(driver, deleteActivityBtn);
		JavascriptLibrary.javascriptClickElement(driver, deleteActivityBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, activityDeleteConfirm_OK);
		JavascriptLibrary.javascriptClickElement(driver, activityCloseBtn);
	}
	
	public void verify_Add_Comment_to_Gate(String projectName, String comment) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, searchBtn);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		JavascriptLibrary.javascriptType(driver, searchBox, projectName);
		GenericLibrary.waitForElementVisibility(driver, demoProject);
		JavascriptLibrary.javascriptClickElement(driver, demoProject);
		GenericLibrary.waitForElementVisibility(driver, gateBtn);
		JavascriptLibrary.javascriptClickElement(driver, gateBtn);
		GenericLibrary.waitForElementVisibility(driver, gateCommentTextBox);
		JavascriptLibrary.javascriptType(driver, gateCommentTextBox, comment);
		JavascriptLibrary.javascriptClickElement(driver, addCommentBtn);
		GenericLibrary.waitForElementVisibility(driver, addedComment);
		Assert.assertTrue(addedComment.isDisplayed(), "Comment Not Added");
	}
	
	public void verify_Fill_The_Questionnaire_in_the_Gate(String projectName, String leadTime, String workLoad, String filePath) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, searchBtn);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		JavascriptLibrary.javascriptType(driver, searchBox, projectName);
		GenericLibrary.waitForElementVisibility(driver, demoProject);
		JavascriptLibrary.javascriptClickElement(driver, demoProject);
		GenericLibrary.waitForElementVisibility(driver, gateBtn);
		JavascriptLibrary.javascriptClickElement(driver, gateBtn);
		GenericLibrary.waitForElementVisibility(driver, leadTimeTextBox_Out);
		JavascriptLibrary.javascriptClickElement(driver, leadTimeTextBox_Out);
		JavascriptLibrary.javascriptType(driver, leadTimeTextBox_In, leadTime);
		JavascriptLibrary.javascriptClickElement(driver, workLoad_Out);
		JavascriptLibrary.javascriptType(driver, workLoad_In, workLoad);
		JavascriptLibrary.javascriptClickElement(driver, fileBtn);
		GenericLibrary.waitForElementVisibility(driver, fileBrowseBtn);
		GenericLibrary.uploadFile(fileBrowseBtn, filePath);
		JavascriptLibrary.javascriptClickElement(driver, FilesText);
	}
	
	public void verify_View_log_of_Questionnaire(String projectName) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, searchBtn);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		JavascriptLibrary.javascriptType(driver, searchBox, projectName);
		GenericLibrary.waitForElementVisibility(driver, demoProject);
		JavascriptLibrary.javascriptClickElement(driver, demoProject);
		GenericLibrary.waitForElementVisibility(driver, gateBtn);
		JavascriptLibrary.javascriptClickElement(driver, gateBtn);
		GenericLibrary.waitForElementVisibility(driver, logsBtn);
		JavascriptLibrary.javascriptClickElement(driver, logsBtn);
		GenericLibrary.waitForElementVisibility(driver, logsTab);
		Assert.assertTrue(logsTab.isDisplayed(), "Logs Not Displayed");
	}	

	public void verify_Approve_this_stage_as_Completed(String projectName) {
		GenericLibrary.waitForElementVisibility(driver, searchBtn);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		JavascriptLibrary.javascriptType(driver, searchBox, projectName);
		GenericLibrary.waitForElementVisibility(driver, demoProject);
		JavascriptLibrary.javascriptClickElement(driver, demoProject);
		GenericLibrary.waitForElementVisibility(driver, gateBtn);
		JavascriptLibrary.javascriptClickElement(driver, gateBtn);
		GenericLibrary.waitForElementVisibility(driver, approveStageAsCompletedBtn);
		JavascriptLibrary.javascriptClickElement(driver, approveStageAsCompletedBtn);
		JavascriptLibrary.javascriptClickElement(driver, confirmStageCompletion_OK);
	}
	
	public void verify_Unconditional_Completion(String projectName) {
		GenericLibrary.waitForElementVisibility(driver, searchBtn);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		JavascriptLibrary.javascriptType(driver, searchBox, projectName);
		GenericLibrary.waitForElementVisibility(driver, completeMeProject);
		JavascriptLibrary.javascriptClickElement(driver, completeMeProject);
		GenericLibrary.waitForElementVisibility(driver, gateToBeCompletedBtn);
		JavascriptLibrary.javascriptClickElement(driver, gateToBeCompletedBtn);
		GenericLibrary.waitForElementVisibility(driver, unconditionalCompletion);
		JavascriptLibrary.javascriptClickElement(driver, unconditionalCompletion);
	}
	
	
	
	
	
	
	
	
}
