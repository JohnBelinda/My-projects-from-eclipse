package rupeek.com.CustomFrameWork.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Constants;


public class HomePage1 {
	
//     public static void main(String[] args) throws InterruptedException {
//	
    	 WebDriver  driver;
    	
    	 @BeforeTest
    	 public void bt() throws InterruptedException {
    		 
    	 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get(Constants.url);
		Thread.sleep(2000);
    	 }
    	 
    	 @Test
    	 void tt() throws InterruptedException
    	 {
    		 JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement btn = driver.findElement(By.id("posterfresh"));
			 js.executeScript("arguments[0].scrollIntoView();",btn);
			 Thread.sleep(5000);
			 btn.click();
			 driver.findElement(By.id("audio_play_iconfresh")).click();
			 Thread.sleep(70000);
			 
	
     }
    	 @AfterTest
    	 void at() {
    		 driver.quit();
    	 }
}
