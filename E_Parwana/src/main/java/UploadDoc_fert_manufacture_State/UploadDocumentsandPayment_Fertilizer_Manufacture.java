package UploadDoc_fert_manufacture_State;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility_Earwana.ExcelReader;

public class UploadDocumentsandPayment_Fertilizer_Manufacture {
	
	
	WebDriver driver;

	public UploadDocumentsandPayment_Fertilizer_Manufacture(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
///Applicant Information
   @FindBy(xpath = "//span[text()='Step 1: Applicant Information']")
   
   private WebElement App_Info;
   
   public void click_On_Applicant_Information() throws Exception {
	   
	   Thread.sleep(3000);
	   
	   App_Info.click();
   }
		 
   @FindBy(xpath = "//input[@id='file_1']")

	private WebElement file1;

	public void select_Photograph_File(String fle) throws InterruptedException {
		Thread.sleep(2000);
		file1.sendKeys(fle);
	}
	
	@FindBy(xpath = "//button[text()='Upload' and @id='btnUp_1']")

	private WebElement upladbtn31;

	public void click_On_Upload_Photograph_Button() throws Exception {

		Thread.sleep(4000);
		upladbtn31.click();

}
	
	@FindBy(xpath = "//input[@id='file_2']")

	private WebElement file32;

	public void select_sign_File(String fle) throws InterruptedException {
		Thread.sleep(2000);
		file32.sendKeys(fle);
	}
	
	@FindBy(xpath = "//button[text()='Upload' and @id='btnUp_2']")

	private WebElement upladbtn32;

	public void click_On_Upload_sign_Button() throws Exception {

		Thread.sleep(4000);
		upladbtn32.click();

}
	@FindBy(xpath = "//input[@id='file_3']")

	private WebElement file33;

	public void select_education_File(String fle) throws InterruptedException {
		Thread.sleep(2000);
		file33.sendKeys(fle);
	}
	@FindBy(xpath = "//button[text()='Upload' and @id='btnUp_3']")

	private WebElement upladbtn33;

	public void click_On_Upload_education_Button() throws Exception {

		Thread.sleep(4000);
		upladbtn33.click();

}
	
	@FindBy(xpath = "//input[@id='file_4']")

	private WebElement file34;

	public void select_letter_File(String fle) throws InterruptedException {
		Thread.sleep(2000);
		file34.sendKeys(fle);
	}
	
	@FindBy(xpath = "//button[text()='Upload' and @id='btnUp_4']")

	private WebElement upladbtn34;

	public void click_On_Upload_letter_Button() throws Exception {

		Thread.sleep(4000);
		upladbtn34.click();

}
	
	@FindBy(xpath = "//input[@id='file_5']")

	private WebElement file35;

	public void select_Addhar_File(String fle) throws InterruptedException {
		Thread.sleep(2000);
		file35.sendKeys(fle);
	}
	
	@FindBy(xpath = "//button[text()='Upload' and @id='btnUp_5']")

	private WebElement upladbtn35;

	public void click_On_Upload_Addhar_Button() throws Exception {

		Thread.sleep(4000);
		upladbtn35.click();

}
	@FindBy(xpath = "//input[@id='file_6']")

	private WebElement file36;

	public void select_Pan_File(String fle) throws InterruptedException {
		Thread.sleep(2000);
		file36.sendKeys(fle);
	}
	
	@FindBy(xpath = "//button[text()='Upload' and @id='btnUp_6']")

	private WebElement upladbtn36;

	public void click_On_Upload_Pan_Button() throws Exception {

		Thread.sleep(4000);
		upladbtn36.click();

}
	
	//Information of the Firm/Organization
	
	@FindBy(xpath = "//span[text()='Step 2: Information of the Firm/Organization']")
	   
	   private WebElement firm;
	   
	   public void click_On_Information_Of_The_Firm() throws Exception {
		   
		   Thread.sleep(3000);
		   
		   firm.click();
	   }
	   
	   @FindBy(xpath = "//input[@id='file_8']")

		private WebElement file37;

		public void select_PAN_Card_Proof(String fle) throws InterruptedException {
			Thread.sleep(2000);
			file37.sendKeys(fle);
		}
		
		@FindBy(xpath = "//button[text()='Upload' and @id='btnUp_8']")

		private WebElement upladbtn37;

		public void click_On_Upload_PAN_Card_Proof_Button() throws Exception {

			Thread.sleep(4000);
			upladbtn37.click();

}
		
		public void Scroll_Down() {

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,350)", "");
		}
// FORMA
		  @FindBy(xpath = "//input[@id='file_7']")

