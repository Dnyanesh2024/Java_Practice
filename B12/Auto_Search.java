package B12;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Auto_Search {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		WebElement el = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		
		el.sendKeys("chittorgarh");
		
		Thread.sleep(2000);
		
		List <WebElement> sl= driver.findElements(By.xpath("//ul[@jsname='bw4e9b']"));
		//sl.selectByVisibleText("ipo");
		
		for(WebElement e : sl) {
	
		System.out.println(e.getText());
		
		e.click();
					
		}		
	}
}
