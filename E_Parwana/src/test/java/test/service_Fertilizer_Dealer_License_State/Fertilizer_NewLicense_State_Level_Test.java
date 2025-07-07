package test.service_Fertilizer_Dealer_License_State;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import UploadDoc.UploadDocumentsandPayment;
import pages.service_Fertilizer_Dealer_License_State.Fertilizer_NewLicense_State_Level;
import pages_Eparwana.Login_Page;
import utility_Earwana.BaseClassA;
import utility_Earwana.ExcelReader;

public class Fertilizer_NewLicense_State_Level_Test extends BaseClassA {
	Login_Page lp;
	Fertilizer_NewLicense_State_Level fns;
	
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

		fns = new Fertilizer_NewLicense_State_Level(driver);
		

		up= new UploadDocumentsandPayment(driver);
		

		fns.click_on_Fertilizer_Dealer_License_Tab();
		fns.click_On_New_License_State_Level();

		fns.click_On_Close_Button();

	}

	@Test(priority = 1)

	public void verify_Applicant_Informatiom() throws Exception

	{

		ExcelReader er = new ExcelReader(Excel_path, 0);

		fns.click_On_non_Selected_District();

		Thread.sleep(2000);

		fns.click_On_District_Checkbox();

		fns.Select_lincenceHolder(er.getExcelData(13, 1));

		fns.Select_License_Sub_Type(er.getExcelData(14, 1));

		fns.Select_LicenseCat();

		fns.Select_LicenseCategory();
		fns.Select_LicenseCat();

		fns.enter_Applicant_Name(er.getExcelData(17, 1));

		fns.enter_Applicant_Middle_Name(er.getExcelData(17, 3));

		fns.enter_Applicant_Last_Name(er.getExcelData(17, 5));

		fns.enter_Date_Of_Birth();

		fns.enter_Applicant_Educational_Qualification(er.getExcelData(17, 7));

		fns.enter_Applicant_Designation(er.getExcelData(17, 9));

		fns.enter_Applicant_Addhar(er.getExcelData(17, 11));

		fns.enter_Applicant_Pannumber(er.getExcelData(17, 13));

		/// Applicant’s Residential Address

		fns.enter_Name_Of_Building(er.getExcelData(19, 1));

		fns.enter_Name_Of_Street(er.getExcelData(19, 3));

		fns.enter_Name_Of_Landmak(er.getExcelData(19, 5));

		fns.Scroll_Down();

		fns.Select_District(er.getExcelData(19, 7));

		fns.Select_Taluka(er.getExcelData(19, 9));

		fns.enter_pincode(er.getExcelData(19, 11));

		/// Communication Details of Applicant

		fns.enter_Mobile_No(er.getExcelData(21, 1));

		fns.enter_Email_ID(er.getExcelData(21, 3));

		fns.Scroll_Down();

		fns.click_ON_Save_Button();

		fns.write_Application_ID();

		fns.click_On_ok_Button();

		fns.click_On_next_Button();

	}

	// Firm_Informatiom
	@Test(priority = 2)

	public void verify_Firm_Informatiom() throws Exception {

		ExcelReader er = new ExcelReader(Excel_path, 0);

		fns.Select_Firm_Type(er.getExcelData(24, 1));

		fns.enter_Firm_Orgnization(er.getExcelData(24, 3));

		// Registered Office Address

		fns.enter_Name_Of_Building(er.getExcelData(19, 1));

		fns.enter_Name_Of_Street(er.getExcelData(19, 3));

		fns.enter_Name_Of_Landmak(er.getExcelData(19, 5));

		fns.Scroll_Down();

		fns.Select_District(er.getExcelData(19, 7));

		fns.Select_Taluka(er.getExcelData(19, 9));

		fns.enter_Firm_pincode(er.getExcelData(24, 5));

		// Communication Details of Firm/Organization

		fns.enter_Firm_Mobile_No(er.getExcelData(24, 7));

		fns.enter_Firm_Email(er.getExcelData(24, 9));

		fns.Scroll_Down();

		// PAN & GST Details

		fns.enter_Applicant_Pannumber(er.getExcelData(17, 13));
		// 1nd partner_Name

		fns.Select_Number_Of_Partner(er.getExcelData(28, 1));

		fns.enter_name_of_Partner(er.getExcelData(28, 3));

		fns.enter_res_ADD(er.getExcelData(28, 5));

		fns.enter_part_mob_Num(er.getExcelData(28, 7));

		fns.enter_part_Email(er.getExcelData(28, 9));

		fns.click_On_Add_Button();

		Thread.sleep(5000);

		/* fns.click_On_ok_Button(); */

		// 2 nd partner_Name
		fns.enter_name_of_Partner(er.getExcelData(28, 3));

		fns.enter_res_ADD(er.getExcelData(28, 5));

		fns.enter_part_mob_Num(er.getExcelData(28, 7));

		fns.enter_part_Email(er.getExcelData(28, 9));

		fns.click_On_Add_Button();

		fns.Scroll_Down();

		fns.click_On_Self_Declaration();

		fns.click_ON_Save_Button();

		fns.click_On_ok_Button();

		fns.click_On_next_Button();

	}
