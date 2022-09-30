package leafsteps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Leaftabsdelete {
	RemoteWebDriver driver;
	@Given("Open browser1")
	public void openBrowser1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
	}
	@And ("Load the application URL1")
	public void load_url1()
	{
		driver.get("http://leaftaps.com/opentaps/");
	}
	@And ("maximize and timeout is handled1")
	public void maxAndTimeout1()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Given ("enter the username1 as {string}")
	public void username1(String username)
	{
		driver.findElement(By.id("username")).sendKeys(username);
	}
	@And ("enter the password1 as {string}")
	public void password1(String password)
	{
		driver.findElement(By.id("password")).sendKeys(password);
	}
	@And ("Click login1")
	public void login1()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@When ("Clicking login button1")
	public void homepage1()
	{
		driver.findElement(By.xpath("//a[contains(text(), 'CRM')]")).click();
	}
	@Then ("login home page will gets navigated1")
	public void navigate1() throws InterruptedException
	{
		System.out.println("Home Screen has been navigated");
		Thread.sleep(5000);
	}

	@And ("click on leads1")
	public void lead1()
	{
		driver.findElement(By.linkText("Leads")).click();
	}

	@And ("click Find leads")
	public void findlead()
	{
		driver.findElement(By.linkText("Find Leads")).click();
	}

	@And ("Click phone")
	public void phone()
	{
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	@And ("Enter phone number as {string}")
	public void enterphonenum(String pnum)
	{
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pnum);
	}
	@And ("click find leads button")
	public void findlead1() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}
	@And ("Get the lead id")
	public void getleadidandprint()
	{
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(leadID);
	}

	@And ("click on the selected lead id")
	public void clickleadid()
	{
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}

	@And ("click delete button")
	public void delete()
	{
		driver.findElement(By.linkText("Delete")).click();
	}
	@And ("click find lead button")
	public void find()
	{
		driver.findElement(By.linkText("Find Leads")).click();
	}

	@And ("enter lead id {string}")
	public void leadid(String leadid)
	{
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadid);
	}
	@And ("click find leads")
	public void button()
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@When ("alert shows as no result found")
	public void alert()
	{
		String text = driver.findElement(By.className("x-paging-info")).getText();
	}
	@Then ("Lead deleted successfully")
	public void message()
	{
		System.out.println("Lead deleted successfully");
	}
}
