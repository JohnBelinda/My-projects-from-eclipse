package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.HomePage;
import utils.ExcelUtil;

public class LoginTest extends BaseTest {
    @BeforeTest
    public void setUpTestData() throws Exception {
    	System.out.println("*******Set up test level data*******");
        ExcelUtil.getTableArray("LoginData", testDataExcelFile);
    	
    }
    @Test
    public void validLoginTestData() throws Exception {
 //   	ExtentTestManager.getTest
    	
    	HomePage homepge = new HomePage(driver, wait);
    	//LoginTest loginpage = new LoginTest();
    	homepge.goToOrangeHrm();
    	
    	//homepge.Login(null);
    	homepge.Login(ExcelUtil.getRowData(2));
    	//ExcelUtil.setRowNumber(1);
    	//ExcelUtil.setColumnNumber(2);
    	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Login")));
    	
    }
    
    
}
