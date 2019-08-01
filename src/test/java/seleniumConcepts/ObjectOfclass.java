package seleniumConcepts;

import javax.naming.Reference;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjectOfclass {
	public static void main (String args [])
	{
System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Browser Driver\\GC\\chromedriver_win32 (2)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
WebDriver driver2=new ChromeDriver();

System.out.println(driver);
System.out.println(driver2);
//System.out.println(driver instanceof ChromeDriver);


	}
	
	}


