package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selenium_testing {
	
	static String URL = "https://opensource-demo.orangehrmlive.com/";
	
	
	public static void main(String[] args) throws InterruptedException {
		
    WebDriver wb;
	System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver.exe");
	 wb = new ChromeDriver();
	wb.get(URL);
	Thread.sleep(2000);
	wb.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
	wb.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
	wb.findElement(By.xpath("//*[@id='btnLogin']")).click();
	
	Actions act = new Actions(wb);
	act.sendKeys(Keys.PAGE_DOWN).build().perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.PAGE_UP).build().perform();
	
	
}
}
