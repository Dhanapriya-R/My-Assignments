package leaftaps;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import annotation.leaftabs.ui.ProjectSpecificMethods;


	public class DuplicateLead extends ProjectSpecificMethods {
		@BeforeTest
		public void setData()
		{
			  excelFileName = "tc004";
		}
@Test(dataProvider =  "sendData")
		public  void runDuplicateLead(String username, String password) throws InterruptedException{
			
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9");
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			driver.findElement(By.linkText("Duplicate Lead")).click();
			driver.findElement(By.name("submitButton")).click();
			
	}
	}


