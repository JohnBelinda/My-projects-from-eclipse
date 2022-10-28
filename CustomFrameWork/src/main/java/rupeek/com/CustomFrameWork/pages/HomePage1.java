package rupeek.com.CustomFrameWork.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import rupeek.com.CustomFrameWork.base.BasePage;
import rupeek.com.CustomFrameWork.utils.PropertyReader;

public class HomePage1 extends BasePage {
    WebDriver driver;
    
    public HomePage1(WebDriver driver) {
    	super(driver);
    	this.driver = driver;
    }
     public void openHomePage() {
    	goToUrl(PropertyReader.readItem("url"));
    }
}
