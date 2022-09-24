package com.leaftabs.ui.pages;

import org.openqa.selenium.By;

import annotation.leaftabs.ui.ProjectSpecificMethods;

public class WelcomePage extends ProjectSpecificMethods{
	public WelcomePage()
	{
		
	}
	public HomePage Clickcrmsfa()
	{
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new HomePage();
	}
	public LoginPage ClickLogout()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage();
	}
	

}
