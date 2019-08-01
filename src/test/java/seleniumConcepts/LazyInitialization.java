package seleniumConcepts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LazyInitialization {
	public static void main(String args[]) throws InterruptedException, IOException {
		// Chrome Driver
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Browser Driver\\GC\\chromedriver_win32 (2)\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement ele= driver.findElement(By.xpath("//input[@name='q']"));
		ele.sendKeys("Hi");
		WebElement ele1=driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']"));
		WebElement ele2=driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnI']"));
		
		
		
	}

}
