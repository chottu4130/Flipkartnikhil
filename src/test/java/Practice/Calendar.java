package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/datepicker/");
		WebElement wb = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		driver.switchTo().frame(wb);
		driver.findElement(By.id("datepicker")).click();
		String real="January 1998";
		String year = driver.findElement(By.xpath("//div[@class=\"ui-datepicker-title\"]")).getText();
		while(year!=real) {
			driver.findElement(By.xpath("//a[@class=\"ui-datepicker-prev ui-corner-all\"]")).click();
			real="January 1998";
			year = driver.findElement(By.xpath("//div[@class=\"ui-datepicker-title\"]")).getText();
		}

	}

}
