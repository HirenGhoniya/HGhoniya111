package com.crm.qa.pages;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase; 

public class HomeScreen extends TestBase {
	
	public LoginPage loginPage;
	public SignupPage signupPage;
	
	
	public HomeScreen() throws IOException {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]")
	WebElement loginbtn;
	
	@FindBy(xpath= "//a[text()='Sign Up']")
	 WebElement signupbtn;
	
	
	
	public String validatePagetitle() {
		return driver.getTitle();
	}
	
	public LoginPage ValidateLoginPage() throws IOException {
	
		
		//By loadingImage = By.id("preloader");
		//WebDriverWait wait=new WebDriverWait(driver,20);
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
		loginbtn.click();
		return new LoginPage();
			
	}
	
	public SignupPage validateSignUpPage() throws IOException {
		
		//By loadingImage = By.id("preloader");
		//WebDriverWait wait=new WebDriverWait(driver,20);
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
		signupbtn.click();
		return new SignupPage();
		
	}
	

}	

