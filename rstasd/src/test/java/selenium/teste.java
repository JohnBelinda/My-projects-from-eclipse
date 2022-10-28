package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class teste {
	@BeforeTest
	public void Bt() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver.exe");
		ChromeDriver wb = new ChromeDriver();
		wb.navigate().to("https://demo.guru99.com/test/newtours/index.php");
		Thread.sleep(2000);
	}
	


}
