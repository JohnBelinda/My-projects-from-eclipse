package javaprojects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {
	static String baseurl="https://demoqa.com/webtables";
	static String url = "https://demoqa.com/upload-download";
	static String urla ="https://demoqa.com/frames";
    public static void main(String[] args) {
 	   WebDriver wb;
		System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver.exe");
		wb = new ChromeDriver();
//		wb.get(baseurl);
//		WebElement er = wb.findElement(By.id("//div[contains(text(),'Cierra')]/following-sibling::div[2]"));
//       System.out.println(er);
        
		
		 wb.get(urla);
		 List<WebElement> frames = wb.findElements(By.tagName("iframe"));
		 //displayes the no of frames present on the current page 
		 System.out.println(frames.size());
		 //prints the count 
		 for(int i=0; i<frames.size();i++)
		 {
			 System.out.println(frames.get(i));
		 }
		 
		// hw - wb.findElement(By.id("")) to upload the files must use send keys
		
        
    }
}
