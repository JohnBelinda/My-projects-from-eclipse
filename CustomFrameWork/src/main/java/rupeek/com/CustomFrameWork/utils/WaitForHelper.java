package rupeek.com.CustomFrameWork.utils;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForHelper {
     public WebDriver driver;
	
     
     public WaitForHelper(WebDriver driver) {
    	 this.driver = driver;
    	 
     }
     public void implicitWait() {
    	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	 
     }
//    public WebElement presenceofElement(final By elementLocation, Duration timeout) {
//        return new WebDriverWait(driver, timeout).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
//     }
     public WebElement elementToBeClickable(final By elementIdentier, Duration timeout) {
		WebElement element = new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(elementIdentier));
    	 return element; 
     }
//	public void presenceOfElement(By elementlocation) {
//		// TODO Auto-generated method stub
//		
//	}
//	
	
}
