package test.service_Cotton_Dealer_License;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import UploadDoc.UploadDocumentsandPayment;
import pages.service_Cotton_Dealer_License.Cotton_Dealer_Licensee_State_Level;
import pages_Eparwana.Login_Page;
import utility_Earwana.BaseClassA;
import utility_Earwana.ExcelReader;

public class Cotton_Dealer_License_State_Level_Test extends BaseClassA {
	
	Login_Page lp;
	Cotton_Dealer_Licensee_State_Level fm;
	
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

		fm = new Cotton_Dealer_Licensee_State_Level(driver);
		

		up= new UploadDocumentsandPayment(driver);
		

		//fm.click_on_Fertilizer_Dealer_License_Tab();
		
        fm.click_on_Cotton_Dealer_License_Tab();
        fm.click_On_New_License_State_Level();
        fm.click_On_Close_Button();

	}

	@Test(priority = 1)

	public void verify_Applicant_Informatiom() throws Exception

	{

		ExcelReader er = new ExcelReader(Excel_path, 0);
        fm.click_On_non_Selected_District();
		Thread.sleep(2000);
		fm.click_On_District_Checkbox();

		//fm.Select_lincenceHolder(er.getExcelData(13, 1));
		Thread.sleep(2000);

		

		fm.Select_lincenceHolder(er.getExcelData(13, 1));

		

		

		fm.Select_License_categorey_Manufacture(er.getExcelData(14, 1));
		
		fm.Select_LicenseCat();

		fm.Select_LicenseCategory();
		//fm.Select_LicenseCat();

		fm.enter_Applicant_Name(er.getExcelData(17, 1));

		fm.enter_Applicant_Middle_Name(er.getExcelData(17, 3));

		fm.enter_Applicant_Last_Name(er.getExcelData(17, 5));

		fm.enter_Date_Of_Birth();

		fm.enter_Applicant_Educational_Qualification(er.getExcelData(17, 7));

		fm.enter_Applicant_Designation(er.getExcelData(17, 9));

		fm.enter_Applicant_Addhar(er.getExcelData(17, 11));

		fm.enter_Applicant_Pannumber(er.getExcelData(17, 13));

		/// Applicant’s Residential Address

		fm.enter_Name_Of_Building(er.getExcelData(19, 1));

		fm.enter_Name_Of_Street(er.getExcelData(19, 3));

		fm.enter_Name_Of_Landmak(er.getExcelData(19, 5));

		fm.Scroll_Down();
		fm.Select_state(er.getExcelData(12, 3));
		fm.Select_District(er.getExcelData(19, 7));

		fm.Select_Taluka(er.getExcelData(19, 9));

		fm.enter_pincode(er.getExcelData(19, 11));

		/// Communication Details of Applicant

		fm.enter_Mobile_No(er.getExcelData(21, 1));

		fm.enter_Email_ID(er.getExcelData(21, 3));

		fm.Scroll_Down();

		fm.click_ON_Save_Button();

		fm.write_Application_ID();

		fm.click_On_ok_Button();

		fm.click_On_next_Button();

	}

	// Firm_Informatiom
		
	
	@Test(priority = 2)

	public void verify_Firm_Informatiom() throws Exception {

		ExcelReader er = new ExcelReader(Excel_path, 0);

		fm.Select_Firm_Type(er.getExcelData(24, 1));

		fm.enter_Firm_Orgnization(er.getExcelData(24, 3));
		
		fm.Select_Address_Type(er.getExcelData(10, 2));

		// Registered Office Address

		/*
		 * fm.enter_Name_Of_Building(er.getExcelData(19, 1));
		 * 
		 * fm.enter_Name_Of_Street(er.getExcelData(19, 3));
		 * 
		 * fm.enter_Name_Of_Landmak(er.getExcelData(19, 5));
		 * 
		 * fm.Scroll_Down();
		 * 
		 * fm.Select_District(er.getExcelData(19, 7));
		 * 
		 * fm.Select_Taluka(er.getExcelData(19, 9));
		 * 
		 * fm.enter_Firm_pincode(er.getExcelData(24, 5));
		 */
		// Communication Details of Firm/Organization

		fm.enter_Firm_Mobile_No(er.getExcelData(24, 7));

		fm.enter_Firm_Email(er.getExcelData(24, 9));

		fm.Scroll_Down();

		// PAN & GST Details

		fm.enter_Applicant_Pannumber(er.getExcelData(17, 13));
		// 1nd partner_Name
/*
		fm.Select_Number_Of_Partner(er.getExcelData(28, 1));

		fm.enter_name_of_Partner(er.getExcelData(28, 3));

		fm.enter_res_ADD(er.getExcelData(28, 5));

		fm.enter_part_mob_Num(er.getExcelData(28, 7));

		fm.enter_part_Email(er.getExcelData(28, 9));

		fm.click_On_Add_Button();

		Thread.sleep(5000);

		/* fm.click_On_ok_Button(); */

		// 2 nd partner_Name
		
		/*
		fm.enter_name_of_Partner(er.getExcelData(28, 3));

		fm.enter_res_ADD(er.getExcelData(28, 5));

		fm.enter_part_mob_Num(er.getExcelData(28, 7));

		fm.enter_part_Email(er.getExcelData(28, 9));

		fm.click_On_Add_Button();
		
		*/

		fm.Scroll_Down();

		fm.click_On_Self_Declaration();

		fm.click_ON_Save_Button();

		fm.click_On_ok_Button();

		fm.click_On_next_Button();

	}
	@Test(priority = 3)

	public void verify_Sales_Addres_details() throws Exception {

		ExcelReader er = new ExcelReader(Excel_path, 0);
       
		fm.enter_Name_Of_sales_Building(er.getExcelData(19, 1));

		fm.enter_Name_Of_sales_Street(er.getExcelData(19, 3));

		fm.enter_Name_Of_sales_Landmak(er.getExcelData(19, 5));

		fm.Scroll_Down();

		fm.Select_District(er.getExcelData(19, 7));

		fm.Select_Taluka(er.getExcelData(19, 9));

		fm.enter_sales_pincode(er.getExcelData(34, 1));

		fm.Select_sales_Ownership_Details_of_Business(er.getExcelData(34, 3));

		fm.Scroll_Down();

		fm.enter_latitude(er.getExcelData(34, 5));

		fm.enter_longitude(er.getExcelData(34, 7));

		fm.enter_salespart_mob_Num(er.getExcelData(28, 7));

		fm.enter_part_Email(er.getExcelData(28, 9));
		fm.enter_Optional_Email_Id_Email(er.getExcelData(34, 9));

		fm.Scroll_Down();

		fm.enter_Length(er.getExcelData(36, 1));

		fm.enter_Breadh(er.getExcelData(36, 3));

		fm.enter_Height(er.getExcelData(36, 5));

		fm.enter_Area(er.getExcelData(36, 7));

		fm.enter_Storage(er.getExcelData(36, 9));

		fm.enter_floor(er.getExcelData(36, 11));

		fm.enter_Walls(er.getExcelData(36, 13));

		
		fm.Scroll_Down();
		
		fm.Scroll_Down();
		fm.click_ON_salesAuthentication();

		//fm.click_On_Close_Button();
		fm.click_ON_sales_add_Button();

		fm.Scroll_Down();

		fm.click_On_ok_Button();

		fm.click_ON_Res_Save_Button();

		fm.click_on_yes_Button();

		fm.click_On_ok_Button();

		fm.click_On_next_Button();

		/*
		 * fm.click_On_ok_Button();
		 * 
		 * fm.click_On_next_Button();
		 */
	}

	
	@Test(priority = 4)

		public void verify_Storage_Details() throws Exception {

			ExcelReader er = new ExcelReader(Excel_path, 0);
			 fm.Select_Storage_Address(er.getExcelData(10, 3));
			fm.Scroll_Down();
			
			fm.Scroll_Down();
			fm.click_ON_salesAuthentication();
			fm.Scroll_Down();
			fm.click_ON_Storage_add_Button();

			fm.Scroll_Down();

			fm.click_On_ok_Button();

			fm.click_ON_Res_Save_Button();

			fm.click_on_yes_Button();

			fm.click_On_ok_Button();

			fm.click_On_next_Button();

			
		}
