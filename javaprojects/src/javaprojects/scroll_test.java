package javaprojects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class scroll_test {
	//to test scrolling
	//for scrolling we can use javascriptExecuter is advised , better . 
     public static String url = "https://demoqa.com/sortable";
     WebDriver wb;
     
     @BeforeTest
     public void Bt() {
    	 System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver.exe");
    	 wb = new ChromeDriver();
    	 System.out.println(wb.getTitle());
     }
     @Test
     public void tt() {
    	 wb.get(url);
      JavascriptExecutor u = (JavascriptExecutor)wb;
      u.executeScript("scrollBy(0,4500)");
           }
}
