package SeleniumScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listners implements WebDriverEventListener, ITestListener, ISuiteListener, IInvokedMethodListener{
	
	private WebDriver driver;
	Utility obj;

	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		System.out.println("After click on WebElement: " +arg0.toString());
		
	}

	@Override
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		System.out.println("After navigation to: " +arg0.toString());
	}

	@Override
	public void afterScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		System.out.println("Before click on WebElement: " +arg0.toString());
		
	}

	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		System.out.println("Before finding ebElement: " +arg0.toString());
	}

	@Override
	public void beforeNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onException(Throwable arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ISuite suite) {
		Reporter.log("onStart Suite - Suite about to begin " +suite.getName(), true);
		
	}

	@Override
	public void onFinish(ISuite suite) {
		Reporter.log("onFinish Suite - Suite about to begin " +suite.getName(), true);
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Start of test : " +result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test result : Passed " +result.getName());
		String methodName=result.getName().toString().trim();
    	obj = new Utility();
    	//String screenshotName =Utility.getScreenshotName(methodName);
 
    	driver =EasyTestSuite.getDriver();
    	try {
			Utility.takeScreenshot(driver, methodName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		printResults(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("***** Error "+result.getName()+" test has failed *****");
    	//String methodName=result.getName().toString().trim();
    
    	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		
	}
	
	public void printResults(ITestResult result){
		Reporter.log("Test case being run is : " +result.getTestName() , true);
		//System.out.println("Test case being run is : " +result.getTestClass().getName() );
		String status = null;
		switch(result.getStatus()){
		case ITestResult.SUCCESS: 
		status = "Pass";
		
		case ITestResult.FAILURE:
		status = "Fail";
		
		case ITestResult.SKIP:
		status = "Skip";
		}
		
	}

	@Override
	public void afterNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

}
