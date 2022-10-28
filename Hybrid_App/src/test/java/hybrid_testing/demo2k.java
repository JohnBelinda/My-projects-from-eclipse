package hybrid_testing;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import hybridapp.hybridap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class demo2k extends hybridap {
	 AndroidDriver<AndroidElement> driver;
	
			public static void main (String[] args) throws MalformedURLException, InterruptedException{
				
				AndroidDriver<AndroidElement> driver = beli();
			
			Thread.sleep(5000);
			driver.findElementByAndroidUIAutomator("text(\"Sign in\")").click();
			Thread.sleep(5000);
			driver.findElementByAndroidUIAutomator("text(\"Sign in\")").click();
			Thread.sleep(5000);
			driver.findElementByAndroidUIAutomator("text(\"Enter an e-mail address or username\")").sendKeys("tpas123@gmail.com");
			Thread.sleep(5000);
			driver.findElementByAndroidUIAutomator("text(\"Password\")").sendKeys("khan123@");
			Thread.sleep(5000);		
			driver.findElementByAccessibilityId("Sign in").click();			
			Thread.sleep(6000);
			driver.findElements(By.className("android.widget.ImageView")).get(0).click();
			Thread.sleep(5000);
			
			
			
			
			driver.findElementByAndroidUIAutomator("text(\"Sign out\")").click();
			Thread.sleep(5000);
			driver.findElementByAndroidUIAutomator("text(\"SIGN OUT\")").click();
			Thread.sleep(5000);
			

	}

}
