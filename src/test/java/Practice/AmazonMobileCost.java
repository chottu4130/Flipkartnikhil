package Practice;

import java.awt.event.KeyEvent;
import java.security.Key;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonMobileCost
{
	@Test
	public void allMobilePrice()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13",Keys.ENTER);
		LinkedList<String> lis= new LinkedList<String>();
		List<WebElement> list = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']/ancestor::div[@class='a-section a-spacing-small a-spacing-top-small']/descendant::span[@class='a-price-whole']"));
		Iterator<WebElement> li = list.iterator();
		while(li.hasNext())
		{
			String price = li.next().getText().split("₹")[0];
			System.out.println(price);
			String s = price.split(",")[0];
			//String s2 = price.split(",")[1];
			String s3=s;
		//	System.out.println(s3);
			lis.add(s3);
			
			
		}
		Collections.sort(lis);
		//System.out.println(lis);
		
			
		
	}

}
