package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ForgotPassword extends TestBase{

	public ForgotPassword() throws IOException {
		PageFactory.initElements(driver, this);

}
}