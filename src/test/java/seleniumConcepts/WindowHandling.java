package seleniumConcepts;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main (String args []) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Browser Driver\\GC\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com/");
//		String guID=driver.getWindowHandle();
//		System.out.println(guID);
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[contains(text(),'Open New Seperate Windows')]")).click();
		String parentWindowHandle=driver.getWindowHandle();
		System.out.println(parentWindowHandle);
		System.out.println("Title of Parent Window"+parentWindowHandle);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Set<String> allWindow=driver.getWindowHandles();
		System.out.println(allWindow);
		for (String allGUID:allWindow)
		{
			if(!allGUID.equals(parentWindowHandle))
			{
				driver.switchTo().window(allGUID);
			System.out.println("Title of New Window"+driver.getTitle());
		}
		}
		Thread.sleep(3000);
		driver.switchTo().window(parentWindowHandle);
		System.out.println("Title of Window After Moving back"+driver.getTitle());
	}

}

