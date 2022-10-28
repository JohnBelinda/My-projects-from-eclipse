package windowschanging;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class guruwebsite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver.exe");
		ChromeDriver wb = new ChromeDriver();
		wb.navigate().to("https://demo.guru99.com/test/newtours/index.php");
		Thread.sleep(2000);
		
		
		wb.findElement(By.xpath("//*[@name='userName']")).sendKeys("john");
		//Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@name='password']")).sendKeys("john333");
		//Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@name='submit']")).click();
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[contains(text(),'Flights')]")).click();
		Thread.sleep(2000);
		
		wb.findElement(By.xpath("//*[@name='tripType' and @value='oneway']")).click();
		Thread.sleep(2000);
		
		WebElement dd = wb.findElement(By.name("passCount"));
		Select sc = new Select(dd);
		List<WebElement> values = sc.getOptions();
		System.out.println(values.size());
		for(int i=0;i<values.size();i++)
		{
			System.out.println(values.get(i).getText());
		}
		
	}

}
