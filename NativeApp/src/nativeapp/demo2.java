package nativeapp;


import java.net.MalformedURLException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
 
import io.appium.java_client.TouchAction;
//ststic import is required
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
//static import 
import io.appium.java_client.touch.LongPressOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;


public class demo2 extends na {

	
		
		//AndroidDriver<AndroidElement> driver = beli(); 
		
		public static void main(String[] args) throws  InterruptedException, MalformedURLException {
			AndroidDriver<AndroidElement> driver = beli();
			
			driver.findElementByAccessibilityId("Views").click();
			
			WebElement link = driver.findElementByAndroidUIAutomator("new UiSelector().clickable(true)");
			
			Dimension number = link.getSize();
			System.out.println(number);

			
		WebElement el = driver.findElementByAccessibilityId("Expandable Lists");
		
		TouchAction ta = new TouchAction(driver);
		ta.tap(tapOptions().withElement(element(el))).perform();
		Thread.sleep(3000);
		
		driver.findElementByAccessibilityId("1. Custom Adapter").click();
		
		WebElement lp = driver.findElementByAndroidUIAutomator("text(\"People Names\")"); 
		
		ta.longPress(longPressOptions().withElement(element(lp)).withDuration(ofSeconds(3))).release().perform();
		}


}
