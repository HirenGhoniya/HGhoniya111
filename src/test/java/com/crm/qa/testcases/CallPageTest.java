package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CallPage;
import com.crm.qa.pages.DealPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.HomeScreen;
import com.crm.qa.pages.LoginPage;

public class CallPageTest extends TestBase {

	HomeScreen homeScreen;
	LoginPage loginPage;
	HomePage homePage;
	DealPage dealPage;
	CallPage callPage;

	public CallPageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void SetUp() throws IOException {
		Initilization();

		homeScreen = new HomeScreen();
		loginPage = new LoginPage();
		dealPage = new DealPage();
		homePage = new HomePage();
		callPage = new CallPage();

		homeScreen.ValidateLoginPage();
		loginPage.LogIn(Prop.getProperty("username"), Prop.getProperty("password"));
		homePage.validateCall();
	}

	@Test(priority = 1)
	public void newCallButtonTest() {
		callPage.validateNewCallButton();
	}

	@Test(priority = 2)
	public void addNewCallTest() throws InterruptedException {
		callPage.validateNewCallButton();
		callPage.validateAddNewCallData("Test-Description");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
