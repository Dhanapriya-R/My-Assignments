package week4.day2;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {
	public static void main (String[] args) throws InterruptedException, IOException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//2) Mouseover on Brands and Search L'Oreal Paris	
		Actions action = new Actions (driver);

		WebElement brand = driver.findElement(By.xpath("(//a[@class='css-1mavm7h'])[2]"));
		action.moveToElement(brand).perform();
		action.click();
//3) Click L'Oreal Paris
		WebElement search = driver.findElement(By.xpath("//input[@class='css-1upamjb']"));
		search.sendKeys("L'Oreal Paris" + Keys.ENTER);
//4) Check the title contains L'Oreal Paris(Hint-GetTitle)		
		String title = driver.getTitle();
		System.out.println(title);
	//	if(driver.getTitle().contains("L'Oreal Paris"))
			//System.out.println(Title);
//5) Click sort By and 		
		driver.findElement(By.xpath("//span[@class= 'sort-name']")).click();
 
		driver.findElement(By.xpath("(//div[@class= 'control-indicator radio '])[3]")).click();
//select customer top rated
		driver.findElement(By.xpath("(//span[@class= 'title '])[1]")).click();
		Thread.sleep(5000);
//6) Click Category and
		driver.findElement(By.xpath("(//span[@class= 'filter-name '])[2]")).click();
//click Hair->
		driver.findElement(By.xpath("(//span[@class= 'filter-name '])[1]")).click();
//Click haircare->
		driver.findElement(By.xpath("(//div[@class= 'control-indicator checkbox '])[1]")).click();
//click Shampoo
		driver.findElement(By.xpath("(//span[@class= 'title '])[5]")).click();
//7) Click->Concern->
		driver.findElement(By.xpath("(//div[@class='css-xdicx1'])[6]")).click();
//Color Protection
		driver.findElement(By.xpath("(//div[@class='control-indicator checkbox '])[22]")).click();
//8)check whether the Filter is applied with Shampoo
		String filter = driver.findElement(By.xpath("//span[contains (text(), 'Shampoo')]")).getText();
		System.out.println(filter);
//9) Click on L'Oreal Paris Colour Protect Shampoo		
		driver.findElement(By.xpath("(//img[@class= 'css-11gn9r6'])")).click();
Thread.sleep(5000);
//10) GO to the new window and
		Set <String> shampoo1 = driver.getWindowHandles();
		List <String> list = new ArrayList<String>(shampoo1);
		driver.switchTo().window(list.get(1));

 //select size as 175ml
		driver.findElement(By.xpath("//select[@class='css-2t5nwu']")).click();
//11) Print the MRP of the product
		String MRP = driver.findElement(By.xpath("//span[contains (text(), '₹189')]")).getText();
		System.out.println(MRP);
//12) Click on ADD to BAG	
		driver.findElement(By.xpath("(//span[@class='btn-text'])[1]")).click();
//13) Go to Shopping Bag
		driver.findElement(By.xpath("//button[@class='css-g4vs13']")).click();
		Thread.sleep(5000);
//14) Print the Grand Total amount		
		String grand = driver.findElement(By.xpath("//div[@class='first-col']")).getText();
		System.out.println(grand);
		
//15) click proceed
		driver.findElement(By.xpath("//span[text()='Proceed']"));
//16)clcik continue as guest
		driver.findElement(By.xpath("//button[text()='CONTINUE AS GUEST']"));
//17)print the grand total value
		String grand1 = driver.findElement(By.xpath("(//div[@class='value'])[2]")).getText();
		System.out.println(grand1);
		
		if (grand == grand1)
			System.out.println("The grand total value is same as MRP");
		else
			System.out.println("The grand total value is same as MRP");
		
		
}
}