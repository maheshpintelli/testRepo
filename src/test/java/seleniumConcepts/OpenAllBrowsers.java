package seleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenAllBrowsers {
	public static void main (String args [])
	{
		
//			1.	FireFox Browser:
			System.setProperty("webdriver.gecko.driver", "path of firefox .exe file");
			FirefoxDriver driver=new FirefoxDriver();
			//OR
			WebDriver driver=new FirefoxDriver();
//			2.	Chrome Browser:
			System.setProperty("webdriver.chrome.driver", "path of chromedriver .exe file");
			ChromeDriver driver=new ChromeDriver();
			//OR
			WebDriver driver=new ChromeDriver();
//			3.	IE Browser:
			System.setProperty("webdriver.ie.driver", "path IE browser driver .exe file");
			InternetExplorerDriver driver=new InternetExplorerDriver();
			//OR
			WebDriver driver=new InternetExplorerDriver();
//			4.	Edge Browser:
			System.setProperty("webdriver.edge.driver", "path of edge driver .exe file");
			EdgeDriver driver=new EdgeDriver();
			//OR
			WebDriver driver=new EdgeDriver();

	}

}
