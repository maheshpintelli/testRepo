package seleniumConcepts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
	public static Properties properties=new Properties();
	public static String filepath=System.getProperty("user.dir") + "\\src\\test\\java\\seleniumConcepts\\testpfile.Properties";
//	public static String filePath1="D:\\Selenium\\WorkPlace\\MyWorkplace\\AllAboutSelenium\\src\\test\\java\\seleniumConcepts\\testpfile.Properties";
	
	public void method1() throws IOException
	{
		System.out.println(filepath);
		FileInputStream fis=new FileInputStream(filepath);
		properties.load(fis);
		System.out.println(properties.getProperty("fname"));
		System.out.println(properties.getProperty("lname"));
	}
	
	public static void main(String args []) throws IOException
	{
		ReadProperty rp=new ReadProperty();
		rp.method1();
		
	}
}
