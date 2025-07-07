package test;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



import pages_Eparwana.Login_Page;

import utility_Earwana.BaseClassA;
import utility_Earwana.ExcelReader;

public class Login_Test extends BaseClassA {
	
	Login_Page lp;
	
	SoftAssert softAssert1 = new SoftAssert();
	public static String Excel_path;
	public static String gender = "";
	public static String stream = "";

Logger log= Logger.getLogger(Login_Test.class);


@Test
@Parameters("Excel_path")
public void setup(String Excel_path1) throws Exception {
	Excel_path = Excel_path1;
	ExcelReader er = new ExcelReader(Excel_path, 0);
	log.info(" launching chrome broser successfully");
	
	
	applicantlogin();
	
	lp= new Login_Page(driver, Excel_path1);
	
	lp.enterUserName(er.getExcelData(6, 5));// AO_fert
	
	log.info("Username enter successfully");
	lp.enterPassword(er.getExcelData(11, 2));// Pass@123
	log.info("Pasword enter successfully");
	lp.Enter_Captha();
	
	log.info("captcha enter successfully");
	lp.clickLoginButton();
	
	log.info("login button successfully");
	
}


	
}



