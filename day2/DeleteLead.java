package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {


	public static void main (String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup()	;
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Launch the browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Enter the username
		WebElement Locateusername = driver.findElement(By.id("username"));
		Locateusername.sendKeys("DemoSalesmanager");

		//Enter the password
		WebElement LocatePassword = driver.findElement(By.id("password"));
		LocatePassword.sendKeys("crmsfa");

		//Click Login
		WebElement LocateLogin = driver.findElement(By.className("decorativeSubmit"));
		LocateLogin.click();

		//Click crm/sfa link
		WebElement LocateLink = driver.findElement(By.linkText("CRM/SFA"));
		LocateLink.click();
		
		//Click Leads link
		WebElement LocateLeads = driver.findElement(By.linkText("Leads"));
		LocateLeads.click();

		//Click Find leads
		WebElement LocateFindLeads = driver.findElement(By.linkText("Find Leads"));
		LocateFindLeads.click();

		//Click on Phone
		WebElement LocatePhone = driver.findElement(By.xpath("(//span[@class= 'x-tab-strip-text '])[2]"));
		LocatePhone.click();
	
		//Enter phone number
				WebElement LocatecntCode = driver.findElement(By.xpath("//input[@name='phoneCountryCode']"));
				LocatecntCode.clear();
				
				WebElement LocatecntryCode = driver.findElement(By.xpath("//input[@name='phoneCountryCode']"));
				LocatecntryCode.sendKeys("1");
		
				//WebElement LocateareaCode = driver.findElement(By.xpath("//input[@name='phoneAreaCode']"));
				//LocateareaCode.sendKeys("422");
				
				WebElement LocatePhoneNum = driver.findElement(By.xpath("//input[@name='phoneNumber']"));
				LocatePhoneNum.sendKeys("9487672675");
				
		//Click find leads button
			  WebElement LocateLeadsButton= driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]"));
			LocateLeadsButton.click();
			
			WebElement LocateSerch = driver.findElement(By.xpath("//input[@id= 'ext-gen740']"));
			LocateSerch.sendKeys("10293");

			WebElement LocateSerchbutton = driver.findElement(By.xpath("//button[@id= 'ext-gen841']"));
		LocateSerchbutton.click();
			//<a class="linktext" href="/crmsfa/control/viewLead?partyId=22442" id="ext-gen1741">TestLeafTCSTCS</a>
		Thread.sleep(5000);
		
	//Capture lead ID of First Resulting lead
			WebElement captureLead= driver.findElement(By.xpath("(//div[@class= 'x-grid3-cell-inner x-grid3-col-partyId']/a[@class = 'linktext'])[1]"));
			captureLead.click();
			

	//	13	Click Delete
			
			WebElement capturedelete= driver.findElement(By.xpath("//a[@class= 'subMenuButtonDangerous']"));
			capturedelete.click();
	//	14	Click Find leads
			WebElement capturefind= driver.findElement(By.linkText("Find Leads"));
			capturefind.click();
			
			Thread.sleep(5000);
			
	//	15	Enter captured lead ID
			WebElement captureDeletedLead= driver.findElement(By.xpath("(//input[@class = ' x-form-text x-form-field'])[24]"));
			captureDeletedLead.sendKeys("10293");
			
	//	16	Click find leads button
			WebElement captureleadbutton= driver.findElement(By.xpath("(//button[@class = 'x-btn-text'])[7]"));
			captureleadbutton.click();
			
			Thread.sleep(5000);
			
		//17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
			WebElement capturemessage= driver.findElement(By.xpath("//div[@class = 'x-paging-info']"));
			capturemessage.getText();
					
			System.out.println("No records to display");
			
			Thread.sleep(5000);
			//	18	Close the browser (Do not log out)
			driver.close();
	}
}
