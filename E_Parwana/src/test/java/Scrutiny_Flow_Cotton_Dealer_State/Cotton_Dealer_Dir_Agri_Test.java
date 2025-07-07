package Scrutiny_Flow_Cotton_Dealer_State;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Scrutiny_Flow_Cotton_Dealer_Pages.Scrutiny_login_Page_Eparwana_Cotton_Dealer_State;
import UploadDoc.UploadDocumentsandPayment;
import pages.service_Insecticide_Dealer_License_State.Insecticide_Dealer_License_NewLicense_State_Level;
import pages_Eparwana.Login_Page;
import utility_Earwana.BaseClassA;
import utility_Earwana.ExcelReader;


public class Cotton_Dealer_Dir_Agri_Test extends BaseClassA {
	SoftAssert assert1=new SoftAssert();
	public static String Excel_path;
	
	Login_Page lp;
	Insecticide_Dealer_License_NewLicense_State_Level fns;
//	Fertilizer_NewLicense_State_Level fns;
	UploadDocumentsandPayment up;
	
	Scrutiny_login_Page_Eparwana_Cotton_Dealer_State Scrutiny_login_Page;
	@BeforeClass
	@Parameters("Excel_path")
	public void  prinicipal_login(String Excel_path1) throws Exception {
		
		//initializerBrowser();
		scrutinylogin();
		//openNewTab_scrutiny();
		Excel_path=Excel_path1;
		ExcelReader er1 = new ExcelReader(Excel_path,1);
		
		    lp = new Login_Page(driver, Excel_path1);
		 //   fns = new Fertilizer_NewLicense_State_Level(driver);
		    fns	 = new Insecticide_Dealer_License_NewLicense_State_Level(driver);
			
			
			
			up= new UploadDocumentsandPayment(driver);
			
		
	        Scrutiny_login_Page= new Scrutiny_login_Page_Eparwana_Cotton_Dealer_State(driver);
	    
	        Scrutiny_login_Page.enterUserName(er1.getExcelData(14, 1));// AO_fert
	    	
	    	
	        Scrutiny_login_Page.enterPassword(er1.getExcelData(12, 1));// Pass@123
	    	
	        Scrutiny_login_Page.Enter_Captha();
	    	
	    	
	         Scrutiny_login_Page.clickLoginButton();
	    	
		
}
	@Test(priority = 1)
	