			private WebElement file40;

			public void select_FormA1(String fle) throws InterruptedException {
				Thread.sleep(2000);
				file40.sendKeys(fle);
			}
			
			@FindBy(xpath = "//button[text()='Upload' and @id='btnUp_7']")

			private WebElement upladbtn40;

			public void click_On_Upload_FormA1Button() throws Exception {

				Thread.sleep(4000);
				upladbtn40.click();

	}
			
			  @FindBy(xpath = "//input[@id='file_11']")

				private WebElement file41;

				public void select_Assurance_Certificate(String fle) throws InterruptedException {
					Thread.sleep(2000);
					file41.sendKeys(fle);
				}
				
				@FindBy(xpath = "//button[text()='Upload' and @id='btnUp_11']")

				private WebElement upladbtn41;

				public void click_On_Upload_Assurance_Certificate_Button() throws Exception {

					Thread.sleep(4000);
					upladbtn41.click();

		}
				
				  @FindBy(xpath = "//div/div[2]/div/div/div[4]/div/div[3]/input")

					private WebElement file306;

					public void select_Authenticity_of_Firm(String fle) throws InterruptedException {
						Thread.sleep(2000);
						file306.sendKeys(fle);
					}
					
					 @FindBy(xpath = "//div/div[7]/div/fieldset/div/div/div/div[3]/input")

						private WebElement filebill;

						public void select_Bill_OF_Purchase(String fle) throws InterruptedException {
							Thread.sleep(2000);
							filebill.sendKeys(fle);
						}
					
					@FindBy(xpath = "//div/div[2]/div/div/div[4]/div/div[4]/button[1]")

					private WebElement upladbtn306;

					public void click_On_Upload_Authenticity_of_Firm_Button() throws Exception {

						Thread.sleep(4000);
						upladbtn306.click();

			}
					
					@FindBy(xpath = "//div/div[7]/div/fieldset/div/div/div/div[4]/button[1]")

					private WebElement Bill_OF_Purchase;

					public void click_On_Upload_Bill_OF_Purchase_Button() throws Exception {

						Thread.sleep(4000);
						Bill_OF_Purchase.click();

			}
					
					@FindBy(xpath = "//div/div[3]/div[1]/div/div[@class='col-lg-3']/input")

					private WebElement file614;

					public void select_Recent_Photograph_614(String fle) throws InterruptedException {
						Thread.sleep(2000);
						file614.sendKeys(fle);
					}
					
					@FindBy(xpath = "//div/div[3]/div[1]/div/div[@class='col-lg-2']/button[1]")

					private WebElement upladbtn614;

					public void click_On_Upload_Recent_Photograph_614_Button() throws Exception {

						Thread.sleep(4000);
						upladbtn614.click();

			}
					
					@FindBy(xpath = "//div/div[3]/div[2]/div/div[@class='col-lg-3']/input")

					private WebElement file39;

					public void select_Recent_sign_614(String fle) throws InterruptedException {
						Thread.sleep(2000);
						file39.sendKeys(fle);
					}
					
					@FindBy(xpath = "//div/div[3]/div[2]/div/div[@class='col-lg-2']/button[1]")

					private WebElement upladbtn39;

					public void click_On_Upload_Recent_sign_614_Button() throws Exception {

						Thread.sleep(4000);
						upladbtn39.click();

			}
					
					@FindBy(xpath = "//div/div[5]/div[1]/div/div[@class='col-lg-3']/input")

					private WebElement file615;

					public void select_Recent_photograph_615(String fle) throws InterruptedException {
						Thread.sleep(2000);
						file615.sendKeys(fle);
					}
					@FindBy(xpath = "//div/div[5]/div[1]/div/div[@class='col-lg-2']/button[1]")

