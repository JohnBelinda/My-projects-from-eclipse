package DataDriven.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.rupeek.pages.HomePage01;
import org.testng.annotations.AfterMethod;

import DataDriven.base.Base;
import utils.Constants;
//import utilss.dd3;

public class LoginPage extends Base{

	
	public LoginPage(RemoteWebDriver driver) {
		this.driver = driver;
	
	}
	
	public void LoggingIn() throws IOException {

		File excel= new File("C://Users//Administrator//Desktop//datadriven.xls/");
		FileInputStream fis = new FileInputStream(excel);
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sh = wb.getSheet("Sheet1");
		int rowcount = sh.getLastRowNum();
		for(int i=0;i<=rowcount;i++)
		{
			String username = sh.getRow(i).getCell(0).getStringCellValue();
			String password = sh.getRow(i).getCell(1).getStringCellValue();
//			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath(Constants.username)).sendKeys(username);
			
			driver.findElement(By.xpath(Constants.password)).sendKeys(password);
			
			driver.findElement(By.xpath(Constants.submit)).click();
			
			driver.findElement(By.xpath(Constants.dropd)).click();
			//Thread.sleep(5000);
			driver.findElement(By.linkText("Logout")).click();
		}
		
		//return this;
	}
	@AfterMethod
	public void closeApp() {
		driver.quit();
		
	}
}
