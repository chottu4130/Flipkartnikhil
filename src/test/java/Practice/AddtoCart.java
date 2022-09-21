package Practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class AddtoCart 
{
	@Test
	public void addtoCart() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("winter heater");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		driver.findElement(By.xpath("//a[text()='DARSHANAM WORLD 220v 500w Portable Electric Heater Mini...']")).click();
		Set<String> list = driver.getWindowHandles();
		Iterator<String> lis = list.iterator();
		while(lis.hasNext())
		{
			String i = lis.next();
			driver.switchTo().window(i);
			
			String text = driver.getTitle();
			String exp="portable-electric-heater-mini-fan-desktop-household-wall-handy";
			if(text.contains(exp))
			{
				break;
			}
		}
		
		String t1 = driver.findElement(By.xpath("//a[@class='_2Kn22P gBNbID']")).getText();
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		driver.findElement(By.xpath("//img[@class='_2xm1JU']")).click();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		String t = driver.findElement(By.xpath("//a[@class='_2Kn22P gBNbID']")).getText();
		org.testng.Assert.assertEquals(t1,t);
		driver.close();
		
		
		
		
		
	}

}