					private WebElement upladbtn615;

					public void click_On_Upload_Recent_Photo_615_Button() throws Exception {

						Thread.sleep(4000);
						upladbtn615.click();

			}	
					
					@FindBy(xpath = "//div/div[5]/div[2]/div/div[@class='col-lg-3']/input")

					private WebElement file39615;

					public void select_Recent_sign_615(String fle) throws InterruptedException {
						Thread.sleep(2000);
						file39615.sendKeys(fle);
					}
					
					@FindBy(xpath = "//div/div[5]/div[2]/div/div[@class='col-lg-2']/button[1]")

					private WebElement upladbtn39615;

					public void click_On_Upload_Recent_sign_615_Button() throws Exception {

						Thread.sleep(4000);
						upladbtn39615.click();

			}	
					
					// responcible person details
					@FindBy(xpath = "//span[text()='Step 3: Responsible Person Details']")
					   
					   private WebElement Person_Details;
					   
					   public void click_Responsible_Person_Details() throws Exception {
						   
						   Thread.sleep(3000);
						   
						   Person_Details.click();
					   }
					
					
					@FindBy(xpath = "//div/div[3]/div/fieldset/div/div[1]/div/div[3]/input")

					private WebElement file42;

					public void select_Recent_pic_Resp(String fle) throws InterruptedException {
						Thread.sleep(2000);
						file42.sendKeys(fle);
					}
					
					@FindBy(xpath = "//div/div[3]/div/fieldset/div/div[1]/div/div[4]/button[1]")

					private WebElement upladbtn42146302;

					public void click_On_Upload_Recent_pic_Resp_Button() throws InterruptedException {
						
						Thread.sleep(4000);
						upladbtn42146302.click();
}
					
					@FindBy(xpath = "//div/div[3]/div/fieldset/div/div[2]/div/div[3]/input")

					private WebElement file43;

					public void select_scann_Signature_Resp(String fle) throws InterruptedException {
						Thread.sleep(2000);
						file43.sendKeys(fle);
					}
					@FindBy(xpath = "//div/div[3]/div/fieldset/div/div[2]/div/div[4]/button[1]")

					private WebElement upladbtn43146302;

					public void click_On_Upload_scann_Signature_Resp() throws InterruptedException {
						
						Thread.sleep(4000);
						upladbtn43146302.click();
}	
					
					
					@FindBy(xpath = "//div/div[3]/div/fieldset/div/div[3]/div/div[3]/input")

					private WebElement file44;

