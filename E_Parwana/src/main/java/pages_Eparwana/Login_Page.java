package pages_Eparwana;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility_Earwana.Helper;

public class Login_Page {

	WebDriver driver;
	String Excel_path;

	public Login_Page(WebDriver driver, String Excel_path1) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		Excel_path = Excel_path1;
	}

	// login credentials

	@FindBy(xpath = "//input[@id='Username' and  @data-val-required='Username Required']")
	private WebElement username_text;

	@FindBy(xpath = "//input[@id='Password' and  @data-val-required='Password Required']")

	private WebElement password_text;

	public void enterUserName(String Username) throws InterruptedException {
		
		
		
		Helper.highLightElement(driver,username_text);

		username_text.sendKeys(Username);
	}
	
	@FindBy(xpath="//input[@id='captcha_TB_I' and  @name='captcha$TB']")
	private WebElement captha_refresh;
	
	@FindBy(xpath="//input[@id='btnLogin' and  @value='Sign in']")
	private WebElement Login_btn;



	public void enterPassword(String Password) throws InterruptedException {
		
		Helper.highLightElement(driver,password_text);
		password_text.sendKeys(Password);
	}
	
	public void Enter_Captha() throws InterruptedException
	{
		captha_refresh.click();
		Thread.sleep(10000);

	}
	
	public void clickLoginButton()
	
	
	{
		
		Helper.highLightElement(driver,Login_btn);
		Login_btn.click();
	}

}
