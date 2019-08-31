package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.HomeScreen;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase {

	LoginPage loginPage;
	HomeScreen homeScreen;
	HomePage homePage;
	ContactPage cntctPage;

	public HomePageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setUP() throws IOException {
		Initilization();
		homeScreen = new HomeScreen();
		loginPage = new LoginPage();
		homePage = new HomePage();
		homeScreen.ValidateLoginPage();
		loginPage.LogIn(Prop.getProperty("username"), Prop.getProperty("password"));
	}

	@Test(priority = 1)
	public void crmLogoTest() throws IOException {

		boolean logo = homePage.crmLogo();
		Assert.assertTrue(logo);
	}
	
	@Test(priority = 2)
	public void ContactButtonTest() throws IOException {
		cntctPage = homePage.validateContact();
	}

	@AfterMethod
	public void tearDwn() {
		driver.quit();
	}
	
}
