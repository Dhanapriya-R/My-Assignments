package com.leaftabs.ui.test;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftabs.ui.pages.LoginPage;

import annotation.leaftabs.ui.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setData() {
	  excelFileName = "tc001";
	}
	@Test (dataProvider = "sendData")
	public void runCreateLead(String username, String password, String cname, String fname, String lname ) {
	new LoginPage().enterUsername(username).enterPassword(password).clickLoginButton_positive().Clickcrmsfa().ClickLeads().ClickCreateLead().EnterCompanyName(cname).EnterFirstName(fname).EnterLastName(lname).ClickCreateLead().GetLeadId();
}
	
}