					public void select_Education_Qualification(String fle) throws InterruptedException {
						Thread.sleep(2000);
						file44.sendKeys(fle);
					}
				
@FindBy(xpath = "//div/div[3]/div/fieldset/div/div[3]/div/div[4]/button[1]")

private WebElement upladbtn44146302;

public void click_On_Upload_Education_Qualification_Button() throws InterruptedException {
	
	Thread.sleep(4000);
	upladbtn44146302.click();
}	


@FindBy(xpath = "//div/div[3]/div/fieldset/div/div[4]/div/div[3]/input")

private WebElement file45;

public void select_Res_Addhar_Card(String fle) throws InterruptedException {
	Thread.sleep(2000);
	file45.sendKeys(fle);
}

@FindBy(xpath = "//div/div[3]/div/fieldset/div/div[4]/div/div[4]/button[1]")

private WebElement upladbtn45146302;

public void click_On_Upload_Res_Addhar_Card_Button() throws InterruptedException {
	
	Thread.sleep(4000);
	upladbtn45146302.click();
}	
@FindBy(xpath = "//div/div[3]/div/fieldset/div/div[5]/div/div[3]/input")

private WebElement file46;

public void select_Res_pan_Card(String fle) throws InterruptedException {
	Thread.sleep(2000);
	file46.sendKeys(fle);
}
@FindBy(xpath = "//div/div[3]/div/fieldset/div/div[5]/div/div[4]/button[1]")

private WebElement upladbtn46146302;

public void click_On_Upload_Res_Pan_Card_Button() throws InterruptedException {
	
	Thread.sleep(4000);
	upladbtn46146302.click();
}

@FindBy(xpath = "//div/div[3]/div/fieldset/div/div[6]/div/div[3]/input")

private WebElement file47;

public void select_Res_Declaration_by_Dealer(String fle) throws InterruptedException {
	Thread.sleep(2000);
	file47.sendKeys(fle);
}
@FindBy(xpath = "//div/div[3]/div/fieldset/div/div[6]/div/div[4]/button[1]")

private WebElement upladbtn47146302;

public void click_On_Upload_Declaration_by_Dealer_Button() throws InterruptedException {
	
	Thread.sleep(4000);
	upladbtn47146302.click();
}
// sales addres details documents

@FindBy(xpath = "//span[text()='Step 4: Fertilizer Type and Grade Information']")

private WebElement sales_Details;

public void click_sales_Adress_Details() throws Exception {
	   
	   Thread.sleep(3000);
	   
	   sales_Details.click();
}
@FindBy(xpath = "//span[text()='Step 5: POM (Place of Manufacture Address Details)']")

private WebElement pom;

public void click_Step_POM_() throws Exception {
	   
	   Thread.sleep(3000);
	   
	   pom.click();
}

@FindBy(xpath = "//span[text()='Step 6: Production Machinery']")

private WebElement Production_Machinery;

public void click_Production_Machinery() throws Exception {
	   
	   Thread.sleep(3000);
	   
	   Production_Machinery.click();
}
@FindBy(xpath = "//span[text()='Step 7: Laboratory Equipment']")

private WebElement LaboratoryEquipment;

public void click_on_LaboratoryEquipment() throws Exception {
	   
	   Thread.sleep(3000);
	   
	   LaboratoryEquipment.click();
}

@FindBy(xpath = "//div/div[4]/div/fieldset/div/div/div/div[3]/input")

private WebElement file50;

public void select_sales_Ownership_Documents(String fle) throws InterruptedException {
	Thread.sleep(2000);
	file50.sendKeys(fle);
}

@FindBy(xpath = "//div/div[4]/div/fieldset/div/div/div/div[4]/button[1]")

private WebElement upladbtn592598;

public void click_On_Upload_Ownership_Documents_Button() throws InterruptedException {
	
	Thread.sleep(4000);
	upladbtn592598.click();
}
//Step 5: Storage Address Details
@FindBy(xpath = "//span[text()='Step 5: Storage Address Details']")

private WebElement storage_Details;

public void click_storage_Adress_Details() throws Exception {
	   
	   Thread.sleep(3000);
	   
	   storage_Details.click();
}
@FindBy(xpath = "//div/div[5]/div/fieldset/div/div[1]/div/div[3]/input")

private WebElement file52;

public void select_storage_Ownership_Documents(String fle) throws InterruptedException {
	Thread.sleep(2000);
	file52.sendKeys(fle);
}

@FindBy(xpath = "//div/div[8]/div/fieldset/div/div/div/div[3]/input")

private WebElement Mpcb;

public void select_Mpcb_Documents(String fle) throws InterruptedException {
	Thread.sleep(2000);
	Mpcb.sendKeys(fle);
}


@FindBy(xpath = "//div/div[9]/div/fieldset/div/div[1]/div/div[3]/input")

private WebElement pro_sup;

public void select_education_Qualification_Documents(String fle) throws InterruptedException {
	Thread.sleep(2000);
	pro_sup.sendKeys(fle);
}


@FindBy(xpath = "//div/div[10]/div/fieldset/div/div[1]/div/div[3]/input")

private WebElement owner;

public void select_owner_Documents(String fle) throws InterruptedException {
	Thread.sleep(2000);
	owner.sendKeys(fle);
}


@FindBy(xpath = "//div/div[9]/div/fieldset/div/div[2]/div/div[3]/input")

private WebElement Appoinment_LETTER;

public void select_Appoinment_Letter_Documents(String fle) throws InterruptedException {
	Thread.sleep(2000);
	Appoinment_LETTER.sendKeys(fle);
}
@FindBy(xpath = "//div/div[5]/div/fieldset/div/div[1]/div/div[4]/button[1]")

private WebElement upladbtn52592599;

public void click_On_Upload_Storage_Ownership_Documents_Button() throws InterruptedException {
	
	Thread.sleep(4000);
	upladbtn52592599.click();
}

@FindBy(xpath = "//div/div[8]/div/fieldset/div/div/div/div[4]/button[1]")

private WebElement mpcb_Documents_Button;

public void click_On_Upload_mpcb_Documents_Button() throws InterruptedException {
	
	Thread.sleep(4000);
	mpcb_Documents_Button.click();
}

@FindBy(xpath = "//div/div[9]/div/fieldset/div/div[1]/div/div[4]/button[1]")

private WebElement eduquali_Documents_Button;

public void click_On_Education_Qualification_Documents_Button() throws InterruptedException {
	
	Thread.sleep(4000);
	eduquali_Documents_Button.click();
}
@FindBy(xpath = "//div/div[10]/div/fieldset/div/div[1]/div/div[4]/button[1]")

private WebElement ownwer_Button;

public void click_On_Owner_Documents_Button() throws InterruptedException {
	
	Thread.sleep(4000);
	ownwer_Button.click();
}


@FindBy(xpath = "//div/div[9]/div/fieldset/div/div[2]/div/div[4]/button[1]")

private WebElement AppointButton;

public void click_On_Appointment_Letter_Documents_Button() throws InterruptedException {
	
	Thread.sleep(4000);
	AppointButton.click();
}

@FindBy(xpath = "//span[text()='Step 8: MPCB Certificate']")

private WebElement Mpcb_Certificate;

public void click_Mpcb_Certificate_Details() throws Exception {
	   
	   Thread.sleep(3000);
	   
	   Mpcb_Certificate.click();
}

@FindBy(xpath = "//span[text()='Step 9: Production Supervisor']")

private WebElement prod_SUPERVISER;

public void click_production_Superviser_Details() throws Exception {
	   
	   Thread.sleep(3000);
	   
	   prod_SUPERVISER.click();
}

@FindBy(xpath = "//span[text()='Step 10: Place of Storage Details']")

private WebElement storage;

public void click_Storage_Details() throws Exception {
	   
	   Thread.sleep(3000);
	   
	   storage.click();
}
// Step 6: Fertilizer Type and Grade
@FindBy(xpath = "//span[text()='Step 6: Fertilizer Type and Grade']")

private WebElement fertilizer_Details;

public void click_Fertilizer_Details() throws Exception {
	   
	   Thread.sleep(3000);
	   
	   fertilizer_Details.click();
}

@FindBy(xpath = "//div/div[6]/div/fieldset/div/div/div/div[3]/input")

private WebElement file60;

public void select_Fertilizer_Documents(String fle) throws InterruptedException {
	Thread.sleep(2000);
	file60.sendKeys(fle);
}

@FindBy(xpath = "//div/div[6]/div/fieldset/div/div/div/div[4]/button[1]")

private WebElement upladbtn336856;

public void click_On_Upload_Fertilizer_Documents_Button() throws InterruptedException {
	
	Thread.sleep(4000);
	upladbtn336856.click();
}

public void scroll_Up() throws InterruptedException {
	
	Thread.sleep(3000);
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,-1200)", "");
    
    
    
}

