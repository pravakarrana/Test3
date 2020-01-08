package Gen;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.naming.spi.DirStateFactory.Result;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.remote.adapter.RemoteResultListener;
import org.testng.xml.XmlSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.Log;

 
  public class ListenerClass extends Baseclass1 implements ITestListener{

 	public static ExtentReports extent;
 
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites,String outputDirectory) {
		extent = new ExtentReports(outputDirectory + File.separator+ "Extent.html", true);

		for (ISuite suite : suites) {
			Map<String, ISuiteResult> result = suite.getResults();

			for (ISuiteResult r : result.values()) {
				ITestContext context = r.getTestContext();

				buildTestNodes(context.getPassedTests(), LogStatus.PASS);
				buildTestNodes(context.getFailedTests(), LogStatus.FAIL);
				buildTestNodes(context.getSkippedTests(), LogStatus.SKIP);
			}
		}

		extent.flush();
		extent.close();
	}   

	private void buildTestNodes(IResultMap tests, LogStatus status) {
		ExtentTest test;

		if (tests.size() > 0) {
			for (ITestResult result : tests.getAllResults()) {
				test = extent.startTest(result.getMethod().getMethodName());

				test.setStartedTime(getTime(result.getStartMillis()));
				test.setEndedTime(getTime(result.getEndMillis()));

				for (String group : result.getMethod().getGroups())
					test.assignCategory(group);

				if (result.getThrowable() != null) {
					test.log(status, result.getThrowable());
				} else {
					test.log(status, "Test " + status.toString().toLowerCase()
							+ "ed");
				}

				extent.endTest(test);
			}
		}
	}

	private Date getTime(long millis) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(millis);
		return calendar.getTime();
	}

	public void onTestStart(ITestResult result) {
 		               
		 
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Sucessfully Pass==> " +result.getMethod().getMethodName()); 
		
	}

	public void onTestFailure(ITestResult result) {
 		
		String failedTestName=result.getMethod().getMethodName();
 		EventFiringWebDriver eDriver=new EventFiringWebDriver(Baseclass1.driver);
		
		File src=eDriver.getScreenshotAs(OutputType.FILE);
		File dst=new File("./screenshot/"+ failedTestName + ".png");
		try {
			FileUtils.copyFile(src, dst);
		} catch (IOException e1) {
 			e1.printStackTrace();
		}
 
	}
	public void onTestSkipped(ITestResult result) {
		 
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		 
		
	}

	public void onStart(ITestContext context) {
		 
		
	}

	public void onFinish(ITestContext context) {
	 
		
	}

}
