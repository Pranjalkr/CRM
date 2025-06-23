package com.crm.qa.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.crm.qa.base.Base;

public class HomePage extends Base {
	
	
	@FindBy(xpath="//a[@class='item' and @href='/contacts']")
	WebElement contactsIcon;
	
	@FindBy(xpath="//div/a/span[text()='Contacts']")
	WebElement clickOnContact;
	
	@FindBy(xpath="//div[@id='ui']/div[@class='ui fluid container']/div[@id='main-nav']")
	WebElement frame;
	
	@FindBy(xpath="//a[text()='Free account']")
	WebElement freeAccountButton;
	
	public CalanderPage clickOnCalender() throws InterruptedException
	{	
		freeAccountButton.click();
		waitForElementExplicitly(clickOnContact);
		action.moveToElement(contactsIcon).click().build().perform();		
		clickOnContact.click();	
		return new CalanderPage();
	}

	
	public ContactPage clickOnContact() throws InterruptedException
	{	
		freeAccountButton.click();
		waitForElementExplicitly(clickOnContact);
		action.moveToElement(contactsIcon).click().build().perform();		
		clickOnContact.click();	
		return new ContactPage();
	}
	
	public CompanyPage clickOnCompany() throws InterruptedException
	{	
		freeAccountButton.click();
		waitForElementExplicitly(clickOnContact);
		action.moveToElement(contactsIcon).click().build().perform();		
		clickOnContact.click();	
		return new CompanyPage();
	}
	
	public DealPage clickOnDeal() throws InterruptedException
	{	
		freeAccountButton.click();
		waitForElementExplicitly(clickOnContact);
		action.moveToElement(contactsIcon).click().build().perform();		
		clickOnContact.click();	
		return new DealPage();
	}

}