@FindBy(xpath = "//button[text()='Submit & Proceed']")

private WebElement submitbutton;


public void click_on_submit_Button() throws Exception {
	
	Thread.sleep(4000);
	
	WebElement element = driver.findElement(By.xpath("//button[text()='Submit & Proceed']"));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	Thread.sleep(4000);
	executor.executeScript("arguments[0].click();", element);
	
	//submitbutton.click();
}

public void handle_Alert() throws Exception {
	Alert a = new WebDriverWait(driver, Duration.ofSeconds(40)).until(ExpectedConditions.alertIsPresent());
	System.out.println("Alert is present");
	String text = a.getText();

	System.out.println(text);

	Thread.sleep(3000);

	a.accept();
}

// grass payment details

@FindBy(xpath = "//input[@id='GRNNumber']")

private WebElement grass;

public void enter_Grass_Payment_Details(String GrassPay) throws InterruptedException {
	
	grass.sendKeys(GrassPay);
}

@FindBy(xpath = "//input[@id='grassPaymentDetail_GrasChallanPayDate']")

private WebElement chalandate;

public void click_on_challan_Payment_Date () {
	
	chalandate.click();
}

@FindBy(xpath = "//select[@class='ui-datepicker-month']")

private WebElement month;
public void select_Month(String Mon) throws Exception {
	
	Select s1 = new Select(month);
	Thread.sleep(3000);
	s1.selectByVisibleText(Mon);
	
}

