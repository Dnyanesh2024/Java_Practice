package pages.service_Cotton_Dealer_License;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility_Earwana.ExcelReader;
import utility_Earwana.ExcelWritter;


public class Cotton_Dealer_Licensee_District_Level {
	
	
	
WebDriver driver;
	
	String Excel_path;

	public Cotton_Dealer_Licensee_District_Level(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}

	@FindBy(xpath = "//span[text()=' Fertilizer Dealer License']")

	private WebElement Fertilizer_Dealer_License;

	public void click_on_Fertilizer_Dealer_License_Tab() {

		Fertilizer_Dealer_License.click();

	}
	
	@FindBy(xpath = "//span[text()=' Cotton Dealer License']")

	private WebElement  Cotton_Dealer_License;

	public void click_on_Cotton_Dealer_License_Tab() {

		 Cotton_Dealer_License.click();

	}
	
	
	@FindBy(xpath = "//button[@id='sidebarToggle']")
	private WebElement menu;
	
	public void click_On_Menu() throws Exception {
		Thread.sleep(3000);
		menu.click();
	}
	
	@FindBy(xpath = "//span[text()=' Manufacturer License']")

	private WebElement Manuafacture_License;

	public void click_on_Manuafacture_License_Tab() {

		Manuafacture_License.click();

	}

	@FindBy(xpath = "//li[@class='nav-item dropdown open']//div//span[text()='New License (State Level)']")

	private WebElement New_License;

	public void click_On_New_License_State_Level() {

		New_License.click();
	}
	
	@FindBy(xpath = "//li[@class='nav-item dropdown open']//div//span[text()='New License (District Level)']")

	private WebElement New_License_District;

	public void click_On_New_License_District_Level() {

		New_License_District.click();
	}

	@FindBy(xpath = "//button[text()='Close']")

	private WebElement close_Button;

	public void click_On_Close_Button() throws InterruptedException {
		Thread.sleep(2000);
		close_Button.click();

	}

	@FindBy(xpath = "//select[@id='ddlUserType']")
	private WebElement select_Lincence_Holder;

	public void Select_lincenceHolder(String Lincence_Holder) {
		Select s1 = new Select(select_Lincence_Holder);
		s1.selectByVisibleText(Lincence_Holder);
	}

	@FindBy(xpath = "//ul/li/a/label[text()=' Mumbai City']")

	private WebElement mumbai_Check;

	public void click_On_District_Checkbox() {

		mumbai_Check.click();

		// mumbai_Check.sendKeys(Keys.ENTER);

	}

	@FindBy(xpath = "//*[@id=\"divSelectMultipledistrict\"]/div/div/button")

	private WebElement non_Select;

	public void click_On_non_Selected_District() throws Exception {
		Thread.sleep(3000);
		non_Select.click();

	}
	
	@FindBy(xpath = "//select[@id='ddlSingleDistrict']")
	private WebElement Lincence_district;

	public void Select_district(String district) throws Exception

	{

		Lincence_district.click();
		Select s1 = new Select(Lincence_district);
		Thread.sleep(3000);
		s1.selectByVisibleText(district);
	}
	
	

	@FindBy(xpath = "//select[@id='ddllictype']")
	private WebElement Lincence_cat_manu;

	public void Select_License_categorey_Manufacture(String Lincence_Manufacture_Cate) throws Exception

	{

		//Lincence_cat_manu.click();
		Select s1 = new Select(Lincence_cat_manu);
		Thread.sleep(4000);
		s1.selectByVisibleText(Lincence_Manufacture_Cate);
	}

	@FindBy(xpath = "//*[@id=\"divLicenseCategory\"]/div/div/ul/li[2]/a/label")
	private WebElement Lincence_category;

	public void Select_LicenseCategory() throws Exception

	{

		Lincence_category.click();
		/*
		 * Select s1 = new Select(Lincence_category); Thread.sleep(3000);
		 * s1.selectByVisibleText(Lincence_cat);
		 */
	}

	@FindBy(xpath = "//*[@id=\"divLicenseCategory\"]/div/div/button/span")

	private WebElement Linc;

	public void Select_LicenseCat() throws Exception

	{

		Linc.click();

	}

	@FindBy(xpath = "//input[@id='FirstName']")

	private WebElement appname;

	public void enter_Applicant_Name(String Name) throws Exception {

		Thread.sleep(3000);

		appname.sendKeys(Name);

	}

	@FindBy(xpath = "//input[@id='MiddleName']")

	private WebElement middle_Name;

	public void enter_Applicant_Middle_Name(String MName) throws Exception {

		// Thread.sleep(3000);

		middle_Name.sendKeys(MName);

	}

	@FindBy(xpath = "//input[@id='LastName']")

	private WebElement LName;

	public void enter_Applicant_Last_Name(String LastName) throws Exception {

		// Thread.sleep(3000);

		LName.sendKeys(LastName);
	}

