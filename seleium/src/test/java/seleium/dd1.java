package seleium;

import java.io.File;
import java.io.IOException;

	import org.testng.annotations.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeTest;
	import jxl.Workbook;
	import jxl.read.biff.BiffException;
	import jxl.Cell;
	import jxl.Sheet;
	public class dd1
	{
		
		@BeforeTest
		public void BT()
		{
			System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver.exe");
			
		}
		@Test
		public void test1() throws BiffException ,IOException
		{	
			int x,y;
			WebDriver wb1 = new ChromeDriver();
			File excel = new File("C:\\Users\\Moolya\\Desktop\\data_JXL.xls");
			Workbook wb = Workbook.getWorkbook(excel);
			Sheet st= null;
			Cell cl = null;
			int Sheets = wb.getNumberOfSheets();
			for(int i=0;i<Sheets;i++)
			{
				st = wb.getSheet(i);
				int rows = st.getRows();
				int column = st.getColumns();
				for( x=0; x<rows; x++)
				{
					for( y=0; y<column; y++)
					{
						cl = st.getCell(y,x);
						if(cl.getContents().length()>0)
						{
						System.out.println(cl.getContents());
						}
					}
				}
			
//			}
			
			wb1.navigate().to("https://opensource-demo.orangehrmlive.com");
			wb1.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(st.getCell(x));
			wb1.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(st.getCell(y));
			wb1.findElement(By.xpath("//*[@id='btnLogin']")).click();
				
		}
		}
	}

