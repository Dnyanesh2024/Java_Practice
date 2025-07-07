package B12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Methods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testcitizenservices.mahaitgov.in/");
		
	
		System.out.println("Title : "+driver.getTitle());
		
		System.out.println("Current URL : "+driver.getCurrentUrl());
		
		WebElement search =driver.findElement(By.xpath("//input[@id='UserName']"));
		
		
		
		List<WebElement> button =driver.findElements(By.xpath("//span[@class='title']"));
		
		for(WebElement btn:button) {
			
			System.out.println("btn");
			
		}
		
		driver.navigate().to("https://www.makemytrip.com/");
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//section[@class='modalMain tcnFooter']//span[@data-cy='closeModal' and @class='commonModal__close']")).click();
		//driver.navigate().back();
		
		//Thread.sleep(2000);
		//driver.navigate().forward();
		
		//System.out.println(driver.getPageSource());
		
	}

}
