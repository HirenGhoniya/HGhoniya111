package com.crm.qa.testcases;

import java.io.IOException;




import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ClassicCRMPage;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.ForgotPassword;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.HomeScreen;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignupPage;
import com.crm.qa.util.TestUtil;

public class ContactPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	HomeScreen homescreen;
	ForgotPassword frgtps;
	ClassicCRMPage clcrm;
	SignupPage sign;
	ContactPage contactPage;
	String sheetName = "Contacts";

	public ContactPageTest() throws IOException {
		super();
	
	}
	
	
	@BeforeMethod
	public void setUP() throws IOException {	
		Initilization();
		homescreen = new HomeScreen();
		loginPage = new LoginPage();
		homePage = new HomePage();
		contactPage = new ContactPage();
		homescreen.ValidateLoginPage();
		loginPage.LogIn(Prop.getProperty("username"), Prop.getProperty("password"));
		homePage.validateContact();
		
	}
	
	 @Test(priority = 1)
	 public void newContactButtonTest() {
		contactPage.validateNewContactButton();
			} 
	 
	 
	/* @DataProvider
	public Object[][] getCRMData() {
		System.out.println("datadriven second");
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	} 
		
	
	 @Test(dataProvider = "getCRMData")
	public void addNewcontactsTest(String firstN, String LastN, String comp) {
		contactPage.validateNewContactButton();
		contactPage.createNewContacts(firstN, LastN, comp);
		} */
	 
	 @Test(priority = 2)
	 public void addNewContactTest() {
		 contactPage.validateNewContactButton();
		 contactPage.createNewContacts("Devil", "Ghoniya111", "Avinashi111");
		 
	 }
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	} 
	
	
}
