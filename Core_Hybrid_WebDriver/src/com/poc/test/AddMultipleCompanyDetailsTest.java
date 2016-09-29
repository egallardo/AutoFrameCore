package com.poc.test;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.gargoylesoftware.htmlunit.javascript.host.Element;
import com.poc.model.AddPFSCompanyDetails;
import com.poc.uidriver.AddPFSCompanyDetailsConstants;
import com.poc.util.CsvReader;
import com.poc.util.Utils;


/**
 * @param args
 * @throws InterruptedException
 * @author elmer.gallardo
 */

public class AddMultipleCompanyDetailsTest extends AddPFSCompanyDetailsConstants {
	CsvReader csvUtil = new CsvReader();
	Assertion Assertion = new Assertion();
	Utils Utils = new Utils();
	List<AddPFSCompanyDetails> ListOfCompanys = new ArrayList<AddPFSCompanyDetails>();
	Object[][] data;
	HashMap<Object,String> parameters = new HashMap<Object, String>();
	public static Logger APP_LOGS;
	WebDriver driver;
	WebDriverWait wait;


	@BeforeTest
	public void setup(){
		ListOfCompanys = csvUtil.importWorkstationData("../Core_Hybrid_WebDriver/src/com/poc/csv/dataImport.csv");
		System.out.println(ListOfCompanys);
		data = new Object[1][56];
	}
	
