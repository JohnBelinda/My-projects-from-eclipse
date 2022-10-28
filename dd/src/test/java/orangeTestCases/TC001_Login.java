package orangeTestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.rupeek.pages.HomePage01;
import org.testng.Reporter;
import org.testng.annotations.Test;

import DataDriven.base.Base;
import DataDriven.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Constants;

public class TC001_Login extends Base {
	
	@Test(priority=0)
	public void hpTest() throws IOException {
		//logger = report.createTest("verifying if clickable");
		LoginPage hp = new LoginPage(driver);
		new LoginPage (driver).LoggingIn();
		new LoginPage(driver).closeApp();
		//System.out.println("logging in ");
		//logger.pass("it is clickable");
	  	//Reporter.log("it is clickable",true);
		}
	
}