	public void enter_Date_Of_Birth() {

		WebElement date = driver.findElement(By.xpath("//input[@id='personDetails_DOB']"));
		date.click();
		String dateval = "28/01/1993";

		selectDateByJS(driver, date, dateval);
		// date.click();
		date.sendKeys(Keys.ENTER);
	}

	public static void selectDateByJS(WebDriver driver, WebElement element, String dateval) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','" + dateval + "');", element);

	}

	@FindBy(xpath = "//input[@id='personDetails_EducQual']")

	private WebElement eddquali;

	public void enter_Applicant_Educational_Qualification(String Education) throws Exception {

		// Thread.sleep(3000);

		eddquali.sendKeys(Education);
	}

	@FindBy(xpath = "//input[@id='personDetails_Designation']")

	private WebElement desig;

	public void enter_Applicant_Designation(String design) throws Exception {

		// Thread.sleep(3000);

		desig.sendKeys(design);
	}

	@FindBy(xpath = "//input[@id='AadharNum']")

	private WebElement aadgnumber;

	public void enter_Applicant_Addhar(String Addharno) throws Exception {

		// Thread.sleep(3000);
		
		aadgnumber.clear();

		aadgnumber.sendKeys(Addharno);
	}

	@FindBy(xpath = "//input[@id='PanNum']")

	private WebElement Pannum;

	public void enter_Applicant_Pannumber(String pan) throws Exception {

		// Thread.sleep(3000);
		Pannum.clear();

		Pannum.sendKeys(pan);
	}

	/// Applicant’s Residential Address

	@FindBy(xpath = "//input[@id='AddrNameOfBuilding']")

	private WebElement NameBuild;

	public void enter_Name_Of_Building(String Building) throws Exception {

		// Thread.sleep(3000);

		NameBuild.sendKeys(Building);
	}
	
	@FindBy(xpath = "//input[@id='SalesAddrNameOfBuilding']")

	private WebElement salesNameBuild;

	public void enter_Name_Of_sales_Building(String Building) throws Exception {

		// Thread.sleep(3000);

		salesNameBuild.sendKeys(Building);
	}

	@FindBy(xpath = "//input[@id='AddrStreet']")

	private WebElement NameStreet;

	public void enter_Name_Of_Street(String Street) throws Exception {

		// Thread.sleep(3000);

		NameStreet.sendKeys(Street);

	}
	
	@FindBy(xpath = "//input[@id='SalesAddrStreet']")

	private WebElement salesNameStreet;

	public void enter_Name_Of_sales_Street(String Street) throws Exception {

		// Thread.sleep(3000);

		salesNameStreet.sendKeys(Street);

	}

	@FindBy(xpath = "//input[@id='AddrLandmark']")

	private WebElement NameLandmark;

	public void enter_Name_Of_Landmak(String Landmark) throws Exception {

		// Thread.sleep(3000);

		NameLandmark.sendKeys(Landmark);

	}
	@FindBy(xpath = "//input[@id='SalesAddrLandmark']")

	private WebElement salesNameLandmark;

	public void enter_Name_Of_sales_Landmak(String Landmark) throws Exception {

		// Thread.sleep(3000);

		salesNameLandmark.sendKeys(Landmark);

	}

	@FindBy(xpath = "//select[@id='DistrictID_C']")
	private WebElement districtName;

	public void Select_District(String dist) throws Exception

	{

		// Lincence_sub_Type.click();
		Select s1 = new Select(districtName);
		Thread.sleep(3000);
		s1.selectByVisibleText(dist);
	}
	
	@FindBy(xpath = "//select[@id='StateID_C']")
	private WebElement State;

	public void Select_state(String st) throws Exception {
		
		State.click();
		Select s1 = new Select(State);
		Thread.sleep(5000);
		s1.selectByVisibleText(st);
	}
	
	
	@FindBy(xpath = "//select[@id='StateID_C']")
	private WebElement stateName;

	public void Select_State(String state) throws Exception

	{

		// Lincence_sub_Type.click();
		Select s1 = new Select(stateName);
		Thread.sleep(3000);
		s1.selectByVisibleText(state);
	}

	@FindBy(xpath = "//select[@id='TalukaID_C']")
	private WebElement TalukaName;

	public void Select_Taluka(String tal) throws Exception

	{

		// Lincence_sub_Type.click();
		Select s1 = new Select(TalukaName);
		Thread.sleep(3000);
		s1.selectByVisibleText(tal);
	}

	@FindBy(xpath = "//input[@id='AddrPincode']")

	private WebElement pincode;

	public void enter_pincode(String pin) throws Exception {

		// Thread.sleep(3000);

		pincode.sendKeys(pin);

	}

	public void Scroll_Down() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
	}

	@FindBy(xpath = "//input[@id='applicantCommunicationDetails_MobileNum']")

	private WebElement mobnum;

	public void enter_Mobile_No(String mob) throws Exception {

		// Thread.sleep(3000);

		mobnum.sendKeys(mob);
	}

	@FindBy(xpath = "//input[@id='applicantCommunicationDetails_EmailAddr']")

	private WebElement Email;

	public void enter_Email_ID(String EmailNAME) throws Exception {

		// Thread.sleep(3000);

		Email.sendKeys(EmailNAME);
	}

	@FindBy(xpath = "//button[@id='btnSubmit' and @type='submit']")

	private WebElement savebtn;

	public void click_ON_Save_Button() throws Exception {

		Thread.sleep(3000);

		savebtn.click();

	}

	@FindBy(xpath = "//p[starts-with(text(), 'APPLICANT INFORMATION SAVED ')]")
	
