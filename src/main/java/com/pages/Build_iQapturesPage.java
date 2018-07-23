package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.base.TestBase;
import com.util.GenericLibrary;
import com.util.JavascriptLibrary;

public class Build_iQapturesPage extends TestBase {

	// Objects Repository(OR):........................................................................
	// Page verification 
	@FindBy(xpath="//a[text()='iQapture']")
	WebElement iQaptureLink;

	// Create Questionnaire 
	@FindBy(css=".l-btn-icon.icon-add")
	WebElement addiQaptureBtn;

	@FindBy(css="#DS_NAME")
	WebElement questionnaireNametextBox;

	@FindBy(xpath=".//*[@id='btnSave']/span/span[2]")
	WebElement saveBtn;

	@FindBy(xpath=".//*[@id='btnPageBack']/span/span[2]")
	WebElement backBtn;

	@FindBy(xpath=".//*[@id='txtSearch']")
	WebElement searchBox;

	@FindBy(css=".l-btn-icon.icon-blue-search2-round-32")
	WebElement searchBtn;

	@FindBy(xpath="//h3[text()='Test Questionnaire']")
	WebElement TestQuestionnaire;

	// Please enter questionnaire name error message 
	@FindBy(xpath=".//*[@id='divError_DS_NAME']")
	WebElement pleaseEnterQuationnaireName_ErrorMessage;

	// Upload image to questionnaire
	@FindBy(xpath=".//*[@id='imgDataset']")
	WebElement uploadImageBtn;

	// Create fields
	@FindBy(xpath="//div[@title='New Item']")
	WebElement addFieldBtn;

	@FindBy(xpath=".//*[@id='F_DESC']")
	WebElement descriptionTextBox;

	@FindBy(xpath="//label[@title='Large box']")
	WebElement largeBox;

	@FindBy(xpath=".//*[@id='divFieldMainType2']/span")
	WebElement date;

	@FindBy(xpath=".//*[@id='divFieldMainType5']/span")
	WebElement uploadFile;

	@FindBy(xpath=".//*[@id='divFieldMainType9']/span")
	WebElement advanced;

	@FindBy(xpath=".//*[@id='divFieldMainType10']/span")
	WebElement section;

	@FindBy(xpath=".//*[@id='divFieldMainType3']/span")
	WebElement number;

	@FindBy(xpath=".//*[@id='divFieldMainType1']/span")
	WebElement multiChoice;

	@FindBy(xpath=".//*[@id='divFieldMainType11']/span")
	WebElement activity;

	// Text - Advanced settings
	@FindBy(xpath=".//*[@id='showFieldMore']")
	WebElement moreBtn;

	@FindBy(xpath=".//*[@id='rdLevel2']")
	WebElement level2Btn;

	@FindBy(xpath=".//*[@id='rdLevel3']")
	WebElement level3Btn;

	@FindBy(xpath=".//*[@id='rdLevel4']")
	WebElement level4Btn;

	@FindBy(xpath=".//*[@id='rdLevel5']")
	WebElement level5Btn;

	@FindBy(xpath=".//*[@id='trNumbering']/div[1]/label[2]")
	WebElement numberManual;

	@FindBy(xpath=".//*[@id='F_CUTMNUMBERING']")
	WebElement numberManualTextBox;

	@FindBy(xpath=".//*[@id='trNumbering']/div[1]/label[3]")
	WebElement numberNone;

	@FindBy(xpath=".//*[@id='trMandatory']/div[1]/div[1]/label[1]")
	WebElement mandatoryYes;

	@FindBy(xpath=".//*[@id='trFieldComment']/div/label[1]")
	WebElement commentYes;

	@FindBy(xpath=".//*[@id='trExtendAnswer']/div/label[1]")
	WebElement additionalAnswersYes;

	@FindBy(xpath=".//*[@id='F_HINT']")
	WebElement hintTextBox;

	@FindBy(xpath="//*[text()='ADVANCED']/following::button[1]")
	WebElement closeMore;

	// MultiChoice 
	@FindBy(xpath=".//*[@id='divFieldSubTypes']/label[2]")
	WebElement dropDowns;

	@FindBy(xpath=".//*[@id='divFieldSubTypes']/label[3]")
	WebElement checkBoxes;

	@FindBy(xpath=".//*[@id='DropdownDefault']/a")
	WebElement defaultDropDownBtn;

	@FindBy(xpath=".//*[@id='btnHML']")
	WebElement highMediumLowBtn;

	@FindBy(xpath=".//*[@id='btnYNN']")
	WebElement yesNoNaBtn;

	// Date
	@FindBy(xpath=".//*[@id='divFieldSubTypes']/label[2]")
	WebElement dateAndTime;

	@FindBy(xpath=".//*[@id='divFieldSubTypes']/label[3]")
	WebElement time;

	@FindBy(xpath=".//*[@id='divFieldSubTypes']/label[4]")
	WebElement weekAndDate;

	// Date Advanced Settings
	@FindBy(xpath=".//*[@id='trDT_DefaultVal']/div/label[1]")
	WebElement defaultValueYes;

	// Number Questionnaire 
	@FindBy(xpath=".//*[@id='divFieldSubTypes']/label[1]")
	WebElement integerOption;

	@FindBy(xpath=".//*[@id='divFieldSubTypes']/label[2]")
	WebElement floatOption;

	@FindBy(xpath=".//*[@id='divFieldSubTypes']/label[3]")
	WebElement percentageOption;

	@FindBy(xpath=".//*[@id='divFieldSubTypes']/label[4]")
	WebElement currencyOption;

	@FindBy(xpath=".//*[@id='divFieldSubTypes']/label[5]")
	WebElement sliderOption;

	@FindBy(xpath=".//*[@id='F_MINVALUE']")
	WebElement sliderMinValue;

	@FindBy(xpath=".//*[@id='F_MAXVALUE']")
	WebElement sliderMaxValue;

	@FindBy(xpath=".//*[@id='F_STEPVALUE']")
	WebElement sliderStepValue;

	// Number - Advanced Settings
	@FindBy(xpath=".//*[@id='trScore']/div[1]/div/label[1]")
	WebElement scoreYesBtn;

