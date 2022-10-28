package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Constants;

public class homepage2 {
	 public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get(Constants.url);
			Thread.sleep(2000);
//			
//			driver.findElement(By.id("cityDisplay")).click();
//		     Thread.sleep(2000);
//		     driver.findElement(By.xpath("//li[@data-cityname=\"add city here\"]")).click();
			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement range = driver.findElement(By.id("range-overlay"));
			 js.executeScript("arguments[0].scrollIntoView();",range);
			 
			
}
}

