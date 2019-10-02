package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CalenderPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.HomeScreen;
import com.crm.qa.pages.LoginPage;

public class CalenderPageTest extends TestBase {

	public CalenderPageTest() throws IOException {
		super();
	}

	HomeScreen homeScreen;
	LoginPage loginPage;
	HomePage homePage;
	CalenderPage calenderPage;

	@BeforeMethod
	public void setUp() throws IOException {
		Initilization();
		homeScreen = new HomeScreen();
		loginPage = new LoginPage();
		homePage = new HomePage();
		calenderPage = new CalenderPage();
		homeScreen.ValidateLoginPage();
		loginPage.LogIn(Prop.getProperty("username"), Prop.getProperty("password"));
		homePage.validateCalender();
	}

	@Test(priority = 1)
	public void newCalenderButtonTest() {
		calenderPage.validateNewButton();
	}

	@Test(priority = 2)
	public void newCalenderAddDetailsTest() throws InterruptedException {
		calenderPage.validateNewButton();
		calenderPage.validateAddNewCalenderDetails("calender Title", "Test_Tag", "Calender Description", "Virginia",
				"Test Identifier");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
