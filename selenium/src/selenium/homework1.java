package selenium;

import java.awt.Desktop.Action;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class homework1 
{
	

	public void Testcase1() throws InterruptedException, AWTException {
		String URL = "https://demoqa.com/browser-windows";
		String URL1 = "https://www.google.com/";
		String URL2 = "https://opensource-demo.orangehrmlive.com/";
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.get(URL);
		System.out.println(driver.getTitle());
			
	
	WebElement link = driver.findElement(By.id("windowButton"));
	Actions act = new Actions(driver);
	act.moveToElement(link).build().perform();
	act.sendKeys(Keys.ENTER).click().build().perform();
	act.sendKeys(Keys.ENTER).click().build().perform();
	
	Thread.sleep(3000);
	
	String Ptab = driver.getWindowHandle();
	Set<String> tab = driver.getWindowHandles();
	
	for (String windows : tab)
		{
			driver.switchTo().window(windows);
			driver.get(URL1);
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
			
		
		}
	driver.quit();
	}
		
}
