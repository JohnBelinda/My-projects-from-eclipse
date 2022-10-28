package rupeek.com.CustomFrameWork.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import rupeek.com.CustomFrameWork.utils.WaitForHelper;

public class BasePage {
	
	//we can navigate, wait for elements, wait for itm, click directly, write text
	//read text, move to elements
	
  protected WebDriver driver;
  
  public BasePage(WebDriver driver) {
	  this.driver = driver;
  }
  
  public void goToUrl(String url) {
	  driver.get(url);
  }
  
//  public void waitForElementToAppear(By elementLocation) {
//	  new WaitForHelper(driver).presenceOfElement(elementLocation);
//	  
//  }
  
  public void waitForLoading() {
	  new WaitForHelper(driver).implicitWait();
  }
  
  
}
