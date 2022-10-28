package utils;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTest extends AutomationReport{

	@BeforeTest
	void setData() {
		desc = "first test";
		author="Belinda";
		cate = "reg";
	}
	@Test
	void myTest() {
		System.out.println("Test begins");
		//statusOfReport("pass","som desc");
		System.out.println("test ends");
	}
}
