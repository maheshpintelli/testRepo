package staleElement;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementHandling2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Browser Driver\\GC\\chromedriver_win32 (2)\\chromedriver.exe");
	
		WebDriver driver= new ChromeDriver();
		driver.get("https://github.com/login");
		
		LoginPage lp= new LoginPage(driver);
		lp.username.sendKeys("amod");
		lp.password.sendKeys("dsds");
		lp.submit.click();
		Thread.sleep(5000);
		lp.username.sendKeys("amod");
		lp.password.sendKeys("dsds");
		lp.submit.click();
		
		
	}
}
