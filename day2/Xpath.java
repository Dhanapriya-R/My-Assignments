package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		//<input class="inputLogin" type="text" id="username" name="USERNAME" size="50">
		WebElement locateUserName = driver.findElement (By.xpath("//input[@class = 'inputLogin']"));
		locateUserName.sendKeys ("Demosalesmanager");
		
		WebElement locatePassword = driver.findElement (By.xpath("//input[@id= 'password']"));
		locatePassword.sendKeys ("crmsfa");
		
		WebElement locatelogin = driver.findElement (By.xpath("//input[@Class = 'decorativeSubmit']"));
		locatelogin.click();
		
	WebElement locateCrm = driver.findElement (By.xpath("//a[contains(text(), 'CRM/SFA')]"));
	locateCrm.click();
		//a[contains(text(), 'CRM/SFA')]
	WebElement locateLead = driver.findElement (By.xpath("//a[contains(text(), 'Leads')]"));
	locateLead.click();
		
WebElement locatecreateLead = driver.findElement (By.xpath("//a[contains(text(), 'Create Lead')]"));
	locatecreateLead.click();
		
	
	WebElement locateCompoanyName = driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
	locateCompoanyName.sendKeys("CTS");
}
}
