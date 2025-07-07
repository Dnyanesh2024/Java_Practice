package UploadDoc_Insect_dealer_State_Test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import UploadDoc.UploadDocumentsandPayment;
import UploadDoc_Insect_dealer_State.UploadDocumentsandPaymentInsect;
import pages.service_Fertilizer_Dealer_License_State.Fertilizer_NewLicense_State_Level;
import pages_Eparwana.Login_Page;
import utility_Earwana.BaseClassA;
import utility_Earwana.ExcelReader;

public class UploadDocumentsandPayment_Duplicate_Test extends BaseClassA{
	
	
	Login_Page lp;
	Fertilizer_NewLicense_State_Level fns;
	
	UploadDocumentsandPaymentInsect up;
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
		
		up= new UploadDocumentsandPaymentInsect(driver);
		
		

		

	}
	
	@Test(priority = 1)
	
	public void verify_Applicant_Information_Documents() throws Throwable {
		ExcelReader er = new ExcelReader(Excel_path, 0);

		up.click_On_Applicant_Information();
		up.select_Photograph_File_For_District(er.getExcelData(60, 1));
		up.click_On_Upload_Photograph_Button_district();
		up.select_sign_File_District(er.getExcelData(60, 1));
		up.click_On_Upload_sign_Button_District();
		up.select_education_File_District(er.getExcelData(59, 1));
		up.click_On_Upload_education_Button_Ditrict();
		up.select_letter_File_District(er.getExcelData(59, 1));
		up.click_On_Upload_letter_Button_District();
		up.select_Addhar_File_District(er.getExcelData(59, 1));
		up.click_On_Upload_Addhar_Button_District();
		up.select_Pan_File_District(er.getExcelData(59, 1));
		up.click_On_Upload_Pan_Button_District();
		
	}

@Test(priority = 2)
	
	public void verify_Information_of_the_Firm_Organization__Documents() throws Throwable {
		ExcelReader er = new ExcelReader(Excel_path, 0);
		up.Scroll_Down();
		up.click_On_Information_Of_The_Firm();
		up.select_PAN_Card_Proof_For_District(er.getExcelData(59, 1));
		up.click_On_Upload_PAN_Card_Proof_Button_District();
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

}
@Test(priority = 3)

public void verify_Responsible_Persons_Details() throws Throwable {
	ExcelReader er = new ExcelReader(Excel_path, 0);
	
	up.Scroll_Down();
	up.click_Responsible_Person_Details();
	up.select_Recent_pic_Resp(er.getExcelData(60, 1));
	up.click_On_Upload_Recent_pic_Resp_Button();
	up.select_scann_Signature_Resp(er.getExcelData(60, 1));
	up.click_On_Upload_scann_Signature_Resp();
	up.select_Education_Qualification(er.getExcelData(59, 1));
	up.click_On_Upload_Education_Qualification_Button();
	up.select_Res_Addhar_Card(er.getExcelData(59, 1));
	up.click_On_Upload_Res_Addhar_Card_Button();
	up.select_Res_pan_Card(er.getExcelData(59, 1));
	up.click_On_Upload_Res_Pan_Card_Button();
	up.select_Res_Declaration_by_Dealer(er.getExcelData(59, 1));
	
	up.click_On_Upload_Declaration_by_Dealer_Button();
	
}

@Test(priority = 4)

public void verify_Sales_Address_Details_Documents() throws Throwable {
	ExcelReader er = new ExcelReader(Excel_path, 0);
	
	up.Scroll_Down();
	up.click_sales_Adress_Details();
	up.select_sales_Ownership_Documents(er.getExcelData(59, 1));
	up.click_On_Upload_Ownership_Documents_Button();
	
	up.select_storage_Ownership_Documents(er.getExcelData(59, 1));
	up.click_On_Upload_Storage_Ownership_Documents_Button();
	
	up.select_Fertilizer_Documents(er.getExcelData(59, 1));
	up.click_On_Upload_Fertilizer_Documents_Button();
	up.select_Authenticity_of_Firm(er.getExcelData(59, 1));
	  up.click_On_Upload_Authenticity_of_Firm_Button();
	  
	
	
}
//@Test(priority = 5)

public void verify_Storage_Address_Details_Documents() throws Throwable {
	ExcelReader er = new ExcelReader(Excel_path, 0);
	up.Scroll_Down();
	up.click_storage_Adress_Details();
	up.select_storage_Ownership_Documents(er.getExcelData(59, 1));
	up.click_On_Upload_Storage_Ownership_Documents_Button();
}
//@Test(priority = 6)

public void verify_Fertilizer_Type_and_Grade_Details_Documents() throws Throwable {
	ExcelReader er = new ExcelReader(Excel_path, 0);
	
	up.Scroll_Down();
	up.click_Fertilizer_Details();
	up.select_Fertilizer_Documents(er.getExcelData(59, 1));
	up.click_On_Upload_Fertilizer_Documents_Button();
	
	up.scroll_Up();
	up.click_on_submit_Button();
	up.handle_Alert();
	
	up.handle_Alert();
	
	
	
}

@Test(priority = 7)

public void verify_GRAS_Payment_Details_Details() throws Throwable {
	ExcelReader er = new ExcelReader(Excel_path, 0);
	
	up.scroll_Up();
	up.click_on_submit_Button();
	up.handle_Alert();
	
	up.handle_Alert();
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
	up.click_GrassPament_Documents();
	up.select_Receipt_Grass_Documents(er.getExcelData(59, 1));
	up.click_On_Upload_Receipt_Grass_Documents_Button();
	
	up.scroll_Up();
	up.click_on_submit_Button();
	up.handle_Alert();
	
	up.handle_Alert();
	

}

@Test(priority = 8)

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