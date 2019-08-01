package seleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAboutWaits {
	
	WebDriver driver;
	@BeforeTest
	public void browser()
	{
	System.setProperty("webdriver.chrome.driver",
			"D:\\Selenium\\Browser Driver\\GC\\chromedriver_win32 (2)\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	}
	
	@Test(priority=1)
	public void sleepWait() throws InterruptedException
	{
		Thread.sleep(1000);
	}
	@Test(priority=2)
	public void implicitWait()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void ExplicitWait()
	{
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")));
		
	}
	
	public void fluentWait()
	{
		FluentWait wait=new FluentWait(driver);
		wait.withTimeout(20, TimeUnit.SECONDS);
		wait.pollingEvery(5, TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);
		
		
	}
	
	

}
