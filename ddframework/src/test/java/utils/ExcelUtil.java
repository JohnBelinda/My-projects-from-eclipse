package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Platform;
import static tests.BaseTest.testDataExcelFile;

public class ExcelUtil {

//	public static final String currentDir = System.getProperty("user.dir");
//	
//	public static String testDataExcelPath = null;
//	
//	private static XSSFWorkbook excelWBook;
//	
//	private static XSSFSheet excelWSheet;
//	
//	private static XSSFCell cell;
//	
//	private static XSSFRow row;
//	
//	private static int rowNumber;
//	private static int columnNumber;
//	
//	
//	    public class ExcelUtils {

				private static HSSFSheet ExcelWSheet;

				private static HSSFWorkbook ExcelWBook;

				private static XSSFCell Cell;

				private static HSSFRow Row;
				
				public static String testDataExcelPath = null;

			public static Object[][] getTableArray(String FilePath, String SheetName) throws Exception {   

			   String[][] tabArray = null;

			   try {

				   FileInputStream ExcelFile = new FileInputStream(FilePath);

				   // Access the required test data sheet

				   ExcelWBook = new HSSFWorkbook(ExcelFile);

				   ExcelWSheet = ExcelWBook.getSheet(SheetName);

				   int startRow = 1;

				   int startCol = 1;

				   int ci,cj;

				   int totalRows = ExcelWSheet.getLastRowNum();

				   // you can write a function as well to get Column count

				   int totalCols = 2;

				   tabArray=new String[totalRows][totalCols];

				   ci=0;

				   for (int i=startRow;i<=totalRows;i++, ci++) {           	   

					  cj=0;

					   for (int j=startCol;j<=totalCols;j++, cj++){

						   tabArray[ci][cj]=getCellData(i,j);

						   System.out.println(tabArray[ci][cj]);  

							}

						}

					}
			   catch (FileNotFoundException e){

					System.out.println("Could not read the Excel sheet");

					e.printStackTrace();

					}

				catch (IOException e){

					System.out.println("Could not read the Excel sheet");

					e.printStackTrace();

					}

				return(tabArray);

				}
	
//	public static void setRowNumber(int pRowNumber) {
//		rowNumber = pRowNumber;
//	}
//	
//	public static int getRowNumber() {
//		return rowNumber;
//	}
//	public static void setColumnNumber(int pColumnNumber) {
//		 columnNumber = pColumnNumber;
//	}
//	public static int getColumnNumber() {
//		return columnNumber;
//	}
//	
//	public static void setExcelFileSheet(String sheetName) throws Exception {
//		if(Platform.getCurrent().toString().equalsIgnoreCase("MAC")) {
//		testDataExcelPath = currentDir+"//src//test//java//resources//";
//	}else if(Platform.getCurrent().toString().contains("WIN")) {
//		testDataExcelPath=currentDir+"//src//test//java//resources//";
//	}
//		try {
//			FileInputStream ExcelFile = new FileInputStream(testDataExcelPath + testDataExcelFile);
//		    excelWBook = new XSSFWorkbook(ExcelFile);
//			excelWSheet = excelWBook.getSheet(sheetName);
//			System.out.println(excelWSheet);
//			}catch(Exception e) {
//				try {
//					throw(e);
//				}catch(IOException e1) {
//					e1.printStackTrace();
//				}
//			}
//	}
//	
	public static String getCellData(int RowNum,int ColNum ) throws Exception {
		try {
			Cell =ExcelWSheet.getRow(RowNum).getCell(ColNum);
			DataFormatter formatter = new DataFormatter();
			String cellData = formatter.formatCellValue(Cell);
			return cellData;
		}catch(Exception e) {
			throw(e);
		}
	}
	public static XSSFRow getRowData(int RowNum) throws Exception {
		try {
			Row=ExcelWSheet.getRow(RowNum);
			return Row;
		}catch(Exception e) {
			throw(e);
		}
	}
	public static void setCellData(String value,int ColNum, int RowNum) throws Exception {
		try{
			Row = ExcelWSheet.getRow(RowNum);
			Cell = Row.getCell(ColNum);
			if(Cell==null) {
				Cell = Row.createCell(RowNum);
				Cell.setCellValue(value);
			}else {
				Cell.setCellValue(value);
			}
			FileOutputStream fileOut = new FileOutputStream(testDataExcelPath+testDataExcelFile);
			ExcelWBook.write(fileOut);
			fileOut.flush();
			fileOut.close();
		}catch(Exception e) {
			try {
				throw(e);
			}catch(IOException e1) {
				e1.fillInStackTrace();
			}
		}
	}
			   
}
