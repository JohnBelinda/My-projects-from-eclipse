package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Constants;


public class HomePage1 {
     public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rupeek.com/");
		Thread.sleep(2000);
		 JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement btn = driver.findElement(By.id("posterfresh"));
			 js.executeScript("arguments[0].scrollIntoView();",btn);
			
			 Thread.sleep(5000);
			 btn.click();
			 driver.findElement(By.id("audio_play_iconfresh")).click();
			 Thread.sleep(30000);
			 
	
     }
}
