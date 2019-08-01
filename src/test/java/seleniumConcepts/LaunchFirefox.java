package seleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class LaunchFirefox {
	public static void main (String args [])
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Browser Driver\\GC\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
//		 DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//		 capabilities.setCapability("marionette", true);
//		 WebDriver driver = new FirefoxDriver(capabilities);
		driver.get("https://www.google.com/");
	}

}
