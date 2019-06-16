package seleniumConcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	public static String filepath="D:\\Selenium\\WorkPlace\\MyWorkplace\\AllAboutSelenium\\src\\test\\java\\seleniumConcepts\\fileExcelData.xlsx";
	public void readFile() throws EncryptedDocumentException, IOException
	{
FileInputStream fis=new FileInputStream(filepath);
Workbook wb=WorkbookFactory.create(fis);
Sheet s=wb.getSheet("SampleTest");
Row r=s.getRow(0);
System.out.println(r.getCell(0).getStringCellValue());
Row r1=s.getRow(1);
System.out.println(r1.getCell(0).getStringCellValue());
	}
	public static void main (String args []) throws EncryptedDocumentException, IOException
	{
		ReadExcel read=new ReadExcel();
		read.readFile();
	}

}
