package test.service_Insecticide_Dealer_License_State;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import UploadDoc.UploadDocumentsandPayment;
import pages.service_Insecticide_Dealer_License_State.Insecticide_Dealer_License_NewLicense_District_Level;
import pages.service_Insecticide_Dealer_License_State.Insecticide_Dealer_License_NewLicense_State_Level;
import pages_Eparwana.Login_Page;
import utility_Earwana.BaseClassA;
import utility_Earwana.ExcelReader;

public class Insecticide_Dealer_License_NewLicense_District_Test extends BaseClassA {
	Login_Page lp;
	Insecticide_Dealer_License_NewLicense_District_Level idl;

	UploadDocumentsandPayment up;
	public static String Excel_path;

	@BeforeClass
	@Parameters("Excel_path")
	public void setup(String Excel_path1) throws Exception {
		Excel_path = Excel_path1;
		// applicantlogin();
		// HomePage_obj = new Homepage_Page(driver);
		// ApplicantLogin_obj = new ApplicantLogin_Page(driver);

		lp = new Login_Page(driver, Excel_path1);

		idl = new Insecticide_Dealer_License_NewLicense_District_Level(driver);

		up = new UploadDocumentsandPayment(driver);

		idl.click_on_Insecticide_Dealer_License_Tab();
		idl.click_On_New_License_District_Level();

		idl.click_On_Close_Button();

	}

	@Test(priority = 1)

	public void verify_Applicant_Informatiom() throws Exception

	{

		ExcelReader er = new ExcelReader(Excel_path, 0);

		//idl.click_On_non_Selected_District();

		Thread.sleep(2000);

	//	idl.click_On_District_Checkbox();
		
		idl.Select_district(er.getExcelData(2, 1));

		idl.Select_lincenceHolder(er.getExcelData(13, 1));

		//idl.Select_Applicant_Type(er.getExcelData(12, 1));

		// idl.Select_License_Sub_Type(er.getExcelData(14, 1));

		idl.Select_LicenseCat();

		idl.Select_LicenseCategory();
		// idl.Select_LicenseCat();

		idl.enter_Applicant_Name(er.getExcelData(17, 1));

		idl.enter_Applicant_Middle_Name(er.getExcelData(17, 3));

		idl.enter_Applicant_Last_Name(er.getExcelData(17, 5));

		idl.enter_Date_Of_Birth();

		idl.enter_Applicant_Educational_Qualification(er.getExcelData(17, 7));

		idl.enter_Applicant_Designation(er.getExcelData(17, 9));

		idl.enter_Applicant_Addhar(er.getExcelData(17, 11));

		idl.enter_Applicant_Pannumber(er.getExcelData(17, 13));

		/// Applicant’s Residential Address

		idl.enter_Name_Of_Building(er.getExcelData(19, 1));

		idl.enter_Name_Of_Street(er.getExcelData(19, 3));

		idl.enter_Name_Of_Landmak(er.getExcelData(19, 5));

		idl.Scroll_Down();
		idl.Select_state(er.getExcelData(12, 3));

		idl.Select_District(er.getExcelData(19, 7));

		idl.Select_Taluka(er.getExcelData(19, 9));

		idl.enter_pincode(er.getExcelData(19, 11));

		/// Communication Details of Applicant

		idl.enter_Mobile_No(er.getExcelData(21, 1));

		idl.enter_Email_ID(er.getExcelData(21, 3));

		idl.Scroll_Down();

		idl.click_ON_Save_Button();

		idl.write_Application_ID();

		idl.click_On_ok_Button();

		idl.click_On_next_Button();

	}

	// Firm_Informatiom
	@Test(priority = 2)

