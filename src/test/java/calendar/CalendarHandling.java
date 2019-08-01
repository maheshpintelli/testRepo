package calendar;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandling {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Browser Driver\\GC\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		LoginPage lp1 = new LoginPage(driver);
		lp1.monthandyear.getText();
//		WebElement monthandYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
		String text = lp1.monthandyear.getText();
		System.out.println(text);
//		int count = 0;
		while (text.equals(text)) {

			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			text = lp1.monthandyear.getText();
			System.out.println(text);
			if (text.equalsIgnoreCase("June 2019")) {
				break;
			}
		}
		List<WebElement> allData = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
//				WebElement dates;
		for (WebElement dates : allData) {
			String text1 = dates.getText();
			System.out.println(text1);
			if (text1.equalsIgnoreCase("5")) {
				dates.click();
				break;
			} else {
				System.out.println("Date is not available");
			}
		}
	}

	{
	}
}
