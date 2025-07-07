package B12;

import java.awt.event.ActionEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HowToHandleAlert {

	public static void main(String[] args) throws Throwable {

		WebDriver driver =new  FirefoxDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		
		driver.manage().window().maximize();
		
		WebElement Cliclalert=driver.findElement(By.xpath("//button[@class = 'btn btn-primary' and text()='Click Me' and @onclick = 'myPromp()']"));
		Cliclalert.click();
		Thread.sleep(3000);
		
		Alert al= driver.switchTo().alert();
		Thread.sleep(7000);

		al.sendKeys("Hello");
		Thread.sleep(3000);

		System.out.println(al.getText());
		Thread.sleep(3000);

		//al.dismiss();
		
	}

}
