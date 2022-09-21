package Array;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SelGrid {

	public static void main(String[] args) throws MalformedURLException 
	{
		URL url=new URL("http://localhost:4444/wd/hub");
		DesiredCapabilities des=new DesiredCapabilities();
		des.setBrowserName("chrome");
		RemoteWebDriver driver=new RemoteWebDriver(url,des);
		driver.get("http://gmail.com");

	}

}
