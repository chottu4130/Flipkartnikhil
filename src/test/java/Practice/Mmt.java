package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mmt 
{
	@Test
	public void mmt()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//iframe"));
		WebElement ex = driver.findElement(By.xpath("//iframe[@title='notification-frame-173059a7b']"));
		driver.switchTo().frame(ex);
		driver.findElement(By.xpath("//body[@class='desktop in webp']")).click();
		//driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div"));
		//driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).click();
		
		
		
	}

}
