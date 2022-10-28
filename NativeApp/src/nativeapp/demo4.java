package nativeapp;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.AbstractOptionCombinedWithPosition;


import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

//writing this code to swipe
public class demo4 extends na {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
         AndroidDriver<AndroidElement>driver = beli();
		
		driver.findElementByAccessibilityId("Views").click();
		Thread.sleep(2000);
		//click on delete widgets 
		driver.findElementByAccessibilityId("Date Widgets").click();
		Thread.sleep(2000);
		driver.findElementByAccessibilityId("2. Inline").click();
		Thread.sleep(2000);
		driver.findElementByAccessibilityId("9").click();
		Thread.sleep(2000);
		
		WebElement btn1 = driver.findElementByAccessibilityId("15");
		
		WebElement btn2 = driver.findElementByAccessibilityId("45");
		
		TouchAction ta = new TouchAction(driver);
		ta.longPress(longPressOptions().withElement(element(btn1)).withDuration(ofSeconds(2))).moveTo(element(btn2)).release().perform();
	
	
	}


}
