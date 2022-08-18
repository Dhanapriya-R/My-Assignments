package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
	@SuppressWarnings("deprecation")
	public static void main (String[] args) throws InterruptedException
	{
		// Step 1: Download and set the path 
	WebDriverManager.chromedriver().setup()	;
	
	// Step 2: Launch the chromebrowser
	ChromeDriver driver = new ChromeDriver();
	
	
	// Step 3: Load the URL https://en-gb.facebook.com/
	driver.get("https://en-gb.facebook.com/");
	
	// Step 4: Maximise the window
	driver.manage().window().maximize();
	
	// Step 5: Add implicit wait
	//driver.manage().timeouts().implicitlyWait(30, null);
	
	// Step 6: Click on Create New Account button
	WebElement LocateNew = driver.findElement(By.xpath("//div[@class= '_6ltg']/a[@class= '_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
	LocateNew.click();
	//
	
	// Step 7: Enter the first name
	Thread.sleep(5000);
	
	WebElement LocateFirstName = driver.findElement(By.xpath("(//input[@class= 'inputtext _58mg _5dba _2ph-'])[1]"));
	LocateFirstName.sendKeys("Dhana");
	
	// Step 8: Enter the last name

	Thread.sleep(5000);
	
	WebElement LocateLastName = driver.findElement(By.xpath("(//input[@class= 'inputtext _58mg _5dba _2ph-'])[2]"));
	LocateLastName.sendKeys("priya");
	
	// Step 9: Enter the mobile number
Thread.sleep(5000);
	
	WebElement LocateMob = driver.findElement(By.xpath("(//input[@class= 'inputtext _58mg _5dba _2ph-'])[3]"));
	LocateMob.sendKeys("8883844750");
	
	// Step 10: Enterthe password
	
Thread.sleep(5000);
	
	WebElement LocatePsw = driver.findElement(By.xpath("(//input[@class= 'inputtext _58mg _5dba _2ph-'])[5]"));
	LocatePsw.sendKeys("Priya");
	
	// Step 11: Handle all the three drop downs
	Thread.sleep(5000);
	
	WebElement Locatedate = driver.findElement(By.xpath("(//select[@class= '_9407 _5dba _9hk6 _8esg'])[1]"));
	Select sourceDD1 = new Select(Locatedate);
	(sourceDD1).selectByValue ("26");
	
	Thread.sleep(5000);
	
	WebElement Locatemonth = driver.findElement(By.xpath("(//select[@class= '_9407 _5dba _9hk6 _8esg'])[2]"));
	Select sourceDD2 = new Select(Locatemonth);
	(sourceDD2).selectByIndex (0);
	
	Thread.sleep(5000);
	
	WebElement Locateyear = driver.findElement(By.xpath("(//select[@class= '_9407 _5dba _9hk6 _8esg'])[3]"));
	Select sourceDD3 = new Select(Locateyear);
	(sourceDD3).selectByValue ("1992");
	
	// Step 12: Select the radio button "Female" 
	Thread.sleep(5000);
	
	WebElement LocateRadio = driver.findElement(By.xpath("(//input[@class= '_8esa'])[1]"));
	LocateRadio.click();
	
	         //   ( A normal click will do for this step) 
}
}