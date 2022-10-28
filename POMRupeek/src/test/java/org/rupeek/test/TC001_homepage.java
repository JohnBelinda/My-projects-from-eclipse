package org.rupeek.test;

import org.rupeek.pages.HomePage01;
import org.rupeek.seleniumBase.RupeekBase;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC001_homepage extends RupeekBase {

	@Test(priority=0)
	public void hpTest() {
		logger = report.createTest("verifying if clickable");
		HomePage01 hp = new HomePage01(driver);
		new HomePage01(driver).CustomiseYourLoan();	
		logger.pass("it is clickable");
	  	Reporter.log("it is clickable",true);
		}
	
    @Test(priority=1)
	public void hp1test() {
		logger = report.createTest("verifying if clickable");
		//HomePage01 hp = new HomePage01(driver);
		new HomePage01(driver).ShiftYourLoan();	
		logger.pass("it is clickable");
	}
	@Test(priority=2)
	public void hp2test() {
		logger = report.createTest("verifying if clickable");
		HomePage01 hp = new HomePage01(driver);
		new HomePage01(driver).RepayYourLoan();	
		logger.pass("it is clickable");
//		String newRepayYourLoanPage = driver.getWindowHandle();
//		System.out.println(newRepayYourLoanPage);	
		logger.pass("new page got");
        		
	}
//	public void homepage01() {
//		HomePage01 hp = new HomePage01();
//		
	}