package com.leaftabs.ui.pages;

import org.openqa.selenium.By;

import annotation.leaftabs.ui.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	public LoginPage()
	{
		
	}
	public LoginPage enterUsername(String username )
	{
		driver.findElement(By.id("username")).sendKeys(username);
		return this;
	}
	public LoginPage enterPassword(String password)
	{
		driver.findElement(By.id("password")).sendKeys(password);
		return this;
	}
	public WelcomePage clickLoginButton_positive()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		
		return new WelcomePage();
	}
	public LoginPage clickLoginButton_negative()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
		return this;
	}
}
