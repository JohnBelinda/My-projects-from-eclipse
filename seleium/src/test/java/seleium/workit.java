package seleium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workit {
	static String URL = "https://demoapp.skillrary.com/index.php";
	
      public static void main(String[] args) throws InterruptedException {
    	  WebDriver wb;
    		System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver.exe");
    		 wb = new ChromeDriver();
    		wb.get(URL);
    		Thread.sleep(2000);	
    		wb.findElement(By.xpath("//*[@href ='login.php?type=login']")).click();
    		
    		wb.findElement(By.id("email")).sendKeys("user");
    		wb.findElement(By.id("password")).sendKeys("user");
	       Thread.sleep(2000);
    		
    		wb.findElement(By.id("last")).click();
    		Thread.sleep(2000);
      }
}
