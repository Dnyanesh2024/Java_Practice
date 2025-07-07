package Scrutiny_Flow_Cotton_Dealer_Pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import utility_Earwana.Helper;

public class Scrutiny_login_Page_Eparwana_Cotton_Dealer_State {
	
	SoftAssert assert1=new SoftAssert();
	WebDriver driver;
	public  Scrutiny_login_Page_Eparwana_Cotton_Dealer_State(WebDriver driver ) {
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	
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
/// scrutinity dashboard
		
		@FindBy(xpath = "//button[text()='Go For Scrutiny']")
		
		private WebElement Scrutiny;
		
		public void click_On_Go_For_Scrutiny() throws Exception {
			
			Robot robot = new Robot();
			Thread.sleep(4000);
			robot.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(4000);
			System.out.println("a");
			robot.keyPress(KeyEvent.VK_TAB);
		//driver.findElement(By.xpath("//th[text()='License Num']")).click();
			Scrutiny.click();
		}
		
		
@FindBy(xpath = "//span[text()='ServiceAccess']")
		
		private WebElement serviceaccess;
		
		public void click_On_Service_Access() throws Exception {
			Thread.sleep(2000);
			serviceaccess.click();
		}
		
       @FindBy(xpath = "//span[text()=' Desk Service Access']")
		
		private WebElement deskaccess;
		
		public void click_On_Desk_Service_Access() throws Exception {
			Thread.sleep(2000);
			deskaccess.click();
		}
		
		 @FindBy(xpath = "//button[text()=' Activate']")
			
			private WebElement act;
			
			public void click_On_Acctivate_Button() throws Exception {
				Thread.sleep(2000);
				act.click();
			}
		public void enter_Remarks(String remark) {
			
		
		WebElement remark1=driver.findElement(By.xpath("//textarea[@id='txtAreaScrutinyRemark']"));
	      // Javascript executor
	      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", remark1);
	      remark1.sendKeys(remark);
}
		
		@FindBy(xpath = "//button[text()='Recommend For Approval']")
		
		private WebElement Recommend_For_Approval;
		
		public void click_On_Recommend_For_Approval() {
			Recommend_For_Approval.click();
			
		}
		
       @FindBy(xpath = "//a[text()='Next']")
		
		private WebElement nextbtn;
		
		public void click_On_nextbtn() {
			nextbtn.click();
			
		}
		
		@FindBy(xpath = "//input[@type='search']")
		
		private WebElement dash_Search;
		
		public void enter_Search_Application_Id(String search_Id) throws Exception {
			
			Thread.sleep(5000);
			dash_Search.sendKeys(search_Id);
			
		}
		
		@FindBy(xpath = "//a[text()='Firm Information']")
		
		private WebElement firminfolink;
		
		public void click_on_firminfolink() {
			firminfolink.click();
		}
		
       @FindBy(xpath = "//a[text()='Sales Address Details']")
		
		private WebElement Responsible;
		
		public void click_on_firm_Responsible_Person_link() {
			Responsible.click();
		}
		 @FindBy(xpath = "//a[text()='Crop Varieties Details']")
			
			private WebElement salesdetails;
			
			public void click_on_Sales_Address_Details_link() {
				salesdetails.click();
			}
			
			 @FindBy(xpath = "//a[text()='Storage Address Details']")
				
				private WebElement Storagedetails;
				
				public void click_on_Storage_Address_Details_link() {
					Storagedetails.click();
				}
              @FindBy(xpath = "//a[text()='Production Machinery Details']")
				
				private WebElement production_Machinerty;
				
				public void click_on_production_Machinerty_Details_link() {
					production_Machinerty.click();
				}
				
				 @FindBy(xpath = "//a[text()='Laboratory Equipment Details']")
					
					private WebElement lab_Equipment;
					
					public void click_on_lab_Equipment_Details_link() {
						lab_Equipment.click();
					}
				
					
					 @FindBy(xpath = "//a[text()='MPCB Certificate']")
						
						private WebElement mpcb_Certificate;
						
						public void click_on_mpcb_Certificate_Details_link() {
							mpcb_Certificate.click();
						}
						
						 @FindBy(xpath = "//a[text()='Production Supervisor']")
							
							private WebElement production_Superviser;
							
							public void click_on_production_Superviser_Details_link() {
								production_Superviser.click();
							}
							
                           @FindBy(xpath = "//a[text()='Place Of Storage Details']")
							
							private WebElement place_OF_Storage;
							
							public void click_on_place_OF_Storage_Details_link() {
								place_OF_Storage.click();
							}
				 @FindBy(xpath = "//a[text()='GRAS Payment']")
					
					private WebElement gp;
					
					public void click_on_GrassPayment_Details_link() {
						gp.click();
					}
					
				
				 @FindBy(xpath = "//div/div[2]/div/div/table/tbody/tr[1]/th[1]/input")
					
					private WebElement check;
					
					public void click_on_Checkbox() {
						check.click();
					}
					
					
					public void handle_Alert() throws Exception {
						Alert a = new WebDriverWait(driver, Duration.ofSeconds(40)).until(ExpectedConditions.alertIsPresent());
						System.out.println("Alert is present");
						String text = a.getText();

						System.out.println(text);

						Thread.sleep(3000);

						a.accept();
					}
					public void click_On_final_Recommend_For_Approval() {
						
						
						WebElement remark21=driver.findElement(By.xpath("//button[@class='btn btn-info redirectToDashboard']"));
					      // Javascript executor
					      ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", remark21);
					      remark21.click();
				}
					// dir agree
					
					@FindBy(xpath = "//button[text()='Save']")

					private WebElement svbtn;

					public void click_On_save_Button() throws Exception {

						Thread.sleep(3000);

						svbtn.click();

					}
					
					
					@FindBy(xpath = "//button[@value='BackWard_2766']")

					private WebElement Send_back;

					public void click_On_Send_back_to_CQCO
                                          
                    () throws Exception {

						Thread.sleep(3000);

						Send_back.click();

					}
			
					@FindBy(xpath = "//button[@value='BackWard_2765']")

					private WebElement Send_back_to_Fert;

					public void click_On_Send_back_to_TO_Fert
                                          
                    () throws Exception {

						Thread.sleep(3000);

						Send_back_to_Fert.click();

					}
					
              @FindBy(xpath = "//button[@class='btn btn-info redirectToDashboard' and  @value='Forward_2888']")
					
					private WebElement approve;
					
					public void click_On_Approve_Button() throws Exception {
						Thread.sleep(2000);
						approve.click();
						
					}
					
@                   FindBy(xpath = "//button[@class='btn btn-info redirectToDashboard' and  @value='Forward_3048']")
					
					private WebElement approvedistrict;
					
					public void click_On_Approve_Button_District() throws Exception {
						Thread.sleep(2000);
						approvedistrict.click();
						
					}
					
					@FindBy(xpath = "//span[text()=' Insecticide Dealer License']")

					private WebElement Insecticide_Dealer_License;

					public void click_on_Insecticide_Dealer_License_Tab() {

						Insecticide_Dealer_License.click();

					}
					
					@FindBy(xpath = "//span[text()=' Manufacturer License']")

					private WebElement manu_License;

					public void click_on_Fertilizer_Manufacture_Dealer_License_Tab() {

						manu_License.click();

					}
					
					@FindBy(xpath = "//span[text()=' Cotton Dealer License']")

					private WebElement  Cotton_Dealer_License;

					public void click_on_Cotton_Dealer_License_Tab() {

						 Cotton_Dealer_License.click();

					}
					
					@FindBy(xpath = "//li[8]//span[text()='Approved']")

					private WebElement Approvebtn;

					public void click_on_Approve_Tab() {

						Approvebtn.click();

					}
					
					@FindBy(xpath = "//li[4]//span[text()='Approved']")

					private WebElement Approvebtn_District;

					public void click_on_Approve_District_submenu_Tab() {

						Approvebtn_District.click();

					}
					
					@FindBy(xpath = "//button[@id='btnPL' and text()='Preview License']")

					private WebElement prelincence;

					public void click_ON_preVlincence() throws Exception {
                           
						Robot robot = new Robot();
						Thread.sleep(4000);
						robot.keyPress(KeyEvent.VK_TAB);
						Thread.sleep(4000);
						System.out.println("a");
						robot.keyPress(KeyEvent.VK_TAB);
						prelincence.click();

					}
					
					@FindBy(xpath = "//button[@id='btnPL' and text()='Preview License']")

					private WebElement prelincencedist;

					public void click_ON_preVlincence_For_District() throws Exception {
						Thread.sleep(15000);
						Robot robot = new Robot();
						Thread.sleep(10000);
						robot.keyPress(KeyEvent.VK_TAB);
						Thread.sleep(10000);
						System.out.println("a");
						robot.keyPress(KeyEvent.VK_TAB);
						prelincencedist.click();

					}		
				
}

