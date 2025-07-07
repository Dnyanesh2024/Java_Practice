package test.service_Fertilizer_Dealer_License_State;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import UploadDoc.UploadDocumentsandPayment;
import pages.service_Fertilizer_Dealer_License_State.Fertilizer_NewLicense_District_Level;
import pages.service_Fertilizer_Dealer_License_State.Fertilizer_NewLicense_State_Level;
import pages_Eparwana.Login_Page;
import utility_Earwana.BaseClassA;
import utility_Earwana.ExcelReader;

public class Fertilizer_NewLicense_District_Level_Test extends BaseClassA {
	Login_Page lp;
	//Fertilizer_NewLicense_State_Level fdistrict;
	
	Fertilizer_NewLicense_District_Level fdistrict;
	
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

		fdistrict = new Fertilizer_NewLicense_District_Level(driver);
		

		up= new UploadDocumentsandPayment(driver);
		

		fdistrict.click_on_Fertilizer_Dealer_License_Tab();
		fdistrict.click_On_New_License_district_Level();

		fdistrict.click_On_Close_Button();

	}

	@Test(priority = 1)

	public void verify_Applicant_Informatiom() throws Exception

	{

		ExcelReader er = new ExcelReader(Excel_path, 0);

		//fdistrict.click_On_non_Selected_District();

		Thread.sleep(2000);

		//fdistrict.click_On_District_Checkbox();
		
		fdistrict.Select_district(er.getExcelData(4, 2));

		fdistrict.Select_lincenceHolder(er.getExcelData(13, 1));

		fdistrict.Select_License_Sub_Type(er.getExcelData(14, 1));

		fdistrict.Select_LicenseCat();

		fdistrict.Select_LicenseCategory();
		//fdistrict.Select_LicenseCat();

		fdistrict.enter_Applicant_Name(er.getExcelData(17, 1));

		fdistrict.enter_Applicant_Middle_Name(er.getExcelData(17, 3));

		fdistrict.enter_Applicant_Last_Name(er.getExcelData(17, 5));

		fdistrict.enter_Date_Of_Birth();

		fdistrict.enter_Applicant_Educational_Qualification(er.getExcelData(17, 7));

		fdistrict.enter_Applicant_Designation(er.getExcelData(17, 9));

		fdistrict.enter_Applicant_Addhar(er.getExcelData(17, 11));

		fdistrict.enter_Applicant_Pannumber(er.getExcelData(17, 13));

		/// Applicant’s Residential Address

		fdistrict.enter_Name_Of_Building(er.getExcelData(19, 1));

		fdistrict.enter_Name_Of_Street(er.getExcelData(19, 3));

		fdistrict.enter_Name_Of_Landmak(er.getExcelData(19, 5));

		fdistrict.Scroll_Down();

		fdistrict.Select_District(er.getExcelData(19, 7));

		fdistrict.Select_Taluka(er.getExcelData(19, 9));

		fdistrict.enter_pincode(er.getExcelData(19, 11));

		/// Communication Details of Applicant

		fdistrict.enter_Mobile_No(er.getExcelData(21, 1));

		fdistrict.enter_Email_ID(er.getExcelData(21, 3));

		fdistrict.Scroll_Down();

		fdistrict.click_ON_Save_Button();

		fdistrict.write_Application_ID();

		fdistrict.click_On_ok_Button();

		fdistrict.click_On_next_Button();

	}

	// Firm_Informatiom
	@Test(priority = 2)

	public void verify_Firm_Informatiom() throws Exception {

		ExcelReader er = new ExcelReader(Excel_path, 0);

		fdistrict.Select_Firm_Type(er.getExcelData(24, 1));

		fdistrict.enter_Firm_Orgnization(er.getExcelData(24, 3));

		// Registered Office Address

		fdistrict.enter_Name_Of_Building(er.getExcelData(19, 1));

		fdistrict.enter_Name_Of_Street(er.getExcelData(19, 3));

		fdistrict.enter_Name_Of_Landmak(er.getExcelData(19, 5));

		fdistrict.Scroll_Down();

		fdistrict.Select_District(er.getExcelData(19, 7));

		fdistrict.Select_Taluka(er.getExcelData(19, 9));

		fdistrict.enter_Firm_pincode(er.getExcelData(24, 5));

		// Communication Details of Firm/Organization

		fdistrict.enter_Firm_Mobile_No(er.getExcelData(24, 7));

		fdistrict.enter_Firm_Email(er.getExcelData(24, 9));

		fdistrict.Scroll_Down();

		// PAN & GST Details

		fdistrict.enter_Applicant_Pannumber(er.getExcelData(17, 13));
		// 1nd partner_Name

		fdistrict.Select_Number_Of_Partner(er.getExcelData(28, 1));

		fdistrict.enter_name_of_Partner(er.getExcelData(28, 3));

		fdistrict.enter_res_ADD(er.getExcelData(28, 5));

		fdistrict.enter_part_mob_Num(er.getExcelData(28, 7));

		fdistrict.enter_part_Email(er.getExcelData(28, 9));

		fdistrict.click_On_Add_Button();

		Thread.sleep(5000);

		/* fdistrict.click_On_ok_Button(); */

		// 2 nd partner_Name
		fdistrict.enter_name_of_Partner(er.getExcelData(28, 3));

		fdistrict.enter_res_ADD(er.getExcelData(28, 5));

		fdistrict.enter_part_mob_Num(er.getExcelData(28, 7));

		fdistrict.enter_part_Email(er.getExcelData(28, 9));

		fdistrict.click_On_Add_Button();

		fdistrict.Scroll_Down();

		fdistrict.click_On_Self_Declaration();

		fdistrict.click_ON_Save_Button();

		fdistrict.click_On_ok_Button();

		fdistrict.click_On_next_Button();

	}
