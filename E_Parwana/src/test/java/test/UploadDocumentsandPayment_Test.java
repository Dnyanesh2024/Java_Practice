package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import UploadDoc.UploadDocumentsandPayment;
import pages.service_Fertilizer_Dealer_License_State.Fertilizer_NewLicense_State_Level;
import pages_Eparwana.Login_Page;
import utility_Earwana.BaseClassA;

public class UploadDocumentsandPayment_Test extends BaseClassA{
	
	
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
		
		

		

	}
	
	@Test(priority = 1)
	
	public void verify_A() throws Throwable {
		
		up.click_On_Applicant_Information();
		
	}


}
