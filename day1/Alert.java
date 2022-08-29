package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {
	public static void main (String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[text()='Browser']/ancestor::a")).click();
        driver.findElement(By.xpath("//span[text()='Alert']/ancestor::a")).click();
        driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
        org.openqa.selenium.Alert alert1 = driver.switchTo().alert();
      String text = alert1.getText();
      System.out.println(text);
      alert1.accept();
      WebElement result = driver.findElement(By.xpath("//span[@id='simple_result']"));
      System.out.println(result.getText());
      driver.findElement(By.xpath(" (//span[@class='ui-button-text ui-c'])[2]")).click();
      org.openqa.selenium.Alert alert2 = driver.switchTo().alert();
      String text1 = alert2.getText();
      System.out.println(text1);
      alert2.accept();
      WebElement result1 = driver.findElement(By.xpath("//span[@id='result']"));
      System.out.println(result1.getText());	
      
      driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
     // org.openqa.selenium.Alert alert3 = driver.switchTo().alert();
     // String text2 = alert3.getText();
    //  System.out.println(text2);
    //  alert3.accept();
      WebElement result2 = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]"));
      result2.click();	
     driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
     
     // result3.click();	
      
      
     
	}
}
