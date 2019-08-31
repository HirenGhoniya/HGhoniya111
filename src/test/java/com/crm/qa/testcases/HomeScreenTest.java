package com.crm.qa.testcases;

import java.io.IOException;





import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomeScreen;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignupPage;

public class HomeScreenTest extends TestBase{
	
	HomeScreen homeScreen;
	LoginPage loginpage;
	SignupPage signupPage;
	

	public HomeScreenTest() throws IOException {
		super();
		
	}

	@BeforeMethod
	public void setUp() throws IOException {
		Initilization();
		homeScreen = new HomeScreen();
		
	}
	
	
	 @Test(priority = 1)
	public void testloginbtn() throws IOException {
		loginpage = homeScreen.ValidateLoginPage();
			
	} 
	
	 @Test(priority = 2)
	public void testsignupButton() throws IOException {
		signupPage = homeScreen.validateSignUpPage();		
	} 
	
	
	 @Test(priority = 3)
	public void crmTitleTest() {
		String pagettl = homeScreen.validatePagetitle();
		Assert.assertEquals(pagettl, "Free CRM #1 cloud software for any business large or small");
	} 
	
	 @AfterMethod
	public void tearDown() {
	driver.quit();
	} 

}
