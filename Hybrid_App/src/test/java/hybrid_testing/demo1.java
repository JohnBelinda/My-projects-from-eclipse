package hybrid_testing;

import java.awt.AWTException;
import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import hybridapp.hybridap;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class demo1 extends hybridap {
	
	AndroidDriver<AndroidElement> driver;
	@Test(enabled=false)
	public void BT() throws MalformedURLException, InterruptedException
	{
		AndroidDriver<AndroidElement> driver = beli();
		Thread.sleep(3000);
    
	//public void  T() throws AWTException, InterruptedException {
		//driver.get("https://www.google.com");
		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();	
       Thread.sleep(3000);
       
       driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"))").click();
       Thread.sleep(3000);
      // driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("BELINDA");
       
     
       
       driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
       //Thread.sleep(2000);
       
       WebDriverWait waitForToast = new WebDriverWait(driver, 1);
       waitForToast.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/hierarchy/android.widget.Toast")));

       AndroidElement toastMessage = driver.findElement(By.xpath("/hierarchy/android.widget.Toast"));

       System.out.println(toastMessage.getText());
       
}
	@Test(enabled=false)
	public void TT() throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = beli();
		Thread.sleep(3000);
    
	//public void  T() throws AWTException, InterruptedException {
		//driver.get("https://www.google.com");
		//driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();	
      // Thread.sleep(3000);
       
       //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"))").click();
      // Thread.sleep(3000);
      // driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("BELINDA");
       driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("BELINDA");
       
       driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
       Thread.sleep(2000);
       
       //driver.findElementByAndroidUIAutomator("text(\"ADD TO CART\")").getIndex(0).
       driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
       driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
       //index needed the elements must be used .
       //driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).rsourceId( ))
       
      
       // driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"PG 3\"))"));
      
       //driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"PG 3\"))"));
	 
       //check how many products are listed on the screen? 
       int namecount = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
   	for(int i=0;i<namecount;i++)
   	{
   		String productName= driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
   		System.out.println(productName);
   		if(productName.equalsIgnoreCase("PG 3"))
   		{
   			driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
   			break;
   		}
   	}
       
	
	}
	@Test(enabled=true)
	public void TTt() throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = beli();
		Thread.sleep(3000);
    

       driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("BELINDA");
       
       driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
       Thread.sleep(2000);
       
       //driver.findElementByAndroidUIAutomator("text(\"ADD TO CART\")").getIndex(0).
       driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
       driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
       
       
       String d1 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();
		String d2 = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();
		
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		
		String total  = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
		System.out.println(total);
	//subtracting $ sign
		String PRICE1 = d1.substring(1);
		String PRICE2 = d2.substring(1);
		String TOTAL = total.substring(2);
		System.out.println(PRICE1);
		System.out.println(PRICE2);
		System.out.println(TOTAL);
		
		//converting to float
		float foo = Float.parseFloat(PRICE1);
		float foo2 = Float.parseFloat(PRICE2);
		float tTL  = Float.parseFloat(TOTAL);
		
		//comparing
		if(foo+foo2==tTL)
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
       
		
		
	}   
}