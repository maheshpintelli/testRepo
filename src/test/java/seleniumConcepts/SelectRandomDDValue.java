package seleniumConcepts;

import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectRandomDDValue {
	public static void main(String args[]) throws InterruptedException, IOException {
		// Chrome Driver
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Browser Driver\\GC\\chromedriver_win32 (2)\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement dropdownElement=driver.findElement(By.xpath("//select[@id='select-demo']"));
		for (int i=0;i<=3;i++)
		{
		Select dropdownItem=new Select(dropdownElement);
		List<WebElement> ddallitems=dropdownItem.getOptions();
		int size=ddallitems.size();
		int randnMumber = ThreadLocalRandom.current().nextInt(0, size);
		ddallitems.get(randnMumber).click();
		Thread.sleep(2000);
		}
		
		

}
}