	public void verify_Firm_Informatiom() throws Exception {

		ExcelReader er = new ExcelReader(Excel_path, 0);

		idl.Select_Firm_Type(er.getExcelData(24, 1));

		idl.enter_Firm_Orgnization(er.getExcelData(24, 3));

		idl.click_On_non_Selected_District();

		idl.click_On_Licence_Purpose_Checkbox();

		idl.Select_Address_Type(er.getExcelData(10, 2));

		// Registered Office Address

		// idl.enter_Name_Of_Building(er.getExcelData(19, 1));

		// idl.enter_Name_Of_Street(er.getExcelData(19, 3));

		// idl.enter_Name_Of_Landmak(er.getExcelData(19, 5));

		// idl.Scroll_Down();

		// idl.Select_District(er.getExcelData(19, 7));

		// idl.Select_Taluka(er.getExcelData(19, 9));

		// idl.enter_Firm_pincode(er.getExcelData(24, 5));

		// Communication Details of Firm/Organization

		idl.enter_Firm_Mobile_No(er.getExcelData(24, 7));

		idl.enter_Firm_Email(er.getExcelData(24, 9));

		idl.Scroll_Down();

		// PAN & GST Details

		idl.enter_Applicant_Pannumber(er.getExcelData(17, 13));
		// 1nd partner_Name

		// idl.Select_Number_Of_Partner(er.getExcelData(28, 1));

		// idl.enter_name_of_Partner(er.getExcelData(28, 3));

		// idl.enter_res_ADD(er.getExcelData(28, 5));

		// idl.enter_part_mob_Num(er.getExcelData(28, 7));

		// idl.enter_part_Email(er.getExcelData(28, 9));

		// idl.click_On_Add_Button();

		Thread.sleep(5000);

		/* idl.click_On_ok_Button(); */

		// 2 nd partner_Name
		// idl.enter_name_of_Partner(er.getExcelData(28, 3));

		// idl.enter_res_ADD(er.getExcelData(28, 5));

		// idl.enter_part_mob_Num(er.getExcelData(28, 7));

		// idl.enter_part_Email(er.getExcelData(28, 9));

		// idl.click_On_Add_Button();

		idl.Scroll_Down();

		idl.click_On_Self_Declaration();

		idl.click_ON_Save_Button();

		idl.click_On_ok_Button();

		idl.click_On_next_Button();

	}
//  Responsible Person Details

	@Test(priority = 3)

	public void verify_Responsibl_Perso_Details() throws Exception {

		ExcelReader er = new ExcelReader(Excel_path, 0);

		idl.enter_DesResponsibility(er.getExcelData(5, 1));

		idl.Select_Responsible_Person_(er.getExcelData(5, 3));
		/*
		 * idl.enter_Applicant_Addhar(er.getExcelData(17, 11));
		 * idl.enter_Applicant_Pannumber(er.getExcelData(17, 13));
		 * 
		 * idl.Scroll_Down();
		 * 
		 * idl.Select_Responsible_Person_OfficeAddress(er.getExcelData(32, 1));
		 * 
		 * idl.enter_Scope(er.getExcelData(32, 3));
		 * 
		 * idl.Scroll_Down();
		 * 
		 * idl.Scroll_Down();
		 * 
		 * // // Responsible Person Details : save as add button
		 * idl.click_ON_Save_Button();
		 * 
		 * idl.click_On_ok_Button();
		 * 
		 * idl.Scroll_Down();
		 * 
		 * idl.click_ON_Res_Save_Button();
		 * 
		 * idl.click_on_yes_Button();
		 * 
		 * idl.click_On_ok_Button();
		 * 
		 * idl.click_On_next_Button();
		 * 
		 */

		idl.Scroll_Down();

		idl.Scroll_Down();

		idl.enter_Name_Of_Building(er.getExcelData(19, 1));

		idl.enter_Name_Of_Street(er.getExcelData(19, 3));

		idl.enter_Name_Of_Landmak(er.getExcelData(19, 5));

		idl.Scroll_Down();

		idl.Select_state(er.getExcelData(12, 3));

		idl.Select_District(er.getExcelData(19, 7));

		idl.Select_Taluka(er.getExcelData(19, 9));

		idl.enter_pincode(er.getExcelData(19, 11));

		idl.Scroll_Down();

		idl.Scroll_Down();

		idl.enter_Name_Of_Building_res(er.getExcelData(19, 1));

		idl.enter_Name_Of_Street_res(er.getExcelData(19, 3));

		idl.enter_Name_Of_Landmak_Res(er.getExcelData(19, 5));

		idl.Scroll_Down();

		idl.Select_State(er.getExcelData(12, 3));

		idl.Select_District_Res(er.getExcelData(19, 7));

		idl.Select_Taluka_res(er.getExcelData(19, 9));

		idl.enter_pincode_Res(er.getExcelData(19, 11));

		idl.click_On_ADD_Button();

		idl.click_On_ok_Button();

		idl.click_ON_Res_Save_Button();

		idl.click_on_yes_Button();

		idl.click_On_ok_Button();

		idl.click_On_next_Button();

	}