//	@FindBy(xpath = "//p[ substring-before(text(), '-')='APPLICANT INFORMATION SAVED SUCCESSFULLY ' ]")

	private WebElement app_id;

	public void write_Application_ID() throws Exception {
		String ID = app_id.getText();
		
		System.out.println(ID);

		System.out.println(ID);

		String a[] = ID.split("-");

		String app_id = a[1];

		System.out.println(app_id);

		String bb = app_id.stripLeading();

		System.out.println(bb);

		ExcelWritter er = new ExcelWritter(
				"C:\\Users\\Swapnil.Gedam\\eclipse-workspacemahait\\E_Parwana\\src\\main\\resources\\Cotton_Dealer_License_District_Level.xlsx",
				0);

		er.writeExcelData(22, 1, bb);

	}

	@FindBy(xpath = "//button[@class='confirm' and text()='OK']")

	private WebElement okbtn;

	public void click_On_ok_Button() throws Exception {

		Thread.sleep(3000);

		okbtn.click();

	}

	@FindBy(xpath = "//div//a[text()='Next']")

	private WebElement nextbtn;

	public void click_On_next_Button() throws Exception {

		Thread.sleep(3000);

		nextbtn.click();
	}

	// 2 Firm_Information>>>>>>

	// a>>> Address of Firm/Organization

	@FindBy(xpath = "//select[@id='ddlFirmOrgType']")
	private WebElement firmName;

	public void Select_Firm_Type(String firm) throws Exception

	{
		
		Thread.sleep(3000);
		firmName.click();
		// Lincence_sub_Type.click();
		Select s1 = new Select(firmName);
		Thread.sleep(3000);
		s1.selectByVisibleText(firm);
	}

	@FindBy(xpath = "//input[@id='FirmOrganizationName']")

	private WebElement firstorganization;

	public void enter_Firm_Orgnization(String firmorg) throws Exception {

		// Thread.sleep(3000);

		firstorganization.sendKeys(firmorg);
	}
	
	@FindBy(xpath = "//select[@id='ddlAddressOffice']")
	private WebElement FirmAddress;

	public void Select_Address_Type(String AType) throws Exception

	{
		
		Thread.sleep(3000);
		FirmAddress.click();
		// Lincence_sub_Type.click();
		Select s1 = new Select(FirmAddress);
		Thread.sleep(5000);
		s1.selectByVisibleText(AType);
	}

	
	@FindBy(xpath = "//select[@id='drpstorageAddressDetails']")
	private WebElement Storage_Address;

	public void Select_Storage_Address(String AType) throws Exception

	{
		
		Thread.sleep(3000);
		Storage_Address.click();
		// Lincence_sub_Type.click();
		Select s1 = new Select(Storage_Address);
		Thread.sleep(5000);
		s1.selectByVisibleText(AType);
	}


	@FindBy(xpath = "//input[@id='firmAddressDetails_Pincode' and @type='text']")

	private WebElement Fpincode;

	public void enter_Firm_pincode(String Fpin) throws Exception {

		// Thread.sleep(3000);

		Fpincode.sendKeys(Fpin);

		// Communication Details of Firm/Organization

	}

	@FindBy(xpath = "//input[@id='CommfirmContactDetails_MobileNum']")

	private WebElement firmmobnum;

	public void enter_Firm_Mobile_No(String fmob) throws Exception {

		// Thread.sleep(3000);

		firmmobnum.sendKeys(fmob);
	}

	@FindBy(xpath = "//input[@id='CommfirmContactDetails_EmailAddr']")

	private WebElement firemail;

	public void enter_Firm_Email(String femail) throws Exception {

		// Thread.sleep(3000);

		firemail.sendKeys(femail);
	}
	// Partner Details/ Director/ Member Details

	@FindBy(xpath = "//select[@id='PartnerNumber']")
	private WebElement PartnerNumber;

	public void Select_Number_Of_Partner(String pnum) throws Exception

	{

		// Lincence_sub_Type.click();
		Select s1 = new Select(PartnerNumber);
		Thread.sleep(3000);
		s1.selectByVisibleText(pnum);
	}

	@FindBy(xpath = "//input[@id='PartnerName']")

	private WebElement Partname;

	public void enter_name_of_Partner(String pname) throws Exception {

		// Thread.sleep(3000);

		Partname.sendKeys(pname);
	}

	@FindBy(xpath = "//input[@id='ResidentialAddr']")

	private WebElement RESADD;

	public void enter_res_ADD(String Radd) throws Exception {

		// Thread.sleep(3000);

		RESADD.sendKeys(Radd);
	}

	@FindBy(xpath = "//input[@id='MobileNum']")

	private WebElement partNum;

	public void enter_part_mob_Num(String pnum) throws Exception {

		// Thread.sleep(3000);

		partNum.sendKeys(pnum);
	}
	
	
	@FindBy(xpath = "//input[@id='SalesMobileNum']")

	private WebElement salespartNum;

	public void enter_salespart_mob_Num(String pnum) throws Exception {

		// Thread.sleep(3000);

		salespartNum.sendKeys(pnum);
	}
	
	@FindBy(xpath = "//input[@id='placeOfStorageCommunication_MobileNum']")

	private WebElement storagepartNum;

	public void enter_storage_mob_Num(String pnum) throws Exception {

		// Thread.sleep(3000);

		storagepartNum.sendKeys(pnum);
	}


	@FindBy(xpath = "//input[@id='SalesEmailID']")

	private WebElement partEmail;

	public void enter_part_Email(String pemail) throws Exception {

		// Thread.sleep(3000);

		partEmail.sendKeys(pemail);
	}
	
	
	@FindBy(xpath = "//input[@id='placeOfStorageCommunication_EmailAddr']")

	private WebElement storageEmail;

	public void enter_Storage_Email(String pemail) throws Exception {

		// Thread.sleep(3000);

		storageEmail.sendKeys(pemail);
	}

	@FindBy(xpath = "//button[@id='btnAdd' and @type='button']")

	private WebElement addbtn;

	public void click_On_Add_Button() throws Exception {

		Thread.sleep(3000);
		addbtn.click();
	}
	
	
	@FindBy(xpath = "//button[@id='btnSubmitPcCnf_11111111']")

	private WebElement submit;

	public void click_On_subnit_Button() throws Exception {

		Thread.sleep(3000);
		submit.click();
	}

	@FindBy(xpath = "//input[@id='chkDeclaration']")
	private WebElement checkdec;

	public void click_On_Self_Declaration() throws Exception {
		Thread.sleep(3000);
		checkdec.click();

	}

	// Responsible Person Details

	@FindBy(xpath = "//select[@id='responsiblePersonDetails_PersonTypeID']")
	private WebElement Responsible_Person;

	public void Select_Respncible_Person(String rperson) throws Exception

	{

		// Lincence_sub_Type.click();
		Select s1 = new Select(Responsible_Person);
		Thread.sleep(4000);
		s1.selectByVisibleText(rperson);
	}

	// Responsible Person Office Address

	@FindBy(xpath = "//select[@id='ddlAddressOffice']")
	private WebElement Responsible_Person_ADD;

	public void Select_Responsible_Person_OfficeAddress(String rpersonADD) throws Exception

	{

		// Lincence_sub_Type.click();
		Select s1 = new Select(Responsible_Person_ADD);
		Thread.sleep(3000);
		s1.selectByVisibleText(rpersonADD);

	}

	@FindBy(xpath = "//textarea[@id='responsiblePersonDetails_RespScopeArea']")

	private WebElement scope;

	public void enter_Scope(String scopeRes) {
		scope.sendKeys(scopeRes);
	}

	@FindBy(xpath = "//button[text()='Save']")

	private WebElement ressavebtn;

	public void click_ON_Res_Save_Button() throws Exception {

		Thread.sleep(3000);

		ressavebtn.click();

	}

	@FindBy(xpath = "//button[text()='Yes, Save!']")

	private WebElement yessve;

	public void click_on_yes_Button() throws Exception {

		Thread.sleep(3000);

		yessve.click();
	}
	// Sales Address Details

	@FindBy(xpath = "//input[@id='SalesAddrPincode']")

	private WebElement salespincode;

	public void enter_sales_pincode(String pin) throws Exception {

		// Thread.sleep(3000);

		salespincode.sendKeys(pin);

	}
	
	@FindBy(xpath = "//input[@id='placeOfStorageAddress_Pincode']")

	private WebElement placeOfStorageAddress_Pincode;

	public void enter_placeOfStorageAddress_Pincode(String pin) throws Exception {

		// Thread.sleep(3000);

		placeOfStorageAddress_Pincode.sendKeys(pin);

	}


	@FindBy(xpath = "//select[@id='pomAddressDetails_OwnershipType']")
	private WebElement Ownership_Details_of_Business;

	public void Select_Ownership_Details_of_Business(String ownerdetails) throws Exception

	{

		// Lincence_sub_Type.click();
		Select s1 = new Select(Ownership_Details_of_Business);
		Thread.sleep(3000);
		s1.selectByVisibleText(ownerdetails);

	}
	
	
	@FindBy(xpath = "//select[@id='ddlOwnershipPlaceBusiness']")
	private WebElement salesOwnership_Details_of_Business;

	public void Select_sales_Ownership_Details_of_Business(String ownerdetails) throws Exception

	{

		// Lincence_sub_Type.click();
		Select s1 = new Select(salesOwnership_Details_of_Business);
		Thread.sleep(3000);
		s1.selectByVisibleText(ownerdetails);

	}

	@FindBy(xpath = "//input[@id='SalesLatitude']")

	private WebElement sale_Lad;

	public void enter_latitude(String lat) {
		sale_Lad.sendKeys(lat);
	}

	@FindBy(xpath = "//input[@id='SalesLongitude']")

	private WebElement sale_Long;

	public void enter_longitude(String longi) {
		sale_Long.sendKeys(longi);
	}

	@FindBy(xpath = "//input[@id='SalesOptinalEmailID']")

	private WebElement opeEmail;

	public void enter_Optional_Email_Id_Email(String oemail) throws Exception {

		// Thread.sleep(3000);

		opeEmail.sendKeys(oemail);
	}
	
	@FindBy(xpath = "//input[@id='placeOfStorageCommunication_OptEmailID']")

	private WebElement storageopeEmail;

	public void enter_Optional_storage_Email_Id(String oemail) throws Exception {

		// Thread.sleep(3000);

		storageopeEmail.sendKeys(oemail);
	}

	@FindBy(xpath = "//input[@id='SalesLength ']")

	private WebElement lnth;

	public void enter_Length(String length) throws Exception {

		// Thread.sleep(3000);

		lnth.sendKeys(length);
	}

	@FindBy(xpath = "//input[@name='CommonSalesDeclarationInspection.Breadth']")

	private WebElement bdth;

	public void enter_Breadh(String breadth) throws Exception {

		// Thread.sleep(3000);

		bdth.sendKeys(breadth);
	}

	@FindBy(xpath = "//input[@id='SalesHeight']")

	private WebElement hth;

	public void enter_Height(String Height) throws Exception {

		// Thread.sleep(3000);

		hth.sendKeys(Height);
	}

	@FindBy(xpath = "//input[@id='SalesArea']")

	private WebElement ara;

	public void enter_Area(String Area) throws Exception {

		// Thread.sleep(3000);

		ara.sendKeys(Area);
	}

	@FindBy(xpath = "//input[@id='SalesStorageCapacity']")

	private WebElement storage;

	public void enter_Storage(String strge) throws Exception {

		// Thread.sleep(3000);

		storage.sendKeys(strge);
	}

	@FindBy(xpath = "//input[@id='SalesFloor']")

	private WebElement flr;

	public void enter_floor(String floor) throws Exception {

		// Thread.sleep(3000);

		flr.sendKeys(floor);
	}

	@FindBy(xpath = "//input[@id='SalesWalls']")

	private WebElement Walls;

	public void enter_Walls(String wls) throws Exception {

		// Thread.sleep(3000);

		Walls.sendKeys(wls);
	}

	@FindBy(xpath = "//input[@id='chkDeclarationin']")

	private WebElement Authentication;

	public void click_ON_Authentication() throws Exception {

		Thread.sleep(3000);

		Authentication.click();
		;
	}
	
	@FindBy(xpath = "//input[@id='chkDeclaration']")

	private WebElement salesAuthentication;

	public void click_ON_salesAuthentication() throws Exception {

		Thread.sleep(3000);

		salesAuthentication.click();
		;
	}

	@FindBy(xpath = "//button[@id='btnAdd' and @type='submit']")

	private WebElement salesaddbtn;

	public void click_ON_sales_add_Button() throws Exception {

		Thread.sleep(3000);

		salesaddbtn.click();

	}
	
	@FindBy(xpath = "//button[@id='btnAddStorageDetails' and @type='submit']")

	private WebElement storagebtn;

	public void click_ON_Storage_add_Button() throws Exception {

		Thread.sleep(3000);

		storagebtn.click();

	}
	// Storage Address Details

	@FindBy(xpath = "//select[@id='storageAddressDetails_OwnershipType']")
	private WebElement storage_Ownership_Details_of_Business;

	public void Select_Storage_Ownership_Details_of_Business(String ownerdetails) throws Exception

	{

		// Lincence_sub_Type.click();
		Select s1 = new Select(storage_Ownership_Details_of_Business);
		Thread.sleep(3000);
		s1.selectByVisibleText(ownerdetails);

	}
	
	@FindBy(xpath = "//select[@id='placeOfStorageAddress_OwnershipType']")
	private WebElement Ownership_Details_of_Premise
