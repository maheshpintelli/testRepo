package seleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElemets {
	public static void main(String args [])
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Browser Driver\\GC\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.stqatools.com/");
	List<WebElement> findelements = driver.findElements(By.xpath("//input[@type='text']"));
	for (WebElement elements:findelements)
	{
		String ele=elements.getText();
		System.out.println(ele);
	}
		//Use .get(int index) method fot selecting specific WebElement from the list
	findelements.get(1).sendKeys("Mahesh");
			}

	}