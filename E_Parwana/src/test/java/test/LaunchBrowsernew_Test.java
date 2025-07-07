package test;

import java.time.Duration;

//import pages.Login_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class LaunchBrowsernew_Test{

	@Test
	
	public void openApplicationTest() throws Exception {
		

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 //driver.get("https://testdbtprematricapp.mahaitgov.in/Login/Login");
		driver.get("https://testcitizenservices.mahaitgov.in/en");

		Thread.sleep(3000);

		
	}
}
