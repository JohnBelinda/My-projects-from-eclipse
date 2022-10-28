package rupeek.com.CustomFrameWork.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Constants;

public class homepage6 {

	WebDriver  driver ;
	@BeforeTest
	public void bt01() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get(Constants.url);
	}
	///Popular cities///
	@Test
	public void T_01() throws InterruptedException {
				driver.findElement(By.id("cityDisplay")).click();
				Thread.sleep(2000);
				WebElement banglore = driver.findElement(By.xpath("//li[@data-cityid=\"1\"]"));
				banglore.click();	
	}
	
	
	
	@AfterTest
	public void At() {
		driver.quit();
	}
}
