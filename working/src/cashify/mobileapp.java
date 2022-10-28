package cashify;

//import java.util.Scanner;
import java.util.stream.StreamSupport;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import  java.util.stream.Stream;

import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.Message;
//import com.twilio.rest.api.v2010.account.call.Stream;

public class mobileapp {
	public static final String acc_id="ACb77106075dd51919264d28cf2480fbd1";
	public static final String acc_token="a6771602acbf6e792584dc5fe3cfba10";
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver.exe");
		ChromeDriver wb = new ChromeDriver();
		wb.get("https://www.instagram.com/");
		Thread.sleep(2000);
		System.out.println("opened web page");
	  
	    wb.findElement(By.xpath("//*[@id='react-root']/section/main/article/div[2]/div[2]/div/p/a")).click();
	    //clicking on the login button
//	    wb.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
	   Thread.sleep(2000); 	
	   wb.findElement(By.xpath("//*[@id='react-root']/section/main/div/div/div/div/form/div[3]/div/label/input")).sendKeys("+15715367749");
	   wb.findElement(By.xpath("//*[@id='react-root']/section/main/div/div/div/div/form/div[4]/div/label/input")).sendKeys("Belinda");
	   wb.findElement(By.xpath("//*[@id='react-root']/section/main/div/div/div/div/form/div[5]/div/label/input")).sendKeys("Belindasharon390");
	   wb.findElement(By.xpath("//*[@id='react-root']/section/main/div/div/div/div/form/div[6]/div/label/input")).sendKeys("Belinda@333");
//	 
//	   
//	   //from here its login button
       wb.findElement(By.xpath("//*[@id='react-root']/section/main/div/div/div/div/form/div[7]/div/button")).click();
	   
       Thread.sleep(2000);
       wb.findElement(By.xpath("//*[@id='react-root']/section/main/div/div/div/div/div[4]/div/div/span/span[1]/select")).click();
       wb.findElement(By.xpath("//*[@id='react-root']/section/main/div/div/div/div/div[4]/div/div/span/span/select/option[9]")).click();
      
       Thread.sleep(2000);
       wb.findElement(By.xpath("//*[@id='react-root']/section/main/div/div/div/div/div[4]/div/div/span/span[2]/select")).click();
       wb.findElement(By.xpath("//*[@id='react-root']/section/main/div/div/div/div/div[4]/div/div/span/span[2]/select/option[3]")).click();
       
       Thread.sleep(2000);
       wb.findElement(By.xpath("//*[@id='react-root']/section/main/div/div/div/div/div[4]/div/div/span/span[3]/select")).click();
       wb.findElement(By.xpath("//*[@id='react-root']/section/main/div/div/div/div/div[4]/div/div/span/span[3]/select/option[27]")).click();
       
       Thread.sleep(2000);
       wb.findElement(By.xpath("//*[@id='react-root']/section/main/div/div/div/div/div[6]/button")).click();
       //now getting OTP and setting it 
	   Twilio.init(acc_token, acc_id);
	   String smsbody = getMessage();
	       System.out.println(smsbody);
	}	
	public static String getMessage() {
		return getMessages().filter(m -> m.getDirection().compareTo(Message.Direction.INBOUND) == 0)
				.filter(m -> m.getTo().equals("+14342312426")).map(Message::getBody).findFirst()
				.orElseThrow(IllegalStateException::new);
	}
	private static Stream<Message> getMessages() {
		ResourceSet<Message> messages = Message.reader(acc_id).read();
		return StreamSupport.stream(messages.spliterator(), false);
	}
}

