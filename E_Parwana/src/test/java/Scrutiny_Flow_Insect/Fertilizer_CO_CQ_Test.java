package Scrutiny_Flow_Insect;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Scrutiny_pages_Eparwana_Insect_Dealer_State.Scrutiny_login_Page_Eparwana_Insect;
import UploadDoc.UploadDocumentsandPayment;
import pages.service_Insecticide_Dealer_License_State.Insecticide_Dealer_License_NewLicense_State_Level;
import pages_Eparwana.Login_Page;
import utility_Earwana.BaseClassA;
import utility_Earwana.ExcelReader;



public class Fertilizer_CO_CQ_Test extends BaseClassA {
	SoftAssert assert1=new SoftAssert();
	public static String Excel_path;
	
	Login_Page lp;
	Insecticide_Dealer_License_NewLicense_State_Level fns;
	//Fertilizer_NewLicense_State_Level fns;
	UploadDocumentsandPayment up;
	//Scrutiny_login_Page_Eparwana  Scrutiny_login_Page;
	Scrutiny_login_Page_Eparwana_Insect Scrutiny_login_Page;
	@BeforeClass
	@Parameters("Excel_path")
	public void  prinicipal_login(String Excel_path1) throws Exception {
		
		//initializerBrowser();
		scrutinylogin();
		//openNewTab_scrutiny();
		Excel_path=Excel_path1;
		ExcelReader er1 = new ExcelReader(Excel_path,1);
		
		    lp = new Login_Page(driver, Excel_path1);

			fns = new Insecticide_Dealer_License_NewLicense_State_Level(driver);
			//fns= new Fertilizer_NewLicense_State_Level(driver);
			up= new UploadDocumentsandPayment(driver);
			
		
	        Scrutiny_login_Page= new Scrutiny_login_Page_Eparwana_Insect(driver);
	    
	        Scrutiny_login_Page.enterUserName(er1.getExcelData(13, 0));// AO_fert
	    	
	    	
	        Scrutiny_login_Page.enterPassword(er1.getExcelData(12, 1));// Pass@123
	    	
	        Scrutiny_login_Page.Enter_Captha();
	    	
	    	
	         Scrutiny_login_Page.clickLoginButton();
	    	
		
}
	@Test(priority = 1)
	
	public void Scrutiny_Dashboard() throws Exception {
     ExcelReader er = new ExcelReader(Excel_path, 0);
		
		//fns.click_On_Dashboard();
   //    Thread.sleep(22000);
        Scrutiny_login_Page.click_On_Desk_Service_Access();
        Scrutiny_login_Page.click_On_Service_Access();
        Scrutiny_login_Page.click_On_Acctivate_Button();
		fns.enter_Search_Application_Id(er.getExcelData(22,1));
		Thread.sleep(1000);
		
		Scrutiny_login_Page.click_On_Go_For_Scrutiny();
		
		ExcelReader er1 = new ExcelReader(Excel_path,1);
		// applicant information
		//Scrutiny_login_Page.enter_Remarks(er1.getExcelData(15, 1));
		Scrutiny_login_Page.click_On_Recommend_For_Approval();
		fns.click_On_ok_Button();
		Scrutiny_login_Page.click_On_nextbtn();
		
		//firm information
		Scrutiny_login_Page.click_on_firminfolink();
		//Scrutiny_login_Page.enter_Remarks(er1.getExcelData(15, 1));
		
		 Scrutiny_login_Page.click_On_Recommend_For_Approval();
		 fns.click_On_ok_Button(); 
		// Scrutiny_login_Page.click_On_nextbtn(); //
		 // Responsible Person Details
		  Scrutiny_login_Page. click_on_firm_Responsible_Person_link();
		//  Scrutiny_login_Page.enter_Remarks(er1.getExcelData(15, 1));
		  Scrutiny_login_Page.click_On_Recommend_For_Approval();
		  fns.click_On_ok_Button(); 
		 // Scrutiny_login_Page.click_On_nextbtn();
		  
		 
		  
		  //Sales Address Details
		  Scrutiny_login_Page. click_on_Sales_Address_Details_link();
		  
		  //Scrutiny_login_Page.enter_Remarks(er1.getExcelData(15, 1));
		  Scrutiny_login_Page.click_On_Recommend_For_Approval();
		  fns.click_On_ok_Button(); 
		 // Scrutiny_login_Page.click_On_nextbtn();
		  
		  // storage Address Details
		  Scrutiny_login_Page.click_on_Storage_Address_Details_link();
		  Scrutiny_login_Page.click_on_Checkbox();
		 // Scrutiny_login_Page.enter_Remarks(er1.getExcelData(15, 1));
		  Scrutiny_login_Page.click_On_Recommend_For_Approval();
		  fns.click_On_ok_Button();
		 // Scrutiny_login_Page.click_On_nextbtn();
		  
		  //  Fertilizer Type and Grade
		
		
		  Scrutiny_login_Page.click_on_GrassPayment_Details_link();
		 // Scrutiny_login_Page.enter_Remarks(er1.getExcelData(15, 1));
		  Scrutiny_login_Page.click_On_Recommend_For_Approval();
		  fns.click_On_ok_Button();
		  
		  //  Gras Payment
		  
			/*
			 * Scrutiny_login_Page.enter_Remarks(er1.getExcelData(15, 1));
			 * Scrutiny_login_Page.click_On_Recommend_For_Approval();
			 * fns.click_On_ok_Button();
			 */
		  Scrutiny_login_Page.click_On_final_Recommend_For_Approval();
		  
		  fns.click_On_ok_Button();
	}
	
	//@AfterClass
	
	public void tear_Down() {
		
		//driver.close();
		//driver.quit();
	}
	
}
	

