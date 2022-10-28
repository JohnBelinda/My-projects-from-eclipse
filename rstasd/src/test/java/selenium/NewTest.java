package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver wb;
	static String url = "https://opensource-demo.orangehrmlive.com/"; 
  @Test(dataProvider = "dp")
  public void f(String n, String s) throws InterruptedException {
  
	  wb.get(url);
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(n);
		wb.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(s);
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@id='btnLogin']")).click();
		Thread.sleep(2000);
		wb.findElement(By.id("welcome")).click();
		Thread.sleep(2000);
		wb.findElement(By.xpath("//a[normalize-space()='Logout']")).click();		
		
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Admin", "admin123" },
      new Object[] { "Admin", "admin123" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver.exe");
	  wb = new ChromeDriver();
	  wb.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() {
  wb.close();
  }

}
