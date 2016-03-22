import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import SeleniumScripts.Utility;


public class TestClass {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "https://easy.techmahindra.com/EasyHome.aspx";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Utility utilityObj = new Utility();
		String userName = utilityObj.readExcelConfig("C:\\MyAuto\\Excelsheets\\EasyData.xlsx", 1, 1, "CommonData");
		String passWord = utilityObj.readExcelConfig("C:\\MyAuto\\Excelsheets\\EasyData.xlsx", 2, 1, "CommonData");
		driver.findElement(By.xpath("//input[@id='txtLanId']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(passWord);
		driver.findElement(By.xpath("//input[@id='imgLogin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=' Human Resource  (HR)']")).click();
		driver.findElement(By.xpath("//a[text()='My Time']")).click();
		Thread.sleep(5000);
		utilityObj.getWindowHandle(driver, "Welcome to MyTime");
		
		boolean b= utilityObj.assertString(driver, "Welcome to MyTime");
		if(b){
		driver.findElement(By.xpath("//input[@id='chkAcknow']")).click();;
		driver.findElement(By.xpath("//img[contains(@src,'../images/fillTimesheet.png')]")).click();
		}		
		//To locate table
		WebElement myTable = driver.findElement(By.id("gvTimeSheet"));
		//To locate rows if table
		List<WebElement> rows = myTable.findElements(By.xpath("//tr[@class='tdeven1']"));
		System.out.println(rows.size());
		
		for(int row=0; row<14;row++){
		
			//To locate columns(cells) of the specific row
			List<WebElement> columns=rows.get(row).findElements(By.xpath("//td[@align='center']/div/input[contains(@id , 'UCDayInTime')]"));
			//System.out.println("Number of columns:"+columns.size());
			
			for(int cnum=0;cnum<3;cnum++)
				
					{
						if(cnum==1){
							
							driver.findElement(By.xpath("//input[contains(@name,'UCDayInTime')]")).click();
							Thread.sleep(1000);
							driver.findElement(By.xpath("//input[contains(@name,'UCDayInTime')]")).sendKeys("05:59");
							
						}
						else if(cnum==2){
							driver.findElement(By.xpath("//input[contains(@name,'UCDayOutTime')]")).click();
							Thread.sleep(1000);
							driver.findElement(By.xpath("//input[contains(@name,'UCDayOutTime')]")).sendKeys("13:59");

						}
						else{
							System.out.println(columns.get(cnum).getText());
						}	
					}
		
	
}
		utilityObj.close(driver);
	}	

}
