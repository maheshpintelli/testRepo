package seleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import java.util.concurrent.TimeUnit;

public class FluentWaitinSelenium {

	public static void main(String[] args) {
		// set chrome driver exe path
		System.setProperty("webdriver.chrome.driver", "C:/~/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(30, TimeUnit.SECONDS);
	}
}
