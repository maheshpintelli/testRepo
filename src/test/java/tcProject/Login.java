package tcProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Browser Driver\\GC\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://test.thinkcerti.com/");
		Actions act=new Actions(driver);
		WebElement singIn=driver.findElement(By.xpath("//a[contains(text(),'Sign In')]"));
		act.moveToElement(singIn).perform();
		driver.findElement(By.xpath("//a[contains(text(),'Learner')]")).click();
//		Thread.sleep(3000);
		WebElement element=driver.findElement(By.xpath("/html[1]/body[1]/div[7]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]"));
		WebElement element1=driver.findElement(By.xpath("//form[@id='login_Form']//input[@id='form_password_login']"));
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element)); 
//		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.sendKeys("test@gmail.com");
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element1)); 
		element1.sendKeys("Hello");
		driver.findElement(By.xpath("//form[@id='login_Form']//button[@id='signin']")).click();
		
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("document.getElementById('form_username_login').value='Hi'");
	}
}
