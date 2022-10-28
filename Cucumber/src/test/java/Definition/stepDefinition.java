package Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class stepDefinition {
	WebDriver wb;
	String URL = "https://opensource-demo.orangehrmlive.com/";
	
	@Given("I should be in the page of OrangeHRM")
	public void i_should_be_in_the_page_of_orange_hrm() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		wb = new ChromeDriver();
		wb.get(URL);
	   
	}
	@When("Enter name")
	public void enter_name() {
	    // Write code here that turns the phrase above into concrete actions
		wb.findElement(By.id("txtUsername")).sendKeys("Admin");
	    
	}
	@When("Enter Password")
	public void enter_password() {
	    // Write code here that turns the phrase above into concrete actions
		wb.findElement(By.id("txtPassword")).sendKeys("admin123");
	    
	}
	@When("Click on Login button")
	public void click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		wb.findElement(By.id("btnLogin")).click();
	    
	}
	@Then("Login Successful")
	public void login_successful() {
	    // Write code here that turns the phrase above into concrete actions
	   Assert.assertEquals("wb.getTitle","OrangeHRM");
	}

}
