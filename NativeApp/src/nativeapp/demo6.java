package nativeapp;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class demo6 extends na  {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
       
        AndroidDriver<AndroidElement>driver = beli();
        Thread.sleep(3000);
        
        driver.findElementByAccessibilityId("OS").click();
        Thread.sleep(2000);
        
		

	}

}
