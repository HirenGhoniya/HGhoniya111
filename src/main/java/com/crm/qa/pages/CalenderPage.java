package com.crm.qa.pages;

import java.io.IOException;

import org.apache.poi.xwpf.usermodel.BodyElementType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class CalenderPage extends TestBase {

	public CalenderPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")
	WebElement newcalenderbuttonElement;

	// title
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/div/input")
	WebElement ctitleElement;

	// Category
	@FindBy(name = "category")
	WebElement ccElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[1]/div/div/div[2]/div[8]")
	WebElement privatecategory;

	// StartDate
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div/div/input")
	WebElement cdatepickerElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div[2]/div/div[2]/div[2]/div[5]/div[5]")
	WebElement cselectdatElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div[2]/div/div[3]/div[2]/div/ul/li[77]")
	WebElement cselecttimElement;

	// EndDate
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[1]/div/div/div/input")
	WebElement cenddatElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[1]/div/div[2]/div/div[2]/div[2]/div[5]/div[7]")
	WebElement cselectenddatElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[1]/div/div[2]/div/div[3]/div[2]/div/ul/li[75]")
	WebElement cselectendtimeElement;

	// Tags
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[2]/div/label[2]/div/input")
	WebElement caddtagElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[2]/div/label[2]/div/div[2]/div[1]")
	WebElement cchoosetag;

	@FindBy(xpath = "/html/body")
	WebElement bodyElement;

	// Description
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[5]/div/div/textarea")
	WebElement cdescElement;

	// Location
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[7]/div/div/textarea")
	WebElement clocation;

	// All Day
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[2]/form/div[8]/div[1]/div/div/label")
	WebElement calldayElement;

	// Identifier
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[13]/div/div/div/input")
	WebElement cidentifierElement;

	// Save
	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")
	WebElement saveCalenderBtnElement;

	public void validateNewButton() {

		newcalenderbuttonElement.click();

	}

	public void validateAddNewCalenderDetails(String ctitle, String tag, String desc, String location, String idt)
			throws InterruptedException {
		ctitleElement.sendKeys(ctitle);
		Thread.sleep(2500);

		ccElement.click();
		privatecategory.click();

		cdatepickerElement.click();
		Thread.sleep(2500);
		cselectdatElement.click();
		Thread.sleep(2500);
		cselecttimElement.click();
		Thread.sleep(2500);

		cenddatElement.click();
		Thread.sleep(2500);
		cselectenddatElement.click();
		Thread.sleep(2500);
		cselectendtimeElement.click();
		Thread.sleep(2500);

		caddtagElement.sendKeys(tag);
		;
		Thread.sleep(2500);
		cchoosetag.click();
		Thread.sleep(2500);
		bodyElement.click();

		cdescElement.sendKeys(desc);
		Thread.sleep(2500);

		clocation.sendKeys(location);
		Thread.sleep(2500);

		calldayElement.click();
		Thread.sleep(2500);

		cidentifierElement.sendKeys(idt);
		Thread.sleep(2500);

		saveCalenderBtnElement.click();

	}

}
