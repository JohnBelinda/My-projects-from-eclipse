package working;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_testing {
	WebDriver wb;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver.exe");
		ChromeDriver wb = new ChromeDriver();
		wb.navigate().to("https://opensource-demo.orangehrmlive.com/");
		String Exptrslt = "OrangeHRM";
		
		wb.manage().window().maximize();
		String Actlresult = wb.getTitle();
		if(Exptrslt.equals(Actlresult)) 
		{
		wb.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		wb.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		wb.findElement(By.xpath("//*[@id='btnLogin']")).click();
		System.out.println("same titles");
		}
		else 
		{
			System.out.println("not same titles");
		}
		Thread.sleep(2000);
		wb.findElement(By.xpath("//*[@id='welcome']")).click();
		Thread.sleep(3000);
		wb.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]/a")).click();
		wb.quit();
	}

}
