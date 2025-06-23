package com.crm.stepDefinations;

import com.crm.qa.pageObjects.ContactPage;
import com.crm.qa.pageObjects.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageDefination {

	HomePage homePage;
	ContactPage contactpage;
	@Given("I click on Contacts from sidebar")
	public void click_On_Contacts_from_sidebar() throws InterruptedException
	{		
		homePage= new HomePage();
		contactpage=homePage.clickOnContact();
	}
	@Then("I created a new Contact")
	public void I_created_a_new_Contact() throws InterruptedException
	{
		contactpage.createNewContact();
	}
}
