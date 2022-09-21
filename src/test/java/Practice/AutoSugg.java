package Practice;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSugg 
{

	@Test
	public void autoSugg()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("sachin");
		TreeSet<String>str=new TreeSet<String>();
		List<WebElement> list = driver.findElements(By.xpath("//div[@class=\"aajZCb\"]//ul/div/ul/li/div/div[2]/div[1]/span"));
		for (int i = 2; i < list.size(); i++) 
		{
			String tt = list.get(i).getText();
			System.out.println(tt);
			str.add(tt);
			
		}
		System.out.println(str);
		
	}
	@Test
		public void col()
		{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		WebElement we = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		WebElement body = driver.findElement(By.xpath("//body[@jsmodel=\"hspDDf\"]"));
		WebElement img = driver.findElement(By.xpath("//a[text()='Images']"));
		WebElement gm = driver.findElement(By.xpath("//a[text()='Gmail']"));
		WebElement sin = driver.findElement(By.xpath("//a[text()='Sign in' and @class='gb_1 gb_2 gb_8d gb_8c']"));
		JavascriptExecutor jsr=(JavascriptExecutor)driver;
		jsr.executeScript("arguments[0].setAttribute('style','border:50px solid red; background:yellow')", we);
		jsr.executeScript("arguments[0].value='sachin';", we);
		jsr.executeScript("arguments[0].setAttribute('style','border:50px solid green; background:blue')", body);
		jsr.executeScript("arguments[0].setAttribute('style','border:5px solid white; background:yellow')", img);
		jsr.executeScript("arguments[0].setAttribute('style','border:5px solid white; background:orange')", gm);
		jsr.executeScript("arguments[0].setAttribute('style','border:5px solid white; background:green')", sin);
		
		}
	
	    @Test
	    public void anagram()
	    {
	    	String s="xyz";
	    	String s1="zxy";
	    	int count = 1;
	    	
	    	
	    	if(s.length()==s1.length()) 
	    	{
	    	for(int i=0;i<s.length();i++)
	    		
	    	{
	    		
	    		for(int j=0;j<s1.length();j++)
	    			
	    		{
	    			if(s.charAt(i)==s1.charAt(j))
	    				
	    			{
	    				count++;
	    			}
	    			else
	    			{	    			
	    		}
	    	}
	    	
	    	
	    }
	    	if(count==s1.length())
	    	{
	    		System.out.println("anagram");
	    	}
	    	else
	    	{
	    		System.out.println("not");
	    	}
	    }
	    	else {
	    		System.out.println(" Length is different ");
	    	}
	    }
	    
	    @Test
	    public void searchForProductInFirefox() {
	    	WebDriverManager.firefoxdriver().setup();
	    	WebDriver driver= new FirefoxDriver();
	    	driver.get("https://www.flipkart.com/");
	    	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("iphone 13");
	    	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	    	String s = driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Midnight, 128 GB)']/ancestor::div[@class=\"_3pLy-c row\"]/div[2]/div[1]/div[1]/div")).getText();
	    	System.out.println(s);
	    	
	    }

}