	// Sales Address Details
	@Test(priority = 4)

	public void verify_Sales_Addres_etails() throws Exception {

		ExcelReader er = new ExcelReader(Excel_path, 0);

		idl.enter_Name_Of_Building(er.getExcelData(19, 1));

		idl.enter_Name_Of_Street(er.getExcelData(19, 3));

		idl.enter_Name_Of_Landmak(er.getExcelData(19, 5));

		idl.Scroll_Down();

		idl.Select_District(er.getExcelData(19, 7));

		idl.Select_Taluka(er.getExcelData(19, 9));

		idl.enter_sales_pincode(er.getExcelData(34, 1));

		idl.SELECT_Ownership_Details_of_Business(er.getExcelData(34, 3));

		idl.Scroll_Down();

		idl.enter_latitude(er.getExcelData(34, 5));

		idl.enter_longitude(er.getExcelData(34, 7));

		idl.enter_part_mob_Num(er.getExcelData(28, 7));

		idl.enter_Email_ID_new(er.getExcelData(28, 9));
		idl.enter_Optional_Email_Id_Email(er.getExcelData(34, 9));

		idl.Scroll_Down();

		idl.enter_Length_New(er.getExcelData(36, 1));

		idl.enter_Breadh_New(er.getExcelData(36, 3));

		idl.enter_Height_New(er.getExcelData(36, 5));

		idl.enter_sales_Area(er.getExcelData(36, 7));

		idl.enter_sales_Storage(er.getExcelData(36, 9));

		idl.enter_sales_floor(er.getExcelData(36, 11));

		idl.enter_sales_Walls(er.getExcelData(36, 13));

		idl.Scroll_Down();
		idl.Scroll_Down();
		idl.click_ON_sales_add_Button();

		idl.click_On_ok_Button();

		idl.Scroll_Down();
		idl.Scroll_Down();
		idl.click_ON_Authentication_Sales();

		// idl.click_On_Close_Button();

		idl.Scroll_Down();

		// idl.click_On_ok_Button();

		idl.click_ON_Res_Save_Button();

		idl.click_on_yes_Button();

		idl.click_On_ok_Button();

		idl.click_On_next_Button();

		/*
		 * idl.click_On_ok_Button();
		 * 
		 * idl.click_On_next_Button();
		 */
	}

	// Storage Address Details
	// @Test(priority = 5)

	public void verify_Storag_Address_Details_etails() throws Exception {

		ExcelReader er = new ExcelReader(Excel_path, 0);

		idl.enter_Name_Of_Building(er.getExcelData(19, 1));

		idl.enter_Name_Of_Street(er.getExcelData(19, 3));

		idl.enter_Name_Of_Landmak(er.getExcelData(19, 5));

		idl.Scroll_Down();

		idl.Select_District(er.getExcelData(19, 7));

		idl.Select_Taluka(er.getExcelData(19, 9));

		idl.enter_sales_pincode(er.getExcelData(34, 1));

		idl.Select_Storage_Ownership_Details_of_Business(er.getExcelData(38, 1));

		idl.Scroll_Down();

		idl.enter_latitude(er.getExcelData(34, 5));

		idl.enter_longitude(er.getExcelData(34, 7));

		idl.Scroll_Down();

		idl.enter_Length(er.getExcelData(36, 1));

		idl.enter_Breadh(er.getExcelData(36, 3));

		idl.enter_Height(er.getExcelData(36, 5));

		idl.enter_Area(er.getExcelData(36, 7));

		idl.enter_Storage(er.getExcelData(36, 9));

		idl.enter_floor(er.getExcelData(36, 11));

		idl.enter_Walls(er.getExcelData(36, 13));

		idl.click_ON_Authentication();

		idl.click_On_Storage_close_Button();

		idl.click_On_Add_Button();

		idl.Scroll_Down();

		idl.click_On_ok_Button();

		idl.click_ON_Res_Save_Button();

		idl.click_on_yes_Button();

		idl.click_On_ok_Button();

		idl.click_On_next_Button();

	}

