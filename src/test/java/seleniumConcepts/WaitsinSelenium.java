package seleniumConcepts;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.FluentWait;

public class WaitsinSelenium {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Browser Driver\\GC\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		  Thread.sleep(2000);
		  
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("\"//div[@class='FPdoLc VlcLAe']//input[@name='btnK']\"")));
		driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")).click();

		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver)
		.pollingEvery(5, TimeUnit.SECONDS)
		.withTimeout(30, TimeUnit.SECONDS)
		.ignoring(NoSuchElementException.class)
		.ignoreAll(types)
				
		
		
		
	}

}
