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
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class CustomerServiceOption
{
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
	///click login button
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
			
	Shadow sh = new Shadow(driver);
	sh.findElementByXPath("//span[text()='Products']").click();
	
	
	WebElement service = sh.findElementByXPath("//span[text()='Service']");
	
	Thread.sleep(5000);
	Actions act = new Actions(driver);
	act.moveToElement(service).perform();
	
	
	sh.findElementByXPath("//a[text()='Customer Service']").click();
	
	
	List<WebElement> search = driver.findElements(By.xpath("//h2[@data-equalize='heading1']"));
for (WebElement webElement : search) {
	System.out.println(webElement.getText());
}
				
	String Title = driver.getTitle();
	if(Title.contains("Customer service"))
	{
		System.out.println("Successful");
	}
	else
	{
		System.out.println("Failure");
	}
		
}
}