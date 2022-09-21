package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic.ExcelUtlity;

public class Practice1 {
	public static void main(String[] args)
	{
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("samsung",Keys.ENTER);
		driver.findElement(By.xpath("//div[@class=\"_1TmfNK\"][1]")).click();
		String phone1name = driver.findElement(By.xpath("//a[@title=\"SAMSUNG Galaxy F13 (Sunrise Copper, 64 GB)\"]")).getText();
		String phone1 = driver.findElement(By.xpath("//a[@title=\"SAMSUNG Galaxy F13 (Sunrise Copper, 64 GB)\"]/preceding-sibling::a/following-sibling::a[2]/div/div[1]")).getText();
		ExcelUtlity excelUtlity = new ExcelUtlity();
		//excelUtlity.ge
		int s = Integer.parseInt(phone1);
		System.out.println(s);
//		String phone1price = phone1.split("₹")[1];
//		System.out.println(phone1price);
//		
//		driver.findElement(By.name("q")).clear();
//		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
//		String phone2name = driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Black, 128 GB)']")).getText();
//		
//		String phone2 = driver.findElement(By.xpath("//div[text()='APPLE iPhone 11 (Black, 128 GB)']/../following-sibling::div/div/div/div[1]")).getText();
//		String phone2price = phone2.split("₹")[1];
//		int i1=Integer.parseInt(phone2price);
//		if(i>i1) {
//			System.out.println(phone1name+" "+phone1);
//			
//		}
//		else {
//			System.out.println(phone2name+" "+phone2);
//		}
		
	}
	

}
