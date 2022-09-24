package com.leaftabs.ui.pages;

import org.openqa.selenium.By;

import annotation.leaftabs.ui.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{
	public CreateLeadPage()
	{
		
	}
	public CreateLeadPage EnterCompanyName(String cname)
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		return this;
	}
	public CreateLeadPage EnterFirstName(String fname)
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
	}
	public CreateLeadPage EnterLastName(String lname)
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
	}
	public ViewLeadPage ClickCreateLead()
	{
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}

}
