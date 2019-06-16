package seleniumConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsinSelenium {
	public static void main(String args[]) {
		// Simple Alert
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Browser Driver\\GC\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.findElement(By.xpath("//input[@name='alert']")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//input[@name='alert']")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//input[@name='alert']")).click();
		Alert al = driver.switchTo().alert();
		String alertText = al.getText();
		System.out.println("Alert Text: " + alertText);
		driver.findElement(By.xpath("//input[@name='confirmation']")).click();
		
	driver.switchTo().alert().sendKeys("Sample Text");

	}

}
