package Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class stepdefdd {
	
	WebDriver driver;
	String URL = "https://opensource-demo.orangehrmlive.com/";
	

@Given("I should open the browser and navigate to the login page in skillary app")
public void i_should_open_the_browser_and_navigate_to_the_login_page_in_skillary_app() {
    // Write code here that turns the phrase above into concrete actions
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get(URL);	
	driver.findElement(By.linkText("LOGIN")).click();
}

	@When("Enter the Username {user}")
	public void enter_the_username(String user) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("email")).sendKeys(user);
	}
	@When("Enter the Password {password}")
	public void enter_the_password(String password) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys(password);
	}
	@When("After Click on the loginbutton")
	public void after_click_on_the_loginbutton() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("last")).click();
	}
	@Then("I should see the user name  {username}")
	public void i_should_see_the_user_name(String username) {
	    // Write code here that turns the phrase above into concrete actions
		String un = driver.findElement(By.xpath("//span[contains(text(),'Harry Den')]")).getText();
		Assert.assertEquals(un, username);
		driver.close();
	}




}
