package seleniumConcepts;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotinSelenium {
	public static void main(String args[]) throws IOException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Browser Driver\\GC\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		/*
		 * TakesScreenshot ts=(TakesScreenshot)driver; File
		 * screenShotscr=ts.getScreenshotAs(OutputType.FILE); File screenShotdest=new
		 * File("D:\\"+System.currentTimeMillis()+".jpg");
		 * FileUtils.copyFile(screenShotscr, screenShotdest);
		 */
		//

		// create object to robt class
		Robot robot = new Robot();
		// create rectangle for full screenshot
		Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		// capture screen of the desktop
		BufferedImage screenFullImage = robot.createScreenCapture(screenRect);
		// save the screenshot to local system
		ImageIO.write(screenFullImage, "png", new File("D:\\FullScreenshotRobot.png"));

	}

}