	@FindBy(xpath=".//*[@id='trScoreSettings']/div[3]/label[1]")
	WebElement scoreShowIniQaptureYes;

	// Activity Questionnaire
	@FindBy(xpath=".//*[@id='FAI_DESC']")
	WebElement activityDecriptionTxtBox;

	@FindBy(xpath=".//*[@id='FAI_COMMENT']")
	WebElement activityCommentTxtBox;

	@FindBy(xpath=".//*[@id='btnActDate']/span/span")
	WebElement activityDate;

	// Advanced Questionnaire 
	// Table
	@FindBy(xpath=".//*[@id='divFieldSubTypes']/label[1]")
	WebElement tableOption;

	@FindBy(xpath=".//*[@id='addSubField']/span/span[2]")
	WebElement addSubFieldBtn;

	@FindBy(xpath="//span[text()='Type:']//following::input[1]")
	WebElement tableHeaderTxtBox;

	@FindBy(xpath="//span[text()='Type:']//following::textarea[1]")
	WebElement tableDescriptionTxtBox;

	@FindBy(xpath="//span[contains(.,'Advanced Table Question')]")
	WebElement tableQuestion;

	@FindBy(xpath="//span[contains(.,'Value Chain')]")
	WebElement tableHeaderQuestion;

	// Property
	@FindBy(xpath=".//*[@id='divFieldSubTypes']/label[2]")
	WebElement propertyOption;

	@FindBy(xpath=".//*[@id='ddlPropertiesAnswerType']")
	WebElement propertyDropDown;

	@FindBy(xpath="//span[contains(.,'Advanced Property Question')]")
	WebElement propertyQuestion;

	// Wizard
	@FindBy(xpath=".//*[@id='divFieldSubTypes']/label[3]")
	WebElement wizardBtn;

	@FindBy(xpath=".//*[@id='F_SUBFIELDSCOUNT']")
	WebElement noOfSubQuestionsTxtBox;

	@FindBy(xpath="//span[contains(.,'Advanced Wizard Question')]")
	WebElement wizardQuestion;

	// Section advanced settings 
	@FindBy(xpath=".//*[@id='trSection_Minimize']/div/label[1]")
	WebElement minimizeYes;

	@FindBy(xpath=".//*[@id='FSI_DESC']")
	WebElement moreDescriptionTextBox;

	// MultiChoice - Radio
	@FindBy(xpath=".//*[@id='trMilestone']/div[1]/label[1]")
	WebElement milestoneYesBtn;

	// MultiChoice - DropDown
	@FindBy(xpath=".//*[@id='trSearchable']/div/label[1]")
	WebElement searchableYesBtn;

	// MultiChoice - CheckBox
	@FindBy(xpath=".//*[@id='F_ANSWERSLIMITMIN']")
	WebElement minAnswersLimitTextBox;

	@FindBy(xpath=".//*[@id='F_ANSWERSLIMITMAX']")
	WebElement maxAnswersLimitTextBox;

	// Create Answers for MultiChoice 
	@FindBy(xpath=".//*[@id='divItemToolbar']/a[1]/span/span[2]")
	WebElement createNewFieldBtn;

	// MultiChoice - Copy Questions 
	@FindBy(xpath=".//*[@id='_copyItem']/span/span[2]")
	WebElement copyQuestionsBtn;

	@FindBy(xpath="//select[@id='ddlCopyChoice']")
	WebElement copyChoice;

	@FindBy(xpath=".//*[@id='ddlCopyQuestion']")
	WebElement copyQuestion;

	@FindBy(xpath=".//*[@id='trCopyItem']/div/span/a/span/span[2]")
	WebElement confirmCopy;

	// MultiCboice - Download Template
	@FindBy(xpath=".//*[@id='divItemToolbar']/a[3]/span/span[2]")
	WebElement downloadTemplate;

	// MultiCboice - Upload Template
	@FindBy(xpath=".//*[@id='divItemToolbar']/a[4]/span/span[2]")
	WebElement uploadTemplate;

	// Rename Questionnaire 
	@FindBy(xpath=".//*[@id='divDS_NAME']")
	WebElement questionnaireOutField;

	@FindBy(xpath="//h3[contains(text(),'Renamed')]")
	WebElement renamedQuestionnaire;

	// Removing Questions from the Questionnaire
	@FindBy(xpath="//span[contains(.,'Radio')]")
	WebElement radioQuestion;
	
	@FindBy(xpath="//span[contains(.,'DropDown')]")
	WebElement dropDownQuestion;
	
	@FindBy(xpath=".//*[@id='removeField']/span/span[2]")
	WebElement deleteQuestionBtn;
	
	// Comment Adding/Updating/Deleting 
	@FindBy(xpath="//*[text()='Comment']")
	WebElement addedComment;

	// Delete Questionnaire
	@FindBy(xpath=".//*[@id='removedataset']/span/span[2]")
	WebElement deleteQuestionnaireBtn;
	
	@FindBy(xpath="//h3[contains(text(),'Removing')]")
	WebElement deletingQuestionnaire;
	
	@FindBy(xpath="//button[@data-bb-handler='confirm']")
	WebElement confirmDeleteBtn;


	// Initializing the Page Objects:................................................................
	public Build_iQapturesPage() {
		PageFactory.initElements(driver, this);
	}


	// Actions:......................................................................................

	public void verify_iQapturePage() {
		GenericLibrary.waitForElementVisibility(driver, iQaptureLink);
		Assert.assertTrue(iQaptureLink.isDisplayed(), "Unable to Navigate iQapture Page");
	}

