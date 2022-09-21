package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.host.Iterator;

public class Hotstar 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hotstar.com/in");
		List<WebElement> list = driver.findElements(By.xpath("//a[text()='Popular Shows']/ancestor::div[@class='tray-wrapper']/descendant::article[@class='ripple show-card vertical']/a"));
		
			java.util.Iterator<WebElement> li = list.iterator();
			for(int i=0;i<list.size();i++)
			{
				
				System.out.println(list.get(i).getAttribute("to").split("/")[3]);
		}
			System.out.println(list.size());
		

		}
		

	}


