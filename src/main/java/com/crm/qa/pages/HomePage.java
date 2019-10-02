package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	public HomePage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[1]/div[1]")
	WebElement crmlogo;

	@FindBy(xpath = "/html/body/div[1]/div/div[1]/a[3]")
	WebElement cntbtn;

	@FindBy(xpath = "//*[@id=\"main-nav\"]/a[5]/span")
	WebElement dealbtn;

	@FindBy(xpath = "//*[@id=\"main-nav\"]/a[6]")
	WebElement taskElement;

	@FindBy(xpath = "//*[@id=\"main-nav\"]/a[8]")
	WebElement callElement;

	@FindBy(xpath = "//*[@id=\"main-nav\"]/a[11]/span")
	WebElement campaignElement;

	@FindBy(xpath = "//*[@id=\"main-nav\"]/a[2]/span")
	WebElement calenderElement;

	@FindBy(xpath = "//*[@id=\"main-nav\"]/a[4]")
	WebElement companiesElement;

	@FindBy(xpath = "//*[@id=\"main-nav\"]/a[7]")
	WebElement casesElement;

	@FindBy(xpath = "//*[@id=\"main-nav\"]/a[9]/span")
	WebElement documentsElement;

	@FindBy(xpath = "//*[@id=\"main-nav\"]/a[10]")
	WebElement emailElement;

	public boolean crmLogo() throws IOException {
		return crmlogo.isDisplayed();
	}

	public ContactPage validateContact() throws IOException {
		cntbtn.click();
		return new ContactPage();
	}

	public DealPage validateDeal() throws IOException {
		dealbtn.click();
		return new DealPage();

	}

	public TaskPage validateTask() throws IOException {
		taskElement.click();
		return new TaskPage();

	}

	public CallPage validateCall() throws IOException {
		callElement.click();
		return new CallPage();
	}

	public CampaignPage validateCampaign() throws IOException {
		campaignElement.click();
		return new CampaignPage();

	}

	public CalenderPage validateCalender() throws IOException {
		calenderElement.click();
		return new CalenderPage();

	}

	public CompaniesPage validatecompanies() throws IOException {
		companiesElement.click();
		return new CompaniesPage();

	}

	public CasesPage validateCases() throws IOException {
		casesElement.click();
		return new CasesPage();

	}

	public DocumentsPage validateDocuments() {
		documentsElement.click();
		return new DocumentsPage();

	}

	public EmailPage validateEmail() {
		emailElement.click();
		return new EmailPage();

	}

}
