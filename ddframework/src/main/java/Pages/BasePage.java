package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	public WebDriver driver;
	
	public WebDriverWait wait;
	
	public BasePage(WebDriver driver,WebDriverWait wait) {
	this.driver = driver;
	this.wait = wait;
		 
	}
	public void click(By elementLocation) {
		driver.findElement(elementLocation).click();
	}

	public void write(By elementLocation, String text) {
		driver.findElement(elementLocation).sendKeys(text);
	}
	public void read(By elementLocation) {
		driver.findElement(elementLocation).getText();
	}
}
