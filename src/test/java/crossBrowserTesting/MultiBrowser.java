package crossBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser {
	WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	public void openBrowsers(String browser) throws Exception {
		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Selenium\\Browser Driver\\GC\\chromedriver_win32 (2)\\chromedriver.exe");
			// create chrome instance
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					"D:\\Selenium\\Browser Driver\\GC\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equals("ie")) {

			System.setProperty("webdriver.ie.driver",
					"D:\\Selenium\\Browser Driver\\GC\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else {
			throw new Exception("Browser is not correct");
		}
		driver.manage().window().maximize();
	}

	@Test
	public void openURL() {
		driver.get("http://demo.guru99.com/V4/");
		// Find user name
		WebElement userName = driver.findElement(By.name("uid"));
		// Fill user name
		userName.sendKeys("guru99");
		// Find password
		WebElement password = driver.findElement(By.name("password"));
		// Fill password
		password.sendKeys("guru99");
	}

}
