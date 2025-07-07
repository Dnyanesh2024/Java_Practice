package UploadDoc_cotton_Dealer_State_Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import UploadDoc_cotton_Dealer.UploadDocumentsandPayment_cotton_Dealer;
import pages.service_Fertilizer_Dealer_License_State.Fertilizer_NewLicense_State_Level;
import pages_Eparwana.Login_Page;
import utility_Earwana.BaseClassA;
import utility_Earwana.ExcelReader;


public class UploadDocumentsandPayment_Cotton_Dealer_Test extends BaseClassA {
	
	
	Login_Page lp;
	Fertilizer_NewLicense_State_Level fns;
	
	UploadDocumentsandPayment_cotton_Dealer up;
	public static String Excel_path;

	@BeforeClass
	@Parameters("Excel_path")
	public void setup(String Excel_path1) throws Exception {
		Excel_path = Excel_path1;
		// applicantlogin();
		// HomePage_obj = new Homepage_Page(driver);
		// ApplicantLogin_obj = new ApplicantLogin_Page(driver);

		lp = new Login_Page(driver, Excel_path1);

		fns = new Fertilizer_NewLicense_State_Level(driver);
		
		up= new UploadDocumentsandPayment_cotton_Dealer(driver);
		
		

		

	}
	
	@Test(priority = 1)
	
	public void verify_Applicant_Information_Documents() throws Throwable {
		ExcelReader er = new ExcelReader(Excel_path, 0);

		up.click_On_Applicant_Information();
		
	
		up.select_Photograph_File(er.getExcelData(60, 1));
		up.click_On_Upload_Photograph_Button();
		up.select_sign_File(er.getExcelData(60, 1));
		up.click_On_Upload_sign_Button();
		up.select_education_File(er.getExcelData(59, 1));
		up.click_On_Upload_education_Button();
		/*
		 * up.select_letter_File(er.getExcelData(59, 1));
		 * up.click_On_Upload_letter_Button();
		 */
		up.select_Addhar_File(er.getExcelData(59, 1));
		up.click_On_Upload_Addhar_Button();
		up.select_Pan_File(er.getExcelData(60, 1));
		up.click_On_Upload_Pan_Button();
		/*
		 * up.select_Photograph_File_For_District(er.getExcelData(60, 1));
		 * up.click_On_Upload_Photograph_Button_district();
		 * up.select_sign_File_District(er.getExcelData(60, 1));
		 * up.click_On_Upload_sign_Button_District();
		 * up.select_education_File_District(er.getExcelData(59, 1));
		 * up.click_On_Upload_education_Button_Ditrict();
		 * up.select_letter_File_District(er.getExcelData(59, 1));
		 * up.click_On_Upload_letter_Button_District();
		 * up.select_Addhar_File_District(er.getExcelData(59, 1));
		 * up.click_On_Upload_Addhar_Button_District();
		 * up.select_Pan_File_District(er.getExcelData(59, 1));
		 * up.click_On_Upload_Pan_Button_District();
		 */
		
	}

@Test(priority = 2)
	
