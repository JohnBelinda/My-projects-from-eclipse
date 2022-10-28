package windowschanging;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;


public class testingt {
	

    String URL = "https://opensource-demo.orangehrmlive.com/";
    String driverpath = "C://selenium//chromedriver.exe";
    public WebDriver wb;
	
     @BeforeTest   
	public void bt() throws InterruptedException {
    	 System.setProperty("webdriver.chrome.driver",driverpath);
    	 ChromeDriver wb = new ChromeDriver();
		wb.get(URL);
    	 wb.manage().window().maximize();
		Thread.sleep(2000);
		
     }
      @Test
       public void tt() throws Exception {
    	  String er ="OrangeHRM";
    	  String ar= wb.getTitle();
    	  Assert.assertEquals(ar,er);
//		wb.findElement(By.id("txtUsername")).sendKeys("Admin");
//		wb.findElement(By.id("txtPassword")).sendKeys("admin123");
//		wb.findElement(By.id("btnLogin")).click();
//		Thread.sleep(2000);
	}
     }
		
}