;

	public void Select_Ownership_Details_of_Premise(String ownerdetails) throws Exception

	{

		// Lincence_sub_Type.click();
		Select s1 = new Select(Ownership_Details_of_Premise);
		Thread.sleep(3000);
		s1.selectByVisibleText(ownerdetails);

	}

	@FindBy(xpath = "//input[@id='OwnershipType']")

	private WebElement rent;

	public void enter_place_Rented(String rnt) throws Exception {

		// Thread.sleep(3000);

		rent.sendKeys(rnt);
	}

	@FindBy(xpath = "//div[@aria-hidden='false']//div[@class='modal-footer']//button[text()='Close']")

	private WebElement Storage_close_Button;

	public void click_On_Storage_close_Button() throws InterruptedException {
		Thread.sleep(2000);
		Storage_close_Button.click();

	}

	@FindBy(xpath = "//input[@id='txtPCLHNoForSoleDealer']")

	private WebElement License;

	public void enter_Fertilizer_type_Grade_License(String grade) throws Exception {

		// Thread.sleep(3000);

		License.sendKeys(grade);
	}

	@FindBy(xpath = "//button[@id='btnAddPCLHNoForSoleDealer' and text()='Send Request']")

	private WebElement sendpc;

	public void click_On_Send_Request() throws Exception {
		Thread.sleep(3000);
		sendpc.click();

	}

	@FindBy(xpath = "//li[@class='nav-item dropdown open']/div//a[contains(@onclick,'FormO')]//span[contains(text(),'Pending ')]")

	private WebElement pendingo;

	public void click_On_PendingO() throws Exception {

		Thread.sleep(3000);

		pendingo.click();
	}
	
	@FindBy(xpath = "//li[@class='nav-item dropdown open']/div//a[contains(@onclick,'SeedDealerLicense/Sen')]//span[contains(text(),'Send Principal Certificate')]")
	
	private WebElement sendpc_Certificate;
	
	public void click_sendpc_Certificat() throws Exception {
		Thread.sleep(3000);
		sendpc_Certificate.click();
		
	}
	@FindBy(xpath = "//span[text()='Sending ‘O’ form']")

	private WebElement sendingo;

	public void click_On_sendingo() throws Exception {

		Thread.sleep(3000);

		sendingo.click();
	}

	@FindBy(xpath = "//input[@id='myInput']")

	private WebElement applicationid;

	public void enter_Application_ID(String ID) throws Exception {

		// Thread.sleep(3000);

		applicationid.sendKeys(ID);
	}

	
	@FindBy(xpath = "//input[@id='txtApplicationId']")

	private WebElement applicationidcotton;

	public void enter_Application_ID_For_Cotton(String ID) throws Exception {

		// Thread.sleep(3000);

		applicationidcotton.sendKeys(ID);
	}
	
	@FindBy(xpath = "//button[@id='btnSearch']")

	private WebElement srcbtn;

	public void click_On_Search() throws Exception {

		 Thread.sleep(2000);

		srcbtn.click();
	}
	public void Click_Send_PCbtn() throws Exception {

		// List<WebElement> row1 =
		// driver.findElements(By.xpath("//table[@id='tblSendPC']//tbody//tr"));

		List<WebElement> row1 = driver.findElements(By.xpath("//table//tbody/tr/td"));

		int row = row1.size();
		System.out.println("number of rows " + row);

		for (int i = 1; i <= row - 1; i++) {

			// String app =
			// driver.findElement(By.xpath("//table[@id='tblSendPC']//tbody//td["+i+"]")).getText();

			String app = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[2]")).getText();

			System.out.println(app);

			ExcelReader er = new ExcelReader(
					"C:\\Users\\Swapnil.Gedam\\eclipse-workspacemahait\\E_Parwana\\src\\main\\resources\\Cotton_Dealer_License_District_Level.xlsx",
					0);

			if (app.contains(er.getExcelData(22, 1))) {

				driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[9]/button[1]")).click();

				break;

			}

		}
	}

