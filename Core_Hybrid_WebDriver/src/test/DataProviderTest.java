package test;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.HashMap;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.poc.model.AddPFSCompanyDetails;
import com.poc.uidriver.AddPFSCompanyDetailsConstants;
import com.poc.util.CsvReader;
import com.poc.util.Utils;
/**
 * @param args
 * @throws InterruptedException
 * @author elmer.gallardo
 */

public class DataProviderTest extends AddPFSCompanyDetailsConstants {
	CsvReader csvUtil = new CsvReader();
	Assertion Assertion = new Assertion();
	Utils Utils = new Utils();
	List<AddPFSCompanyDetails> ListOfCompanys = new ArrayList<AddPFSCompanyDetails>();
	Object[][] data;
	HashMap<Object,String> parameters = new HashMap<Object, String>();


	@BeforeTest
	public void setup(){
		ListOfCompanys = csvUtil.importWorkstationData("../Core_Hybrid_WebDriver/src/com/poc/csv/dataImport.csv");
		System.out.println(ListOfCompanys);
		data = new Object[1][56];
	}

	@DataProvider
	public Object[][] importedData(){
		data[0][0] = ListOfCompanys.get(0).getFiNumber();
		data[0][1] = ListOfCompanys.get(0).getUsertype();
		data[0][2] = ListOfCompanys.get(0).getStatus();
		data[0][3] = ListOfCompanys.get(0).getAdmintype();
		data[0][4] = ListOfCompanys.get(0).getWebName();
		data[0][5] = ListOfCompanys.get(0).getAddress();
		data[0][6] = ListOfCompanys.get(0).getCity();
		data[0][7] = ListOfCompanys.get(0).getProvince();
		data[0][8] = ListOfCompanys.get(0).getPostalcode();
		data[0][9] = ListOfCompanys.get(0).getContact();
		data[0][10] = ListOfCompanys.get(0).getTelephone();
		data[0][11] = ListOfCompanys.get(0).getFax();
		data[0][12] = ListOfCompanys.get(0).getEmail();
		data[0][13] = ListOfCompanys.get(0).getLanguage();
		data[0][14] = ListOfCompanys.get(0).getMailingTransit();
		data[0][15] = ListOfCompanys.get(0).getEnrollmentServicingTransit();
		data[0][16] = ListOfCompanys.get(0).getContact2();
		data[0][17] = ListOfCompanys.get(0).getTelephone2();
		data[0][18] = ListOfCompanys.get(0).getContactNumber();
		data[0][19] = ListOfCompanys.get(0).getCustomerReferenceNumber();
		data[0][20] = ListOfCompanys.get(0).getBillMethod();
		data[0][21] = ListOfCompanys.get(0).getRevenueExpenseTransit();
		data[0][22] = ListOfCompanys.get(0).getAggregateIndicator();
		data[0][23] = ListOfCompanys.get(0).getAggregateIndicator2();
		data[0][24] = ListOfCompanys.get(0).getZeroTransactionFee();
		data[0][25] = ListOfCompanys.get(0).getZeroTransactionFee2();
		data[0][26] = ListOfCompanys.get(0).getNumberOfFirstTrx();
		data[0][27] = ListOfCompanys.get(0).getNumberOffirsttrx2();
		data[0][28] = ListOfCompanys.get(0).getNumberOfFirstTrxFeeIndicator();
		data[0][29] = ListOfCompanys.get(0).getNumberOfFirstTrxFee();
		data[0][30] = ListOfCompanys.get(0).getIncludeFirstTrxIndicator();
		data[0][31] = ListOfCompanys.get(0).getIncludeFirstTrxIndicator2();
		data[0][32] = ListOfCompanys.get(0).getExtraFilingTrxFee();
		data[0][33] = ListOfCompanys.get(0).getExtraFilingTrxFee2();
		data[0][34] = ListOfCompanys.get(0).getExtraPaymentTrxFee();
		data[0][35] = ListOfCompanys.get(0).getExtraPaymentTrxFee2();
		data[0][36] = ListOfCompanys.get(0).getAdditionalPaymentAdvFee();
		data[0][37] = ListOfCompanys.get(0).getAdditionalPaymentAdvFee2();
		data[0][38] = ListOfCompanys.get(0).getChargeAllAdditionalPaymentAdv();
		data[0][39] = ListOfCompanys.get(0).getChargeAllAdditionalPaymentAdv2();
		data[0][40] = ListOfCompanys.get(0).getNewUserEnrollmentFee();
		data[0][41] = ListOfCompanys.get(0).getNewuserEnrollmentFee2();
		data[0][42] = ListOfCompanys.get(0).getCancellationFeeIndicator();
		data[0][43] = ListOfCompanys.get(0).getCancellationFee();
		data[0][44] = ListOfCompanys.get(0).getReversalFeeIndicator();
		data[0][45] = ListOfCompanys.get(0).getReversalFee();
		data[0][46] = ListOfCompanys.get(0).getAccountIsABillingAccount();
		data[0][47] = ListOfCompanys.get(0).getBranch();
		data[0][48] = ListOfCompanys.get(0).getAccount();
		data[0][49] = ListOfCompanys.get(0).getDescription();
		data[0][50] = ListOfCompanys.get(0).getEmailNotification();
		data[0][51] = ListOfCompanys.get(0).getAdminName();
		data[0][52] = ListOfCompanys.get(0).getEmailAddress();
		data[0][53] = ListOfCompanys.get(0).getPhoneNumber();
		data[0][54] = ListOfCompanys.get(0).getExtension();
		data[0][55] = ListOfCompanys.get(0).getFiNumber2();
		return data;
	}
	@Test(dataProvider="importedData")
	public void csvTest(String fiNumber, String usertype, String status, String admintype, String webName,
			String address, String city, String province, String postalcode, String contact, String telephone,
			String fax, String email, String language, String mailingTransit, String enrollmentServicingTransit,
			String contact2, String telephone2, String contactNumber, String customerReferenceNumber, String billMethod,
			String revenueExpenseTransit, String aggregateIndicator, String aggregateIndicator2,
			String zeroTransactionFee, String zeroTransactionFee2, String numberOfFirstTrx, String numberOffirsttrx2,
			String numberOfFirstTrxFeeIndicator, String numberOfFirstTrxFee, String includeFirstTrxIndicator,
			String includeFirstTrxIndicator2, String extraFilingTrxFee, String extraFilingTrxFee2,
			String extraPaymentTrxFee, String extraPaymentTrxFee2, String additionalPaymentAdvFee,
			String additionalPaymentAdvFee2, String chargeAllAdditionalPaymentAdv,
			String chargeAllAdditionalPaymentAdv2, String newUserEnrollmentFee, String newuserEnrollmentFee2,
			String cancellationFeeIndicator, String cancellationFee, String reversalFeeIndicator, String reversalFee,
			String accountIsABillingAccount, String branch, String account, String description,
			String emailNotification, String adminName, String emailAddress, String phoneNumber, String extension, String fiNumber2) throws Exception {


		System.out.println("Printing imported data:");

		System.out.println(
				fiNumber + " " + usertype + " " + status+ " "  + admintype+ " " + webName + " " + address + " " +
						city+ " " + province + " " + postalcode+ " " + contact+ " " + telephone + " " +	
						fax+ " " + email + " " + language+ " " + mailingTransit + " " + enrollmentServicingTransit+ " " +	
						contact2 + " " + telephone2+ " " + contactNumber + " " + customerReferenceNumber+ " " +	
						billMethod + " " + revenueExpenseTransit + " " + aggregateIndicator + " " + aggregateIndicator2 + " " +	
						zeroTransactionFee + " " + zeroTransactionFee2 + " " + numberOfFirstTrx + " " + numberOffirsttrx2 + " " +	 
						numberOfFirstTrxFeeIndicator + " " + numberOfFirstTrxFee + " " + includeFirstTrxIndicator + " " +	
						includeFirstTrxIndicator2 + " " + extraFilingTrxFee + " " + extraFilingTrxFee2+ " " + extraPaymentTrxFee + " " +	
						extraPaymentTrxFee2 + " " + additionalPaymentAdvFee + " " + additionalPaymentAdvFee2 + " " +	
						chargeAllAdditionalPaymentAdv + " " + chargeAllAdditionalPaymentAdv2 + " " + newUserEnrollmentFee + " " +	
						newuserEnrollmentFee2 + " " + cancellationFeeIndicator + " " + cancellationFee + " " + reversalFeeIndicator + " " +	
						reversalFee + " " +	accountIsABillingAccount + " " + branch + " " + account + " " + description + " " +	 
						emailNotification + " " + adminName+ " " + emailAddress + " " + phoneNumber + " " + extension+ " " + fiNumber2
				);

		parameters = new HashMap<Object, String>();

		parameters.put(companyConstants.enum_dpd_fiNumberId,fiNumber);
		parameters.put(companyConstants.enum_dpd_userTypeId,usertype);
		parameters.put(companyConstants.enum_dpd_statusId,status);
		parameters.put(companyConstants.enum_dpd_adminTypeId,admintype);
		parameters.put(companyConstants.enum_webNameId,webName);
		parameters.put(companyConstants.enum_addressId1,address);
		parameters.put(companyConstants.enum_addressId2,address);
		parameters.put(companyConstants.enum_cityId,city);
		parameters.put(companyConstants.enum_dpd_provinceId,province);
		parameters.put(companyConstants.enum_postalCodeId,postalcode);
		parameters.put(companyConstants.enum_contactId,contact);
		parameters.put(companyConstants.enum_telephoneId,telephone);
		parameters.put(companyConstants.enum_faxId,fax);
		parameters.put(companyConstants.enum_emailId,email);
		parameters.put(companyConstants.enum_dpd_languageId,language);
		parameters.put(companyConstants.enum_mailingTransitId,mailingTransit);
		parameters.put(companyConstants.enum_enrollTransitId,enrollmentServicingTransit);
		parameters.put(companyConstants.enum_fiContactId,contact2);
		parameters.put(companyConstants.enum_fiContactTelephone,telephone2);
		parameters.put(companyConstants.enum_fiContactNumbId,contactNumber);
		parameters.put(companyConstants.enum_fiCustRefId,customerReferenceNumber);
		parameters.put(companyConstants.enum_dpd_billingMethodId,billMethod);
		parameters.put(companyConstants.enum_revenueExpId_input,revenueExpenseTransit);
		parameters.put(companyConstants.enum_chkbox_aggregateIndicator,aggregateIndicator);
		parameters.put(companyConstants.enum_chkbox_aggregateIndicator2,aggregateIndicator2);
		parameters.put(companyConstants.enum_chkbox_zeroTransactionFee,zeroTransactionFee);
		parameters.put(companyConstants.enum_zeroTranFeeId,zeroTransactionFee2);
		parameters.put(companyConstants.enum_chkbox_NumberOfFirstTrx,numberOfFirstTrx);
		parameters.put(companyConstants.enum_numFirstTrxId_input,numberOffirsttrx2);
		parameters.put(companyConstants.enum_chkbox_numberOfFirstTrxFeeIndicator,numberOfFirstTrxFeeIndicator);
		parameters.put(companyConstants.enum_firstTrxFeeId_input,numberOfFirstTrxFee);
		parameters.put(companyConstants.enum_chkbox_IncludeFirstTrxIndicator,includeFirstTrxIndicator);
		parameters.put(companyConstants.enum_chkbox_IncludeFirstTrxIndicator2,includeFirstTrxIndicator2);
		parameters.put(companyConstants.enum_chkbox_ExtraFilingTrxFee,extraFilingTrxFee);
		parameters.put(companyConstants.enum_axftTrxFeeId,extraFilingTrxFee2);
		parameters.put(companyConstants.enum_chkbox_ExtraPaymentTrxFee,extraPaymentTrxFee);
		parameters.put(companyConstants.enum_axptTrxFeeId_input,extraPaymentTrxFee2);
		parameters.put(companyConstants.enum_chkbox_AdditionalPaymentAdvFee,additionalPaymentAdvFee);
		parameters.put(companyConstants.enum_aapaFeeId_input,additionalPaymentAdvFee2);
		parameters.put(companyConstants.enum_chkbox_ChargeAllAdditionalPaymentAdv,chargeAllAdditionalPaymentAdv);
		parameters.put(companyConstants.enum_chkbox_ChargeAllAdditionalPaymentAdv2,chargeAllAdditionalPaymentAdv2);
		parameters.put(companyConstants.enum_chkbox_NewUserEnrollmentFee,newUserEnrollmentFee);
		parameters.put(companyConstants.enum_nrlFeeId_input,newuserEnrollmentFee2);
		parameters.put(companyConstants.enum_chkbox_Cancellation_FeeIndicator,cancellationFeeIndicator);
		parameters.put(companyConstants.enum_cclFeeId,cancellationFee);
		parameters.put(companyConstants.enum_chkbox_ReversalFeeIndicator,reversalFeeIndicator);
		parameters.put(companyConstants.enum_rvsFeeId_input,reversalFee);
		parameters.put(companyConstants.enum_chkbox_billingId,accountIsABillingAccount);
		parameters.put(companyConstants.enum_branchInputId,branch);
		parameters.put(companyConstants.enum_accInputId,account);
		parameters.put(companyConstants.enum_descInputId,description);
		parameters.put(companyConstants.enum_dpd_emailNotificationId,emailNotification);

		// Optional, if not specified, WebDriver will search your path for chromedriver.
		//System.setProperty("webdriver.chrome.driver", "C:/Users/elmer.gallardo/Documents/POC/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:/Users/elmer.gallardo/Documents/POC/geckodriver-v0.10.0-win64/geckodriver.exe");
		//DesiredCapabilities caps = DesiredCapabilities.chrome();        
		//WebDriver driver = new ChromeDriver(caps);
		WebDriver driver = new FirefoxDriver();
		login("224100056", "Password*1" ,driver);
		loadMenuWebElments(driver);
		ui_menu.click();
		Thread.sleep(5000);
		ui_menu_addPfsCompany.click();
		Thread.sleep(3000);
		//loading webelements with xpath in the form
		loadAddCompanyWebElments(driver);
		//		Filling  Company Information form with data provider information
		Thread.sleep(3000);
		JavascriptExecutor js =Utils.executejQuery("fiNumberId_input",fiNumber,driver);//"fiNumberId_input","1",driver
		Thread.sleep(5000);
		//Refreshing Web Element
		js.executeScript("$('select[id*=\""+ "fiNumberId_input" + "\"]').val(\""+fiNumber+"\").trigger(\"change\");");
		Thread.sleep(5000);
		loadAddCompanyWebElments(driver);
		cleanForm(driver);
		Utils.executejQuery("userTypeId_input",usertype,driver);//"userTypeId_input","U",driver 
		Utils.executejQuery("statusId_input",status,driver);//"statusId_input","R",driver
		Utils.executejQuery("adminTypeId_input",admintype,driver);//"adminTypeId_input","0",driver
		Thread.sleep(3000);
		webNameId.sendKeys(webName);
		addressId1.sendKeys(address);
		addressId2.sendKeys(address);
		cityId.sendKeys( city);
		Utils.executejQuery("provinceId_input",province,driver);//"provinceId_input","QC",driver
		postalCodeId.sendKeys(postalcode);
		contactId.sendKeys(contact);
		telephoneId.sendKeys(telephone);
		faxId.sendKeys(fax);
		emailId.sendKeys(email);
		Utils.executejQuery("languageId_input",language,driver);
		mailingTransitId.sendKeys(mailingTransit);
		enrollTransitId.sendKeys(enrollmentServicingTransit);
		//		Financial Institution Information
		fiContactId.sendKeys(contact2);
		fiContactTelephone.sendKeys(telephone2);
		fiContactNumbId.sendKeys(contactNumber);
		fiCustRefId.sendKeys(customerReferenceNumber);
		//		Billing Information
		Utils.executejQuery("billingMethodId_input",billMethod,driver);
		revenueExpId_input.sendKeys(revenueExpenseTransit);
		zeroTranFeeId_input.sendKeys(zeroTransactionFee2);
		numFirstTrxId_input.sendKeys(numberOffirsttrx2);
		firstTrxFeeId_input.sendKeys(numberOfFirstTrxFee);
		axftTrxFeeId_input.sendKeys(extraFilingTrxFee2);
		axptTrxFeeId_input.sendKeys(extraPaymentTrxFee2);
		aapaFeeId_input.sendKeys(additionalPaymentAdvFee2);
		nrlFeeId_input.sendKeys(newuserEnrollmentFee2);
		cclFeeId_input.sendKeys(cancellationFee);
		rvsFeeId_input.sendKeys(reversalFee);
		//		CheckBox Validation
		System.out.println("****************************************");
		System.out.println(parameters.get(companyConstants.enum_chkbox_aggregateIndicator));
		checkboxValidation(parameters);
		//		Bank Account Information
		//billingPanelId.sendKeys("");
		//lbl_accountPanelId.sendKeys("");
		//lbl_billingBranchNumId.sendKeys("");
		//lbl_accountPanelId2.sendKeys("");
		//accFi.sendKeys(fiNumber);
		branchInputId.sendKeys(branch);
		accInputId.sendKeys(account);
		descInputId.sendKeys(description);
		try{
			btn_AddAccount.click();
		}catch(Exception e){
			Assertion.fail("Not able to click Add Account Button" + "\n" + e.getMessage() );

		}
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		Utils.executejQuery("emailNotificationId_input",emailNotification,driver);
		//btn_Add.click();
		//btn_ClearAll.click();
		//btn_Cancel.click();
		Utils.waitForPageToLoad(driver);
		Thread.sleep(5000);
		//Assertion.assertEquals(driver.getPageSource().contains("The new PFS company is pending authorization."), true);
		driver.close();
	}
	private void cleanForm(WebDriver driver) {
		//		Company Information
		webNameId.clear();;
		addressId1.clear();;
		addressId2.clear();
		cityId.clear();
		postalCodeId.clear();
		contactId.clear();
		telephoneId.clear();
		faxId.clear();
		emailId.clear();
		mailingTransitId.clear();
		enrollTransitId.clear();
		//		Financial Institution Information
		fiContactId.clear();
		fiContactTelephone.clear();
		fiContactNumbId.clear();
		fiCustRefId.clear();
		//		Billing Information
		revenueExpId_input.clear();
		zeroTranFeeId_input.clear();
		numFirstTrxId_input.clear();
		firstTrxFeeId_input.clear();
		axftTrxFeeId_input.clear();
		axptTrxFeeId_input.clear();
		aapaFeeId_input.clear();
		nrlFeeId_input.clear();
		cclFeeId_input.clear();
		rvsFeeId_input.clear();
		//		Bank Account Information
		//accFi.clear();
		branchInputId.clear();
		accInputId.clear();
		descInputId.clear();		
		//		Cleaning Checkbox
		if (chkbox_aggregateIndicatorFlag.getAttribute("aria-checked").equals("true")){
			chkbox_aggregateIndicator.click();
		}
		if (chkbox_aggregateIndicator2Flag.getAttribute("aria-checked").equals("true")){
			chkbox_aggregateIndicator2.click();
		}
		if (chkbox_zeroTransactionFeeFlag.getAttribute("aria-checked").equals("true")){
			chkbox_zeroTransactionFee.click();
		}
		if (chkbox_NumberOfFirstTrxFlag.getAttribute("aria-checked").equals("true")){
			chkbox_NumberOfFirstTrx.click();
		}
		if (chkbox_numberOfFirstTrxFeeIndicatorFlag.getAttribute("aria-checked").equals("true")){
			chkbox_numberOfFirstTrxFeeIndicator.click();
		}
		if (chkbox_IncludeFirstTrxIndicatorFlag.getAttribute("aria-checked").equals("true")){
			chkbox_IncludeFirstTrxIndicator.click();
		}
		if (chkbox_IncludeFirstTrxIndicator2Flag.getAttribute("aria-checked").equals("true")){
			chkbox_IncludeFirstTrxIndicator2.click();
		}
		if (chkbox_ExtraFilingTrxFeeFlag.getAttribute("aria-checked").equals("true")){
			chkbox_ExtraFilingTrxFee.click();
		}
		if (chkbox_ExtraPaymentTrxFeeFlag.getAttribute("aria-checked").equals("true")){
			chkbox_ExtraPaymentTrxFee.click();
		}
		if (chkbox_AdditionalPaymentAdvFeeFlag.getAttribute("aria-checked").equals("true")){
			chkbox_AdditionalPaymentAdvFee.click();
		}
		if (chkbox_ChargeAllAdditionalPaymentAdvFlag.getAttribute("aria-checked").equals("true")){
			chkbox_ChargeAllAdditionalPaymentAdv.click();
		}
		if (chkbox_ChargeAllAdditionalPaymentAdv2Flag.getAttribute("aria-checked").equals("true")){
			chkbox_ChargeAllAdditionalPaymentAdv2.click();
		}
		if (chkbox_NewUserEnrollmentFeeFlag.getAttribute("aria-checked").equals("true")){
			chkbox_NewUserEnrollmentFee.click();
		}
		if (chkbox_Cancellation_FeeIndicatorFlag.getAttribute("aria-checked").equals("true")){
			chkbox_Cancellation_FeeIndicator.click();
		}
		if (chkbox_ReversalFeeIndicatorFlag.getAttribute("aria-checked").equals("true")){
			chkbox_ReversalFeeIndicator.click();
		}
		if (chkbox_billingIdFlag.getAttribute("aria-checked").equals("true")){
			chkbox_billingId.click();
		}
	}
	private void login(String user, String password, WebDriver driver) throws InterruptedException{
		driver.get("http://10.36.6.174/apt-webapp/login.xhtml");
		loadLoginWebElments(driver);
		// Sending values
		j_username.sendKeys(user);
		j_password.sendKeys(password);
		logon_button.click();

		Thread.sleep(5000);

	}
	private void checkboxValidation(HashMap<Object, String> mapper){
		//Checkbox validation
		if (mapper.get(companyConstants.enum_chkbox_aggregateIndicator).contentEquals("Y")){
			chkbox_aggregateIndicator.click();
		}else{
			System.out.println("didn't match!!!");
			System.out.println("Value found: " + mapper.get(companyConstants.enum_chkbox_aggregateIndicator));
		}

		if (mapper.get(companyConstants.enum_chkbox_aggregateIndicator2).contentEquals("Y")){
			chkbox_aggregateIndicator2.click();
		}else{
			System.out.println("didn't match!!!");
			System.out.println("Value found: " + mapper.get(companyConstants.enum_chkbox_aggregateIndicator2));
		}

		if (mapper.get(companyConstants.enum_chkbox_zeroTransactionFee).contentEquals("Y")){
			chkbox_zeroTransactionFee.click();
		}else{
			System.out.println("didn't match!!!");
			System.out.println("Value found: " + mapper.get(companyConstants.enum_chkbox_zeroTransactionFee));
		}

		if (mapper.get(companyConstants.enum_chkbox_NumberOfFirstTrx).contentEquals("Y")){
			chkbox_NumberOfFirstTrx.click();
		}else{
			System.out.println("didn't match!!!");
			System.out.println("Value found: " + mapper.get(companyConstants.enum_chkbox_NumberOfFirstTrx));
		}

		if (mapper.get(companyConstants.enum_chkbox_numberOfFirstTrxFeeIndicator).contentEquals("Y")){
			chkbox_numberOfFirstTrxFeeIndicator.click();
		}else{
			System.out.println("didn't match!!!");
			System.out.println("Value found: " + mapper.get(companyConstants.enum_chkbox_numberOfFirstTrxFeeIndicator));
		}

		if (mapper.get(companyConstants.enum_chkbox_IncludeFirstTrxIndicator).contentEquals("Y")){
			chkbox_IncludeFirstTrxIndicator.click();
		}else{
			System.out.println("didn't match!!!");
			System.out.println("Value found: " + mapper.get(companyConstants.enum_chkbox_IncludeFirstTrxIndicator));
		}

		if (mapper.get(companyConstants.enum_chkbox_IncludeFirstTrxIndicator2).contentEquals("Y")){
			chkbox_IncludeFirstTrxIndicator2.click();
		}else{
			System.out.println("didn't match!!!");
			System.out.println("Value found: " + mapper.get(companyConstants.enum_chkbox_IncludeFirstTrxIndicator2));
		}

		if (mapper.get(companyConstants.enum_chkbox_ExtraFilingTrxFee).contentEquals("Y")){
			chkbox_ExtraFilingTrxFee.click();
		}else{
			System.out.println("didn't match!!!");
			System.out.println("Value found: " + mapper.get(companyConstants.enum_chkbox_ExtraFilingTrxFee));
		}

		if (mapper.get(companyConstants.enum_chkbox_ExtraPaymentTrxFee).contentEquals("Y")){
			chkbox_ExtraPaymentTrxFee.click();
		}else{
			System.out.println("didn't match!!!");
			System.out.println("Value found: " + mapper.get(companyConstants.enum_chkbox_ExtraPaymentTrxFee));
		}

		if (mapper.get(companyConstants.enum_chkbox_AdditionalPaymentAdvFee).contentEquals("Y")){
			chkbox_AdditionalPaymentAdvFee.click();
		}else{
			System.out.println("didn't match!!!");
			System.out.println("Value found: " + mapper.get(companyConstants.enum_chkbox_AdditionalPaymentAdvFee));
		}

		if (mapper.get(companyConstants.enum_chkbox_ChargeAllAdditionalPaymentAdv).contentEquals("Y")){
			chkbox_ChargeAllAdditionalPaymentAdv.click();
		}else{
			System.out.println("didn't match!!!");
			System.out.println("Value found: " + mapper.get(companyConstants.enum_chkbox_ChargeAllAdditionalPaymentAdv));
		}

		if (mapper.get(companyConstants.enum_chkbox_ChargeAllAdditionalPaymentAdv2).contentEquals("Y")){
			chkbox_ChargeAllAdditionalPaymentAdv2.click();
		}else{
			System.out.println("didn't match!!!");
			System.out.println("Value found: " + mapper.get(companyConstants.enum_chkbox_ChargeAllAdditionalPaymentAdv2));
		}

		if (mapper.get(companyConstants.enum_chkbox_NewUserEnrollmentFee).contentEquals("Y")){
			chkbox_NewUserEnrollmentFee.click();
		}else{
			System.out.println("didn't match!!!");
			System.out.println("Value found: " + mapper.get(companyConstants.enum_chkbox_NewUserEnrollmentFee));
		}

		if (mapper.get(companyConstants.enum_chkbox_Cancellation_FeeIndicator).contentEquals("Y")){
			chkbox_Cancellation_FeeIndicator.click();
		}else{
			System.out.println("didn't match!!!");
			System.out.println("Value found: " + mapper.get(companyConstants.enum_chkbox_Cancellation_FeeIndicator));
		}
		if (mapper.get(companyConstants.enum_chkbox_ReversalFeeIndicator).contains("Y")){
			chkbox_ReversalFeeIndicator.click();
		}else{
			System.out.println("didn't match!!!");
			System.out.println("Value found: " + mapper.get(companyConstants.enum_chkbox_ReversalFeeIndicator));
		}
		if (mapper.get(companyConstants.enum_chkbox_billingId).contentEquals("Y")){
			chkbox_billingId.click();	
		}else{
			System.out.println("didn't match!!!");
			System.out.println("Value found: " + mapper.get(companyConstants.enum_chkbox_billingId));
		}
	}
}


