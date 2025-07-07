package B12;

import java.io.InputStream;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Addition_Using_TestNG {
	
	//WebDriver driver;
	
	@Test
	public void additionof_twonumber() {
	
	
		 int a1=10, b1=20;
	
		
		
	
		System.out.println("Enter Value of a and b");
	//driver = new ChromeDriver();

	  int c;
	  
	 
	  
	  c=a1+b1;
	  
	  System.out.println(c);
	 
	}
}
