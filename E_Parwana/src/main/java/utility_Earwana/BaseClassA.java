package utility_Earwana;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassA {
public static WebDriver driver;
public static String StudentWindow;
public static String SrutinyWindow;

public void initializerBrowser() throws IOException {
	
	WebDriverManager.chromedriver().setup();
	
//	WebDriverManager.firefoxdriver().setup();
	driver=new ChromeDriver();
	driver.get(UtilClass.getPFdata("url_scrutiny"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
}

public void openNewTab_scrutiny () {
((JavascriptExecutor) driver).executeScript("window.open('https://testeparwanaapp.mahaitgov.in/')");
	Set <String> list1 = driver.getWindowHandles();
	Iterator<String> it = list1.iterator();

	StudentWindow = 	it.next();
	SrutinyWindow = it.next();
		
	driver.switchTo().window (SrutinyWindow);
	System.out.println(driver.getTitle());
}




public void applicantlogin() throws IOException {
	//WebDriverManager.firefoxdriver().setup();
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get(UtilClass.getPFdata("url_portal"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
}
public void scrutinylogin() throws IOException {
	//WebDriverManager.firefoxdriver().setup();
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.get(UtilClass.getPFdata("url_scrutiny"));
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    
}//NEW CODE UNDER BASECLASS 

public String takeScreenshot (String testName, WebDriver driver) throws IOException {

	 

    File sourceScreenshots = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
   
    String    destinationScreenshotpath= UtilClass.getPFdata("extentReport_path")+"Screenshots\\"+testName+".png";

    try {
    	System.out.println("INside takeScreenshot");

        FileUtils.copyFile(sourceScreenshots, new File(destinationScreenshotpath));

    } catch (IOException e) {

        // TODO Auto-generated catch block

        e.printStackTrace();

    }

    

    return destinationScreenshotpath;

    

    

}
   

}




