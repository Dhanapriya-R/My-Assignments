package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {
	public static void main (String[] args) throws InterruptedException, IOException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
//Go to Mens Fashion
		WebElement mensfashion = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.moveToElement(mensfashion).perform();
		mensfashion.click();
		
//3. Go to Sports Shoes
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		
//4. Get the count of the sports shoes
		String count = driver.findElement(By.xpath("//a[@class='sub-cat-node dp-widget-link hashAdded']")).getText();
		System.out.println(count);
		
//5. Click Training shoes
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
//6. Sort by Low to High
		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
		WebElement sortby = driver.findElement(By.xpath("(//li[@class= 'search-li'])[1]"));
		act.moveToElement(sortby).perform();
		sortby.click();
		Thread.sleep(5000);
//7. Check if the items displayed are sorted correctly
		List<WebElement> list = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		List <String> display = new ArrayList <String>();
		
		for (int i=0; i<list.size(); i++)
		{
			String rate = list.get(i).getText();
		System.out.println(rate);
		display.add(rate);
		String str = rate.replaceAll("\\D", "");
		int data = Integer.parseInt(str);
		System.out.println(data);
		}
		
//8.Select the price range (900-1200)
		driver.findElement(By.xpath("(//input[@class='input-filter'])[1]")).clear();
		driver.findElement(By.xpath("(//input[@class='input-filter'])[1]")).sendKeys("900");
		driver.findElement(By.xpath("(//input[@class='input-filter'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@class='input-filter'])[2]")).sendKeys("1500");
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		Thread.sleep(5000);
//9.Filter with color Navy 
		driver.findElement(By.xpath("//input[@id='Color_s-Blue']/following-sibling::label")).click();
		Thread.sleep(5000);
		
//10 verify the all applied filters 
		String rate = driver.findElement(By.xpath("(//a[@class='clear-filter-pill'])[1]")).getText();
		if(rate.contains("900"))
		{
			System.out.println("Rate filter is correct");
		}
		else
		{
			System.out.println("Rate filter is wrong");
		}
		Thread.sleep(5000);
		String colour = driver.findElement(By.xpath("(//a[@class='clear-filter-pill  '])[1]")).getText();
		if(colour.contains("Blue"))
		{
			System.out.println("Colour filter is correct");
		}
		else
		{
			System.out.println("Colour filter is wrong");
		}
//11. Mouse Hover on first resulting Training shoes
		WebElement trainingshoe = driver.findElement(By.xpath("(//img[@class='product-image wooble'])[1]"));
		Thread.sleep(5000);
		Actions Act = new Actions (driver);
		act.moveToElement(trainingshoe).perform();
		trainingshoe.click();
//12. click QuickView button
		driver.findElement(By.xpath("(//div[@class='clearfix row-disc'])[1]")).click();
//13. Print the cost and the discount percentage
		String cost = driver.findElement(By.xpath("(//div[@class='product-price pdp-e-i-PAY-l clearfix'])[1]")).getText();
		System.out.println(cost);
//14. Take the snapshot of the shoes.
		WebElement snapshot = driver.findElement(By.xpath("(//img[@class='cloudzoom'])[1]"));
		File source = snapshot.getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\Snap.jpg");
		FileUtils.copyFile(source, destination);
		System.out.println("Screenshot took successfully");
//15. Close the current window
		driver.close();
//16. Close the main window
		driver.quit();
}
}