	public void verify_Create_Questionnaire(String questionnaireName, String searchItem) {
		GenericLibrary.waitForElementVisibility(driver, addiQaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, addiQaptureBtn);
		GenericLibrary.waitForElementVisibility(driver, questionnaireNametextBox);
		JavascriptLibrary.javascriptType(driver, questionnaireNametextBox, questionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		JavascriptLibrary.javascriptClickElement(driver, backBtn);
		GenericLibrary.waitForElementVisibility(driver, searchBox);
		JavascriptLibrary.javascriptType(driver, searchBox, searchItem);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		GenericLibrary.waitForElementVisibility(driver, TestQuestionnaire);
		Assert.assertTrue(TestQuestionnaire.isDisplayed(), "Questionnaire Not Created");
	}

	public void verify_error_message_on_creating_questionnaire_without_entering_name() {
		GenericLibrary.waitForElementVisibility(driver, addiQaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, addiQaptureBtn);
		GenericLibrary.waitForElementVisibility(driver, questionnaireNametextBox);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		Assert.assertTrue(pleaseEnterQuationnaireName_ErrorMessage.isDisplayed(), "Error message not displayed");
	}

	public void verify_Upload_image_to_questionnaire(String questionnaireName, String filePath) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, addiQaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, addiQaptureBtn);
		GenericLibrary.waitForElementVisibility(driver, questionnaireNametextBox);
		JavascriptLibrary.javascriptType(driver, questionnaireNametextBox, questionnaireName);
		GenericLibrary.uploadFile(uploadImageBtn, filePath);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
	}

	public void verify_Create_fields(String questionnaireName, String text_SmallBoxQuestion, String text_LargeBoxQuestion, String dateQuestion,
			String uploadFileQuestion, String advancedQuestion, String sectionQuestion, String numberQuestion, String multiChoiceQuestion, String activityQuestion) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, addiQaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, addiQaptureBtn);
		GenericLibrary.waitForElementVisibility(driver, questionnaireNametextBox);
		JavascriptLibrary.javascriptType(driver, questionnaireNametextBox, questionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(text_SmallBoxQuestion);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, largeBox);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(text_LargeBoxQuestion);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, date);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(dateQuestion);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, uploadFile);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(uploadFileQuestion);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver,advanced);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(advancedQuestion);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, section);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(sectionQuestion);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, number);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(numberQuestion);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(multiChoiceQuestion);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, activity);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(activityQuestion);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
	}

	public void verify_Text_Questionnaire(String questionnaireName, String text_SmallBoxQuestion, String text_LargeBoxQuestion) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, addiQaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, addiQaptureBtn);
		GenericLibrary.waitForElementVisibility(driver, questionnaireNametextBox);
		JavascriptLibrary.javascriptType(driver, questionnaireNametextBox, questionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(text_SmallBoxQuestion);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, largeBox);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(text_LargeBoxQuestion);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
	}

	public void verify_Advanced_settings_for_Text(String questionnaireName, String Q1, String level1Hint, String Q2, String level2Hint,
			String Q3, String level3Hint, String Q4, String level4Hint, String Q5, String level5Hint, String Q6, String n, String hint6,
			String Q7, String hint7) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, addiQaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, addiQaptureBtn);
		GenericLibrary.waitForElementVisibility(driver, questionnaireNametextBox);
		JavascriptLibrary.javascriptType(driver, questionnaireNametextBox, questionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		// Level 1
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, additionalAnswersYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level1Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 2
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q2);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level2Btn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, additionalAnswersYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level2Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 3
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q3);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level3Btn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, additionalAnswersYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level3Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 4
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q4);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level4Btn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, additionalAnswersYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level4Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 5
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q5);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level4Btn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, additionalAnswersYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level5Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Number Manual
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q6);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, numberManual);
		JavascriptLibrary.javascriptType(driver, numberManualTextBox, n);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, additionalAnswersYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, hint6);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Number None
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q7);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, numberNone);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, additionalAnswersYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, hint7);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
	}

	public void verify_MultiChoice_Questionnaire(String questionnaireName, String radioHML, String radioYesNoNa,
			String dropDownHML, String dropDownYesNoNa, String checkBoxHML, String checkBoxYesNoNa) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, addiQaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, addiQaptureBtn);
		GenericLibrary.waitForElementVisibility(driver, questionnaireNametextBox);
		JavascriptLibrary.javascriptType(driver, questionnaireNametextBox, questionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		// MultiChoice - Radio Buttons - High/Medium/Low priority
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, defaultDropDownBtn);
		JavascriptLibrary.javascriptClickElement(driver, highMediumLowBtn);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(radioHML);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		// MultiChoice - Radio Buttons - Yes/No/NA
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, defaultDropDownBtn);
		JavascriptLibrary.javascriptClickElement(driver, yesNoNaBtn);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(radioYesNoNa);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		// MultiChoice - DropDowns - High/Medium/Low priority
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, dropDowns);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, defaultDropDownBtn);
		JavascriptLibrary.javascriptClickElement(driver, highMediumLowBtn);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(dropDownHML);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		// MultiChoice - DropDowns - Yes/No/Na
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, dropDowns);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, defaultDropDownBtn);
		JavascriptLibrary.javascriptClickElement(driver, yesNoNaBtn);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(dropDownYesNoNa);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		// MultiChoice - CheckBoxes - High/Medium/Low priority
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, checkBoxes);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, defaultDropDownBtn);
		JavascriptLibrary.javascriptClickElement(driver, highMediumLowBtn);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(checkBoxHML);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		// MultiChoice - CheckBoxes - Yes/No/Na
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, checkBoxes);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, defaultDropDownBtn);
		JavascriptLibrary.javascriptClickElement(driver, yesNoNaBtn);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(checkBoxYesNoNa);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
	}

	public void verify_Date_Questionnaire(String questionnaireName, String dateQuestion, 
			String dateAndTimeQuestion, String timeQuestion, String weekDateQuestion) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, addiQaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, addiQaptureBtn);
		GenericLibrary.waitForElementVisibility(driver, questionnaireNametextBox);
		JavascriptLibrary.javascriptType(driver, questionnaireNametextBox, questionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		// Date
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, date);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(dateQuestion);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		// Date and Time
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, date);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, dateAndTime);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(dateAndTimeQuestion);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		// Time
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, date);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, time);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(timeQuestion);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		// Week and Date
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, date);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, weekAndDate);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(weekDateQuestion);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
	}

	public void verify_Advanced_Settings_for_Date(String questionnaireName, String Q1, String level1Hint,
			String Q2, String level2Hint, String Q3, String level3Hint, String Q4, String level4Hint, 
			String Q5, String level5Hint, String Q6, String n, String hint6, String Q7, String hint7) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, addiQaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, addiQaptureBtn);
		GenericLibrary.waitForElementVisibility(driver, questionnaireNametextBox);
		JavascriptLibrary.javascriptType(driver, questionnaireNametextBox, questionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		// Level 1
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, date);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, defaultValueYes);
		JavascriptLibrary.javascriptClickElement(driver, additionalAnswersYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level1Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 2
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, date);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q2);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level2Btn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, defaultValueYes);
		JavascriptLibrary.javascriptClickElement(driver, additionalAnswersYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level2Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 3
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, date);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q3);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level3Btn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, defaultValueYes);
		JavascriptLibrary.javascriptClickElement(driver, additionalAnswersYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level3Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 4
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, date);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q4);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level4Btn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, defaultValueYes);
		JavascriptLibrary.javascriptClickElement(driver, additionalAnswersYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level4Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 5
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, date);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q5);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level4Btn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, defaultValueYes);
		JavascriptLibrary.javascriptClickElement(driver, additionalAnswersYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level5Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Number Manual
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, date);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q6);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, numberManual);
		JavascriptLibrary.javascriptType(driver, numberManualTextBox, n);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, defaultValueYes);
		JavascriptLibrary.javascriptClickElement(driver, additionalAnswersYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, hint6);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Number None
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, date);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q7);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, numberNone);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, defaultValueYes);
		JavascriptLibrary.javascriptClickElement(driver, additionalAnswersYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, hint7);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
	}

	public void verify_Number_Questionnaire(String questionnaireName, String Q1, String Q2, String Q3,
			String Q4, String Q5, String min, String max, String step) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, addiQaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, addiQaptureBtn);
		GenericLibrary.waitForElementVisibility(driver, questionnaireNametextBox);
		JavascriptLibrary.javascriptType(driver, questionnaireNametextBox, questionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		// Number - Integer
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, number);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, integerOption);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		Reporter.log("Integer Question Added Successfully", true);
		// Number - Float
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, number);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, floatOption);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q2);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		Reporter.log("Float Question Added Successfully", true);
		// Number - Percentage
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, number);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, percentageOption);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q3);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		Reporter.log("Percentage Question Added Successfully", true);
		// Number - Currency
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, number);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, currencyOption);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q4);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		Reporter.log("Currency Question Added Successfully", true);
		// Number - Slider
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, number);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, sliderOption);
		Thread.sleep(1000);
		sliderMinValue.sendKeys(min);
		sliderMaxValue.sendKeys(max);
		sliderStepValue.sendKeys(step);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q5);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		Reporter.log("Currency Question Added Successfully", true);
	}

	public void verify_Advanced_settings_for_Number(String questionnaireName, String Q1, String level1Hint,
			String Q2, String level2Hint, String Q3, String level3Hint, String Q4, String level4Hint, 
			String Q5, String level5Hint, String Q6, String n, String hint6, String Q7, String hint7) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, addiQaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, addiQaptureBtn);
		GenericLibrary.waitForElementVisibility(driver, questionnaireNametextBox);
		JavascriptLibrary.javascriptType(driver, questionnaireNametextBox, questionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		// Level 1
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, number);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, scoreShowIniQaptureYes);
		JavascriptLibrary.javascriptClickElement(driver, additionalAnswersYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level1Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 2
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, number);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q2);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level2Btn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, scoreShowIniQaptureYes);
		JavascriptLibrary.javascriptClickElement(driver, additionalAnswersYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level2Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 3
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, number);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q3);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level3Btn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, scoreShowIniQaptureYes);
		JavascriptLibrary.javascriptClickElement(driver, additionalAnswersYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level3Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 4
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, number);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q4);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level4Btn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, scoreShowIniQaptureYes);
		JavascriptLibrary.javascriptClickElement(driver, additionalAnswersYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level4Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 5
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, number);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q5);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level4Btn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, scoreShowIniQaptureYes);
		JavascriptLibrary.javascriptClickElement(driver, additionalAnswersYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level5Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Number Manual
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, number);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q6);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, numberManual);
		JavascriptLibrary.javascriptType(driver, numberManualTextBox, n);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, scoreShowIniQaptureYes);
		JavascriptLibrary.javascriptClickElement(driver, additionalAnswersYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, hint6);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Number None
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, number);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q7);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, numberNone);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, scoreShowIniQaptureYes);
		JavascriptLibrary.javascriptClickElement(driver, additionalAnswersYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, hint7);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
	}

	public void verify_Upload_File_Questionnaire(String questionnaireName, String Q1) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, addiQaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, addiQaptureBtn);
		GenericLibrary.waitForElementVisibility(driver, questionnaireNametextBox);
		JavascriptLibrary.javascriptType(driver, questionnaireNametextBox, questionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, uploadFile);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
	}

	public void verify_Advanced_settings_for_Upload_File(String questionnaireName, String Q1, String level1Hint,
			String Q2, String level2Hint, String Q3, String level3Hint, String Q4, String level4Hint, 
			String Q5, String level5Hint, String Q6, String n, String hint6, String Q7, String hint7) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, addiQaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, addiQaptureBtn);
		GenericLibrary.waitForElementVisibility(driver, questionnaireNametextBox);
		JavascriptLibrary.javascriptType(driver, questionnaireNametextBox, questionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		// Level 1
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, uploadFile);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level1Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 2
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, uploadFile);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q2);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level2Btn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level2Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 3
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, uploadFile);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q3);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level3Btn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level3Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 4
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, uploadFile);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q4);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level4Btn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level4Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 5
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, uploadFile);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q5);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level4Btn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level5Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Number Manual
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, uploadFile);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q6);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, numberManual);
		JavascriptLibrary.javascriptType(driver, numberManualTextBox, n);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, hint6);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Number None
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, uploadFile);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q7);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, numberNone);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, hint7);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
	}

	public void verify_Activity_Questionnaire(String questionnaireName, String activityDescription, String comment, String Q1) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, addiQaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, addiQaptureBtn);
		GenericLibrary.waitForElementVisibility(driver, questionnaireNametextBox);
		JavascriptLibrary.javascriptType(driver, questionnaireNametextBox, questionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, activity);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#btnActPeople")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".bs-checkbox>input")).click();
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, activityDate);
		Thread.sleep(1000);
		List<WebElement> switchToYear = driver.findElements(By.cssSelector(".datepicker-switch"));
		for (WebElement ele : switchToYear) {
			String text = ele.getText();
			if(text.equalsIgnoreCase("2018")) {
				ele.click();
				break;
			}
		}
		List<WebElement> switchToYear2 = driver.findElements(By.cssSelector(".datepicker-switch"));
		for (WebElement ele : switchToYear2) {
			String text = ele.getText();
			if(text.equalsIgnoreCase("2018")) {
				ele.click();
				break;
			}
		}
		List<WebElement> yearsList = driver.findElements(By.cssSelector(".year"));
		for (WebElement ele : yearsList) {
			String text = ele.getText();
			if(text.equalsIgnoreCase("2009")) {
				ele.click();
				break;
			}
		}
		List<WebElement> monthsList = driver.findElements(By.cssSelector(".month"));
		for (WebElement ele : monthsList) {
			String text = ele.getText();
			if(text.equalsIgnoreCase("Jun")) {
				ele.click();
				break;
			}
		}
		List<WebElement> dayList = driver.findElements(By.cssSelector(".day"));
		for (WebElement ele : dayList) {
			String text = ele.getText();
			if(text.equalsIgnoreCase("20")) {
				ele.click();
				break;
			}
		}

		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, activityDecriptionTxtBox, activityDescription);
		JavascriptLibrary.javascriptType(driver, activityCommentTxtBox, comment);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
	}

	public void verify_Advanced_settings_for_Activity(String questionnaireName, String Q1, String level1Hint,
			String Q2, String level2Hint, String Q3, String level3Hint, String Q4, String level4Hint, 
			String Q5, String level5Hint, String Q6, String n, String hint6, String Q7, String hint7) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, addiQaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, addiQaptureBtn);
		GenericLibrary.waitForElementVisibility(driver, questionnaireNametextBox);
		JavascriptLibrary.javascriptType(driver, questionnaireNametextBox, questionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		// Level 1
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, activity);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level1Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 2
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, activity);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q2);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level2Btn);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level2Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 3
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, activity);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q3);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level3Btn);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level3Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 4
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, activity);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q4);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level4Btn);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level4Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 5
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, activity);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q5);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level4Btn);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level5Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Number Manual
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, activity);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q6);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, numberManual);
		JavascriptLibrary.javascriptType(driver, numberManualTextBox, n);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, hint6);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Number None
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, activity);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q7);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, numberNone);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptType(driver, hintTextBox, hint7);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
	}

	public void verify_Advanced_Questionnaire(String questionnaireName, String header, String description, String Q1, String Q2, String Q3) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, addiQaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, addiQaptureBtn);
		GenericLibrary.waitForElementVisibility(driver, questionnaireNametextBox);
		JavascriptLibrary.javascriptType(driver, questionnaireNametextBox, questionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		// Table
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, advanced);
		Thread.sleep(1000);
		GenericLibrary.waitForElementVisibility(driver, tableOption);
		JavascriptLibrary.javascriptClickElement(driver, tableOption);
		GenericLibrary.waitForElementVisibility(driver, addSubFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addSubFieldBtn);
		tableHeaderTxtBox.click();
		JavascriptLibrary.javascriptType(driver, tableHeaderTxtBox, header);
		tableDescriptionTxtBox.click();
		JavascriptLibrary.javascriptType(driver, tableDescriptionTxtBox, description);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, additionalAnswersYes);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		Thread.sleep(1000);
		Reporter.log("Advanced Table Question Added Successfully", true);
		// Property
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, advanced);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, propertyOption);
		Thread.sleep(500);
		Select s=new Select(propertyDropDown);
		s.selectByVisibleText("Last Modified By");
		Thread.sleep(500);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q2);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, additionalAnswersYes);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		Thread.sleep(1000);
		Reporter.log("Advanced Property Question Added Successfully", true);
		// Wizard
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, advanced);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, wizardBtn);
		Thread.sleep(500);
		JavascriptLibrary.javascriptType(driver, noOfSubQuestionsTxtBox, "5");
		Thread.sleep(500);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q3);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		Thread.sleep(1000);
		List<WebElement> listOfsubQuestions = driver.findElements(By.xpath("//div[@class='field_desc_txt']"));
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfAllElements(listOfsubQuestions));
		int count = listOfsubQuestions.size()-4;
		Reporter.log("No of Sub-Questions added: "+count, true);
		Reporter.log("Wizard Sub-Questions Created Successfully", true);
	}

	public void verify_Section_Questionnaire(String questionnaireName, String Q1) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, addiQaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, addiQaptureBtn);
		GenericLibrary.waitForElementVisibility(driver, questionnaireNametextBox);
		JavascriptLibrary.javascriptType(driver, questionnaireNametextBox, questionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, section);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1000);
	}

	public void verify_Advanced_settings_for_Section(String questionnaireName, String Q1, String level1Desc, String level1Hint,
			String Q2, String level2Desc, String level2Hint, String Q3, String level3Desc, String level3Hint, String Q4, String level4Desc, String level4Hint, 
			String Q5, String level5Desc,String level5Hint, String Q6, String n, String numberManualDesc, String hint6, String Q7, String numberNoneDesc, String hint7) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, addiQaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, addiQaptureBtn);
		GenericLibrary.waitForElementVisibility(driver, questionnaireNametextBox);
		JavascriptLibrary.javascriptType(driver, questionnaireNametextBox, questionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		// Level 1
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, section);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, minimizeYes);
		JavascriptLibrary.javascriptType(driver, moreDescriptionTextBox, level1Desc);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level1Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 2
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, section);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q2);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level2Btn);
		JavascriptLibrary.javascriptClickElement(driver, minimizeYes);
		JavascriptLibrary.javascriptType(driver, moreDescriptionTextBox, level2Desc);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level2Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 3
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, section);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q3);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level3Btn);
		JavascriptLibrary.javascriptClickElement(driver, minimizeYes);
		JavascriptLibrary.javascriptType(driver, moreDescriptionTextBox, level3Desc);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level3Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 4
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, section);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q4);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level4Btn);
		JavascriptLibrary.javascriptClickElement(driver, minimizeYes);
		JavascriptLibrary.javascriptType(driver, moreDescriptionTextBox, level4Desc);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level4Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 5
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, section);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q5);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level4Btn);
		JavascriptLibrary.javascriptClickElement(driver, minimizeYes);
		JavascriptLibrary.javascriptType(driver, moreDescriptionTextBox, level5Desc);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level5Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Number Manual
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, section);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q6);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, numberManual);
		JavascriptLibrary.javascriptType(driver, numberManualTextBox, n);
		JavascriptLibrary.javascriptClickElement(driver, minimizeYes);
		JavascriptLibrary.javascriptType(driver, moreDescriptionTextBox, numberManualDesc);
		JavascriptLibrary.javascriptType(driver, hintTextBox, hint6);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Number None
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, section);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q7);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, numberNone);
		JavascriptLibrary.javascriptClickElement(driver, minimizeYes);
		JavascriptLibrary.javascriptType(driver, moreDescriptionTextBox, numberNoneDesc);
		JavascriptLibrary.javascriptType(driver, hintTextBox, hint7);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
	}

	public void verify_Advanced_settings_for_MiltiChoice_Radio(String questionnaireName, String Q1, String level1Hint,
			String Q2, String level2Hint, String Q3, String level3Hint, String Q4, String level4Hint, 
			String Q5, String level5Hint, String Q6, String n, String hint6, String Q7, String hint7) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, addiQaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, addiQaptureBtn);
		GenericLibrary.waitForElementVisibility(driver, questionnaireNametextBox);
		JavascriptLibrary.javascriptType(driver, questionnaireNametextBox, questionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		// Level 1
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level1Hint);
		JavascriptLibrary.javascriptClickElement(driver, milestoneYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 2
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q2);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level2Btn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level2Hint);
		JavascriptLibrary.javascriptClickElement(driver, milestoneYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 3
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q3);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level3Btn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level3Hint);
		JavascriptLibrary.javascriptClickElement(driver, milestoneYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 4
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q4);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level4Btn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level4Hint);
		JavascriptLibrary.javascriptClickElement(driver, milestoneYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 5
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q5);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level4Btn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level5Hint);
		JavascriptLibrary.javascriptClickElement(driver, milestoneYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Number Manual
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q6);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, numberManual);
		JavascriptLibrary.javascriptType(driver, numberManualTextBox, n);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptType(driver, hintTextBox, hint6);
		JavascriptLibrary.javascriptClickElement(driver, milestoneYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Number None
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q7);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, numberNone);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptType(driver, hintTextBox, hint7);
		JavascriptLibrary.javascriptClickElement(driver, milestoneYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
	}

	public void verify_Advanced_settings_for_MiltiChoice_DropDown(String questionnaireName, String Q1, String level1Hint,
			String Q2, String level2Hint, String Q3, String level3Hint, String Q4, String level4Hint, 
			String Q5, String level5Hint, String Q6, String n, String hint6, String Q7, String hint7) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, addiQaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, addiQaptureBtn);
		GenericLibrary.waitForElementVisibility(driver, questionnaireNametextBox);
		JavascriptLibrary.javascriptType(driver, questionnaireNametextBox, questionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		// Level 1
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, dropDowns);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, searchableYesBtn);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level1Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 2
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, dropDowns);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q2);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level2Btn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, searchableYesBtn);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level2Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 3
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, dropDowns);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q3);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level3Btn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, searchableYesBtn);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level3Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 4
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, dropDowns);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q4);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level4Btn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, searchableYesBtn);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level4Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 5
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, dropDowns);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q5);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level4Btn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, searchableYesBtn);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level5Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Number Manual
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, dropDowns);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q6);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, numberManual);
		JavascriptLibrary.javascriptType(driver, numberManualTextBox, n);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, searchableYesBtn);
		JavascriptLibrary.javascriptType(driver, hintTextBox, hint6);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Number None
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, dropDowns);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q7);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, numberNone);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptClickElement(driver, searchableYesBtn);
		JavascriptLibrary.javascriptType(driver, hintTextBox, hint7);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
	}

	public void verify_Advanced_settings_for_MiltiChoice_CheckBox(String questionnaireName, String Q1, String min1, String max1,
			String level1Hint, String Q2, String min2, String max2, String level2Hint, String Q3, String min3, String max3, String level3Hint, 
			String Q4, String min4, String max4, String level4Hint, String Q5, String min5, String max5, String level5Hint, 
			String Q6, String n, String min6, String max6, String hint6, String Q7, String min7, String max7, String hint7) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, addiQaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, addiQaptureBtn);
		GenericLibrary.waitForElementVisibility(driver, questionnaireNametextBox);
		JavascriptLibrary.javascriptType(driver, questionnaireNametextBox, questionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		// Level 1
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, checkBoxes);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptType(driver, minAnswersLimitTextBox, min1);
		JavascriptLibrary.javascriptType(driver, maxAnswersLimitTextBox, max1);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level1Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 2
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, checkBoxes);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q2);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level2Btn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptType(driver, minAnswersLimitTextBox, min2);
		JavascriptLibrary.javascriptType(driver, maxAnswersLimitTextBox, max2);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level2Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 3
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, checkBoxes);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q3);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level3Btn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptType(driver, minAnswersLimitTextBox, min3);
		JavascriptLibrary.javascriptType(driver, maxAnswersLimitTextBox, max3);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level3Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 4
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, checkBoxes);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q4);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level4Btn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptType(driver, minAnswersLimitTextBox, min4);
		JavascriptLibrary.javascriptType(driver, maxAnswersLimitTextBox, max4);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level4Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Level 5
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, checkBoxes);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q5);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, level4Btn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptType(driver, minAnswersLimitTextBox, min5);
		JavascriptLibrary.javascriptType(driver, maxAnswersLimitTextBox, max5);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptType(driver, hintTextBox, level5Hint);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Number Manual
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, checkBoxes);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q6);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, numberManual);
		JavascriptLibrary.javascriptType(driver, numberManualTextBox, n);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptType(driver, minAnswersLimitTextBox, min6);
		JavascriptLibrary.javascriptType(driver, maxAnswersLimitTextBox, max6);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptType(driver, hintTextBox, hint6);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		// Number None
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, checkBoxes);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q7);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, numberNone);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptType(driver, minAnswersLimitTextBox, min7);
		JavascriptLibrary.javascriptType(driver, maxAnswersLimitTextBox, max7);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		JavascriptLibrary.javascriptType(driver, hintTextBox, hint7);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
	}

	public void verify_Create_Answers_for_MultiChoice(String questionnaireName, String Q1,
			String answer1, String hint1, String score1, String answer2, String hint2, String score2,
			String dropDownHML, String checkBoxYesNoNa) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, addiQaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, addiQaptureBtn);
		GenericLibrary.waitForElementVisibility(driver, questionnaireNametextBox);
		JavascriptLibrary.javascriptType(driver, questionnaireNametextBox, questionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		// MultiChoice - Radio - Answer, Hint and Score
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		GenericLibrary.waitForElementVisibility(driver, createNewFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, createNewFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, createNewFieldBtn);
		JavascriptLibrary.javascriptType(driver, descriptionTextBox, Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, mandatoryYes);
		JavascriptLibrary.javascriptClickElement(driver, scoreYesBtn);
		GenericLibrary.waitForElementVisibility(driver, scoreShowIniQaptureYes);
		JavascriptLibrary.javascriptClickElement(driver, scoreShowIniQaptureYes);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		Thread.sleep(1000);
		List<WebElement> ansTextBoxes = driver.findElements(By.xpath("//input[@placeholder='Answer']"));
		List<WebElement> hintTextBoxes = driver.findElements(By.xpath("//textarea[@placeholder='Enter hint for answer…']"));
		List<WebElement> scoreTextBox = driver.findElements(By.xpath("//input[@field='FI_SCORE' and @type='text']"));
		List<WebElement> eyelist = driver.findElements(By.xpath("//span[@class='desc hide-desc']"));

		//ansTextBoxes.get(0).sendKeys(answer1);
		WebElement a1 = ansTextBoxes.get(0);
		a1.click();
		a1.sendKeys(answer1);
		Thread.sleep(1000);
		//hintTextBoxes.get(0).sendKeys(hint1);
		WebElement h1 = hintTextBoxes.get(0);
		h1.click();
		h1.sendKeys(hint1);
		Thread.sleep(1000);
		eyelist.get(0).click();
		Thread.sleep(1000);
		//scoreTextBox.get(0).sendKeys(score1);
		WebElement s1 = scoreTextBox.get(0);
		s1.sendKeys(score1);
		Thread.sleep(1000);

		JavascriptExecutor js=(JavascriptExecutor) driver;

		//ansTextBoxes.get(1).sendKeys(answer2);
		WebElement a2 = ansTextBoxes.get(1);
		a2.click();
		a2.sendKeys(answer2);
		Thread.sleep(1000);
		WebElement h2 = hintTextBoxes.get(1);
		js.executeScript("arguments[0].scrollIntoView(true);", h2);
		h2.sendKeys(hint2);
		Thread.sleep(1000);
		eyelist.get(1).click();
		Thread.sleep(1000);
		//scoreTextBox.get(1).sendKeys(score2);
		WebElement s2 = scoreTextBox.get(1);
		s2.sendKeys(score2);
		s2.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		// MultiChoice - DropDowns - High/Medium/Low priority
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, dropDowns);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, defaultDropDownBtn);
		JavascriptLibrary.javascriptClickElement(driver, highMediumLowBtn);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(dropDownHML);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		// MultiChoice - CheckBoxes - Yes/No/Na
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, checkBoxes);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, defaultDropDownBtn);
		JavascriptLibrary.javascriptClickElement(driver, yesNoNaBtn);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(checkBoxYesNoNa);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500); 
	} 

	public void verify_MultiChoice_Copy_Questions_functionality(String questionnaireName, String radioHML, 
			String dropDownYesNoNa,	String choice, String question, String copiedQuestion) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, addiQaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, addiQaptureBtn);
		GenericLibrary.waitForElementVisibility(driver, questionnaireNametextBox);
		JavascriptLibrary.javascriptType(driver, questionnaireNametextBox, questionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		// MultiChoice - Radio Buttons - High/Medium/Low priority
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, defaultDropDownBtn);
		JavascriptLibrary.javascriptClickElement(driver, highMediumLowBtn);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(radioHML);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		// MultiChoice - DropDowns - Yes/No/Na
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, dropDowns);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, defaultDropDownBtn);
		JavascriptLibrary.javascriptClickElement(driver, yesNoNaBtn);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(dropDownYesNoNa);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		// Copy Question
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, copyQuestionsBtn);
		GenericLibrary.waitForElementVisibility(driver, copyChoice);
		GenericLibrary.selectElementByVisibleText(copyChoice, choice);
		GenericLibrary.selectElementByVisibleText(copyQuestion, question);
		JavascriptLibrary.javascriptClickElement(driver, confirmCopy);
		GenericLibrary.waitForAlertPresent(driver);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(copiedQuestion);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
	}

	public void verify_Download_Template_For_MultiChoice_Questionnaire(String questionnaireName, String radioHML, String radioYesNoNa,
			String dropDownHML, String dropDownYesNoNa, String checkBoxHML, String checkBoxYesNoNa) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, addiQaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, addiQaptureBtn);
		GenericLibrary.waitForElementVisibility(driver, questionnaireNametextBox);
		JavascriptLibrary.javascriptType(driver, questionnaireNametextBox, questionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		// MultiChoice - Radio Buttons - High/Medium/Low priority
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, defaultDropDownBtn);
		JavascriptLibrary.javascriptClickElement(driver, highMediumLowBtn);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(radioHML);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		// MultiChoice - Radio Buttons - Yes/No/NA
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, defaultDropDownBtn);
		JavascriptLibrary.javascriptClickElement(driver, yesNoNaBtn);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(radioYesNoNa);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		// MultiChoice - DropDowns - High/Medium/Low priority
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, dropDowns);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, defaultDropDownBtn);
		JavascriptLibrary.javascriptClickElement(driver, highMediumLowBtn);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(dropDownHML);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		// MultiChoice - DropDowns - Yes/No/Na
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, dropDowns);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, defaultDropDownBtn);
		JavascriptLibrary.javascriptClickElement(driver, yesNoNaBtn);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(dropDownYesNoNa);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		// MultiChoice - CheckBoxes - High/Medium/Low priority
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, checkBoxes);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, defaultDropDownBtn);
		JavascriptLibrary.javascriptClickElement(driver, highMediumLowBtn);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(checkBoxHML);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		// MultiChoice - CheckBoxes - Yes/No/Na
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, checkBoxes);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, defaultDropDownBtn);
		JavascriptLibrary.javascriptClickElement(driver, yesNoNaBtn);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(checkBoxYesNoNa);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		// Download Template
		GenericLibrary.waitForElementVisibility(driver, downloadTemplate);
		JavascriptLibrary.javascriptClickElement(driver, downloadTemplate);
		Thread.sleep(1000);
	}

	public void verify_Upload_Template_For_MultiChoice_Questionnaire(String questionnaireName, String filePath, String uploadedQuestion) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, addiQaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, addiQaptureBtn);
		GenericLibrary.waitForElementVisibility(driver, questionnaireNametextBox);
		JavascriptLibrary.javascriptType(driver, questionnaireNametextBox, questionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		// MultiChoice - Upload Template
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		GenericLibrary.waitForElementVisibility(driver, uploadTemplate);
		GenericLibrary.uploadFile(uploadTemplate, filePath);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(uploadedQuestion);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
	}

	public void verify_Rename_Questionnaire(String searchItem, String newName, String newSearchItem) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, searchBox);
		JavascriptLibrary.javascriptType(driver, searchBox, searchItem);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		GenericLibrary.waitForElementVisibility(driver, TestQuestionnaire);
		JavascriptLibrary.javascriptClickElement(driver, TestQuestionnaire);
		GenericLibrary.waitForElementVisibility(driver, questionnaireOutField);
		questionnaireOutField.click();
		questionnaireNametextBox.clear();
		Thread.sleep(1000);
		questionnaireNametextBox.sendKeys(newName);
		questionnaireNametextBox.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		backBtn.click();
		GenericLibrary.waitForElementVisibility(driver, searchBox);
		JavascriptLibrary.javascriptType(driver, searchBox, newSearchItem);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		GenericLibrary.waitForElementVisibility(driver, renamedQuestionnaire);
		Assert.assertTrue(renamedQuestionnaire.isDisplayed(), "Questionnaire Not Renamed");
	}

	public void verify_Removing_Questions_From_Questionnaire(String questionnaireName, String radioHML, String dropDownYesNoNa) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, addiQaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, addiQaptureBtn);
		GenericLibrary.waitForElementVisibility(driver, questionnaireNametextBox);
		JavascriptLibrary.javascriptType(driver, questionnaireNametextBox, questionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		// MultiChoice - Radio Buttons - High/Medium/Low priority
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, defaultDropDownBtn);
		JavascriptLibrary.javascriptClickElement(driver, highMediumLowBtn);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(radioHML);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		// MultiChoice - DropDowns - Yes/No/Na
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, multiChoice);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, dropDowns);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, defaultDropDownBtn);
		JavascriptLibrary.javascriptClickElement(driver, yesNoNaBtn);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(dropDownYesNoNa);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		deleteQuestionBtn.click();
		GenericLibrary.waitForAlertPresent(driver);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		radioQuestion.click();
		GenericLibrary.waitForElementVisibility(driver, deleteQuestionBtn);
		deleteQuestionBtn.click();
		GenericLibrary.waitForAlertPresent(driver);
		driver.switchTo().alert().accept();
	}
	
	public void verify_Comment_Adding_Updating_Deleting(String questionnaireName, String Q1) throws Exception{
		GenericLibrary.waitForElementVisibility(driver, addiQaptureBtn);
		JavascriptLibrary.javascriptClickElement(driver, addiQaptureBtn);
		GenericLibrary.waitForElementVisibility(driver, questionnaireNametextBox);
		JavascriptLibrary.javascriptType(driver, questionnaireNametextBox, questionnaireName);
		JavascriptLibrary.javascriptClickElement(driver, saveBtn);
		// Comment adding
		GenericLibrary.waitForElementVisibility(driver, addFieldBtn);
		JavascriptLibrary.javascriptClickElement(driver, addFieldBtn);
		Thread.sleep(1000);
		descriptionTextBox.sendKeys(Q1);
		descriptionTextBox.sendKeys(Keys.TAB);
		Thread.sleep(1500);
		JavascriptLibrary.javascriptClickElement(driver, moreBtn);
		JavascriptLibrary.javascriptClickElement(driver, commentYes);
		JavascriptLibrary.javascriptClickElement(driver, closeMore);
		GenericLibrary.waitForElementVisibility(driver, addedComment);
		Assert.assertTrue(addedComment.isDisplayed(), "Comment Not Added");
		Reporter.log("Comment Added successfully", true);
		// Comment Deleting
		JavascriptLibrary.javascriptClickElement(driver, addedComment);
		Thread.sleep(1000);
		JavascriptLibrary.javascriptClickElement(driver, deleteQuestionBtn);
		GenericLibrary.waitForAlertPresent(driver);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
	}
	
	public void verify_Delete_Questionnaire (String searchItem) throws Exception {
		GenericLibrary.waitForElementVisibility(driver, searchBox);
		JavascriptLibrary.javascriptType(driver, searchBox, searchItem);
		JavascriptLibrary.javascriptClickElement(driver, searchBtn);
		GenericLibrary.waitForElementVisibility(driver, deletingQuestionnaire);
		JavascriptLibrary.javascriptClickElement(driver, deletingQuestionnaire);
		GenericLibrary.waitForElementVisibility(driver, deleteQuestionnaireBtn);
		JavascriptLibrary.javascriptClickElement(driver, deleteQuestionnaireBtn);
		GenericLibrary.waitForElementVisibility(driver, confirmDeleteBtn);
		JavascriptLibrary.javascriptClickElement(driver, confirmDeleteBtn);
		Thread.sleep(1000);
	}
}















