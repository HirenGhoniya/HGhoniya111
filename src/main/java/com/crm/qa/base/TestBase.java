package com.crm.qa.base;

import java.io.FileInputStream;


import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
	
	public static Properties Prop;
	FileInputStream ip; 
	String browserName;
	public static WebDriver driver;
	

	public TestBase() throws IOException {
		
		Prop = new Properties();
		ip = new FileInputStream("C:\\Users\\Scaletech\\eclipse-workspace\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
		Prop.load(ip);
		
	}
	
	public void Initilization() {
		
		browserName = Prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Scaletech\\Hiren\\chromedriver.exe");
			driver = (WebDriver) new ChromeDriver();
			
		}
		else if(browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "C:/Users/Scaletech/geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
			
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PageLoadTimeOut, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.ImplicitWait, TimeUnit.SECONDS);
		
		driver.get(Prop.getProperty("url"));
	}
		
}
