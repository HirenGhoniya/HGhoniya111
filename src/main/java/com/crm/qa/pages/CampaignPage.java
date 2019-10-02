package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;

import okhttp3.internal.cache.DiskLruCache.Editor;

public class CampaignPage extends TestBase {

	public CampaignPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	// New Template
	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/a[2]/button")
	WebElement addnewtemplatElement;

	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")
	WebElement newcontent;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/div/form/div[1]/div/input")
	WebElement TemplateName;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/div/form/div[2]/div/input")
	WebElement templatesubject;

	/*
	 * @FindBy(xpath =
	 * "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/div/form/div[4]/div/div[3]/div/div/div/div/div/div")
	 * WebElement templatebody;
	 */

	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")
	WebElement templatesavebutton;

	// New Campaign
	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/a[1]/button")
	WebElement newcampaignElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/input")
	WebElement campaignNamElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[2]/div")
	WebElement campaignTransportElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[2]/div/div[2]/div[2]")
	WebElement smscampaignElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/label")
	WebElement campaignactivElement;

	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")
	WebElement savecampaignbuttonElement;

	@FindBy(xpath = "//*[@id=\"main-nav\"]/a[11]/span")
	WebElement campaignElement;

	public void validateNewTemplateButton() throws InterruptedException {
		addnewtemplatElement.click();
		Thread.sleep(2500);

		newcontent.click();
	}

	public void validateAddNewTemplate(String tname, String tsubject) throws InterruptedException {
		TemplateName.sendKeys(tname);
		templatesubject.sendKeys(tsubject);
		// templatebody.sendKeys(tbody);
		templatesavebutton.click();

	}

	public void validateNewCampaignButtn() {
		newcampaignElement.click();
	}

	public void validateAddNewCampaign(String cname) throws InterruptedException, IOException {
		campaignNamElement.sendKeys(cname);

		// campaignTransportElement.click();
		// Thread.sleep(2500);
		// smscampaignElement.click();
		// Thread.sleep(2500);

		// campaignactivElement.click();
		// Thread.sleep(2500);

		savecampaignbuttonElement.click();
		Thread.sleep(2500);

		campaignElement.click();

	}

}
