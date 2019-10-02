package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ClassicCRMPage;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.ForgotPassword;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.HomeScreen;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.SignupPage;
import com.crm.qa.pages.TaskPage;

public class TaskPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	HomeScreen homescreen;
	ForgotPassword frgtps;
	ClassicCRMPage clcrm;
	SignupPage sign;
	ContactPage contactPage;
	TaskPage taskPage;

	public TaskPageTest() throws IOException {
		super();
	}

	@BeforeMethod

	public void setUp() throws IOException {

		Initilization();
		homescreen = new HomeScreen();
		loginPage = new LoginPage();
		homePage = new HomePage();
		contactPage = new ContactPage();
		taskPage = new TaskPage();
		homescreen.ValidateLoginPage();
		loginPage.LogIn(Prop.getProperty("username"), Prop.getProperty("password"));
		homePage.validateTask();

	}

	@Test(priority = 1)
	public void createNewTaskTest() {
		taskPage.validateNewTaskButton();
	}

	@Test(priority = 2)
	public void addNewTaskDetailsTest() throws InterruptedException {
		taskPage.validateNewTaskButton();
		taskPage.validateAddNewTask("Call To Hiren", "Important Client - Call on free time");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
