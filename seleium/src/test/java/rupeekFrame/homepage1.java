package rupeekFrame;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homepage1 {
	
	public void Testcase1() throws InterruptedException {
       String url = "https://rupeek.com";
       WebDriver driver;
		
		driver = new ChromeDriver();
		driver.get(url);
		System.out.println(driver.getTitle());
       
}
}
