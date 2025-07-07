package B12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUp {

	public static void main(String[] args) throws Exception {

//WebDriverManager.firefoxdriver().setup();
        
        
        WebDriver    driver = new ChromeDriver();
        
        
        driver.manage().window().maximize();
        
        driver.get("https://rof.mahaonline.gov.in/");
        
        driver.findElement(By.xpath("//input[@id='UserID']")).sendKeys("MolAccount");
        
        /*
         * Robot robot = new Robot(); Thread.sleep(3000);
         */
            /*  
             * robot.keyPress(KeyEvent.VK_TAB); Thread.sleep(3000);
             */
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Pass@123");
        
        Thread.sleep(9000);
        
        driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
	}

}
