package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBar {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Browser Driver\\GC\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		driver.get("http://moneyboats.com/");
//		driver.manage().window().maximize();
//		js.executeScript("window.scrollBy(0,1000)");
		driver.navigate().to("https://www.google.com/");
		WebElement ele=driver.findElement(By.xpath("//input[@name='q']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Test';", ele);
		

	}

}
