package week4.day1;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Link;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceAssignment {
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
	WebElement publiser = driver.findElement(By.xpath("(//span[@class=' label bBody'])[2]"));
	publiser.click();
//window handles	
	Set <String> SalesForce = driver.getWindowHandles();
	List <String> list = new ArrayList<String>(SalesForce);
	driver.switchTo().window(list.get(1));
//Click confirmation message	
	driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
	System.out.println(driver.getTitle());
//Switch to main screen.
	driver.switchTo().window(list.get(0));
	
}
}