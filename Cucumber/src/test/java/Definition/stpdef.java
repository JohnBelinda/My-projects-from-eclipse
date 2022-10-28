package Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class stpdef {
	WebDriver driver;
	public String URL= "https://demoapp.skillrary.com/login.php?type=login";


@Given("I should open the browser and navigate to the login page in skillary app")
public void i_should_open_the_browser_and_navigate_to_the_login_page_in_skillary_app() {
    // Write code here that turns the phrase above into concrete actions
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get(URL);	
	driver.findElement(By.linkText("LOGIN")).click();
}
@When("Enter Username {string}")
public void enter_username(String string) {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("email")).sendKeys(string);
}
@When("Enter Password {string}")
public void enter_password(String string) {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("password")).sendKeys(string);
}
@When("Click on the loginbutton")
public void click_on_the_loginbutton() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.id("last")).click();
}
@Then("I should see the user name as {string}")
public void i_should_see_the_user_name_as(String string) {
    // Write code here that turns the phrase above into concrete actions
	String username = driver.findElement(By.xpath("//span[contains(text(),'Harry Den')]")).getText();
	Assert.assertEquals(username, string);
}

@Then("I should see the admin name as {string}")
public void i_should_see_the_admin_name_as(String string) {
  // Write code here that turns the phrase above into concrete actions
  String admin = driver.findElement(By.xpath("//span[contains(text(),'SkillRary Admin')]")).getText();
Assert.assertEquals(admin, string);
}

@Then("i should navigate to the page {string}")
public void i_should_navigate_to_the_page(String string) {
    // Write code here that turns the phrase above into concrete actions
	String Register= driver.findElement(By.xpath("//*[@class='btnRegister']")).getAttribute("value");
	 Assert.assertEquals(Register, string);
}


}
