package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {
	public static void main (String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement frame1 = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame1);
		WebElement tryit = driver.findElement(By.xpath("//button[text() = 'Try it']"));
		tryit.click();
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.accept();
		WebElement result = driver.findElement(By.xpath("//p[@id='demo']"));
		System.out.println(result.getText());
		
}
}