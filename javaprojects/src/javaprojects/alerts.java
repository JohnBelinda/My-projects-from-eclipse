package javaprojects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class alerts {
	static String url ="https://demoqa.com/alerts";
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver wb;
		System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver.exe");
		wb = new ChromeDriver();
		//using get and navigate to go to that link  - wb.get(url);
		wb.navigate().to(url);
		//when adding thread the InterruptedException gets added 
		//wb.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		Thread.sleep(3000);
	//	wb.findElement(By.id("alertButton")).click();
		
		//the below given alert once created can use anywhere in prog
		Alert alt = wb.switchTo().alert();
		
//		String alrt = alt.getText();
//		System.out.println(alrt);
//		alt.accept();
//		
//		
//		wb.findElement(By.id("timerAlertButton")).click();
//		Thread.sleep(5000);
//		String alrt1 = alt.getText();
//		System.out.println(alrt1);
//		alt.accept();
//		
//		
//	    wb.findElement(By.id("confirmButton")).click();
//		String alrt2 = alt.getText();
//		alt.dismiss();
		//some doubts here ?
		
		wb.findElement(By.id("promtButton")).click();
		Thread.sleep(3000);
		alt.sendKeys("Belinda");
		Thread.sleep(3000);
		String alrt3 =alt.getText();
		System.out.println(alrt3);	
		alt.accept();
	}
}



