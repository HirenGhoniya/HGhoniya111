package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class DealPage extends TestBase{

	public DealPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/a[2]/button")
	WebElement ndealbtnElement;
	
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/div/input")
	WebElement dealtitleElement;
	
	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")
	WebElement dealSaveButton;
	
	public void validateNewDealbutton() {
		ndealbtnElement.click();
	}
	
	public void validateCreateNewDeal(String dealName) {
		dealtitleElement.sendKeys(dealName);
		dealSaveButton.click();
	}
	
}
