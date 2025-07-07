package Scrutiny_Flow;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Scrutiny_pages_Eparwana.Scrutiny_login_Page_Eparwana;
import UploadDoc.UploadDocumentsandPayment;
import pages.service_Fertilizer_Dealer_License_State.Fertilizer_NewLicense_State_Level;
import pages_Eparwana.Login_Page;
import utility_Earwana.BaseClassA;
import utility_Earwana.ExcelReader;


public class Fertilizer_dir_agri_Send_back_To_CQCO_Test extends BaseClassA {
	SoftAssert assert1=new SoftAssert();
	public static String Excel_path;
	
	Login_Page lp;
	Fertilizer_NewLicense_State_Level fns;
	
	UploadDocumentsandPayment up;
	
	Scrutiny_login_Page_Eparwana Scrutiny_login_Page;
	@BeforeClass
	@Parameters("Excel_path")
	public void  dir_agri_login(String Excel_path1) throws Exception {
		
		//initializerBrowser();
		scrutinylogin();
	//	openNewTab_scrutiny();
		Excel_path=Excel_path1;
		ExcelReader er1 = new ExcelReader(Excel_path,1);
		
		    lp = new Login_Page(driver, Excel_path1);

			fns = new Fertilizer_NewLicense_State_Level(driver);
			
			up= new UploadDocumentsandPayment(driver);
			
		
	        Scrutiny_login_Page= new Scrutiny_login_Page_Eparwana(driver);
	    
	        Scrutiny_login_Page.enterUserName(er1.getExcelData(14, 1));// AO_fert
	    	
	    	
	        Scrutiny_login_Page.enterPassword(er1.getExcelData(12, 1));// Pass@123
	    	
	        Scrutiny_login_Page.Enter_Captha();
	    	
	    	
	         Scrutiny_login_Page.clickLoginButton();
	    	
		
}
	@Test(priority = 1)
	
	public void Scrutiny_dir_agri_Dashboard() throws Exception {
     ExcelReader er = new ExcelReader(Excel_path, 0);
		
		//fns.click_On_Dashboard();
		
		fns.enter_Search_Application_Id(er.getExcelData(22,1));
		
		Scrutiny_login_Page.click_On_Go_For_Scrutiny();
		
		ExcelReader er1 = new ExcelReader(Excel_path,1);
		// applicant information
		//Scrutiny_login_Page.enter_Remarks(er1.getExcelData(15, 1));
		//Scrutiny_login_Page.click_On_Recommend_For_Approval();
		
		Scrutiny_login_Page.click_On_save_Button();
		fns.click_On_ok_Button();
		//Scrutiny_login_Page.click_On_nextbtn();
		
		//firm information
		
		Scrutiny_login_Page.click_On_save_Button();
	//	Scrutiny_login_Page.click_on_firminfolink();
		//Scrutiny_login_Page.enter_Remarks(er1.getExcelData(15, 1));
		
		// Scrutiny_login_Page.click_On_Recommend_For_Approval();
		 fns.click_On_ok_Button(); 
		// Scrutiny_login_Page.click_On_nextbtn(); //
		 // Responsible Person Details
		 
		 Scrutiny_login_Page.click_On_save_Button();
		 // Scrutiny_login_Page. click_on_firm_Responsible_Person_link();
		//  Scrutiny_login_Page.enter_Remarks(er1.getExcelData(15, 1));
		  //Scrutiny_login_Page.click_On_Recommend_For_Approval();
		  fns.click_On_ok_Button(); 
		//  Scrutiny_login_Page.click_On_nextbtn();
		  
		 
		  
		  //Sales Address Details
		  
		  Scrutiny_login_Page.click_On_save_Button();
		 // Scrutiny_login_Page. click_on_Sales_Address_Details_link();
		  
		//  Scrutiny_login_Page.enter_Remarks(er1.getExcelData(15, 1));
		//  Scrutiny_login_Page.click_On_Recommend_For_Approval();
		  fns.click_On_ok_Button(); 
		//  Scrutiny_login_Page.click_On_nextbtn();
		  
		  // storage Address Details
		  
		  Scrutiny_login_Page.click_On_save_Button();
		//  Scrutiny_login_Page.click_on_Storage_Address_Details_link();
		//  Scrutiny_login_Page.enter_Remarks(er1.getExcelData(15, 1));
		//  Scrutiny_login_Page.click_On_Recommend_For_Approval();
		  fns.click_On_ok_Button();
		 // Scrutiny_login_Page.click_On_nextbtn();
		  
		  //  Fertilizer Type and Grade
		
		  Scrutiny_login_Page.click_on_Checkbox();
		  
		  Scrutiny_login_Page.click_On_save_Button();
		  
		//  Scrutiny_login_Page.enter_Remarks(er1.getExcelData(15, 1));
		  //Scrutiny_login_Page.click_On_Recommend_For_Approval();
		  fns.click_On_ok_Button();
		  
		  //  Gras Payment
		  
		  Scrutiny_login_Page.click_On_save_Button();
		  
		
		  
		//  Scrutiny_login_Page.enter_Remarks(er1.getExcelData(15, 1));
		//  Scrutiny_login_Page.click_On_Recommend_For_Approval();
		  fns.click_On_ok_Button();
		  
		  Scrutiny_login_Page.click_On_Send_back_to_CQCO();
		  
		  fns.click_On_ok_Button();
		  
		//  Scrutiny_login_Page.click_On_final_Recommend_For_Approval();
		  
		//  fns.click_On_ok_Button();
	}
	
	@AfterClass
	
	public void tear_Down() {
		
	//	driver.quit();
	}
}