//Form O

	@FindBy(xpath = "//input[@type='checkbox' and @id='chkAllNotified']")

	private WebElement selectall;

	public void click_On_Select_All() throws Exception {

		Thread.sleep(2000);
		selectall.click();
	}
//fertilizer
//	@FindBy(xpath = "//input[@id='file_65726996']")
	
	//MANUFACTURE
	
	//@FindBy(xpath = "//input[@id='file_78304128']")
	
	@FindBy(xpath = "//input[@id='file_84034933']")

	private WebElement file;

	public void select_File(String fle) throws InterruptedException {
		Thread.sleep(2000);
		file.sendKeys(fle);
	}
	// new code
//	@FindBy(xpath = "//input[@id='file_78304127']")
	
	@FindBy(xpath = "//input[@id='file_84034933']")


	private WebElement file1;

	public void select_File1(String fle) throws InterruptedException {
		Thread.sleep(2000);
		file1.sendKeys(fle);
	}
//fert
	//@FindBy(xpath = "//button[text()='Upload']")
	
//	manua
	@FindBy(xpath = "//button[text()='Upload' and @id='btnUp_84034933']")
	//@FindBy(xpath = "//button[text()='Upload' and @id='btnUp_78304128']")

	private WebElement upladbtn;

	public void click_On_Upload_Button() throws Exception {

		Thread.sleep(4000);
		upladbtn.click();

		/*
		 * Alert alert = driver.switchTo().alert();
		 * 
		 * Thread.sleep(3000);
		 * 
		 * alert.accept();
		 */

	}
	
	@FindBy(xpath = "//button[text()='Upload' and @id='btnUp_84034933']")

	private WebElement upladbtn1;

	public void click_On_Upload_Button1() throws Exception {

		Thread.sleep(4000);
		upladbtn1.click();
	}

	@FindBy(xpath = "//input[@value='period' and @id='DurationType']")

	private WebElement periodbtn;

	public void click_On_Period_Button() throws Exception {
		
		Thread.sleep(4000);

		periodbtn.click();
	}

	public void handle_Alert() throws Exception {
		Alert a = new WebDriverWait(driver, Duration.ofSeconds(40)).until(ExpectedConditions.alertIsPresent());
		System.out.println("Alert is present");
		String text = a.getText();

		System.out.println(text);

		Thread.sleep(3000);

		a.accept();
	}

	@FindBy(xpath = "//input[@id='dtpFrom']")
	
	private WebElement linfromdate;
	
	public void click_on_From_Date () {
		
		linfromdate.click();
	}
	
	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
	
	private WebElement month;
	public void select_Month(String Mon) throws Exception {
		
		Select s1 = new Select(month);
		Thread.sleep(3000);
		s1.selectByVisibleText(Mon);
		
	}
	