@FindBy(xpath = "//select[@class='ui-datepicker-year']")

private WebElement year;
public void select_year(String yr) throws Exception {
	
	Select s1 = new Select(year);
	Thread.sleep(3000);
	s1.selectByVisibleText(yr);
	
}

public void select_Date() throws Exception {
	
	ExcelReader er = new ExcelReader(
			"C:\\Users\\Swapnil.Gedam\\eclipse-workspacemahait\\E_Parwana\\src\\main\\resources\\Eprawana_Fertilizer_State.xlsx",
			0);
	
	String date=er.getExcelData(45, 1);
	
	List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
	
	for (WebElement ele : alldates) {
		
		String dt = ele.getText();
		
		if(dt.equals(date)) {
			Thread.sleep(1000);
			ele.click();
			
			break;
	}
}
	
}

@FindBy(xpath = "//input[@id='GrassAmount']")

private WebElement grassamt;

public void enter_Grass_Ammount_Details(String Grassamount) throws InterruptedException {
	
	grassamt.sendKeys(Grassamount);
}
@FindBy(xpath = "//button[text()='Save']")

private WebElement ressavebtn;

public void click_ON_Res_Save_Button() throws Exception {

	Thread.sleep(3000);

	ressavebtn.click();

}

@FindBy(xpath = "//button[@class='confirm' and text()='OK']")

private WebElement okbtn;

public void click_On_ok_Button() throws Exception {

	Thread.sleep(3000);

	okbtn.click();

}
@FindBy(xpath = "//a[text()='Final Submit ']")

private WebElement finalsubmit;

public void click_On_Final_Submit_Button() {
	
	finalsubmit.click();
}



@FindBy(xpath = "//span[text()='Step 11: GRAS Payment']")

private WebElement gp_Details;

public void click_GrassPament_Documents() throws Exception {
	   
	   Thread.sleep(3000);
	   
	   gp_Details.click();
}

@FindBy(xpath = "//input[@id='file_30']")

private WebElement file63;

public void select_Receipt_Grass_Documents(String fle) throws InterruptedException {
	Thread.sleep(2000);
	file63.sendKeys(fle);
}

@FindBy(xpath = "//button[text()='Upload' and @id='btnUp_30']")

private WebElement upladbtn63;

public void click_On_Upload_Receipt_Grass_Documents_Button() throws InterruptedException {
	
	Thread.sleep(4000);
	upladbtn63.click();
}

/// Payment page


@FindBy(xpath = "//button[@id='Confirm']")

private WebElement onnpay;

public void click_ON_Online_Payment() {
	
	onnpay.click();
}
@FindBy(xpath = "//a[text()='Net Banking']")

private WebElement net;

public void click_ON_Net_Banking() {
	
	net.click();
}

@FindBy(xpath = "//input[@id='CPH_dlNetBanking_btnPayNMode_0']")

private WebElement paygov;

public void click_ON_Pay_Govt() {
	
	paygov.click();
}
@FindBy(xpath = "//input[@id='CPH_btnSubmit']")

private WebElement proceedPay;

public void click_ON_Proceed_For_Payment() {
	
	proceedPay.click();
}
@FindBy(xpath = "//img[@alt='HDFC Bank' and @src='./assets/images/hdfc_desktop.png']")

private WebElement Hdfc;

public void click_ON_HDFC_bank() {
	
	Hdfc.click();
}
@FindBy(xpath = "//span[@class='mdc-button__label' and text()='Pay Now']")

private WebElement paynow;

public void click_ON_pay_now() {
	
	paynow.click();
}

@FindBy(xpath = "//button[@class='success' and text()='Success']")

private WebElement success;

public void click_ON_success_Button() {
	
	success.click();
}
}