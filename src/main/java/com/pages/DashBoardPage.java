package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.util.GenericLibrary;

public class DashBoardPage extends TestBase {

	// Objects Repository(OR):........................................................................
	// Home Page Links
	@FindBy(xpath="//span[contains(text(),'Dashboard')]")
	@CacheLookup
	WebElement dashBoard;

	@FindBy(xpath="//span[contains(text(),'Build')]")
	WebElement build;
	
	@FindBy(xpath="//span[text()='Projects']")
	WebElement projects;
	
	@FindBy(xpath="//span[text()='Templates']")
	WebElement templates;
	
	@FindBy(xpath="//span[text()='iQaptures']")
	WebElement iQaptures;
	
	@FindBy(xpath="//span[text()='Track']")
	WebElement track;
	
	@FindBy(xpath="//span[text()='Risk Register']")
	WebElement riskRegister;
	
	@FindBy(xpath="//span[text()='Companies']")
	WebElement companies;

	@FindBy(xpath="//span[contains(text(),'Analyse')]")
	WebElement analyse;
	
	@FindBy(xpath="//span[contains(text(),'Settings')]")
	WebElement settings;

	// Dashboard
	@FindBy(xpath="//a[text()='Dashboard']")
	WebElement dashBoardLink;



	// Initializing the Page Objects:................................................................
	public DashBoardPage() {
		PageFactory.initElements(driver, this);
	}

	// Actions:......................................................................................
	public String verifyHomePageTitle(){
		return driver.getTitle();
	}

	public boolean verifyDashboard(){
		return dashBoardLink.isDisplayed();
	}

	public Build_ProjectsPage clickOnProjectsLink() {
		build.click();
		GenericLibrary.waitForElementToBeClickable(driver, projects);
		projects.click();
		return new Build_ProjectsPage();
	}

	public Build_TemplatesPage clickOnTempaltesLink() {
		build.click();
		GenericLibrary.waitForElementToBeClickable(driver, templates);
		templates.click();
		return new Build_TemplatesPage();
	}

	public Build_iQapturesPage clickOniQaptureslink() {
		build.click();
		GenericLibrary.waitForElementToBeClickable(driver, iQaptures);
		iQaptures.click();
		return new Build_iQapturesPage();
	}
	
	public TrackPage clickOnTrackLink() {
		track.click();
		return new TrackPage();
	}
	
	public RiskRegisterPage clickOnRiskRegisterLink() {
		riskRegister.click();
		return new RiskRegisterPage();
	}
	
	public CompaniesPage clickOnCompaniesLink() {
		companies.click();
		return new CompaniesPage();
	}
	
	public AnalysePage clickOnAnalyseLink() {
		analyse.click();
		return new AnalysePage();
	}
	
	public SettingsPage clickOnSettingsLink() {
		settings.click();
		return new SettingsPage();
	}
	
	
}

