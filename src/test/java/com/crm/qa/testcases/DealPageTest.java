package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ClassicCRMPage;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.DealPage;
import com.crm.qa.pages.ForgotPassword;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.HomeScreen;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignupPage;

public class DealPageTest extends TestBase{

	LoginPage loginPage;
	HomePage homePage;
	HomeScreen homescreen;
	ForgotPassword frgtps;
	ClassicCRMPage clcrm;
	SignupPage sign;
	ContactPage contactPage;
	DealPage dealPage;
	
	public DealPageTest() throws IOException {
		super();
	}


	@BeforeMethod
	public void SetUp() throws IOException {
		Initilization();
		homescreen = new HomeScreen();
		loginPage = new LoginPage();
		homePage = new HomePage();
		contactPage = new ContactPage();
		dealPage = new DealPage();
		homescreen.ValidateLoginPage();
		loginPage.LogIn(Prop.getProperty("username"), Prop.getProperty("password"));
		homePage.validateDeal();
	}
	
	
	 @Test(priority = 1)
	public void newDealButtonTest() {
		dealPage.validateNewDealbutton();
	} 
	
	
	@Test(priority = 2)
	public void addNewDealTest() {
		dealPage.validateNewDealbutton();
		dealPage.validateCreateNewDeal("Swastik info - Hot Deal");
	}
	
	
 	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	} 
	
	
}
