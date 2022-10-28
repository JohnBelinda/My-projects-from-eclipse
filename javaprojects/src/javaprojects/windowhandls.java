package javaprojects;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowhandls {
	static String baseurl="https://demoqa.com/browser-windows";
	
           public static void main(String[] args) {
        	   WebDriver wb;
       		System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver.exe");
       		wb = new ChromeDriver();
       		
       		wb.navigate().to(baseurl);
       		//the string 'sbu' stores the current open window to use it 
       		String sbu = wb.getWindowHandle();
       		System.out.println(sbu);
       		
       		WebElement link = wb.findElement(By.id("windowButton"));
       		
       		Actions ac = new Actions(wb);
       		ac.moveToElement(link).build().perform();
       		ac.sendKeys(Keys.ENTER).build().perform();
       		ac.sendKeys(Keys.ENTER).build().perform();
       		
       		String st = wb.getWindowHandle();
       		Set<String> tab =wb.getWindowHandles();
       		
       		
		}
}
