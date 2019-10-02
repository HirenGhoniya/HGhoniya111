package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CampaignPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.HomeScreen;
import com.crm.qa.pages.LoginPage;

public class CampaignPageTest extends TestBase {

	public CampaignPageTest() throws IOException {
		super();
	}

	HomeScreen homescreen;
	LoginPage loginpage;
	HomePage homepage;
	CampaignPage campaignpage;

	@BeforeMethod
	public void SetUp() throws IOException {
		Initilization();
		homescreen = new HomeScreen();
		loginpage = new LoginPage();
		homepage = new HomePage();
		campaignpage = new CampaignPage();

		homescreen.ValidateLoginPage();
		loginpage.LogIn(Prop.getProperty("username"), Prop.getProperty("password"));
		homepage.validateCampaign();
	}

	@Test(priority = 1)
	public void NewTemplateScreenTest() throws InterruptedException {
		campaignpage.validateNewTemplateButton();

	}

	@Test(priority = 2)
	public void AddNewTemplateTest() throws InterruptedException {
		campaignpage.validateNewTemplateButton();
		campaignpage.validateAddNewTemplate("Radio", "Radio mirchi");
	}

	@Test(priority = 3)
	public void NewCampaignTest() {
		campaignpage.validateNewCampaignButtn();
	}

	@Test(priority = 4)
	public void AddNewCampaignTest() throws InterruptedException, IOException {
		campaignpage.validateNewCampaignButtn();
		campaignpage.validateAddNewCampaign("Holders_one");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}

}
