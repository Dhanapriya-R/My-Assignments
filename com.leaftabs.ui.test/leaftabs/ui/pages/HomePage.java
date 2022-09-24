package com.leaftabs.ui.pages;

import org.openqa.selenium.By;

import annotation.leaftabs.ui.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	public HomePage()
	{
		
	}
	public LeadsPage ClickLeads()
	{
		driver.findElement(By.linkText("Leads")).click();
		return new LeadsPage();
	}

}
