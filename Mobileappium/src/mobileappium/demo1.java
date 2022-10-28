package mobileappium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class demo1 extends mobiletest {

	AndroidDriver<AndroidElement> driver; 
	
	@BeforeTest
	public void BT() throws MalformedURLException
	{
	 driver = beli();
    }
	@Test
	public void T() throws AWTException, InterruptedException {
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
	    driver.findElement(By.xpath("")).sendKeys("Moolya");
	    
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_ENTER);
	    //WebElement.sendKeys(Keys.RETURN);
		String st= driver.getTitle();
		System.out.println(st);
		
	}
	
}
