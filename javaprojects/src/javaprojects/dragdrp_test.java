package javaprojects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dragdrp_test {

	 String url="https://demoqa.com/droppable";
		WebDriver wb;
	@BeforeTest
	public void BT()
	{
		
			System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver.exe");
	       wb = new ChromeDriver();
	}

	@Test
	public void Tt() {
        wb.get(url);
        System.out.println(wb.getTitle());
        WebElement from = wb.findElement(By.id("draggable"));
        
        WebElement to = wb.findElement(By.id("droppable"));
        Actions act = new Actions(wb);
        
        
        act.dragAndDrop(from, to).build().perform();
        
	}

}
