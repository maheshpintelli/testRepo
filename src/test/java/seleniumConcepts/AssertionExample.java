package seleniumConcepts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExample {

	@Test
	public void hardAssert() {
		String str = "Hello";
		String str1 = "Welcome";
		Assert.assertEquals(str, str1);
		System.out.println("Hard Assertion completed");
	}

	@Test
	public void softAssertion() {

		String str = "Hello";
		String str1 = "Welcome";
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(str, str1);
		System.out.println("Soft Assertion completed");
		soft.assertAll();
	}

}