@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	
	private WebElement year;
	public void select_year(String yr) throws Exception {
		
		Select s1 = new Select(year);
		Thread.sleep(3000);
		s1.selectByVisibleText(yr);
		
	}
	
	public void select_Date() throws Exception {
		
		ExcelReader er = new ExcelReader(
				"C:\\Users\\Swapnil.Gedam\\eclipse-workspacemahait\\E_Parwana\\src\\main\\resources\\Cotton_Dealer_License_District_Level.xlsx",
				0);
		
		String date=er.getExcelData(45, 1);
		
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for (WebElement ele : alldates) {
			
			String dt = ele.getText();
			
			if(dt.equals(date)) {
				Thread.sleep(1000);
				ele.click();
				
				break;
		}
	}
	}

	@FindBy(xpath = "//input[@id='dtpTo']")
	
	private WebElement lintodate;
	
	public void click_on_To_Date () {
		
		lintodate.click();
	}
	
	@FindBy(xpath = "//input[@id='tbxAuthorizedPersonName']")

	private WebElement Authperson;

	public void enter_Auth_Person(String aperson) throws InterruptedException {
		Thread.sleep(2000);
		Authperson.sendKeys(aperson);
	}
	
	@FindBy(xpath = "//input[@id='tbxDesignation']")

	private WebElement design;

	public void enter_design(String desig) throws InterruptedException {
		Thread.sleep(2000);
		design.sendKeys(desig);
	}
	
	@FindBy(xpath = "//input[@id='flSignature']")

	private WebElement Signature;

	public void select_Authorized_person_Signature (String sign) throws InterruptedException {
		Thread.sleep(3000);
		Signature.sendKeys(sign);
	}
	
	@FindBy(xpath = "//input[@id='tbxMobileNo']")

	private WebElement form_O_Mob_Num;

	public void enter_Mob_Number_Form_O (String NUM) throws InterruptedException {
		Thread.sleep(2000);
		form_O_Mob_Num.sendKeys(NUM);
	}
	
	// dashboard
	
	@FindBy(xpath = "//a[text()='User Dashboard']")
	
	private WebElement dash;
	
	public void click_On_Dashboard() {
		
		dash.click();
		
	}
	
	@FindBy(xpath = "//input[@type='search']")
	
	private WebElement dash_Search;
	
	public void enter_Search_Application_Id(String search_Id) throws Exception {
		
		Thread.sleep(5000);
		dash_Search.sendKeys(search_Id);
		Thread.sleep(24000);
		dash_Search.sendKeys(Keys.ENTER);
	}
	
	@FindBy(xpath = "//button[text()='View Form']")
	
	private WebElement vform;
	
	
	public void click_On_view_Form() throws Exception {
		Thread.sleep(4000);
		
		vform.click();
		
	}
	
	@FindBy(xpath = "//a[contains (@href, 'FertilizerTypeGrade')]")
	
	private WebElement ftg;
	
	public void click_On_Fertilizer_Type_and_Grade() {
		
		ftg.click();
	}
