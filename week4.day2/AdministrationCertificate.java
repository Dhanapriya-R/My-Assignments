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

public class AdministrationCertificate {
	public static void main (String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password#123");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
//2. Click on Learn More link in Mobile Publisher
		driver.findElement(By.xpath("(//span[@class=' label bBody'])[2]")).click();
		
		Set <String> newWindow = driver.getWindowHandles();
		List <String> list = new ArrayList<String> (newWindow);
		driver.switchTo().window(list.get(1));
		//Click confirmation message	
      	driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
	
	//Click  on learning
	//It is a shadow Dom so find webelement by means of shadow dom logic
	     Shadow sh1 = new Shadow(driver);
	//sh.findElementByXPath("//a[@text()='Resources']").click();
	     sh1.findElementByXPath("//span[text()='Learning']").click();
	//Mouse over on trailhead
	     WebElement trailhead = sh1.findElementByXPath("//span[text()='Learning on Trailhead']");
	     Thread.sleep(5000);
	     Actions act = new Actions(driver);
	     act.moveToElement(trailhead).perform();
//6. Click on Salesforce Certifications	
		WebElement certificate = sh1.findElementByXPath("//a[text()='Salesforce Certification']");
		act.moveToElement(certificate).perform();
		certificate.click();
//7. Navigate to Certification - Administrator Overview window
		driver.findElement(By.xpath("//div[text()='Administrator']")).click();
//8. Verify the Certifications available for Administrator Certifications should be displayed		
		List<WebElement> list1 = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
		for (WebElement webElement : list1) {
			System.out.println(webElement.getText());
		}
		
		
}
}