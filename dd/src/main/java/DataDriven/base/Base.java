package DataDriven.base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	
protected RemoteWebDriver driver = null;
	
	
	@BeforeMethod
	public void startOrangehrm() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	public WebElement getElement(String locator, String type){
		WebElement element  = null;
		type = type.toLowerCase();
		
		if(type.equals("id")){
			element  =  driver.findElement(By.id(locator));
		} else if(type.equals("css")){
			element = driver.findElement(By.cssSelector(locator));
		}else if (type.equals("name")){
			element  = driver.findElement(By.name(locator));
		}else if(type.equals("xpath")){
			element = driver.findElement(By.xpath(locator));	
		}
		if(checkSingleEntry(locator, type)){
			System.out.println("Element Found and Returned");
			return element;
		}	
		System.out.println("Sorry Element not found, so not returned...");
		return null;


	}
	

	
	// shall give if it has multiple entries as a list in DOM 
	
	public List<WebElement> getElementsAsList(String locator, String type){
		type = type.toLowerCase();
		if(type.equals("id")){
			return driver.findElements(By.id(locator));
		}else if(type.equals("name")){
			return driver.findElements(By.name(locator));
		}else if(type.equals("xpath")){
			return driver.findElements(By.xpath(locator));
		}else if(type.equals("class")){
			return driver.findElements(By.className(locator));
		}// other TODO 
		return null;
	}
	
	// return true if element exists 
	// this method works for us when we have more than 1 element 
	// to be found for 
	public boolean isElementFound(String locator, String type){
		return getElementsAsList(locator, type).size()>0;
	}
	
	// this method gives true only where there is an single entry 
	// in the DOM 
	public boolean checkSingleEntry(String locator, String type){
		return getElementsAsList(locator, type).size() ==1;
	}
	
	@AfterMethod
	public void closeApp() {
		driver.quit();
		
	}
}
