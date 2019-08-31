package com.crm.qa.pages;

import java.io.IOException;





import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{

	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath = "/html/body/div[1]/div/div/form/div/div[3]")
	WebElement loginbtn;
	
	@FindBy(xpath = "//a[text()='Forgot your password?']")
	WebElement frgtpswrdt;
	
	@FindBy(xpath = "//a[text()='Classic CRM']")
	WebElement clscrm;
	
	@FindBy(xpath = "//a[text()='Forgot your password?']")
	WebElement signupp;
	
	
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	
	public HomePage LogIn(String un, String pwd) throws IOException {
		email.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		return new HomePage();
				
	}	
	
	 public ForgotPassword forgotPass() throws IOException {
		frgtpswrdt.click();
		return new ForgotPassword();
	}
	
	public ClassicCRMPage clasicCRM() throws IOException {
		clscrm.click();
		return new ClassicCRMPage();
		
	}
		
	public SignupPage sgnup() throws IOException {
			signupp.click();
			return new SignupPage();

	} 

}