//  Responsible Person Details

	//@Test(priority = 3)

	public void verify_Responsibl_Perso_Details() throws Exception {

		ExcelReader er = new ExcelReader(Excel_path, 0);
		
		fm.Select_Respncible_Person(er.getExcelData(30, 1));

       fm.enter_Applicant_Addhar(er.getExcelData(17, 11));
       fm.enter_Applicant_Pannumber(er.getExcelData(17, 13));

		fm.Scroll_Down();

		fm.Select_Responsible_Person_OfficeAddress(er.getExcelData(32, 1));

		fm.enter_Scope(er.getExcelData(32, 3));

		fm.Scroll_Down();

		fm.Scroll_Down();

		// // Responsible Person Details : save as add button
		fm.click_ON_Save_Button();

		fm.click_On_ok_Button();

		fm.Scroll_Down();

		fm.click_ON_Res_Save_Button();

		fm.click_on_yes_Button();

		fm.click_On_ok_Button();

		fm.click_On_next_Button();
	}
	//@Test(priority = 4)

	public void verify_Grade_Type_Details() throws Exception {
		ExcelReader er = new ExcelReader(Excel_path, 0);

		fm.Select_State(er.getExcelData(3, 1));
		fm.click_on_checkbox_Grade9();
		fm.click_ON_ADD_Grade_Button();
		
		fm.click_On_ok_Button();
		
		fm.click_ON_Res_Save_Button();

		fm.click_on_yes_Button();
		fm.click_On_ok_Button();
		
		fm.click_On_next_Button();

		
		
	}
	// Sales Address Details
	//@Test(priority = 5)

	public void verify_Place_of_Manufacturer_Details_() throws Exception {

		ExcelReader er = new ExcelReader(Excel_path, 0);

		fm.enter_Name_Of_Building(er.getExcelData(19, 1));

		fm.enter_Name_Of_Street(er.getExcelData(19, 3));

		fm.enter_Name_Of_Landmak(er.getExcelData(19, 5));

		fm.Scroll_Down();

		fm.Select_District(er.getExcelData(19, 7));

		fm.Select_Taluka(er.getExcelData(19, 9));

		fm.enter_sales_pincode(er.getExcelData(34, 1));

		fm.Select_Ownership_Details_of_Business(er.getExcelData(34, 3));

		fm.Scroll_Down();

		fm.enter_latitude(er.getExcelData(34, 5));

		fm.enter_longitude(er.getExcelData(34, 7));

		fm.enter_part_mob_Num(er.getExcelData(28, 7));
/*
		fm.enter_part_Email(er.getExcelData(28, 9));
		fm.enter_Optional_Email_Id_Email(er.getExcelData(34, 9));

		fm.Scroll_Down();

		fm.enter_Length(er.getExcelData(36, 1));

		fm.enter_Breadh(er.getExcelData(36, 3));

		fm.enter_Height(er.getExcelData(36, 5));

		fm.enter_Area(er.getExcelData(36, 7));

		fm.enter_Storage(er.getExcelData(36, 9));

		fm.enter_floor(er.getExcelData(36, 11));

		fm.enter_Walls(er.getExcelData(36, 13));

		fm.click_ON_Authentication();

		fm.click_On_Close_Button();
		
		*/
		//fm.click_ON_sales_add_Button();
		
		fm.click_On_Add_Button();

		fm.Scroll_Down();
		
		

		fm.click_On_ok_Button();

		fm.click_ON_Res_Save_Button();

		fm.click_on_yes_Button();

		fm.click_On_ok_Button();

		fm.click_On_next_Button();

		/*
		 * fm.click_On_ok_Button();
		 * 
		 * fm.click_On_next_Button();
		 */
	}
	
	//  Production_Machinery_Details
	//@Test(priority = 6)
	public void verify_Production_Machinery_Details() throws Exception {

		ExcelReader er = new ExcelReader(Excel_path, 0);
		fm.Select_Place_of_Manufacture(er.getExcelData(2, 1));
		
		fm.enter_Machinery_Name(er.getExcelData(2, 3));
		
		fm.click_on_Date_of_Purchase();

		fm.select_Month(er.getExcelData(43, 1));

		fm.select_year(er.getExcelData(44, 1));

		fm.select_Date();
		
		fm.click_On_Add_Button();

		fm.Scroll_Down();
		
		

		fm.click_On_ok_Button();
		
		fm.click_ON_Res_Save_Button();

		fm.click_on_yes_Button();

		fm.click_On_ok_Button();

		fm.click_On_next_Button();

		
	}
	//@Test(priority = 7)
	public void verify_Laboratory_Equipment_Details() throws Exception {

		ExcelReader er = new ExcelReader(Excel_path, 0);
		
		fm.Select_Place_of_Manufacture(er.getExcelData(2, 1));
		
		fm.Select_Type_of_Manufactured_Fertilizer(er.getExcelData(2, 5));
		
		fm.enter_labEquipment_Machinery_Name(er.getExcelData(2, 3));
		
		fm.enter_Number_Of_Equipment_Name(er.getExcelData(2, 7));
		
		fm.click_on_Date_of_PurchaseLAB();
		
		fm.select_Month(er.getExcelData(43, 1));

		fm.select_year(er.getExcelData(44, 1));

		fm.select_Date();
		
		fm.click_On_Add_Button();

		fm.Scroll_Down();
		
		

		fm.click_On_ok_Button();
		
		fm.click_ON_Res_Save_Button();

		fm.click_on_yes_Button();

		fm.click_On_ok_Button();

		fm.click_On_next_Button();
		
		
	}
	
	//@Test(priority = 8)
	public void verify_MPCB_Certificate_Details() throws Exception {

		ExcelReader er = new ExcelReader(Excel_path, 0);
		
		fm.Select_Place_of_Manufacture(er.getExcelData(2, 1));
		
		fm.enter_Number_MPCB(er.getExcelData(1, 2));
		
		fm.click_on_MPCB_Consent_Date();
		
		fm.select_Month(er.getExcelData(43, 1));

		fm.select_year(er.getExcelData(44, 1));

		fm.select_Date();
		
		fm.click_on_MPCB_Consent_valid_up_toDate();
		fm.select_Month(er.getExcelData(43, 2));

		fm.select_year(er.getExcelData(46,1));

		fm.select_Date();
		
		fm.enter_Dic_No(er.getExcelData(1,4));
		
		fm.click_on_Date_Of_Issue();
		fm.select_Month(er.getExcelData(43, 1));

		fm.select_year(er.getExcelData(44, 1));

		fm.select_Date();
		
		
		fm.click_On_Add_Button();

		fm.Scroll_Down();
		
		

		fm.click_On_ok_Button();
		
		fm.click_ON_Res_Save_Button();

		fm.click_on_yes_Button();

		fm.click_On_ok_Button();

		fm.click_On_next_Button();
		
		
	
		
		
	}

	
	//@Test(priority = 9)

	public void verify_Production_Supervisor() throws Exception {

		ExcelReader er = new ExcelReader(Excel_path, 0);
		fm.Select_Supervisor(er.getExcelData(30, 1));
		fm.Select_Place_of_Manufacture(er.getExcelData(2, 1));
		
		fm.click_On_Add_Button();

		fm.Scroll_Down();
		
		

		fm.click_On_ok_Button();
		
		fm.click_ON_Res_Save_Button();

		fm.click_on_yes_Button();

		fm.click_On_ok_Button();

		fm.click_On_next_Button();
		

	}
	// Storage Address Details
	//@Test(priority = 10)

	public void verify_Storag_Address_Details_etails() throws Exception {

		ExcelReader er = new ExcelReader(Excel_path, 0);
		
		fm.Select_Place_of_Manufacture(er.getExcelData(2, 1));

		fm.enter_Name_Of_Building(er.getExcelData(19, 1));

		fm.enter_Name_Of_Street(er.getExcelData(19, 3));

		fm.enter_Name_Of_Landmak(er.getExcelData(19, 5));

		fm.Scroll_Down();

		fm.Select_District(er.getExcelData(19, 7));

		fm.Select_Taluka(er.getExcelData(19, 9));

		fm.enter_placeOfStorageAddress_Pincode(er.getExcelData(34, 1));

		fm.Select_Ownership_Details_of_Premise(er.getExcelData(38, 1));

		fm.Scroll_Down();

		fm.enter_latitude(er.getExcelData(34, 5));

		fm.enter_longitude(er.getExcelData(34, 7));
		
		fm.Scroll_Down();
		fm.enter_storage_mob_Num(er.getExcelData(28, 7));
		fm.enter_Storage_Email(er.getExcelData(28, 9));
		fm.enter_Optional_storage_Email_Id(er.getExcelData(34, 9));
		
		

		fm.Scroll_Down();

		
		
		fm.click_On_Add_Button();

		
		
		

		fm.click_On_ok_Button();
		
		fm.click_ON_Res_Save_Button();

		fm.click_on_yes_Button();

		fm.click_On_ok_Button();
		
		fm.click_On_Final_Submit_Button();
		
		fm.click_On_ok_Button();

		//fm.click_On_next_Button();
		

		//fm.enter_Length(er.getExcelData(36, 1));

	//	fm.enter_Breadh(er.getExcelData(36, 3));

	//	fm.enter_Height(er.getExcelData(36, 5));

	//	fm.enter_Area(er.getExcelData(36, 7));

	/*
	 * fm.enter_Storage(er.getExcelData(36, 9));
	 * 
	 * fm.enter_floor(er.getExcelData(36, 11));
	 * 
	 * fm.enter_Walls(er.getExcelData(36, 13));
	 * 
	 * fm.click_ON_Authentication();
	 * 
	 * fm.click_On_Storage_close_Button();
	 */

	/*
	 * fm.click_On_Add_Button();
	 * 
	 * fm.Scroll_Down();
	 * 
	 * fm.click_On_ok_Button();
	 * 
	 * fm.click_ON_Res_Save_Button();
	 * 
	 * fm.click_on_yes_Button();
	 * 
	 * fm.click_On_ok_Button();
	 * 
	 * fm.click_On_next_Button();
	 */

	}

	@Test(priority = 5)

	public void verify_Crop_Varieties__Details() throws Exception {

		ExcelReader er = new ExcelReader(Excel_path, 0);

		fm.enter_Fertilizer_type_Grade_License(er.getExcelData(40, 1));

		fm.click_On_Send_Request();

		fm.click_On_ok_Button();

		//fm.click_on_Fertilizer_Dealer_License_Tab();
		
		//fm.click_on_Manuafacture_License_Tab();
		
		fm.click_On_Menu();
		 fm.click_on_Cotton_Dealer_License_Tab();
	//	fm.click_On_PendingO();
		
		//fm.click_On_sendingo();
		 
		 fm.click_sendpc_Certificat();

		fm.enter_Application_ID_For_Cotton(er.getExcelData(22, 1));
		
		fm.click_On_Search();
		fm.Click_Send_PCbtn();

		fm.click_On_Select_All();

		//fm.select_File(er.getExcelData(59, 1));
		//fm.select_File1(er.getExcelData(59, 1));
		//fm.click_On_Upload_Button();
		//fm.click_On_Upload_Button1();


		//fm.handle_Alert();
		// manufacture
		//fm.select_File1(er.getExcelData(59, 1));
		
		//fm.click_On_Upload_Button1();
		
	//	fm.handle_Alert();

		/*
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
		 */
		// river.switchTo().alert().accept();

		/*
		 * Alert alert = driver.switchTo().alert();
		 * 
		 * alert.accept();
		 */

		fm.Scroll_Down();
		fm.click_On_Period_Button();

		fm.click_on_From_Date();

		fm.select_Month(er.getExcelData(43, 3));

		fm.select_year(er.getExcelData(44, 1));

		fm.select_Date();
		fm.click_on_To_Date();

		fm.select_Month(er.getExcelData(43, 3));

		fm.select_year(er.getExcelData(46,1));

		fm.select_Date();
		
		fm.enter_Auth_Person(er.getExcelData(47,1));
		
		fm.enter_design(er.getExcelData(47,3));
		fm.enter_Mob_Number_Form_O(er.getExcelData(48,1));
		fm.select_Authorized_person_Signature(er.getExcelData(60,1));
		
		
		//submit button
		fm.click_On_subnit_Button();
		
		
		// developer remove this alert
		//fm.handle_Alert();
		
		fm.click_On_ok_Button();
		
		
	}
	@Test(priority =6)

	public void verify_Dashboard_Search() throws Exception{

		ExcelReader er = new ExcelReader(Excel_path, 0);
		
		fm.click_On_Dashboard();
		
		fm.enter_Search_Application_Id(er.getExcelData(22,1));
		
		fm.click_On_view_Form();
		
		fm.click_On_crop_Variety_Details();
		
		fm.Scroll_Down();
		fm.Scroll_Down();
		
		fm.click_ON_Res_Save_Button();
		
		//fm.click_on_yes_Button();

		fm.click_On_ok_Button();
		
		fm.click_On_Final_Submit_Button();
		
		fm.handle_Alert();
		
		fm.click_On_ok_Button();

}
	
	
}



