package org.rupeek.test;

import org.rupeek.pages.HomePage02;
import org.rupeek.seleniumBase.RupeekBase;
import org.testng.annotations.Test;

public class TC002_homepage extends RupeekBase {
	
	@Test
	public void syl(){
		HomePage02 hp2 = new HomePage02(driver);
		new HomePage02(driver).shiftYourLoan1();
	}
}
