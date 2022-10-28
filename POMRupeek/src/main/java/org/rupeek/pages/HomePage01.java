package org.rupeek.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.rupeek.seleniumBase.RupeekBase;

import com.aventstack.extentreports.ExtentReports;

public class HomePage01 extends RupeekBase {
	
	
	
//	extend.loadConfig(new File(System.getProperty("user.dir")+"//src//extent-config.xml"));

	//RemoteWebDriver driver = null;
	public HomePage01(RemoteWebDriver driver) {
		this.driver = driver;
	
	}
	
	public HomePage01 CustomiseYourLoan() {
		WebElement d =driver.findElement(By.linkText("Customise Your Loan"));
		d.click();
		return this;
	}
	
	public HomePage01 ShiftYourLoan() {
		driver.findElement(By.linkText("Shift Your Loan")).click();
		return this;
		}
	public repayYourLoanPage RepayYourLoan() {
		driver.findElement(By.linkText("Repay Your Loan")).click();
		return new repayYourLoanPage();
	}
	


}
