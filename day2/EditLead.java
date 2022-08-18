package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
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

	//Enter first name
	WebElement LocateFirstName = driver.findElement(By.xpath("// input[@id= 'ext-gen248']"));
	LocateFirstName.sendKeys("Tharini");

	//Click Find leads button
	WebElement LocateLeadsButton = driver.findElement(By.xpath("(//button[@class= 'x-btn-text'])[7]"));
	LocateLeadsButton.click();

	//Click on first resulting lead
	WebElement LocateSerch = driver.findElement(By.xpath("//input[@id= 'ext-gen740']"));
	LocateSerch.sendKeys("10045");

	WebElement LocateSerchbutton = driver.findElement(By.xpath("//button[@id= 'ext-gen841']"));
	LocateSerchbutton.click();
	
	Thread.sleep(5000);

	WebElement LocatelatestLead = driver.findElement(By.xpath("(//div[@class= 'x-grid3-cell-inner x-grid3-col-partyId']/a[@class = 'linktext'])[7]"));
	LocatelatestLead.click();


	//Verify title of the page
	String Locatetitle = driver.getTitle();
	System.out.println(Locatetitle);
	if (driver.getTitle().contains ("View Lead | opentaps CRM"))
	System.out.println("Title loading successfully");
	else
		System.out.println("Title loadinf Fails");

	//Click Edit
	WebElement LocateEdit = driver.findElement(By.linkText("Edit"));
	LocateEdit.click();

	//Change the company name
	WebElement ChangeCompanyname = driver.findElement(By.id("updateLeadForm_companyName"));
	ChangeCompanyname.clear();

	WebElement ChangeCompany = driver.findElement(By.id("updateLeadForm_companyName"));
	ChangeCompany.sendKeys("CTS");


	//Click Update
	WebElement LocateUpdate = driver.findElement(By.className("smallSubmit"));
	LocateUpdate.click();

	// Close the browser (Do not log out)
	driver.close();
	}


		
	}
	
