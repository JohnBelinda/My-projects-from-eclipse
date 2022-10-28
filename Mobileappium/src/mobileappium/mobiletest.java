package mobileappium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class mobiletest {

	public static   AndroidDriver<AndroidElement> beli() throws MalformedURLException {
		DesiredCapabilities cd = new DesiredCapabilities();
		cd.setCapability(MobileCapabilityType.DEVICE_NAME, "Belinda" );
		cd.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cd.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		cd.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C://selenium//chromedriver.exe" );
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cd); 
	     return driver;
	}

}
