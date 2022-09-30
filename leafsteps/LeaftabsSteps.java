package leafsteps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LeaftabsSteps{
	RemoteWebDriver driver;
	@Given("Open browser")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
	}
	@And ("Load the application URL")
	public void load_url()
	{
		driver.get("http://leaftaps.com/opentaps/");
	}
	@And ("maximize and timeout is handled")
	public void maxAndTimeout()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}
	
	@Given ("enter the username as {string}")
	public void username(String username)
	{
		driver.findElement(By.id("username")).sendKeys(username);
	}
	@And ("enter the password as {string}")
	public void password(String password)
	{
		driver.findElement(By.id("password")).sendKeys(password);
	}
	@And ("Click login")
	public void login()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@When ("Clicking login button")
	public void homepage()
	{
		driver.findElement(By.xpath("//a[contains(text(), 'CRM')]")).click();
	}
	@Then ("login home page will gets navigated")
	public void navigate() throws InterruptedException
	{
		System.out.println("Home Screen has been navigated");
		Thread.sleep(5000);
	}

	@And ("click on leads")
	public void lead()
	{
		driver.findElement(By.linkText("Leads")).click();
	}
	@And ("click create leads")
	public void createlead()
	{
		driver.findElement(By.linkText("Create Lead")).click();
	}
	
	@And ("Enter first name as {string}")
	public void fname(String firstname)
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
	}
	@And ("Enter last name as {string}")
	public void lname(String lastname)
	{
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
	}
	@And ("Enter company name as {string}")
	public void cname(String companyname)
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
	}
	@When ("Create lead button is clicked")
	public void submit()
	{
		driver.findElement(By.name("submitButton")).click();
	}
	@Then ("New lead should be created successfully")
	public void leadcreated()
	{
		
		System.out.println("lead created successfully");

	}
	




}