package org.rupeek.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.rupeek.seleniumBase.RupeekBase;
import org.testng.annotations.Test;

public class HomePage02 extends RupeekBase {
	
	//RemoteWebDriver driver = null;
		public HomePage02(RemoteWebDriver driver) {
			this.driver = driver;
		
		}
		public HomePage02 shiftYourLoan1() {
			driver.findElement(By.linkText("Shift Your Loan")).click();
//			
//			JavascriptExecutor js = (JavascriptExecutor)driver;
//			WebElement range = driver.findElement(By.linkText("Get Started Now"));
//			 js.executeScript("arguments[0].scrollIntoView();",range);

       		JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");
			return this;
		}

}
