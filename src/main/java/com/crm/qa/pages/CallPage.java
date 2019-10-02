package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.mongodb.Tag;

public class CallPage extends TestBase {

	public CallPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")
	WebElement newcallbuttonElement;

	// Type
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[1]/div/div")
	WebElement typecallElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[1]/div/div/div[2]/div[2]")
	WebElement conferencElement;

	// Status
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div")
	WebElement statElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div/div[2]/div[2]")
	WebElement terminatedElement;

	// Start time
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[1]/div/div/div/input")
	WebElement datecallElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[1]/div/div[2]/div/div[2]/div[2]/div[5]/div[7]")
	WebElement datepickElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[1]/div/div[2]/div/div[3]/div[2]/div/ul/li[61]")
	WebElement timeElement;

	// Flag
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[2]/div/div")
	WebElement flagElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[2]/div/div/div[2]/div[4]")
	WebElement noanswerElement;

	// Tags
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[4]/div/div/label[2]/div")
	WebElement tagfield;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[4]/div/div/label[2]/div")
	WebElement tagsElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[4]/div/div/label[2]/div/div[2]/div")
	WebElement selecttagoption;

	// Description
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[5]/div/div/textarea")
	WebElement descripElement;

	// Save
	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")
	WebElement savecallbuttonElement;

	public void validateNewCallButton() {
		newcallbuttonElement.click();
	}

	public void validateAddNewCallData(String desc) throws InterruptedException {
		typecallElement.click();
		conferencElement.click();
		Thread.sleep(2500);

		statElement.click();
		terminatedElement.click();
		Thread.sleep(2500);

		datecallElement.click();
		datepickElement.click();
		timeElement.click();
		Thread.sleep(2500);

		flagElement.click();
		noanswerElement.click();
		Thread.sleep(2500);

		// tagfield.click();
		// tagsElement.sendKeys(tag);
		// Thread.sleep(2500);
		// selecttagoption.click();
		// Thread.sleep(2500);

		descripElement.sendKeys(desc);
		Thread.sleep(2500);

		savecallbuttonElement.click();

	}

}