@FindBy(xpath = "//a[contains (@href, '/SeedDealerLicense/CropVaritiesDetails')]")
	
	private WebElement crop;
	
	public void click_On_crop_Variety_Details() {
		
		crop.click();
	}
	@FindBy(xpath = "//a[text()='Final Submit ']")
	
	private WebElement finalsubmit;
	
	public void click_On_Final_Submit_Button() throws Exception {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", finalsubmit);
		//finalsubmit.click();
	}
	
	@FindBy(xpath = "//button[text()='ADD Grade']")
	private WebElement addgrade;
	
	public void click_ON_ADD_Grade_Button() {
		addgrade.click();
		
	}
	
	@FindBy(xpath = "//input[@id='checkbox-9']")
	private WebElement checkboxgrade9;
	
	public void click_on_checkbox_Grade9() throws Exception {
		Thread.sleep(3000);
		checkboxgrade9.click();
	}
	
	@FindBy(xpath = "//select[@id='ddlPOM']")
	private WebElement Place_of_Manufacture;

	public void Select_Place_of_Manufacture(String pom) throws Exception

	{

		// Lincence_sub_Type.click();
		Select s1 = new Select(Place_of_Manufacture);
		Thread.sleep(3000);
		s1.selectByVisibleText(pom);
	}
	
	@FindBy(xpath = "//input[@id='productionMachinery_MachineryName']")

	private WebElement productionMachinery;

	public void enter_Machinery_Name(String Machinery ) throws Exception {

		// Thread.sleep(3000);

		productionMachinery.sendKeys(Machinery);

}
	
	
    @FindBy(xpath = "//input[@id='productionMachinery_PurchaseDate']")
	
	private WebElement PurchaseDate;
	
	public void click_on_Date_of_Purchase () {
		
		PurchaseDate.click();
	}
	
	@FindBy(xpath = "//select[@id='ddlFertManufacturedType']")
	private WebElement Type_of_Manufactured;

	public void Select_Type_of_Manufactured_Fertilizer(String tom) throws Exception

	{

		// Lincence_sub_Type.click();
		Select s1 = new Select(Type_of_Manufactured);
		Thread.sleep(3000);
		s1.selectByVisibleText(tom);
	}
	
	@FindBy(xpath = "//input[@id='labEquipment_EquipmentName']")

	private WebElement labEquipment;

	public void enter_labEquipment_Machinery_Name(String labMachinery ) throws Exception {

		// Thread.sleep(3000);

		labEquipment.sendKeys(labMachinery);

}
	
