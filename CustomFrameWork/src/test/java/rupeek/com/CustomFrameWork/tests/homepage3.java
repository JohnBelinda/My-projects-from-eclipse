package rupeek.com.CustomFrameWork.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Constants;

public class homepage3 {
      @Test
	 public void hp3() throws InterruptedException {
			
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(Constants.url);
			
			Thread.sleep(2000);
			driver.findElement(By.linkText("Shift Your Loan")).click();
			 //JavascriptExecutor js = (JavascriptExecutor)driver;
				//WebElement btn = driver.findElement(By.xpath("//div[@class=\"sub_heading\"]"));
						//inner_videowrap container\"]"));
						//id("shiftyourloan-takeover"));
						//("//div[@class=\"video_wrap position-relative\"]"));
				// js.executeScript("arguments[0].scrollIntoView();",btn);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1321)", "");
			Thread.sleep(3000);
			 Actions actions = new Actions(driver);
				 WebElement target = driver.findElement(By.xpath("//div[@class=\"video_wrap position-relative\"]"));
				 actions.moveToElement(target).perform();
				 Thread.sleep(3000);
				 driver.findElement(By.id("telugu")).click();
				 String youtube = driver.getWindowHandle();
		       		System.out.println(youtube);
		       	 Thread.sleep(80000);
		       		driver.findElement(By.id("rupeek_video")).click();
		       		Thread.sleep(4000);
		       	
		       		driver.findElement(By.id("close-videopopupwrapper")).click();
		       	 Thread.sleep(3000);
		       	 
		       		//for kanada video
		       	 actions.moveToElement(target).perform();
				 Thread.sleep(3000);
				 driver.findElement(By.id("kanada")).click();
				// String youtube = driver.getWindowHandle();
		       		System.out.println(youtube);
		       	 Thread.sleep(70000);
		       		driver.findElement(By.id("rupeek_video")).click();
		       		Thread.sleep(4000);
		       		driver.findElement(By.id("close-videopopupwrapper")).click();
		       		
		       	 Thread.sleep(3000);
		       		//for hindi video
		       		actions.moveToElement(target).perform();
					 Thread.sleep(3000);
					 driver.findElement(By.id("hindi")).click();
			       		System.out.println(youtube);
			       	 Thread.sleep(70000);
			       		driver.findElement(By.id("rupeek_video")).click();
			       		Thread.sleep(4000);
			       		driver.findElement(By.id("close-videopopupwrapper")).click();
			       		Thread.sleep(4000);
			       		driver.quit();
			       		
	
}
}