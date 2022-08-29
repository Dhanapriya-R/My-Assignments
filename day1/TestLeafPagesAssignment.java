package week4.day1;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLeafPagesAssignment {
	public static void main (String[] args) throws InterruptedException, IOException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//Enter username		
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("Demosalesmanager");
//Enter password
		WebElement passwrd = driver.findElement(By.xpath("//input[@id='password']"));
		passwrd.sendKeys("crmsfa");
//Click login button
		WebElement login = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		login.click();
//Click CRM/SFA link
		WebElement link = driver.findElement(By.linkText("CRM/SFA"));
		link.click();
//Click on Contact
		WebElement contacts = driver.findElement(By.xpath("(//div[@class='x-panel-header'])[3]"));
		contacts.click();
		WebElement mergecnt = driver.findElement(By.xpath("(//a[contains(text(),'Merge Contacts')])"));
		mergecnt.click();
//Click Widget of From Contact
		driver.findElement(By.xpath("(//img[@alt='Lookup']/parent::a)[1]")).click();
//window handles		
		Set<String> mergecontact = driver.getWindowHandles();
		List<String> list = new ArrayList<String> (mergecontact);
//Move to new Window
		driver.switchTo().window(list.get(1));
//Click first contact details		
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
//Reture to main page or primary window		
		driver.switchTo().window(list.get(0));
//Click Widget of To Contact		
		driver.findElement(By.xpath("(//img[@alt='Lookup']/parent::a)[2]")).click();
//Window handling
		Set<String> mergetocontact = driver.getWindowHandles();
		List<String> list1 = new ArrayList<String> (mergetocontact);
//Return to new window
		driver.switchTo().window(list1.get(1));
//Click second contact details
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]")).click();
//Return to main window
		driver.switchTo().window(list.get(0));
//Click merge button in main window	
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
//Switch to alert and accept the alert message pop-up		
		driver.switchTo().alert().accept();
//print the title of the main page
		System.out.println(driver.getTitle());
	
	}
	}
