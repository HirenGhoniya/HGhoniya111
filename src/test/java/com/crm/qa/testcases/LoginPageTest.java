package com.crm.qa.testcases;

import java.io.IOException;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ClassicCRMPage;
import com.crm.qa.pages.ForgotPassword;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.HomeScreen;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignupPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	HomeScreen homescreen;
	ForgotPassword frgtps;
	ClassicCRMPage clcrm;
	SignupPage sign;

	public LoginPageTest() throws IOException {
		super();

	}
	
		
	@BeforeMethod
	public void setUp() throws IOException {
		Initilization();
		loginPage = new LoginPage();
		homescreen = new HomeScreen();
		loginPage = homescreen.ValidateLoginPage();
	}
	
	
	@Test(priority = 1)
	public void lgntest() throws IOException {
		homePage = loginPage.LogIn(Prop.getProperty("username"), Prop.getProperty("password"));
	}
		
	
	@Test(priority = 2)
	public void forgotpasswordTest() throws IOException {
		frgtps = loginPage.forgotPass();
		
	}	
		
	@Test(priority = 3)
	public void classicCRMTest() throws IOException {
		clcrm = loginPage.clasicCRM();
		
	}
			
	@Test(priority = 4)
	public void signuppageTest() throws IOException {
		sign = loginPage.sgnup();	
	
	}
		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
		
		
}
	
