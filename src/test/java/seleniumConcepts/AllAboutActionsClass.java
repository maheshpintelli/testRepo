package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AllAboutActionsClass {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Browser Driver\\GC\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Actions act = new Actions(driver);
		// Click and Hold
		WebElement button = driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']"));
		act.clickAndHold(button).perform();
		act.release(button).perform();
		// Right Click
		act.contextClick().perform();
		// Move to Element
		WebElement ele1 = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));
		act.moveToElement(ele1).perform();
		// Double Click
		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		WebElement clickOnBtn = driver.findElement(By.xpath("//input[@id='double-click']"));
		act.doubleClick(clickOnBtn).perform();
		driver.switchTo().alert().accept();
		// Drag and Drop
		driver.navigate().to("http://jqueryui.com/droppable/");
		// Create object of Actions class
		Actions actions1 = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		// Find the Locator of Draggable file
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		// Find the Locator of Droppabled file
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		// use dragAndDrop() method
		Thread.sleep(3000);
		actions1.dragAndDrop(drag, drop).perform();
		System.out.println("Dropped successfully");
		// ScrollBar
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		act.sendKeys(Keys.PAGE_UP).build().perform();

	}

}
