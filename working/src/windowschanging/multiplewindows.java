package windowschanging;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver.exe");
		ChromeDriver wb = new ChromeDriver();
		wb.navigate().to("https://demoqa.com/browser-windows");
		Thread.sleep(2000);
        //to store the current window to variable
		String oldwindow=wb.getWindowHandle();
		
		wb.findElement(By.xpath("//*[@id='windowButton']")).click();
	    //window hanhandeling
		// or also can write it this way - WebElement firstbutton = wb.findElement(By.id("home"));
		//firstbutton.click();
		Set<String> allwindows =wb.getWindowHandles();
		//in set<string> format all the widows open will bepresent
		Thread.sleep(2000);
        
		for (String newwindow : allwindows) {
		//foreach is used here , where it becomes like an iteration 	
			wb.switchTo().window(newwindow);
			//the last two lines changes the browser and later can start inspecting the elements in the new browser.
		}
		
//		wb.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[1]/a/img")).click();
		//Thread.sleep(3000);
		//wb.close();
		//Thread.sleep(3000);
		
		//wb.switchTo().defaultContent();
		
		//in the defaultContent the initially opened window will be used
		//Thread.sleep(2000);
	    // wb.findElement(By.xpath("//button[contains(text(),'Open Multiple Windows')]")).click();
	
	}

}
