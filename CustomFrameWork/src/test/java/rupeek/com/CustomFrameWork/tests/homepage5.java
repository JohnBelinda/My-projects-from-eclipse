package rupeek.com.CustomFrameWork.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Constants;

public class homepage5 {

	 public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(Constants.url);
			Thread.sleep(2000);
			driver.findElement(By.linkText("Repay Your Loan")).click();
			Thread.sleep(3000);
			//Actions actions = new Actions(driver);
			 String repayYourloanPage = driver.getWindowHandle();
	       		System.out.println(repayYourloanPage);
	       		Thread.sleep(10000);
	       		
	       		JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,500)", repayYourloanPage );
				Thread.sleep(3000);
				
//	       		driver.findElement(By.xpath("//div[@class=\"icon-play-store-bg public-icon\"]")).click();
//	       		String playstorePage = driver.getWindowHandle();
//	       		System.out.println(playstorePage);
	       		
}
}
