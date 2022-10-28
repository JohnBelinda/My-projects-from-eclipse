package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

	public WebDriver driver;
	
	public WebDriverWait wait;
	
	public static final String testDataExcelFile = "testData.xlsx";
  
	public WebDriver getDriver() {
		return driver;
		
	}
	public void setUp() {
		driver = new ChromeDriver();
		
		wait = new WebDriverWait(driver, 15);
		
		driver.manage().window().maximize();
		
	}
	
	public void teardown() {
		driver.quit();
	}
}
