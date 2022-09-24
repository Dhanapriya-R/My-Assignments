package com.leaftabs.ui.pages;

import org.openqa.selenium.By;

import annotation.leaftabs.ui.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{
	public ViewLeadPage()
	{
		
	}
	public ViewLeadPage GetLeadId()
	{
		System.out.println(driver.findElement(By.id("viewLead_companyName_sp")).getText());
		return this;
	} 
	
}
