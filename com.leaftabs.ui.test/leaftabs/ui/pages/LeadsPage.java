package com.leaftabs.ui.pages;

import org.openqa.selenium.By;

import annotation.leaftabs.ui.ProjectSpecificMethods;

public class LeadsPage extends ProjectSpecificMethods{
	public LeadsPage()
	{
		
	}
	public CreateLeadPage ClickCreateLead()
	{
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
	}

}
