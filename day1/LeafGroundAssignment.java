package week4.day1;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAssignment {
	public static void main (String[] args) throws InterruptedException, IOException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml ");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
		Set<String> leafGround1 = driver.getWindowHandles();
	       List <String> list = new ArrayList<String>(leafGround1);
	       driver.switchTo().window(list.get(1));
	       String dashBoard = driver.getTitle();
	       if(driver.getTitle().equals("Dashboard")) {
	    	   System.out.println(dashBoard);
	       }
	       driver.switchTo().window(list.get(1)).close();
	       driver.switchTo().window(list.get(0));

	       
	       driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
	       
	       Set<String> leafground2 = driver.getWindowHandles();
	       List<String> list1 = new ArrayList<String>(leafground2);
	       System.out.println(list1.size());
	     
	       for (String eachHandles : leafground2 )
	       { 
	    	   driver.switchTo().window(eachHandles);
	    	   if(!driver.getTitle().equals("Window"))
	    	   {
	    		   driver.close();
	    		   
	    	   }
	       }
		
		driver.switchTo().window(list1.get(0));
		System.out.println("Primary window is open:" +driver.getTitle());
		
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		Set<String> leafground3 = driver.getWindowHandles();
		List<String> list2 = new ArrayList<String>(leafground3);
		for (String eachHandles : leafground3)
		{
			driver.switchTo().window(eachHandles);
			if (driver.getTitle().equals("Window"))
			{
				break;
				
			}
		
		}
	driver.switchTo().window(list2.get(0));
		
	
	 driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]")).click();
     WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
     wait.until(ExpectedConditions.numberOfWindowsToBe(2));
     Set<String> leafGround4 = driver.getWindowHandles();
     List <String> list3 = new ArrayList<String>(leafGround4);
     System.out.println(list3.size());
     driver.switchTo().window(list3.get(0));
     
     driver.quit();
			
}
}