	public void Scrutiny_Cotton_Dir_Agri() throws Exception {
     ExcelReader er = new ExcelReader(Excel_path, 0);
		
		//fns.click_On_Dashboard();
      //  Thread.sleep(22000);
		fns.enter_Search_Application_Id(er.getExcelData(22,1));
		//Thread.sleep(12000);
		Scrutiny_login_Page.click_On_Go_For_Scrutiny();
		
		ExcelReader er1 = new ExcelReader(Excel_path,1);
		// applicant information
		//Scrutiny_login_Page.enter_Remarks(er1.getExcelData(15, 1));
		Scrutiny_login_Page.click_On_save_Button();
		fns.click_On_ok_Button();
		Scrutiny_login_Page.click_On_nextbtn();
		
		//firm information
		Scrutiny_login_Page.click_on_firminfolink();
		//Scrutiny_login_Page.enter_Remarks(er1.getExcelData(15, 1));
		
		Scrutiny_login_Page.click_On_save_Button();
		 fns.click_On_ok_Button(); 
		// Scrutiny_login_Page.click_On_nextbtn(); //
		 // Responsible Person Details
		
		  Scrutiny_login_Page. click_on_firm_Responsible_Person_link();
		 // Scrutiny_login_Page.enter_Remarks(er1.getExcelData(15, 1));
		  Scrutiny_login_Page.click_On_save_Button();
		  fns.click_On_ok_Button();
		 
		 // Scrutiny_login_Page.click_On_nextbtn();
		  // storage
		  Scrutiny_login_Page.click_on_Storage_Address_Details_link();
			//  Scrutiny_login_Page.click_on_Checkbox();
			  //Scrutiny_login_Page.enter_Remarks(er1.getExcelData(15, 1));
		  Scrutiny_login_Page.click_On_save_Button();
			  fns.click_On_ok_Button();
		  
		  // crop variety
		  Scrutiny_login_Page. click_on_Sales_Address_Details_link();
		  Scrutiny_login_Page.click_on_Checkbox();
		  //Scrutiny_login_Page.enter_Remarks(er1.getExcelData(15, 1));
		  Scrutiny_login_Page.click_On_save_Button();
		  fns.click_On_ok_Button(); 
		 // Scrutiny_login_Page.click_On_nextbtn();
		  
		  // Place of Manufacturer
			/*
			 * Scrutiny_login_Page.click_on_Storage_Address_Details_link(); //
			 * Scrutiny_login_Page.click_on_Checkbox();
			 * Scrutiny_login_Page.enter_Remarks(er1.getExcelData(15, 1));
			 * Scrutiny_login_Page.click_On_Recommend_For_Approval();
			 * fns.click_On_ok_Button();
			 */
		 // Scrutiny_login_Page.click_On_nextbtn();
		  
		//  Production Machinery Details
		  
		/*
		 * Scrutiny_login_Page.click_on_production_Machinerty_Details_link();
		 * 
		 * Scrutiny_login_Page.enter_Remarks(er1.getExcelData(15, 1));
		 * Scrutiny_login_Page.click_On_Recommend_For_Approval();
		 * fns.click_On_ok_Button();
		 */
			  
			  
			  ///  Laboratory Equipment Details
			  
				/*
				 * Scrutiny_login_Page.click_on_lab_Equipment_Details_link();
				 * 
				 * Scrutiny_login_Page.enter_Remarks(er1.getExcelData(15, 1));
				 * Scrutiny_login_Page.click_On_Recommend_For_Approval();
				 * fns.click_On_ok_Button();
				 */
			  
		////  MPCB Certificate
		/*
		 * Scrutiny_login_Page.click_on_mpcb_Certificate_Details_link();
		 * 
		 * Scrutiny_login_Page.enter_Remarks(er1.getExcelData(15, 1));
		 * Scrutiny_login_Page.click_On_Recommend_For_Approval();
		 * fns.click_On_ok_Button();
		 */
			///  Production Supervisor
			  
			/*
			 * Scrutiny_login_Page.click_on_production_Superviser_Details_link();
			 * 
			 * Scrutiny_login_Page.enter_Remarks(er1.getExcelData(15, 1));
			 * Scrutiny_login_Page.click_On_Recommend_For_Approval();
			 * fns.click_On_ok_Button();
			 */
			  
			  /// Place Of Storage Details
			  
				/*
				 * Scrutiny_login_Page.click_on_place_OF_Storage_Details_link();
				 * 
				 * Scrutiny_login_Page.enter_Remarks(er1.getExcelData(15, 1));
				 * Scrutiny_login_Page.click_On_Recommend_For_Approval();
				 * fns.click_On_ok_Button();
				 */
			//  Gras Payment
		     Scrutiny_login_Page.click_on_GrassPayment_Details_link();
		     Scrutiny_login_Page.enter_Remarks(er1.getExcelData(15, 1));
		   //  Scrutiny_login_Page.click_On_final_Recommend_For_Approval();
		     
		     Scrutiny_login_Page.click_On_Approve_Button();
		    // Scrutiny_login_Page.click_On_Recommend_For_Approval();
		     fns.click_On_ok_Button();
		  
		  //  Gras Payment
		  
			/*
			 * Scrutiny_login_Page.enter_Remarks(er1.getExcelData(15, 1));
			 * Scrutiny_login_Page.click_On_Recommend_For_Approval();
			 * fns.click_On_ok_Button();
			 */
		 
			/*
			 * Scrutiny_login_Page.handle_Alert(); fns.click_On_ok_Button();
			 */
	}
	
	@Test(priority = 2)
	  
	  public void verify_License() throws Exception {
		  ExcelReader er = new ExcelReader(Excel_path, 0); 
	 
	  
	  Scrutiny_login_Page.click_on_Cotton_Dealer_License_Tab();
		 
		 Scrutiny_login_Page.click_on_Approve_District_submenu_Tab();
		 
		// Scrutiny_login_Page.click_On_Desk_Service_Access();
	     //  Scrutiny_login_Page.click_On_Service_Access();
	     //   Scrutiny_login_Page.click_On_Acctivate_Button();
	        
	   //     Scrutiny_login_Page.click_on_Insecticide_Dealer_License_Tab();
			 
			// Scrutiny_login_Page.click_on_Approve_Tab();
			
		 
		 fns.enter_Search_Application_Id(er.getExcelData(22,1));
		 
		 Scrutiny_login_Page.click_ON_preVlincence_For_District();
}
	
	@AfterClass
	
	public void tear_Down() {
		
		//driver.close();
		//driver.quit();
	}
	
}
	

