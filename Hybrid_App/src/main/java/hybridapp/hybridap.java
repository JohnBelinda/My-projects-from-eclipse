package hybridapp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class hybridap {

	public static AndroidDriver<AndroidElement> beli() throws MalformedURLException {
DesiredCapabilities dc = new DesiredCapabilities();
		
	    dc.setCapability(MobileCapabilityType.DEVICE_NAME, "john");
					
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			dc.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:\\Program Files\\chromedriver.exe");
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
			//dc.setCapability(MobileCapabilityType.APP, "pathof the app");
			
			//new lines added 
			//dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.calculator2");
	       // dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
			
	       //dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.androidsample.generalstore");
			//dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.androidsample.generalstore.SplashActivity");
 
			
			 dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "org.khanacademy.android");
				dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "org.khanacademy.android.ui.library.MainActivity");
	 
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.APPIUM);
			AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
			
			return driver;	
	}

}
