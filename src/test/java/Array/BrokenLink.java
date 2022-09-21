package Array;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.net.UrlChecker;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSourceType;
import org.testng.annotations.Test;

public class BrokenLink 
{
	@Test
	public void brokenlink() throws URISyntaxException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		List<WebElement> link = driver.findElements(By.xpath("//a"));
		ArrayList< String> li=new ArrayList< String>();
		for(WebElement we : link)
		{
			String linklist = we.getAttribute("href");
			li.add(linklist);
			//li.remove(null);
		//	li.size();
		}
		for(String z:li)
		{
			//System.out.println(z);
			URL url=new URL(z);
			HttpURLConnection res=(HttpURLConnection)url.openConnection();
			res.connect();
			
			if(res.getResponseCode()<300)
			{
				System.out.println(z);
			}
			else
			{
				System.out.println("broken");
			}
		}
	}
	
		@Test
		public void broken()
		{
			WebDriver driver=new HtmlUnitDriver();
			driver.get("https://timesofindia.indiatimes.com/?from=mdr");
			System.out.println(driver.getTitle());
			
		}
		
		@Test
		public void grid() throws MalformedURLException
		{
			URL url=new URL("http://localhost:4444");
			DesiredCapabilities des=new DesiredCapabilities();
			des.setBrowserName("chrome");
			RemoteWebDriver driver=new RemoteWebDriver(url,des);
			driver.get("http://localhost:8888");
		}

}
