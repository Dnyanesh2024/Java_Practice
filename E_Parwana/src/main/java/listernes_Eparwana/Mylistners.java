package listernes_Eparwana;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.apache.commons.mail.EmailException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import utility_Earwana.ExtentReportGenerator;
import utility_Earwana.UtilClass;


public class Mylistners extends utility_Earwana.BaseClassA implements ITestListener {

	 ExtentReports report = ExtentReportGenerator.getExtentReport();

	    ExtentTest etest;

	 

	    public void onTestStart(ITestResult result) {

	        String testName = result.getName();


	        // ExtentReportGenerator.getExtentReport()

	 
	        etest = report.createTest(testName);

	        etest.log(Status.INFO, testName +"Execution Started");

	    }

	    public void onTestSuccess(ITestResult result) {

	        String testName = result.getName();

	        etest.log(Status.PASS, testName + "Got Successfuly Executed");

	        etest.assignAuthor("Swapnil Gedam");

	    }

	 
	    public void onTestFailure(ITestResult result) {
	    	String testName = result.getName();

	        etest.log(Status.FAIL, testName+"got failed");

	 

	         etest.assignAuthor("Swapnil Gedam");

	         WebDriver driver = null;

	 

	        try {

	 

	            driver = (WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());

	 

	        } catch (IllegalArgumentException e) {

	 

	            // TODO Auto-generated catch block

	 

	            e.printStackTrace();

	 

	        } catch (IllegalAccessException e) {

	 

	            // TODO Auto-generated catch block

	 

	            e.printStackTrace();

	 

	        } catch (NoSuchFieldException e) {

	            // TODO Auto-generated catch block
	 
	            e.printStackTrace();

	 
	        } catch (SecurityException e) {


	            // TODO Auto-generated catch block


	            e.printStackTrace();

	        }

	        try {
				etest.addScreenCaptureFromPath(takeScreenshot(testName,driver), testName);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	 

	        etest.log(Status.INFO, result.getThrowable());
	       

			/*
			 * try {
			 * 
			 * 
			 * 
			 * byte[] file1 = FileUtils.readFileToByteArray(new
			 * File(takeScreenshot(testName, driver)));
			 * 
			 * 
			 * 
			 * String screenshot = Base64.encodeBase64String(file1);
			 * 
			 * 
			 * 
			 * etest.addScreenCaptureFromBase64String(screenshot);
			 * 
			 * 
			 * 
			 * } catch (Exception e) {
			 * 
			 * e.printStackTrace();
			 * 
			 * 
			 * 
			 * }
			 */
	        etest.log(Status.INFO, result.getThrowable());

	    }

	 

	    public void onTestSkipped(ITestResult result) {

	 

	        String testName = result.getName();

	 

	        etest.log(Status.SKIP, testName + "Got Skipped");

	        etest.log(Status.INFO, result.getThrowable());

	 

	        etest.assignAuthor("Swapnil Gedam");

	    }

	 

	    public void onFinish(ITestContext context) {


	        report.flush();

	        try {

	 

	            utility_Earwana.SendEmail.SendEmail();


	 

	        } catch (EmailException e) {

	 
	            e.printStackTrace();

	        } catch (IOException e) {
				
				e.printStackTrace();
			}

	 

	        File eReportsFile;
	        
			try {
				eReportsFile = new File(UtilClass.getPFdata("extentReport_path") +ExtentReportGenerator.filename1+".html");
			         Desktop.getDesktop().browse(eReportsFile.toURI());

	        } catch (IOException e) {

	         

	            e.printStackTrace();

	        }

	    }

	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	 
	    }


	    public void onStart(ITestContext context) {

	 
	    }

	

}
