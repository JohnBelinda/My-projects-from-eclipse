package Pages;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage extends BasePage{

public HomePage(WebDriver driver, WebDriverWait wait) {
	super(driver,wait);
}

  //  ******base url - page variable  ******
 String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

 public void goToOrangeHrm() {
	 driver.get(url);
 }

// //**** WebElements *******
 String username = "Admin";
 
 String password = "admin123";
 String loginButton = "Login";
 
// String errorMessageUsernameXpath = "";
// 
// //String errorMessagePasswordXpath="";
// //*** Page Methods ******
// 
 public void Login(XSSFRow row) {
	 
	 write(By.name(username),row.getCell(0).toString());
     write(By.name(password),row.getCell(1).toString());
     click(By.linkText(loginButton));
 }
 
// public void verifyLoginUserName(String ExpectedUserNameMsg) {
////	 Assert.assertEquals(read(By.name(username)),ExpectedUserNameMsg);
//// }
//// 
//// public void verifyLoginPassword(String ExpectedPasswordMsg) {
////	 Assert.assertEquals(read(By.linkText("loginButton")),ExpectedPasswordMsg);
//// }
//// 
//}
}