/*
 * @FindBy(xpath = "//input[@id='labEquipment_EquipmentName']")
 * 
 * private WebElement labEquipment;
 * 
 * public void enter_labEquipment_Machinery_Name(String labMachinery ) throws
 * Exception {
 * 
 * // Thread.sleep(3000);
 * 
 * labEquipment.sendKeys(labMachinery);
 * 
 * }
 */
   @FindBy(xpath = "//input[@id='labEquipment_EquipmentQuantity']")

   private WebElement EquipmentQuantity;

   public void enter_Number_Of_Equipment_Name(String quantity ) throws Exception {

	// Thread.sleep(3000);
	   
	   EquipmentQuantity.clear();

	   EquipmentQuantity.sendKeys(quantity);

}
   
   @FindBy(xpath = "//input[@id='labEquipment_PurchaseDate']")
	
  	private WebElement PurchaselabDate;
  	
  	public void click_on_Date_of_PurchaseLAB () {
  		
  		PurchaselabDate.click();
  	}
  	
  	//MPCB Certificate
  	
  	
  	 @FindBy(xpath = "//input[@id='MPCB_MPCBConsentNum']")

     private WebElement MPCBConsentNum;

     public void enter_Number_MPCB(String MPCB ) throws Exception {

  	// Thread.sleep(3000);
  	   
  	  // EquipmentQuantity.clear();

  	 MPCBConsentNum.sendKeys(MPCB);

  }
     @FindBy(xpath = "//input[@id='MPCB_MPCBConsentDate']")
 	
   	private WebElement MPCB_Consent_Date;
   	
   	public void click_on_MPCB_Consent_Date () {
   		
   		MPCB_Consent_Date.click();
   	}
    @FindBy(xpath = "//input[@id='MPCB_MPCBConsentEnd']")
 	
   	private WebElement MPCB_Consent_valid_up_to;
   	
   	public void click_on_MPCB_Consent_valid_up_toDate () {
   		
   		MPCB_Consent_valid_up_to.click();
   	}
   	@FindBy(xpath = "//input[@id='MPCB_DicNum']")

    private WebElement Dic_No;

    public void enter_Dic_No(String dic ) throws Exception {

 	// Thread.sleep(3000);
 	   
 	  // EquipmentQuantity.clear();

    	Dic_No.sendKeys(dic);

 }
    
 @FindBy(xpath = "//input[@id='MPCB_IssueDate']")
 	
   	private WebElement Date_Of_Issue;
   	
   	public void click_on_Date_Of_Issue () {
   		
   		Date_Of_Issue.click();
   	}
   	
   	@FindBy(xpath = "//select[@id='responsiblePersonDetails_PersonTypeID']")
	private WebElement Supervisor;

	public void Select_Supervisor(String Super) throws Exception

	{

		// Lincence_sub_Type.click();
		Select s1 = new Select(Supervisor);
		Thread.sleep(3000);
		s1.selectByVisibleText(Super);
	}
}





