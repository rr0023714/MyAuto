package SeleniumScripts;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;



public class Utility {

	String data;
	WebDriver driver;
	Cell cell;
	String cellValue;
	
	public String readExcelConfig(String excelPath, int row, int col, String sheetName){
		
		try {
			File src = new File(excelPath);
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook wb =new XSSFWorkbook(fis);
			XSSFSheet ws =wb.getSheet(sheetName);
			data=ws.getRow(row).getCell(col).getStringCellValue();
			//cell = ws.getRow(row).getCell(col).getNumericCellValue();
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
		return data;
		
	}
	
public String readExcelConfig1(String excelPath, int row, int col, String sheetName){
		
		try {
			File src = new File(excelPath);
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook wb =new XSSFWorkbook(fis);
			XSSFSheet ws =wb.getSheet(sheetName);
			cell=ws.getRow(row).getCell(col);
			//cellValue=cell.getCellType();
			switch (cell.getCellType()) {
		    case XSSFCell.CELL_TYPE_NUMERIC:
		        if(DateUtil.isCellDateFormatted(cell)) {
		            cellValue = new DataFormatter().formatCellValue(cell);
		        } else {
		            cellValue = String.valueOf((int) (cell.getNumericCellValue()));
		        }
		        return cellValue;
			case XSSFCell.CELL_TYPE_STRING:
		        cellValue = cell.getStringCellValue();
		        return cellValue;
		}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		
		return data;
		
	}
	
public String readExcelConfig2(String excelPath, int row, int col, String sheetName){
	
	try {
		File src = new File(excelPath);
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb =new XSSFWorkbook(fis);
		XSSFSheet ws =wb.getSheet(sheetName);
		cell=ws.getRow(row).getCell(col);
		DataFormatter objDataFormatter = new DataFormatter();
	//	FormulaEvaluator objFormulaEvaluator = new XSSFFormulaEvaluator(wb);
		//objFormulaEvaluator.evaluate(cell); // This will evaluate the cell, And any type of cell will return string value
		//cellValue=cell.getCellType();
		cellValue=objDataFormatter.formatCellValue(cell);
        return cellValue;
	   }
	catch (Exception e) {
		
		e.printStackTrace();
	} 
		
	return cellValue;
}

public static WebElement fluentWait(WebDriver driver, final By locator,  int timeout){

	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver);
	
	
	

}

	
	public void getWindowHandle(WebDriver driver, String windowTitle){
		
		boolean wFound = false;
		
		Set<String> handles = driver.getWindowHandles();

	for(String handle : handles){
			
			driver.switchTo().window(handle);
			String strActualTitle= driver.getTitle().trim();
			if(strActualTitle.equals(windowTitle)){
				wFound = true;				
				System.out.println(strActualTitle);
			}
			
		}
		
	}
	
	public boolean assertString(WebDriver driver, String expectedString){
		
	//Assert.assertEquals(driver.getTitle().trim(), expectedString);
		String actualStr = driver.getTitle().trim();
		if(actualStr.equals(expectedString)){
			return true;
		}
		else 
			return false;
		
	
	}
	
	public void close(WebDriver driver){
		Set<String> handles = driver.getWindowHandles();
		
		for(String handle : handles){
			driver.switchTo().window(handle).close();
		}
	}
	
	public static String getRandomString(int length) {
		StringBuilder sb = new StringBuilder();
		String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		for (int i = 0; i < length; i++) {
			int index = (int) (Math.random() * characters.length());
			sb.append(characters.charAt(index));
		}
		return sb.toString();
	}
	
	public static String getScreenshotName(String testName){
		
		StringBuilder sb = new StringBuilder();
		sb.append(testName);
		Date dt = new Date();
		dt.getTime();
		sb.append(dt);
		
		return sb.toString();
	}
	
	public static void takeScreenshot(WebDriver driver, String testName) throws IOException {
		StringBuilder sb =new StringBuilder(); 
		sb.append("C:\\MyAuto\\Screenshots\\");
		sb.append(testName);
		//Date dt = new Date();
		//dt.getTime();
		//sb.append(dt);
		String fileName= sb + ".png" ;
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(fileName));
	}
	
	public void selectOption(String path, WebElement element){
		Select s1 = new Select(element.findElement(By.xpath(path)));
		s1.selectByValue("2");
	}

	
}
