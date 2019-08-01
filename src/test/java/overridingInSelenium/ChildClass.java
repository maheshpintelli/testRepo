package overridingInSelenium;

import org.testng.annotations.Test;

public class ChildClass extends ParentClass {
	@Test(priority=2)
	public void ccMethod()
	{
		driver.get("http://www.facebook.com/");
	}

}