//  Responsible Person Details

	@Test(priority = 3)

	public void verify_Responsibl_Perso_Details() throws Exception {

		ExcelReader er = new ExcelReader(Excel_path, 0);
		
		fdistrict.Select_Respncible_Person(er.getExcelData(30, 1));

fdistrict.enter_Applicant_Addhar(er.getExcelData(17, 11));
fdistrict.enter_Applicant_Pannumber(er.getExcelData(17, 13));

		fdistrict.Scroll_Down();

		fdistrict.Select_Responsible_Person_OfficeAddress(er.getExcelData(32, 1));

		fdistrict.enter_Scope(er.getExcelData(32, 3));

		fdistrict.Scroll_Down();

		fdistrict.Scroll_Down();

		// // Responsible Person Details : save as add button
		fdistrict.click_ON_Save_Button();

		fdistrict.click_On_ok_Button();

		fdistrict.Scroll_Down();

		fdistrict.click_ON_Res_Save_Button();

		fdistrict.click_on_yes_Button();

		fdistrict.click_On_ok_Button();

		fdistrict.click_On_next_Button();
	}

	// Sales Address Details
	@Test(priority = 4)

	public void verify_Sales_Addres_etails() throws Exception {

		ExcelReader er = new ExcelReader(Excel_path, 0);

		fdistrict.enter_Name_Of_Building(er.getExcelData(19, 1));

		fdistrict.enter_Name_Of_Street(er.getExcelData(19, 3));

		fdistrict.enter_Name_Of_Landmak(er.getExcelData(19, 5));

		fdistrict.Scroll_Down();

		fdistrict.Select_District(er.getExcelData(19, 7));

		fdistrict.Select_Taluka(er.getExcelData(19, 9));

		fdistrict.enter_sales_pincode(er.getExcelData(34, 1));

		fdistrict.Select_Ownership_Details_of_Business(er.getExcelData(34, 3));

		fdistrict.Scroll_Down();

		fdistrict.enter_latitude(er.getExcelData(34, 5));

		fdistrict.enter_longitude(er.getExcelData(34, 7));

		fdistrict.enter_part_mob_Num(er.getExcelData(28, 7));

		fdistrict.enter_part_Email(er.getExcelData(28, 9));
		fdistrict.enter_Optional_Email_Id_Email(er.getExcelData(34, 9));

		fdistrict.Scroll_Down();

		fdistrict.enter_Length(er.getExcelData(36, 1));

		fdistrict.enter_Breadh(er.getExcelData(36, 3));

		fdistrict.enter_Height(er.getExcelData(36, 5));

		fdistrict.enter_Area(er.getExcelData(36, 7));

		fdistrict.enter_Storage(er.getExcelData(36, 9));

		fdistrict.enter_floor(er.getExcelData(36, 11));

		fdistrict.enter_Walls(er.getExcelData(36, 13));

		fdistrict.click_ON_Authentication();

		fdistrict.click_On_Close_Button();
		fdistrict.click_ON_sales_add_Button();

		fdistrict.Scroll_Down();

		fdistrict.click_On_ok_Button();

		fdistrict.click_ON_Res_Save_Button();

		fdistrict.click_on_yes_Button();

		fdistrict.click_On_ok_Button();

		fdistrict.click_On_next_Button();

		/*
		 * fdistrict.click_On_ok_Button();
		 * 
		 * fdistrict.click_On_next_Button();
		 */
	}

	// Storage Address Details
	@Test(priority = 5)

	public void verify_Storag_Address_Details_etails() throws Exception {

		ExcelReader er = new ExcelReader(Excel_path, 0);

		fdistrict.enter_Name_Of_Building(er.getExcelData(19, 1));

		fdistrict.enter_Name_Of_Street(er.getExcelData(19, 3));

		fdistrict.enter_Name_Of_Landmak(er.getExcelData(19, 5));

		fdistrict.Scroll_Down();

		fdistrict.Select_District(er.getExcelData(19, 7));

		fdistrict.Select_Taluka(er.getExcelData(19, 9));

		fdistrict.enter_sales_pincode(er.getExcelData(34, 1));

		fdistrict.Select_Storage_Ownership_Details_of_Business(er.getExcelData(38, 1));

		fdistrict.Scroll_Down();

		fdistrict.enter_latitude(er.getExcelData(34, 5));

		fdistrict.enter_longitude(er.getExcelData(34, 7));
		
		fdistrict.enter_part_mob_Num(er.getExcelData(28, 7));

		fdistrict.enter_part_Email(er.getExcelData(28, 9));
		fdistrict.enter_Optional_Email_Id_Email(er.getExcelData(34, 9));

		fdistrict.Scroll_Down();

		fdistrict.enter_Length(er.getExcelData(36, 1));

		fdistrict.enter_Breadh(er.getExcelData(36, 3));

		fdistrict.enter_Height(er.getExcelData(36, 5));

		fdistrict.enter_Area(er.getExcelData(36, 7));

		fdistrict.enter_Storage(er.getExcelData(36, 9));

		fdistrict.enter_floor(er.getExcelData(36, 11));

		fdistrict.enter_Walls(er.getExcelData(36, 13));

		fdistrict.click_ON_Authentication();

		fdistrict.click_On_Storage_close_Button();

		fdistrict.click_On_Add_Button();

		fdistrict.Scroll_Down();

		fdistrict.click_On_ok_Button();

		fdistrict.click_ON_Res_Save_Button();

		fdistrict.click_on_yes_Button();

		fdistrict.click_On_ok_Button();

		fdistrict.click_On_next_Button();

	}

	@Test(priority = 6)

	public void verify_Fertilizer_type_Grade() throws Exception {

		ExcelReader er = new ExcelReader(Excel_path, 0);

		fdistrict.enter_Fertilizer_type_Grade_License(er.getExcelData(40, 1));

		fdistrict.click_On_Send_Request();

		fdistrict.click_On_ok_Button();

		//fdistrict.click_on_Fertilizer_Dealer_License_Tab();
		
		fdistrict.click_on_Manuafacture_License_Tab();

	//	fdistrict.click_On_PendingO();
		
		fdistrict.click_On_sendingo();

		fdistrict.enter_Application_ID(er.getExcelData(22, 1));
		fdistrict.Click_Send_PCbtn();

		fdistrict.click_On_Select_All();

		fdistrict.select_File(er.getExcelData(59, 1));
		//fdistrict.select_File1(er.getExcelData(59, 1));
		fdistrict.click_On_Upload_Button();
		//fdistrict.click_On_Upload_Button1();


		fdistrict.handle_Alert();
		// manufacture
		//fdistrict.select_File1(er.getExcelData(59, 1));
		
		//fdistrict.click_On_Upload_Button1();
		
	//	fdistrict.handle_Alert();

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

		fdistrict.Scroll_Down();
		fdistrict.click_On_Period_Button();

		fdistrict.click_on_From_Date();

		fdistrict.select_Month(er.getExcelData(43, 1));

		fdistrict.select_year(er.getExcelData(44, 1));

		fdistrict.select_Date();
		fdistrict.click_on_To_Date();

		fdistrict.select_Month(er.getExcelData(43, 1));

		fdistrict.select_year(er.getExcelData(46,1));

		fdistrict.select_Date();
		
		fdistrict.enter_Auth_Person(er.getExcelData(47,1));
		
		fdistrict.enter_design(er.getExcelData(47,3));
		
		fdistrict.select_Authorized_person_Signature(er.getExcelData(60,1));
		
		fdistrict.enter_Mob_Number_Form_O(er.getExcelData(48,1));
		//submit button
		fdistrict.click_On_Add_Button();
		
		
		// developer remove this alert
		//fdistrict.handle_Alert();
		
		fdistrict.click_On_ok_Button();
		
		
	}
	@Test(priority =7)

	public void verify_Dashboard_Search() throws Exception{

		ExcelReader er = new ExcelReader(Excel_path, 0);
		
		fdistrict.click_On_Dashboard();
		
		fdistrict.enter_Search_Application_Id(er.getExcelData(22,1));
		
		fdistrict.click_On_view_Form();
		
		fdistrict.click_On_Fertilizer_Type_and_Grade();
		
		fdistrict.Scroll_Down();
		fdistrict.Scroll_Down();
		
		fdistrict.click_ON_Res_Save_Button();
		
		fdistrict.click_on_yes_Button();

		fdistrict.click_On_ok_Button();
		
		fdistrict.click_On_Final_Submit_Button();
		
		fdistrict.click_On_ok_Button();

}
	
}
