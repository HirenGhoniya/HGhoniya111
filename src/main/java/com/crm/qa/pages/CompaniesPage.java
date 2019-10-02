package com.crm.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

import com.crm.qa.base.TestBase;

public class CompaniesPage extends TestBase {

	public CompaniesPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	// New button
	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")
	WebElement newcompaniesElement;

	// Name
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/div/div/input")
	WebElement companienamElement;

	// Access
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[2]/div/div/div[1]/button")
	WebElement companieAccessbuttonElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[2]/div/div/div[2]/div/div[1]")
	WebElement companiesAccessUserElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[2]/div/div/div[2]/div/div[2]/div")
	WebElement companiesAccessUserSelectElement;

	// Website
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div/div/div/input")
	WebElement companoesWebsiteElement;

	// Address
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div/div/div/div[1]/div/input")
	WebElement companiesAddressStreetElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div/div/div/div[2]/div/input")
	WebElement companiesAddresscityElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div/div/div/div[3]/div/input")
	WebElement companiesAdressStatElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div/div/div/div[4]/div/input")
	WebElement companiesAddressZipcodElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div/div/div/div[5]/div/input")
	WebElement comoaniesAddressCountryElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div/div/div/div[5]/div/div[2]/div[100]")
	WebElement companiesAddressCountryIndiaElement;

	// Phone
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[4]/div[1]/div/div/div/div[1]/input")
	WebElement companyPhonecountryElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[4]/div[1]/div/div/div/div[1]/div[2]/div[100]")
	WebElement companyAddressPhonecountrySelectElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[4]/div[1]/div/div/div/div[2]/input")
	WebElement companyAddressPhonenumberElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[4]/div[1]/div/div/div/div[3]/input")
	WebElement companyPhonehome;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[4]/div[1]/div/div/div/div[3]/input")
	WebElement companyAddressCarElement;

	// Tags
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[4]/div[2]/div/label[2]/div")
	WebElement companyTagElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[4]/div[2]/div/label[2]/div/div[2]/div")
	WebElement companyTagSelectElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[6]/div/div/label")
	WebElement companyTagoutsidElement;

	// Description
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[6]/div/div/textarea")
	WebElement companyDescriptionElement;

	// Social channel
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[7]/div[1]/div/div/div/div[1]")
	WebElement companySocialChannElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[7]/div[1]/div/div/div/div[1]/div[2]/div[2]")
	WebElement companySocialchannelFacebookElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[7]/div[1]/div/div/div/div[2]/input")
	WebElement companySocialchannelFacebookProfileLinkElement;

	// Industry
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[7]/div[2]/div/div/input")
	WebElement companyIndustryElement;

	// No. Of employee
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[8]/div[1]/div/div/input")
	WebElement companynoOfemployeeElement;

	// Stock symbols
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[8]/div[2]/div/div/input")
	WebElement companyStockSymbolElement;

	// Annual revenue
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[9]/div[1]/div/div/input")
	WebElement companyAnnualRevenuElement;

	// Priority
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[9]/div[2]/div/div")
	WebElement companyPrioElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[9]/div[2]/div/div/div[2]/div[3]")
	WebElement companyPriorityHighPriElement;

	// Status
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[10]/div[1]/div/div")
	WebElement companystatusElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[10]/div[1]/div/div/div[2]/div[2]")
	WebElement companyStatusActivElement;

	// source
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[10]/div[2]/div/div")
	WebElement companysourcElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[10]/div[2]/div/div/div[2]/div[6]")
	WebElement companySourceInternetOptionElement;

	// Category
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[11]/div[1]/div/div")
	WebElement companyCategoryElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[11]/div[1]/div/div/div[2]/div[2]")
	WebElement companyCategoryPartnerElement;

	// VAT number
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[11]/div[2]/div/div/input")
	WebElement companyVATNumberElement;

	// Identifier
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[12]/div[1]/div/div/input")
	WebElement comopanyIdentifierElement;

	// Upload Image
	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[12]/div[2]/div/div/div/input")
	WebElement companyUploadImagElement;

	// Save Button
	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")
	WebElement savebuttoncompanyElement;

	public void validateNewcompanybutton() {
		newcompaniesElement.click();
	}

	public void validateAddNewCompanyDetails(String cname, String cwebsite, String cadrsstreet, String caddresscity,
			String state, String zipcode, String desc, String facebook, String industry, String employeeNo,
			String stock, String revenue, String vat, String identifier) throws InterruptedException, AWTException {

		companienamElement.sendKeys(cname);

		companieAccessbuttonElement.click();
		Thread.sleep(2500);
		companiesAccessUserElement.click();
		companiesAccessUserSelectElement.click();

		companoesWebsiteElement.sendKeys(cwebsite);

		companiesAddressStreetElement.sendKeys(cadrsstreet);
		companiesAddresscityElement.sendKeys(caddresscity);
		companiesAdressStatElement.sendKeys(state);
		companiesAddressZipcodElement.sendKeys(zipcode);
		comoaniesAddressCountryElement.click();
		Thread.sleep(2500);
		companiesAddressCountryIndiaElement.click();
		Thread.sleep(2500);

		// companyPhonecountryElement.click();
		// Thread.sleep(2500);
		// companyAddressPhonecountrySelectElement.click();
		// companyAddressPhonenumberElement.sendKeys(cphonenumber);

		// companyTagElement.sendKeys(tag);
		// companyTagSelectElement.click();
		// Thread.sleep(2500);
		// companyTagoutsidElement.click();

		companyDescriptionElement.sendKeys(desc);

		companySocialChannElement.click();
		Thread.sleep(2500);
		companySocialchannelFacebookElement.click();
		companySocialchannelFacebookProfileLinkElement.sendKeys(facebook);

		companyIndustryElement.sendKeys(industry);

		companynoOfemployeeElement.sendKeys(employeeNo);

		companyStockSymbolElement.sendKeys(stock);

		companyAnnualRevenuElement.sendKeys(revenue);

		companyPrioElement.click();
		Thread.sleep(2500);
		companyPriorityHighPriElement.click();

		companystatusElement.click();
		Thread.sleep(2500);
		companyStatusActivElement.click();

		companysourcElement.click();
		Thread.sleep(2500);
		companySourceInternetOptionElement.click();

		companyCategoryElement.click();
		Thread.sleep(2500);
		companyCategoryPartnerElement.click();

		companyVATNumberElement.sendKeys(vat);

		comopanyIdentifierElement.sendKeys(identifier);
		Thread.sleep(2500);

		// WebElement uploadElement =
		// driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[12]/div[2]/div/div/div/input"));
		// uploadElement.sendKeys("C://Image.jpg");
		// Thread.sleep(8000);

		driver.findElement(
				By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[12]/div[2]/div/div/div/input")).click();

		Robot rb = new Robot();

		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);

		rb.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(500);

		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(500);

		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);

		rb.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(500);

		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(500);

		savebuttoncompanyElement.click();
	}

}
