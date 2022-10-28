package nativeapp;

import java.net.MalformedURLException;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class demo5 extends na {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
       
        AndroidDriver<AndroidElement>driver = beli();
		
        driver.findElementByAndroidUIAutomator("text(\"4\")").click();
		//driver.findElementByAccessibilityId("Views").click();
		Thread.sleep(2000);
		
		driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
		
		driver.startActivity(new Activity("io.appium.android.apis","io.appium.android.apis.ApiDemos"));
	}

}
