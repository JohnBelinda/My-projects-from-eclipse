package seleium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilss.dd3;

public class dd2 {
	WebDriver driver;
	
	@Test
	public void test() throws IOException, InterruptedException {
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
		driver.get(dd3.linkk);
	File excel= new File(dd3.filep);
	FileInputStream fis = new FileInputStream(excel);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sh = wb.getSheet("Sheet1");
	int rowcount = sh.getLastRowNum();
	for(int i=0;i<rowcount;i++)
	{
		String username = sh.getRow(i).getCell(0).getStringCellValue();
		String password = sh.getRow(i).getCell(1).getStringCellValue();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(dd3.uname)).sendKeys(username);
		
		driver.findElement(By.xpath(dd3.pwds)).sendKeys(password);
		
		driver.findElement(By.xpath(dd3.sbmt)).click();
		
		driver.findElement(By.xpath("//*[@class=\"oxd-userdropdown-img\"]")).click();
		//Thread.sleep(5000);
		driver.findElement(By.linkText("Logout")).click();
	}
	}
}
