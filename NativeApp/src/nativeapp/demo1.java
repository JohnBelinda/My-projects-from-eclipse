package nativeapp;


import java.net.MalformedURLException;

import org.openqa.selenium.By;


import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class demo1 extends na {


	AndroidDriver<AndroidElement> driver; 
	
	public static void main(String[] args) throws  InterruptedException, MalformedURLException {
		AndroidDriver<AndroidElement> driver = beli();
		//if i run this what will happen
		driver.findElement(MobileBy.AccessibilityId("Preference")).click();
		Thread.sleep(3000);
	   driver.findElement(MobileBy.AccessibilityId("3. Preference dependencies")).click();
		//beacuse id is a locator of selenium so i can use By.id directly //
		//i use mobile By only if it is android locator
		Thread.sleep(3000);
		driver.findElement(By.id("android:id/checkbox")).click();
		//if i dont have accessibilty id and i cnnot use xpath as it is big
		//so i can identify the element using text
		//Whenever i am identifing the element with attribute not locator then i that case i use uiautomator
		//and uiSelector is a method i am using this to identify the elemnt with a attribute
	//	driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"WiFi settings\")")).click();
		//or
		//driver.findElementByAndroidUIAutomator("UiSelector().text(\"WiFi settings\")").click();
		//or
				driver.findElement(By.xpath("//*[@text='WiFi settings']")).click();
				
				driver.findElements(By.className("android.widget.Button")).get(0).click();
				driver.navigate().back();
				
				
				
	}

}
