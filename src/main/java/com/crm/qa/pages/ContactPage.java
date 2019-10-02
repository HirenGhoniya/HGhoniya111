package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactPage extends TestBase {

	public ContactPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div[2]/div/div[1]/div[2]/div/a/button")
	WebElement newbtn;

	@FindBy(name = "first_name")
	WebElement firstname;

	@FindBy(name = "last_name")
	WebElement lastname;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div/input")
	WebElement companyname;

	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")
	WebElement savebutton;

	public void validateNewContactButton() {
		newbtn.click();

	}

	public void createNewContacts(String ftName, String ltName, String CpName) {
		firstname.sendKeys(ftName);
		lastname.sendKeys(ltName);
		companyname.sendKeys(CpName);
		savebutton.click();
	}

}