	@Test(priority = 5)

	public void verify_Fertilizer_type_Grade() throws Exception {

		ExcelReader er = new ExcelReader(Excel_path, 0);

		idl.enter_Insect_License_for_District(er.getExcelData(40, 1));

		idl.click_On_insecSend_Request_For_District();

		idl.click_On_ok_Button();

		// idl.click_on_Fertilizer_Dealer_License_Tab();

		idl.click_on_Insecticide_Manufacturing_License_Tab();
		idl.click_on_pricipal_Certificate_Tab();

		// idl.click_On_PendingO();

		// idl.click_On_sendingo();

		idl.enter_Application_ID_For_Insec(er.getExcelData(22, 1));
		idl.Click_Send_PCbtn();

		idl.click_On_Select_All();

		idl.Scroll_Down();

		idl.Scroll_Down();
		idl.click_On_Upto_the_validity();

		idl.click_On_chkDirectlyFromUs();

		idl.click_On_chkActAsDistributor();
		
		idl.click_On_submit_Button();
		
		idl.click_On_ok_Button();
		/*
		 * idl.select_File(er.getExcelData(59, 1));
		 * //idl.select_File1(er.getExcelData(59, 1)); idl.click_On_Upload_Button();
		 * //idl.click_On_Upload_Button1();
		 * 
		 * 
		 * idl.handle_Alert(); // manufacture //idl.select_File1(er.getExcelData(59,
		 * 1));
		 * 
		 * //idl.click_On_Upload_Button1();
		 * 
		 * // idl.handle_Alert();
		 * 
		 * 
		 * Alert a = new WebDriverWait(driver,
		 * Duration.ofSeconds(40)).until(ExpectedConditions.alertIsPresent());
		 * System.out.println("Alert is present"); String text = a.getText();
		 * 
		 * System.out.println(text);
		 * 
		 * Thread.sleep(3000);
		 * 
		 * 
		 * a.accept();
		 * 
		 * // river.switchTo().alert().accept();
		 * 
		 * 
		 * Alert alert = driver.switchTo().alert();
		 * 
		 * alert.accept();
		 * 
		 * 
		 * idl.Scroll_Down(); idl.click_On_Period_Button();
		 * 
		 * idl.click_on_From_Date();
		 * 
		 * idl.select_Month(er.getExcelData(43, 1));
		 * 
		 * idl.select_year(er.getExcelData(44, 1));
		 * 
		 * idl.select_Date(); idl.click_on_To_Date();
		 * 
		 * idl.select_Month(er.getExcelData(43, 1));
		 * 
		 * idl.select_year(er.getExcelData(46,1));
		 * 
		 * idl.select_Date();
		 * 
		 * idl.enter_Auth_Person(er.getExcelData(47,1));
		 * 
		 * idl.enter_design(er.getExcelData(47,3));
		 * 
		 * idl.select_Authorized_person_Signature(er.getExcelData(60,1));
		 * 
		 * idl.enter_Mob_Number_Form_O(er.getExcelData(48,1)); //submit button
		 * idl.click_On_Add_Button();
		 * 
		 * 
		 * // developer remove this alert //idl.handle_Alert();
		 * 
		 * idl.click_On_ok_Button();
		 * 
		 */
	}
	 @Test(priority =6)

	public void verify_Dashboard_Search() throws Exception {

		ExcelReader er = new ExcelReader(Excel_path, 0);

		idl.click_On_Dashboard();

		idl.enter_Search_Application_Id(er.getExcelData(22, 1));

		idl.click_On_view_Form();

		idl.click_On_InsecticideDealer();

		idl.Scroll_Down();
		idl.Scroll_Down();

		idl.click_ON_Res_Save_Button();

		idl.click_on_yes_Button();

		idl.click_On_ok_Button();

		idl.click_On_Final_Submit_Button();

		idl.click_On_ok_Button();

	}

}
