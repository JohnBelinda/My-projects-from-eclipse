package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Constants {


public static String username="//*[@name='username']";
	
	public static String password = "//*[@type='password']";
	
	public static String submit ="//*[@type='submit']"; 
	
	public static String dropd = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']";
	public static String filep = "C://Users//Administrator//Documents//testData.xlsx/";
//	public void fp() throws IOException {
//		File excel= new File(filep);
//		FileInputStream fis = new FileInputStream(excel);
//		XSSFWorkbook wb = new XSSFWorkbook(fis);
//		XSSFSheet sh = wb.getSheet("Sheet1");
//		int rowcount = sh.getLastRowNum();
//}
}