package SeleniumScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {
	static WebDriver driver;
	
public WebDriver getDriver(){
	return driver;
	
}

	public static void main(String[] args) throws InterruptedException, IOException {
		//WebDriver driver;
		WebDriverWait wait;
		String baseUrl;
		Utility utilityObj;
		EventFiringWebDriver eDriver;
		driver = new FirefoxDriver();
		baseUrl = "https://easy.techmahindra.com/EasyHome.aspx";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		eDriver = new EventFiringWebDriver(driver);
		Listners lis= new Listners();
		eDriver.register(lis);
		
		utilityObj = new Utility();
		String userName = utilityObj.readExcelConfig("C:\\MyAuto\\Excelsheets\\EasyData.xlsx", 1, 1, "CommonData");
		String passWord = utilityObj.readExcelConfig("C:\\MyAuto\\Excelsheets\\EasyData.xlsx", 2, 1, "CommonData");
		eDriver.findElement(By.xpath("//input[@id='txtLanId']")).sendKeys(userName);
		eDriver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(passWord);
		eDriver.findElement(By.xpath("//input[@id='imgLogin']")).click();
		
		//do some assertion after click
		Thread.sleep(2000);		
	
		eDriver.findElement(By.xpath("//a[text()=' Human Resource  (HR)']")).click();
		eDriver.findElement(By.xpath("//a[text()='HR-Home']")).click();
				
		//calling AutoIT script for Windows Authentication.
		Thread.sleep(2000);	
		Runtime.getRuntime().exec("C:\\MyAuto\\AutoITscripts\\WinAuthentication.exe");
		
		utilityObj.getWindowHandle(eDriver, "Welcome to HR");
		
		wait = new WebDriverWait(eDriver, 100);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='MenuControl_txtSearch']")));
		

	}

}