	public void verify_Information_of_the_Firm_Organization__Documents() throws Throwable {
		ExcelReader er = new ExcelReader(Excel_path, 0);
		up.Scroll_Down();
		up.click_On_Information_Of_The_Firm();
		
		//up.Scroll_Down();
		//up.click_On_Information_Of_The_Firm();
		
		up.select_PAN_Card_Proof(er.getExcelData(60, 1));
		up.click_On_Upload_PAN_Card_Proof_Button();
		
		up.select_FormA1(er.getExcelData(59, 1));
		up.click_On_Upload_FormA1Button();
		
		up.select_Assurance_Certificate(er.getExcelData(59, 1));
		up.click_On_Upload_Assurance_Certificate_Button();
		up.select_Authenticity_of_Firm(er.getExcelData(59, 1));
		up.click_On_Upload_Authenticity_of_Firm_Button();
		//up.select_PAN_Card_Proof_For_District(er.getExcelData(59, 1));
		//up.click_On_Upload_PAN_Card_Proof_Button_District();
		/*
		 * up.select_FormA1(er.getExcelData(59, 1)); up.click_On_Upload_FormA1Button();
		 * up.select_Assurance_Certificate(er.getExcelData(59, 1));
		 * up.click_On_Upload_Assurance_Certificate_Button();
		 * up.select_Authenticity_of_Firm(er.getExcelData(59, 1));
		 * up.click_On_Upload_Authenticity_of_Firm_Button();
		 * 
		 * up.Scroll_Down(); up.select_Recent_Photograph_614(er.getExcelData(60, 1));
		 * up.click_On_Upload_Recent_Photograph_614_Button();
		 * up.select_Recent_sign_614(er.getExcelData(60, 1));
		 * up.click_On_Upload_Recent_sign_614_Button();
		 * up.select_Recent_photograph_615(er.getExcelData(60, 1));
		 * up.click_On_Upload_Recent_Photo_615_Button();
		 * up.select_Recent_sign_615(er.getExcelData(60, 1));
		 * up.click_On_Upload_Recent_sign_615_Button();
		 */
		up.Scroll_Down();
		
		
		
		up.select_Recent_pic_Resp(er.getExcelData(59, 1));
		up.click_On_Upload_Recent_pic_Resp_Button();
		up.select_scann_Signature_Resp(er.getExcelData(59, 1));
		up.click_On_Upload_scann_Signature_Resp();
		up.Scroll_Down();
		up.select_Education_Qualification(er.getExcelData(59, 1));
		up.click_On_Upload_Education_Qualification_Button();
		up.select_Res_Addhar_Card(er.getExcelData(59, 1));
		up.click_On_Upload_Res_Addhar_Card_Button();
		
		up.Scroll_Down();
		up.select_Res_pan_Card(er.getExcelData(59, 1));
		up.click_On_Upload_Res_Pan_Card_Button();
		/*
		 * up.select_Res_Declaration_by_Dealer(er.getExcelData(59, 1));
		 * up.click_On_Upload_Declaration_by_Dealer_Button();
		 */
		

}
@Test(priority = 3)

public void verify_sales_Address_Details() throws Throwable {
	ExcelReader er = new ExcelReader(Excel_path, 0);
	
	up.Scroll_Down();
	up.click_Responsible_Person_Details();
	/*
	 * up.select_Recent_pic_Resp(er.getExcelData(60, 1));
	 * up.click_On_Upload_Recent_pic_Resp_Button();
	 */
	/*
	 * up.select_scann_Signature_Resp(er.getExcelData(60, 1));
	 * up.click_On_Upload_scann_Signature_Resp();
	 */
	/*
	 * up.select_Education_Qualification(er.getExcelData(59, 1));
	 * up.click_On_Upload_Education_Qualification_Button();
	 */
	/*
	 * up.select_Res_Addhar_Card(er.getExcelData(59, 1));
	 * up.click_On_Upload_Res_Addhar_Card_Button();
	 */
	/*
	 * up.select_Res_pan_Card(er.getExcelData(60, 1));
	 * up.click_On_Upload_Res_Pan_Card_Button();
	 */
	up.select_Res_Declaration_by_Dealer(er.getExcelData(59, 1));
	up.click_On_Upload_Declaration_by_Dealer_Button();
	
}

  @Test(priority = 4)

public void verify_Storage_Documents() throws Throwable {
	ExcelReader er = new ExcelReader(Excel_path, 0);
	
	up.Scroll_Down();
	///
	up.click_sales_Adress_Details();
	//Matter to Printed
	up.select_sales_Ownership_Documents(er.getExcelData(59, 1));
	up.click_On_Upload_Ownership_Documents_Button();
	
	////////
	
	/*
	 * up.select_Authenticity_of_Firm(er.getExcelData(59, 1));
	 * up.click_On_Upload_Authenticity_of_Firm_Button();
	 */
	
	
}
  
  //@Test(priority = 5)

  public void verify_POMDocuments() throws Throwable {
  	ExcelReader er = new ExcelReader(Excel_path, 0);
  	up.	click_Step_POM_();
  	up.select_storage_Ownership_Documents(er.getExcelData(59, 1));
	up.click_On_Upload_Storage_Ownership_Documents_Button();
  }
  
  //@Test(priority = 6)

  public void verify_Production_Machinery() throws Throwable {
  	ExcelReader er = new ExcelReader(Excel_path, 0);
  	up.Scroll_Down();
  	up.click_Production_Machinery();
  	up.select_Fertilizer_Documents(er.getExcelData(59, 1));
	up.click_On_Upload_Fertilizer_Documents_Button();
  }
  
