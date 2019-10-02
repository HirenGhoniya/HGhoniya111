package com.crm.qa.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.openxml4j.opc.PackageProperties;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CompaniesPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.HomeScreen;
import com.crm.qa.pages.LoginPage;

public class CompanyPageTest extends TestBase {

	HomeScreen homescreen;
	LoginPage loginpage;
	HomePage homePage;
	CompaniesPage companyPage;

	public CompanyPageTest() throws IOException {
		super();

	}

	@BeforeMethod
	public void setUp() throws IOException {
		Initilization();
		homescreen = new HomeScreen();
		loginpage = new LoginPage();
		homePage = new HomePage();
		companyPage = new CompaniesPage();
		homescreen.ValidateLoginPage();
		loginpage.LogIn(Prop.getProperty("username"), Prop.getProperty("password"));
		homePage.validatecompanies();
	}

	@Test(priority = 1)
	public void NewcompaniesButton() {
		companyPage.validateNewcompanybutton();
	}

	@Test(priority = 2)
	public void addNewCompanyDetails() throws InterruptedException, AWTException {
		companyPage.validateNewcompanybutton();
		companyPage.validateAddNewCompanyDetails("Omega", "www.google.com", "Payalpark", "Ahmedabad", "Gujarat",
				"380015", "Test_Description", "https://www.facebook.com/hiren.ghonu", "Software_Industry", "EMP01",
				"testStock", "50000", "6000", "TestIdentifier");

	}

	// @Test
	// public void addNewCompanyDetails() throws InterruptedException, AWTException
	// {
	// companyPage.validateNewcompanybutton();
	// companyPage.validateAddNewCompanyDetails("Omega");
	// }

	@AfterMethod
	public void teadDown() {

		driver.quit();
	}

}
