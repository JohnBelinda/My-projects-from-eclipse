package hybrid_testing;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	private WebDriver  driver;
	
	@BeforeTest
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(Constants.url);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			
			driver.findElement(By.linkText("Customise Your Loan")).click();
			 JavascriptExecutor js = (JavascriptExecutor)driver;
				WebElement btn = driver.findElement(By.id("range_desktop"));
				 js.executeScript("arguments[0].scrollIntoView()",btn);
				 Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"scheme-card-body-wrapper\"]/div/div[2]/div[4]/div/button")).click();





11:07
WebDriver  driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(Constants.url);
			driver.findElement(By.id("cityDisplay")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"citiesList\"]/li[2]")).click();
			driver.findElement(By.xpath("//*[@id=\"banner_desktop\"]")).sendKeys("8985412390");
			driver.findElement(By.xpath("//button[@class =\"btn lead-capture-btn\"]")).click();
		    JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement btn = driver.findElement(By.xpath("//*[@id=\"selectCity-popup\"]/div/div[2]/div/button"));
	   //     Thread.sleep(4000);
		    js.executeScript("arguments[0].scrollIntoView()",btn);
		    btn.click();
		//    Thread.sleep(3000);
		    driver.findElement(By.xpath("//*[@id=\"desktop-wrapper\"]/section/button/span")).click();
		    Thread.sleep(3000);
	
		    driver.findElement(By.xpath("//input[@type = \"text\"]")).sendKeys("Ayaan");
		//    Thread.sleep(2000);
		    driver.findElement(By.xpath("//button[@class =\"btnDefault-0-2-80 button-0-2-68 button-d1-0-2-75 buttonEnabled-0-2-69 buttonEnabled-d2-0-2-76\"]")).click();








}
