package week4.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelectable {
	public static void main (String[] args) throws InterruptedException, IOException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(0);
		Actions selectable = new Actions(driver);
		WebElement sele1 = driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-selectee'])[1]"));
		WebElement sele2 = driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-selectee'])[2]"));
		WebElement sele3 = driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-selectee'])[3]"));
		selectable.keyDown(Keys.CONTROL).click(sele1).click(sele2).click(sele3).keyUp(Keys.CONTROL).perform();
		
		
}
}