  //@Test(priority = 7)

  public void verify_Laboratory_Equipment() throws Throwable {
  	ExcelReader er = new ExcelReader(Excel_path, 0);
  	
  	up.Scroll_Down();
  	up.click_on_LaboratoryEquipment();
    up.select_Bill_OF_Purchase(er.getExcelData(59, 1));
    up.click_On_Upload_Bill_OF_Purchase_Button();
  }
//@Test(priority = 5)

public void verify_Storage_Address_Details_Documents() throws Throwable {
	ExcelReader er = new ExcelReader(Excel_path, 0);
	up.Scroll_Down();
	up.click_storage_Adress_Details();
	up.select_storage_Ownership_Documents(er.getExcelData(59, 1));
	up.click_On_Upload_Storage_Ownership_Documents_Button();
}

//@Test(priority = 8)

public void verify_MPCB_Certificate_Documents() throws Throwable {
	ExcelReader er = new ExcelReader(Excel_path, 0);
	up.Scroll_Down();
	up.click_Mpcb_Certificate_Details();
	up.select_Mpcb_Documents(er.getExcelData(59, 1));
	up.click_On_Upload_mpcb_Documents_Button();
}

//@Test(priority = 9)

public void verify_Production_Supervisor_Documents() throws Throwable {
	ExcelReader er = new ExcelReader(Excel_path, 0);
	up.Scroll_Down();
	up.click_production_Superviser_Details();
	up.select_education_Qualification_Documents(er.getExcelData(59, 1));
	up.click_On_Education_Qualification_Documents_Button();
	up.select_Appoinment_Letter_Documents(er.getExcelData(59, 1));
	up.click_On_Appointment_Letter_Documents_Button();
}

//@Test(priority = 10)

public void verify_Place_of_Storage_Details_Documents() throws Throwable {
	ExcelReader er = new ExcelReader(Excel_path, 0);
	up.Scroll_Down();
	up.click_Storage_Details();
	up.select_owner_Documents(er.getExcelData(59, 1));
	up.click_On_Owner_Documents_Button();
	
	up.scroll_Up();
	up.click_on_submit_Button();
	up.handle_Alert();
	
	up.handle_Alert();
	
}
@Test(priority = 5)

public void verify_Grass_Paymnt_Documents() throws Throwable {
	ExcelReader er = new ExcelReader(Excel_path, 0);
	
	up.Scroll_Down();
	up.click_Fertilizer_Details();
	up.select_owner_Documents(er.getExcelData(59, 1));
	up.click_On_Owner_Documents_Button();
	
	
	up.scroll_Up();
	up.click_on_submit_Button();
	up.handle_Alert();
	
	up.handle_Alert();
	
	
	
}

//@Test(priority = 11)

public void verify_GRAS_Payment_Details_Details() throws Throwable {
	ExcelReader er = new ExcelReader(Excel_path, 0);
	
	/*
	 * up.scroll_Up(); up.click_on_submit_Button(); up.handle_Alert();
	 * 
	 * up.handle_Alert();
	 */
	up.enter_Grass_Payment_Details(er.getExcelData(49, 1));
	
	up.click_on_challan_Payment_Date();
	up.select_Month(er.getExcelData(43, 1));

	up.select_year(er.getExcelData(44, 1));

	up.select_Date();
	up.enter_Grass_Ammount_Details(er.getExcelData(50, 1));
	
	up.click_ON_Res_Save_Button();
	
	up.click_On_ok_Button();
	
	up.click_On_Final_Submit_Button();

	up.click_On_ok_Button();
	
	up.Scroll_Down();
	up.Scroll_Down();
	
	up.Scroll_Down();
	
	up.click_GrassPament_Documents();
	up.select_Receipt_Grass_Documents(er.getExcelData(59, 1));
	up.click_On_Upload_Receipt_Grass_Documents_Button();
	
	up.scroll_Up();
	up.click_on_submit_Button();
	up.handle_Alert();
	
	up.handle_Alert();
	

}

@Test(priority = 6)

public void verify_Make_Payment() throws Throwable {
	
	up.click_ON_Online_Payment();
	up.click_ON_Net_Banking();
	up. click_ON_Pay_Govt();
	up.click_ON_Proceed_For_Payment();
	up.click_ON_HDFC_bank();
	up.click_ON_pay_now();
	up.click_ON_success_Button();
}
}


