package com.crm.qa.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.Base;

public class ContactPage extends Base {

	@FindBy(xpath="//button[text()='Create']")
	WebElement newContactButton;
	
	@FindBy(xpath="//div[@name='category']/span")
	WebElement dropDown;
	
	public  WebElement getFieldByLabel(String labelText) {
	        String xpath = "//label[text()='" + labelText + "']/following-sibling::div/input";
	        return driver.findElement(By.xpath(xpath));
	    }
	
	public void createNewContact() throws InterruptedException
	{
		newContactButton.click();
		getFieldByLabel("First Name").sendKeys("Pranjal");
		getFieldByLabel("Last Name").sendKeys("Kumar");
		getFieldByLabel("Middle name(s)").sendKeys("Deep");
		getFieldByLabel("Company").sendKeys("Philips");
		getFieldByLabel("Email").sendKeys("pranjal.@gmail.com");
		SelectDropDownItem(dropDown,"Lead");
	}
}
