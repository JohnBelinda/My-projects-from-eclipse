package hybridapp;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Platform;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import org.openqa.selenium.JavascriptExecutor;
	import java.net.URL;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;


	public class browserstack {

		  public static final String AUTOMATE_USERNAME = "belinda_OER9KC";
		  public static final String AUTOMATE_ACCESS_KEY = "fPssux7ccijDXsX1G7EC";
		  public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
		  public static DesiredCapabilities dc = new DesiredCapabilities();
		  
		  public static  AndroidDriver<AndroidElement> beli() throws Exception {
		   
			  dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
				dc.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:\\Program Files\\chromedriver.exe");
				dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);

			       dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.androidsample.generalstore");
					dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.androidsample.generalstore.SplashActivity");
                 
					dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.APPIUM);
					AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
					
					return driver;	
					
					
					//		    final WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
//		    try {
//		      driver.get("https://bstackdemo.com/");
//		      final WebDriverWait wait = new WebDriverWait(driver, 10);
//		      wait.until(ExpectedConditions.titleIs("StackDemo"));
//		      // getting name of the product
//		      String product_name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'1\']/p"))).getText();
//		      // waiting for the Add to cart button to be clickable
//		      WebElement cart_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'1\']/div[4]")));
//		      // clicking the 'Add to cart' button
//		      cart_btn.click();
//		      // checking if the Cart pane is visible
//		      wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("float-cart__content")));
//		      // getting the product's name added in the cart
//		      final String product_in_cart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'__next\']/div/div/div[2]/div[2]/div[2]/div/div[3]/p[1]"))).getText();
//		      // verifying whether the product added to cart is available in the cart
//		      if (product_name.equals(product_in_cart)) {
//		        markTestStatus("passed", "Product has been successfully added to the cart!", driver);
//		        }
//		      } catch (Exception e) {
//		          markTestStatus("failed", "Some elements failed to load", driver);
//		        }
//		      driver.quit();
//		    }
//		  // This method accepts the status, reason and WebDriver instance and marks the test on BrowserStack
//		  public static void markTestStatus(String status, String reason, WebDriver driver) {
//		    final JavascriptExecutor jse = (JavascriptExecutor) driver;
//		    jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \""+ status + "\", \"reason\": \"" + reason + "\"}}");
		  }
		} 


