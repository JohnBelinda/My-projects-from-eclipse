package nativeapp;

import java.net.MalformedURLException;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class demo3 extends na{

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement>driver = beli();
		
		driver.findElementByAccessibilityId("Views").click();
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))").click();
         //when using androiduiautomator cannot use it for ios , 
		 //js and web driver -used for web testing ; so for mobile testng inbuilt method 
		//ui scrolable is used. 
	
		
	}

}
