package extrpt;

import java.io.File;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extentreport {
	ExtentReports extent ;
	 ExtentTest logger;
	WebDriver driver;
	
	@BeforeTest
	public void BT()
	{
		System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver.exe");
		 driver = new ChromeDriver();
		
		 //This will append the logger file and stores in the folder called Test_Output
		 extent = new ExtentReports(System.getProperty("user.dir")+"//Belinda_Ouput//Belinda.html",true);
		
		 //This line used to load the configuration file
		 extent.loadConfig(new File(System.getProperty("user.dir")+"//src//extent-config.xml"));
	}
	
	@Test
	public void testcase1() throws InterruptedException
	{
		logger = extent.startTest("OrangeHRM");
		
		driver.get("https://opensource-demo.orangehrmlive.com/");	
		logger.log(LogStatus.PASS, "WebPage Opened");
		String Title = driver.getTitle();
		logger.log(LogStatus.PASS, Title);
		
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");  //gives the username
		logger.log(LogStatus.PASS, "USername enetred");
		
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123"); //gives the password
		
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click(); //clicks on the login button
		logger.log(LogStatus.PASS, "Logged In Succesfully");
		Thread.sleep(3000); //sleep time duration
		extent.endTest(logger);
		extent.flush();
		extent.close();
	}
}