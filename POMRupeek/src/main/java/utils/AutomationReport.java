package utils;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AutomationReport {
	
	ExtentReports extent;
	ExtentTest test;
	String desc="";
	String author="";
	String cate="";
	
	@BeforeSuite
	protected void startReport() {
		//blank html 
				ExtentSparkReporter reporter = new ExtentSparkReporter("./TestReport.html");
		        //actual report
				 extent = new ExtentReports();
			   extent.attachReporter(reporter);
	}
	@BeforeClass
	 void createTest() {
	    test = extent.createTest(desc);
		test.assignAuthor(author);
		test.assignCategory(cate);
	}
////	@Test
////    void statusOfReport(String status,String description) {
////    	switch (status.toLowerCase()) {
////		case "Pass":
////			test.pass(description);
////			break;
////		case "fail":
////			test.fail(description);
////			break;
////		case "info":
////			test.info(description);
////			break;
////		case "warning":
////			test.warning(description);
////			break;
////		default:
////			System.err.print("Error occuring");
////			break;
////		}
//    	
//    }
    @AfterTest
     protected void stopReport() {
    	 extent.flush();
     }



}
