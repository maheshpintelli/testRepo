package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsMethods {
	public static void main (String args [])
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Browser Driver\\GC\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
	
	// isSelected()
			driver.navigate().to("http://demo.automationtesting.in/Register.html");
			boolean isselected = driver.findElement(By.xpath("//input[@id='checkbox1']")).isSelected();
			System.out.println(isselected);

			driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
			boolean isselected1 = driver.findElement(By.xpath("//input[@id='checkbox2']")).isSelected();
			System.out.println(isselected1);

			// isDisplayed()
			boolean isdisplayed = driver.findElement(By.id("submitbtn")).isDisplayed();
			System.out.println(isdisplayed);

			// isEnabled()
			boolean isenanled = driver.findElement(By.id("submitbtn")).isEnabled();
			System.out.println(isenanled);
			

}
}