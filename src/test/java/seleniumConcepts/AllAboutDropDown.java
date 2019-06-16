package seleniumConcepts;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllAboutDropDown {
	public static void main (String args [])
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Browser Driver\\GC\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		//Single Value Dropdown
		WebElement dropdownElement=driver.findElement(By.xpath("//select[@id='select-demo']"));
		Select dropdownItem=new Select(dropdownElement);
		//Select item by selectByIndex()
		dropdownItem.selectByIndex(0);
		boolean ddisselected=dropdownElement.isSelected();
		//Select item by selectByValue()
		dropdownItem.selectByValue("Monday");
		//Select item by selectByVisibleText()
		dropdownItem.selectByVisibleText("Tuesday");
		
		
		
		
		java.util.List<WebElement> we=driver.findElements(By.id("Some_Id"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Select sel=new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));
		/*WebElement dd=driver.findElement(By.xpath("//select[@id='select-demo']"));
		Select sel=new Select(dd);
		java.util.List<WebElement> options=sel.getOptions();
		for(WebElement items:options)
		{
			System.out.println(items.getText());
			String a=items.getText();
			if (a.equals("Monday"))
			{
				System.out.println("hi");
				sel.selectByVisibleText("Monday");
				break;
				
			}
		}*/
		Select sel=new Select(driver.findElement(By.xpath("//select[@id='multi-select']")));
		sel.isMultiple();
		sel.selectByIndex(0);
		sel.selectByIndex(1);
		sel.selectByIndex(2);
		sel.selectByIndex(3);
		sel.selectByIndex(4);
		sel.selectByIndex(5);
		sel.selectByIndex(6);
		sel.selectByIndex(7);
		java.util.List<WebElement> allSelectedOp=sel.getAllSelectedOptions();
		for (WebElement alloptions:allSelectedOp) {
			System.out.println("All Selected OPtions = "+alloptions.getText());
		}
		WebElement firstSelectedOp=sel.getFirstSelectedOption();
		System.out.println("First Selected Item= "+firstSelectedOp.getText());
		sel.deselectAll();
		
	
	}
}
