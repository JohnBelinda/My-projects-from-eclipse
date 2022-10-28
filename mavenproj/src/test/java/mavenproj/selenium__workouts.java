package mavenproj;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class selenium__workouts {


static String URL = "https://opensource-demo.orangehrmlive.com/";
static String  URL1 = "";
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
    WebDriver wb;
	System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver.exe");
	 wb = new ChromeDriver();
	wb.get(URL);
//	Thread.sleep(2000);
//	wb.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
//	wb.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
//	wb.findElement(By.xpath("//*[@id='btnLogin']")).click();
//	
	
	//alerts
	
	
	
	
	
	//page up and down
//	Actions act = new Actions(wb);
//	act.sendKeys(Keys.PAGE_DOWN).build().perform();
//	Thread.sleep(2000);
//	act.sendKeys(Keys.PAGE_UP).build().perform();
//	
	
	//javascript 
//	JavascriptExecutor js = (JavascriptExecutor)wb; 
//	String title = js.executeScript("return document.title").toString();
//	System.out.println(title);
//	
//	String domain = js.executeScript("return document.domain").toString();
//	System.out.println(domain);
//	
//	String un = js.executeScript("return document.getElementById('divUsername').innerText").toString();
//	System.out.println(un);
//	
//	String up = js.executeScript("return document.getElementById('divPassword').innerText").toString();
//	System.out.println(up);
	
	}
}

	