	@DataProvider
	public Object[][] importedData(){
		CsvReader csvUtil = new CsvReader();

		ListOfCompanys = csvUtil.importWorkstationData("../Core_Hybrid_WebDriver/src/com/poc/csv/dataImport.csv");

		Object[][] data = new Object[ListOfCompanys.size()][56];

		int i = 0;
		//		System.out.println(ListOfCompanys.size());
		while (i < ListOfCompanys.size()) {
			data[i][0] = ListOfCompanys.get(i).getFiNumber();
			data[i][1] = ListOfCompanys.get(i).getUsertype();
			data[i][2] = ListOfCompanys.get(i).getStatus();
			data[i][3] = ListOfCompanys.get(i).getAdmintype();
			data[i][4] = ListOfCompanys.get(i).getWebName();
			data[i][5] = ListOfCompanys.get(i).getAddress();
			data[i][6] = ListOfCompanys.get(i).getCity();
			data[i][7] = ListOfCompanys.get(i).getProvince();
			data[i][8] = ListOfCompanys.get(i).getPostalcode();
			data[i][9] = ListOfCompanys.get(i).getContact();
			data[i][10] = ListOfCompanys.get(i).getTelephone();
			data[i][11] = ListOfCompanys.get(i).getFax();
			data[i][12] = ListOfCompanys.get(i).getEmail();
			data[i][13] = ListOfCompanys.get(i).getLanguage();
			data[i][14] = ListOfCompanys.get(i).getMailingTransit();
			data[i][15] = ListOfCompanys.get(i).getEnrollmentServicingTransit();
			data[i][16] = ListOfCompanys.get(i).getContact2();
			data[i][17] = ListOfCompanys.get(i).getTelephone2();
			data[i][18] = ListOfCompanys.get(i).getContactNumber();
			data[i][19] = ListOfCompanys.get(i).getCustomerReferenceNumber();
			data[i][20] = ListOfCompanys.get(i).getBillMethod();
			data[i][21] = ListOfCompanys.get(i).getRevenueExpenseTransit();
			data[i][22] = ListOfCompanys.get(i).getAggregateIndicator();
			data[i][23] = ListOfCompanys.get(i).getAggregateIndicator2();
			data[i][24] = ListOfCompanys.get(i).getZeroTransactionFee();
			data[i][25] = ListOfCompanys.get(i).getZeroTransactionFee2();
			data[i][26] = ListOfCompanys.get(i).getNumberOfFirstTrx();
			data[i][27] = ListOfCompanys.get(i).getNumberOffirsttrx2();
			data[i][28] = ListOfCompanys.get(i).getNumberOfFirstTrxFeeIndicator();
			data[i][29] = ListOfCompanys.get(i).getNumberOfFirstTrxFee();
			data[i][30] = ListOfCompanys.get(i).getIncludeFirstTrxIndicator();
			data[i][31] = ListOfCompanys.get(i).getIncludeFirstTrxIndicator2();
			data[i][32] = ListOfCompanys.get(i).getExtraFilingTrxFee();
			data[i][33] = ListOfCompanys.get(i).getExtraFilingTrxFee2();
			data[i][34] = ListOfCompanys.get(i).getExtraPaymentTrxFee();
			data[i][35] = ListOfCompanys.get(i).getExtraPaymentTrxFee2();
			data[i][36] = ListOfCompanys.get(i).getAdditionalPaymentAdvFee();
			data[i][37] = ListOfCompanys.get(i).getAdditionalPaymentAdvFee2();
			data[i][38] = ListOfCompanys.get(i).getChargeAllAdditionalPaymentAdv();
			data[i][39] = ListOfCompanys.get(i).getChargeAllAdditionalPaymentAdv2();
			data[i][40] = ListOfCompanys.get(i).getNewUserEnrollmentFee();
			data[i][41] = ListOfCompanys.get(i).getNewuserEnrollmentFee2();
			data[i][42] = ListOfCompanys.get(i).getCancellationFeeIndicator();
			data[i][43] = ListOfCompanys.get(i).getCancellationFee();
			data[i][44] = ListOfCompanys.get(i).getReversalFeeIndicator();
			data[i][45] = ListOfCompanys.get(i).getReversalFee();
			data[i][46] = ListOfCompanys.get(i).getAccountIsABillingAccount();
			data[i][47] = ListOfCompanys.get(i).getBranch();
			data[i][48] = ListOfCompanys.get(i).getAccount();
			data[i][49] = ListOfCompanys.get(i).getDescription();
			data[i][50] = ListOfCompanys.get(i).getEmailNotification();
			data[i][51] = ListOfCompanys.get(i).getAdminName();
			data[i][52] = ListOfCompanys.get(i).getEmailAddress();
			data[i][53] = ListOfCompanys.get(i).getPhoneNumber();
			data[i][54] = ListOfCompanys.get(i).getExtension();
			data[i][55] = ListOfCompanys.get(i).getFiNumber2();

			i++;
		}
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
		
		APP_LOGS = Logger.getLogger("devpinoyLogger");
		APP_LOGS.debug("Starting test execution " + this.getClass().getName());
		APP_LOGS.debug("Printing imported data:");
		APP_LOGS.debug(
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
		
		APP_LOGS.debug("Initializing WebDriver");
/*		//System.setProperty("webdriver.gecko.driver", "C:/Users/elmer.gallardo/Documents/POC/geckodriver-v0.10.0-win64/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:/Users/elmer.gallardo/Documents/POC/chromedriver.exe");
		DesiredCapabilities caps = DesiredCapabilities.chrome();        
		WebDriver driver = new ChromeDriver(caps);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//WebDriver driver = new FirefoxDriver();
		 
*/		
		//You can Use Chrome or Firefox
		driver = Utils.configureWebDriver(driver, "Firefox");
		
		wait = new WebDriverWait(driver, 30);
		driver.manage().window().maximize(); 
		login("224100056", "Password*1" ,driver);
		APP_LOGS.debug("Loading Menu Elements");
		loadMenuWebElments(driver);
		ui_menu.click();
		ui_menu.click();
		Thread.sleep(3000);
		//wait.until(ExpectedConditions.elementToBeClickable(ui_menu_addPfsCompany));
		ui_menu_addPfsCompany.click();
		Thread.sleep(3000);
		//loading webelements with xpath in the form
		APP_LOGS.debug("Loading Company Elements");
		loadAddCompanyWebElments(driver);
		APP_LOGS.debug("Filling  Company Information form with data provider information");
		Thread.sleep(2000);
		JavascriptExecutor js =Utils.executejQuery("fiNumberId_input",fiNumber,driver);//"fiNumberId_input","1",driver
		Thread.sleep(1000);
		//Refreshing Web Element
		js.executeScript("$('select[id*=\""+ "fiNumberId_input" + "\"]').val(\""+fiNumber+"\").trigger(\"change\");");
		Thread.sleep(3000);
		loadAddCompanyWebElments(driver);
		cleanForm(driver);
		Utils.executejQuery("userTypeId_input",usertype,driver);//"userTypeId_input","U",driver 
		Utils.executejQuery("statusId_input",status,driver);//"statusId_input","R",driver
		Utils.executejQuery("adminTypeId_input",admintype,driver);//"adminTypeId_input","0",driver
		Thread.sleep(1000);
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
		//System.out.println("****************************************");
		//System.out.println(parameters.get(companyConstants.enum_chkbox_aggregateIndicator));
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
			APP_LOGS.debug("Adding Bank Account");
			btn_AddAccount.click();
		}catch(Exception e){
			Assertion.fail("Not able to click Add Account Button" + "\n" + e.getMessage() );

		}
//		Thread.sleep(1000);
		Utils.executejQuery("emailNotificationId_input",emailNotification,driver);
		btn_Add.click();
		//btn_ClearAll.click();
		//btn_Cancel.click();
		//Utils.waitForPageToLoad(driver);
		Thread.sleep(5000);
		Assertion.assertEquals(driver.getPageSource().contains("The new PFS company is pending authorization."), true);
		driver.quit();
		
	}
	private void cleanForm(WebDriver driver) {
		APP_LOGS.debug("Cleaning form");
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
		APP_LOGS.debug("Login into the application");
		driver.get("http://10.36.6.174/apt-webapp/login.xhtml");
		loadLoginWebElments(driver);
		// Sending values
		j_username.sendKeys(user);
		j_password.sendKeys(password);
		logon_button.click();
		
		Thread.sleep(5000);

	}
	private void checkboxValidation(HashMap<Object, String> mapper){
		APP_LOGS.debug("Marking Billing Information options Selected");
		//Checkbox validation
		if (mapper.get(companyConstants.enum_chkbox_aggregateIndicator).contentEquals("Y")){
			chkbox_aggregateIndicator.click();
		}/*else{
			System.out.println("didn't match!!!");
			APP_LOGS.debug("Marking Billing Information options");
			System.out.println("Value found: " + mapper.get(companyConstants.enum_chkbox_aggregateIndicator));
		}*/

		if (mapper.get(companyConstants.enum_chkbox_aggregateIndicator2).contentEquals("Y")){
			chkbox_aggregateIndicator2.click();
		}
		if (mapper.get(companyConstants.enum_chkbox_zeroTransactionFee).contentEquals("Y")){
			chkbox_zeroTransactionFee.click();
		}
		if (mapper.get(companyConstants.enum_chkbox_NumberOfFirstTrx).contentEquals("Y")){
			chkbox_NumberOfFirstTrx.click();
		}
		if (mapper.get(companyConstants.enum_chkbox_numberOfFirstTrxFeeIndicator).contentEquals("Y")){
			chkbox_numberOfFirstTrxFeeIndicator.click();
		}
		if (mapper.get(companyConstants.enum_chkbox_IncludeFirstTrxIndicator).contentEquals("Y")){
			chkbox_IncludeFirstTrxIndicator.click();
		}
		if (mapper.get(companyConstants.enum_chkbox_IncludeFirstTrxIndicator2).contentEquals("Y")){
			chkbox_IncludeFirstTrxIndicator2.click();
		}
		if (mapper.get(companyConstants.enum_chkbox_ExtraFilingTrxFee).contentEquals("Y")){
			chkbox_ExtraFilingTrxFee.click();
		}
		if (mapper.get(companyConstants.enum_chkbox_ExtraPaymentTrxFee).contentEquals("Y")){
			chkbox_ExtraPaymentTrxFee.click();
		}
		if (mapper.get(companyConstants.enum_chkbox_AdditionalPaymentAdvFee).contentEquals("Y")){
			chkbox_AdditionalPaymentAdvFee.click();
		}
		if (mapper.get(companyConstants.enum_chkbox_ChargeAllAdditionalPaymentAdv).contentEquals("Y")){
			chkbox_ChargeAllAdditionalPaymentAdv.click();
		}
		if (mapper.get(companyConstants.enum_chkbox_ChargeAllAdditionalPaymentAdv2).contentEquals("Y")){
			chkbox_ChargeAllAdditionalPaymentAdv2.click();
		}
		if (mapper.get(companyConstants.enum_chkbox_NewUserEnrollmentFee).contentEquals("Y")){
			chkbox_NewUserEnrollmentFee.click();
		}
		if (mapper.get(companyConstants.enum_chkbox_Cancellation_FeeIndicator).contentEquals("Y")){
			chkbox_Cancellation_FeeIndicator.click();
		}
		if (mapper.get(companyConstants.enum_chkbox_ReversalFeeIndicator).contains("Y")){
			chkbox_ReversalFeeIndicator.click();
		}
		if (mapper.get(companyConstants.enum_chkbox_billingId).contentEquals("Y")){
			chkbox_billingId.click();	
		}
	}
}


