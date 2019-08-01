package flipkart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAveragePrice {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Browser Driver\\GC\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.flipkart.com/mobiles/~iphone-xr-series/pr?sid=tyy,4io&otracker=clp_banner_1_2.banner.BANNER_apple-products-store_2XLEYVFO3M8Z");
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
		int sum = 0, count = 0;
		for (WebElement price : ele) {
			String price1 = price.getText();
			String clean = price1.replaceAll("[^\\d]", "");
//			System.out.println(clean);
			int intPrice = Integer.parseInt(clean);
			System.out.println("Price of iPhone is : " + intPrice);
			count = count + 1;
			System.out.println("Price of count is : " + count);
			sum = sum + intPrice;
			System.out.println("Price of sum is : " + sum);
			float avg = sum / count;
			System.out.println("avg=" + avg);
		}
		driver.close();
	}
}