//  Responsible Person Details

	@Test(priority = 3)

	public void verify_Responsibl_Perso_Details() throws Exception {

		ExcelReader er = new ExcelReader(Excel_path, 0);
		
		fns.Select_Respncible_Person(er.getExcelData(30, 1));

fns.enter_Applicant_Addhar(er.getExcelData(17, 11));
fns.enter_Applicant_Pannumber(er.getExcelData(17, 13));

		fns.Scroll_Down();

		fns.Select_Responsible_Person_OfficeAddress(er.getExcelData(32, 1));

		fns.enter_Scope(er.getExcelData(32, 3));

		fns.Scroll_Down();

		fns.Scroll_Down();

		// // Responsible Person Details : save as add button
		fns.click_ON_Save_Button();

		fns.click_On_ok_Button();

		fns.Scroll_Down();

		fns.click_ON_Res_Save_Button();

		fns.click_on_yes_Button();

		fns.click_On_ok_Button();

		fns.click_On_next_Button();
	}

	// Sales Address Details
	@Test(priority = 4)

	public void verify_Sales_Addres_etails() throws Exception {

		ExcelReader er = new ExcelReader(Excel_path, 0);

		fns.enter_Name_Of_Building(er.getExcelData(19, 1));

		fns.enter_Name_Of_Street(er.getExcelData(19, 3));

		fns.enter_Name_Of_Landmak(er.getExcelData(19, 5));

		fns.Scroll_Down();

		fns.Select_District(er.getExcelData(19, 7));

		fns.Select_Taluka(er.getExcelData(19, 9));

		fns.enter_sales_pincode(er.getExcelData(34, 1));

		fns.Select_Ownership_Details_of_Business(er.getExcelData(34, 3));

		fns.Scroll_Down();

		fns.enter_latitude(er.getExcelData(34, 5));

		fns.enter_longitude(er.getExcelData(34, 7));

		fns.enter_part_mob_Num(er.getExcelData(28, 7));

		fns.enter_part_Email(er.getExcelData(28, 9));
		fns.enter_Optional_Email_Id_Email(er.getExcelData(34, 9));

		fns.Scroll_Down();

		fns.enter_Length(er.getExcelData(36, 1));

		fns.enter_Breadh(er.getExcelData(36, 3));

		fns.enter_Height(er.getExcelData(36, 5));

		fns.enter_Area(er.getExcelData(36, 7));

		fns.enter_Storage(er.getExcelData(36, 9));

		fns.enter_floor(er.getExcelData(36, 11));

		fns.enter_Walls(er.getExcelData(36, 13));

		fns.click_ON_Authentication();

		fns.click_On_Close_Button();
		fns.click_ON_sales_add_Button();

		fns.Scroll_Down();

		fns.click_On_ok_Button();

		fns.click_ON_Res_Save_Button();

		fns.click_on_yes_Button();

		fns.click_On_ok_Button();

		fns.click_On_next_Button();

		/*
		 * fns.click_On_ok_Button();
		 * 
		 * fns.click_On_next_Button();
		 */
	}

	// Storage Address Details
	@Test(priority = 5)

	public void verify_Storag_Address_Details_etails() throws Exception {

		ExcelReader er = new ExcelReader(Excel_path, 0);

		fns.enter_Name_Of_Building(er.getExcelData(19, 1));

		fns.enter_Name_Of_Street(er.getExcelData(19, 3));

		fns.enter_Name_Of_Landmak(er.getExcelData(19, 5));

		fns.Scroll_Down();

		fns.Select_District(er.getExcelData(19, 7));

		fns.Select_Taluka(er.getExcelData(19, 9));

		fns.enter_sales_pincode(er.getExcelData(34, 1));

		fns.Select_Storage_Ownership_Details_of_Business(er.getExcelData(38, 1));

		fns.Scroll_Down();

		fns.enter_latitude(er.getExcelData(34, 5));

		fns.enter_longitude(er.getExcelData(34, 7));

		fns.Scroll_Down();

		fns.enter_Length(er.getExcelData(36, 1));

		fns.enter_Breadh(er.getExcelData(36, 3));

		fns.enter_Height(er.getExcelData(36, 5));

		fns.enter_Area(er.getExcelData(36, 7));

		fns.enter_Storage(er.getExcelData(36, 9));

		fns.enter_floor(er.getExcelData(36, 11));

		fns.enter_Walls(er.getExcelData(36, 13));

		fns.click_ON_Authentication();

		fns.click_On_Storage_close_Button();

		fns.click_On_Add_Button();

		fns.Scroll_Down();

		fns.click_On_ok_Button();

		fns.click_ON_Res_Save_Button();

		fns.click_on_yes_Button();

		fns.click_On_ok_Button();

		fns.click_On_next_Button();

	}

	@Test(priority = 6)

	public void verify_Fertilizer_type_Grade() throws Exception {

		ExcelReader er = new ExcelReader(Excel_path, 0);

		fns.enter_Fertilizer_type_Grade_License(er.getExcelData(40, 1));

		fns.click_On_Send_Request();

		fns.click_On_ok_Button();

		//fns.click_on_Fertilizer_Dealer_License_Tab();
		
		fns.click_on_Manuafacture_License_Tab();

	//	fns.click_On_PendingO();
		
		fns.click_On_sendingo();

		fns.enter_Application_ID(er.getExcelData(22, 1));
		fns.Click_Send_PCbtn();

		fns.click_On_Select_All();

		fns.select_File(er.getExcelData(59, 1));
		//fns.select_File1(er.getExcelData(59, 1));
		fns.click_On_Upload_Button();
		//fns.click_On_Upload_Button1();


		fns.handle_Alert();
		// manufacture
		//fns.select_File1(er.getExcelData(59, 1));
		
		//fns.click_On_Upload_Button1();
		
	//	fns.handle_Alert();

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

		fns.Scroll_Down();
		fns.click_On_Period_Button();

		fns.click_on_From_Date();

		fns.select_Month(er.getExcelData(43, 1));

		fns.select_year(er.getExcelData(44, 1));

		fns.select_Date();
		fns.click_on_To_Date();

		fns.select_Month(er.getExcelData(43, 1));

		fns.select_year(er.getExcelData(46,1));

		fns.select_Date();
		
		fns.enter_Auth_Person(er.getExcelData(47,1));
		
		fns.enter_design(er.getExcelData(47,3));
		
		fns.select_Authorized_person_Signature(er.getExcelData(60,1));
		
		fns.enter_Mob_Number_Form_O(er.getExcelData(48,1));
		//submit button
		fns.click_On_Add_Button();
		
		
		// developer remove this alert
		//fns.handle_Alert();
		
		fns.click_On_ok_Button();
		
		
	}
	@Test(priority =7)

	public void verify_Dashboard_Search() throws Exception{

		ExcelReader er = new ExcelReader(Excel_path, 0);
		
		fns.click_On_Dashboard();
		
		fns.enter_Search_Application_Id(er.getExcelData(22,1));
		
		fns.click_On_view_Form();
		
		fns.click_On_Fertilizer_Type_and_Grade();
		
		fns.Scroll_Down();
		fns.Scroll_Down();
		
		fns.click_ON_Res_Save_Button();
		
		fns.click_on_yes_Button();

		fns.click_On_ok_Button();
		
		fns.click_On_Final_Submit_Button();
		
		fns.click_On_ok_Button();

}
	
}
