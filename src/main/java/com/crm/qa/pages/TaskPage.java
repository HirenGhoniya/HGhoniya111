package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.base.TestBase;

public class TaskPage extends TestBase {

	public TaskPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")
	WebElement newTaskbuttonElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/div/input")
	WebElement newTaskTitlebuttonElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div")
	WebElement newTaskTypElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div/div[2]/div[6]/span")
	WebElement enquiry;

	@FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")
	WebElement taskSaveButtonElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[7]/div/div/textarea")
	WebElement taskDescriptionElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[2]/div/div/div[1]/button")
	WebElement accessElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[2]/div/div/div[2]")
	WebElement selectuserElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[1]/div[2]/div/div/div[2]/div/div[2]/div")
	WebElement uservaluElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[1]/div/div")
	WebElement assignToElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[1]/div/div/div[2]/div")
	WebElement assigntovaluElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[1]/div/div/div/input")
	WebElement dueDatElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[1]/div/div[2]/div/button[2]")
	WebElement nextmontheoneElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[1]/div/div[2]/div/button[2]")
	WebElement nextElementtwoElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[1]/div/div[2]/div/button[2]")
	WebElement nextElementthreeElement;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/div[5]")
	WebElement dateElement;

	public void validateNewTaskButton() {
		newTaskbuttonElement.click();
	}

	public void validateAddNewTask(String taskTTl, String desk) throws InterruptedException {
		newTaskTitlebuttonElement.sendKeys(taskTTl);

		taskDescriptionElement.sendKeys(desk);

		// Select type = new
		// Select(driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div")));
		// Select elementType = new Select(driver.findElement(By.name("type")));
		// elementType.selectByIndex(2);

		// Access Button selection
		accessElement.click();
		selectuserElement.click();
		uservaluElement.click();
		Thread.sleep(2000);

		// AssignTo Selection
		assignToElement.click();
		assigntovaluElement.click();
		Thread.sleep(2000);

		// Type Selection
		newTaskTypElement.click();
		enquiry.click();
		Thread.sleep(2000);

		// Due Date selection
		dueDatElement.click();
		nextmontheoneElement.click();
		nextElementtwoElement.click();
		nextElementthreeElement.click();
		dateElement.click();
		Thread.sleep(2000);

		taskSaveButtonElement.click();
	}

}
