package week4.day2;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ArchitectCertificate {
	public static void main (String[] args) throws InterruptedException, IOException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//enter usere name
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("ramkumar.ramaiah@testleaf.com");
	//enter password
		WebElement passwrd = driver.findElement(By.xpath("//input[@id='password']"));
		passwrd.sendKeys("Password#123");
	//click login button
		WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));
		login.click();
	//Click mobile Publisher
		Thread.sleep(5000);
		WebElement publiser = driver.findElement(By.xpath("(//span[@class=' label bBody'])[2]"));
		publiser.click();
	//	window handles	
		Set <String> SalesForce = driver.getWindowHandles();
		List <String> list = new ArrayList<String>(SalesForce);
		driver.switchTo().window(list.get(1));
	//Click confirmation message	
      	driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
	
	//Click  on learning
	//It is a shadow Dom so find webelement by means of shadow dom logic
	
	     Shadow sh = new Shadow(driver);
	//sh.findElementByXPath("//a[@text()='Resources']").click();
	     sh.findElementByXPath("//span[text()='Learning']").click();
	//Mouse over on trailhead
	     WebElement trailhead = sh.findElementByXPath("//span[text()='Learning on Trailhead']");
	     Thread.sleep(5000);
	     Actions act = new Actions(driver);
	     act.moveToElement(trailhead).perform();
	//Click sales force certificate by mouse scrolling
	     WebElement certificate = sh.findElementByXPath("//a[text()='Salesforce Certification']");
	     act.scrollToElement(certificate).perform();
	      certificate.click();
	//Click Salesforce architect
	      driver.findElement(By.xpath("//div[text()='Architect']")).click();
	//Get the Text(Summary) of Salesforce Architect 
	       List<WebElement> result = driver.findElements(By.xpath("//div[contains(@class, 'cert-site_text')]"));
	        for (WebElement webElement : result) {
		    System.out.println(webElement.getText());
	}
//Get the List of Salesforce Architect Certifications Available
	          List <WebElement> list1 = driver.findElements(By.xpath("//div[contains(@class, 'credentials-card_title')]"));
	         for (WebElement webElement : list1) {
	    	System.out.println(webElement.getText());
	}
	//Click on Application Architect 
	         driver.findElement(By.xpath("//a[text()='Application Architect']")).click();
	//Get the List of Certifications available
	         List <WebElement> list3 = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
	        for (WebElement webElement : list3) {
	    	System.out.println(webElement.getText());
		
	}
}
}