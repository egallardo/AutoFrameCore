package test;


import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;


public class Login_test {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	@Test()
	public void loginTest() throws InterruptedException {

		// Optional, if not specified, WebDriver will search your path for chromedriver.
		//System.setProperty("webdriver.chrome.driver", "C:/Users/elmer.gallardo/Documents/POC/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:/Users/elmer.gallardo/Documents/POC/geckodriver-v0.10.0-win64/geckodriver.exe");
		//DesiredCapabilities caps = DesiredCapabilities.chrome();        
		  
		  
		//WebDriver driver = new ChromeDriver(caps);
		WebDriver driver = new FirefoxDriver();
		driver.get("http://10.36.6.174/apt-webapp/login.xhtml");
		
		//Capturing Elements
		//---------------------------------------------------------------------------------------------------------------------------
		//Login WebElements
		WebElement j_username = driver.findElement(By.xpath("//*[@id='login_content']/table[2]/tbody/tr[1]/td[2]/input"));
		WebElement j_password = driver.findElement(By.xpath("//*[@id='login_content']/table[2]/tbody/tr[2]/td[2]/input"));
		WebElement logon_button = driver.findElement(By.xpath("//*[@id='login_content']/table[4]/tbody/tr/td/input"));

		
		//--------------------------------------------------------------------------------------------------------------------------------
		
		// Sending values
		j_username.sendKeys("224100056");
		j_password.sendKeys("Password*1");
		logon_button.click();
		
		Thread.sleep(5000);
		WebElement ui_menu_addPfsCompany = driver.findElement(By.xpath("//*[@id='layoutFormID:menuBarID']/ul/li[1]/ul/li[4]/a/span"));
		WebElement ui_menu = driver.findElement(By.xpath("//*[@id='layoutFormID:menuBarID']/ul/li[1]/a/span[2]"));
		
		ui_menu.click();
		Thread.sleep(3000);
		ui_menu_addPfsCompany.click();
		
		Thread.sleep(3000);
		//-----------------------------------------------------
		//Company information webElements
		
		WebElement dpd_fiNumberId_label = driver.findElement(By.xpath("//*[@id='addCompanyFormId:fiNumberId_label']")); 
		WebElement dpd_userTypeId_label = driver.findElement(By.xpath("//*[@id='addCompanyFormId:userTypeId_label']"));
		WebElement dpd_statusId_label = driver.findElement(By.xpath("//*[@id='addCompanyFormId:statusId_label']"));
		WebElement dpd_adminTypeId_label = driver.findElement(By.xpath("//*[@id='addCompanyFormId:adminTypeId_label']"));
		WebElement webNameId = driver.findElement(By.xpath("//*[@id='addCompanyFormId:webNameId']"));
		WebElement addressId1 = driver.findElement(By.xpath("//*[@id='addCompanyFormId:addressId1']"));
		WebElement addressId2 = driver.findElement(By.xpath("//*[@id='addCompanyFormId:addressId2']"));
		WebElement cityId = driver.findElement(By.xpath("//*[@id='addCompanyFormId:cityId']"));
		WebElement dpd_provinceId_label = driver.findElement(By.xpath("//*[@id='addCompanyFormId:provinceId_label']"));
		WebElement postalCodeId = driver.findElement(By.xpath("//*[@id='addCompanyFormId:postalCodeId']"));
		WebElement contactId = driver.findElement(By.xpath("//*[@id='addCompanyFormId:contactId']"));
		WebElement telephoneId = driver.findElement(By.xpath("//*[@id='addCompanyFormId:telephoneId']"));
		WebElement faxId = driver.findElement(By.xpath("//*[@id='addCompanyFormId:faxId']"));
		WebElement emailId = driver.findElement(By.xpath("//*[@id='addCompanyFormId:emailId']"));
		WebElement dpd_languageId_label = driver.findElement(By.xpath("//*[@id='addCompanyFormId:languageId_label']"));
		WebElement mailingTransitId = driver.findElement(By.xpath("//*[@id='addCompanyFormId:mailingTransitId']"));
		WebElement enrollTransitId = driver.findElement(By.xpath("//*[@id='addCompanyFormId:enrollTransitId']"));

		//Financial Institution information webElements
		WebElement fiContactId = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:fiContactId']"));
		WebElement fiContactTelephone = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:fiContactTelephone']"));
		WebElement fiContactNumbId = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:fiContactNumbId']"));
		WebElement fiCustRefId = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:fiCustRefId']"));
		//Billing Information webElements
		WebElement dpd_billingMethodId_label = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingMethodId_label']"));
		WebElement revenueExpId_input = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:revenueExpId_input']"));
		WebElement chkbox_aggregateIndicator = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[3]/td[1]/div/div[2]/span")); //Aquiiiiiiiiiiii
		WebElement chkbox_aggregateIndicator2 = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[3]/td[2]/div/div[2]/span"));
		WebElement chkbox_zeroTransactionFee = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[4]/td[1]/div/div[2]/span"));
		WebElement zeroTranFeeId_input = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:zeroTranFeeId_input']"));
		WebElement chkbox_NumberOfFirstTrx = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[5]/td[1]/div/div[2]/span"));
		WebElement numFirstTrxId_input = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:numFirstTrxId_input']"));
		WebElement chkbox_numberOfFirstTrxFeeIndicator = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[6]/td[1]/div/div[2]/span"));
		WebElement firstTrxFeeId_input = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:firstTrxFeeId_input']"));
		WebElement chkbox_IncludeFirstTrxIndicator = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[7]/td[1]/div/div[2]/span"));
		WebElement chkbox_IncludeFirstTrxIndicator2 = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[7]/td[2]/div/div[2]/span"));
		WebElement chkbox_ExtraFilingTrxFee = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[8]/td[1]/div/div[2]/span"));
		WebElement axftTrxFeeId_input = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:axftTrxFeeId_input']"));
		WebElement chkbox_ExtraPaymentTrxFee = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[9]/td[1]/div/div[2]/span"));
		WebElement axptTrxFeeId_input = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:axptTrxFeeId_input']"));
		WebElement chkbox_AdditionalPaymentAdvFee = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[10]/td[1]/div/div[2]/span"));
		WebElement aapaFeeId_input = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:aapaFeeId_input']"));
		WebElement chkbox_ChargeAllAdditionalPaymentAdv = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[11]/td[1]/div/div[2]/span"));
		WebElement chkbox_ChargeAllAdditionalPaymentAdv2 = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[11]/td[2]/div/div[2]/span"));
		WebElement chkbox_NewUserEnrollmentFee = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[12]/td[1]/div/div[2]/span"));
		WebElement nrlFeeId_input = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:nrlFeeId_input']"));
		WebElement chkbox_Cancellation_FeeIndicator = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[13]/td[1]/div/div[2]/span"));
		WebElement cclFeeId_input = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:cclFeeId_input']"));
		WebElement chkbox_ReversalFeeIndicator = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[14]/td[1]/div/div[2]/span"));
		WebElement billingPanelId = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingPanelId']/tbody/tr[14]/td[3]"));
		//Bank Account Information webElements
		WebElement lbl_accountPanelId= driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:accountPanelId']/tbody/tr[2]/td[2]"));
		WebElement lbl_billingBranchNumId= driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingBranchNumId']"));
		WebElement lbl_accountPanelId2= driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:accountPanelId2']/tbody/tr[2]/td[2]"));
		WebElement chkbox_billingId = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:accountTab']/table[2]/tbody/tr[2]/td[3]/div/div[2]/span"));
		WebElement branchInputId = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:branchInputId']"));
		WebElement accInputId = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:accInputId']"));
		WebElement descInputId = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:descInputId']"));
		WebElement btn_AddAccount = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:accountTab']/table[3]/tbody/tr/td[1]/button"));
		WebElement btn_UpdateAccount = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:accountTab']/table[3]/tbody/tr/td[2]/button"));
		WebElement btn_DeleteAccount = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:accountTab']/table[3]/tbody/tr/td[3]/button"));
		
		//Authorization information webElements
		WebElement dpd_emailNotificationId_label = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:emailNotificationId_label']"));
		WebElement lbl_CompanyLimit = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:adminPanelId']/tbody/tr[1]/td[5]"));
		WebElement lbl_NumberOfAuthReq = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:adminPanelId']/tbody/tr[2]/td[3]"));
		
		// Form Buttons webElements
		WebElement btn_Add = driver.findElement(By.xpath("//*[@id='addCompanyFormId']/div[3]/div[1]/div[1]/div[2]/table/tbody/tr/td[1]/button"));
		WebElement btn_ClearAll = driver.findElement(By.xpath("//*[@id='addCompanyFormId']/div[3]/div[1]/div[1]/div[2]/table/tbody/tr/td[2]/button"));
		WebElement btn_Cancel = driver.findElement(By.xpath("//*[@id='addCompanyFormId']/div[3]/div[1]/div[1]/div[2]/table/tbody/tr/td[3]/button"));
		//-------------------------------
		
	
		
		// Filling Company Information
		dpd_fiNumberId_label.sendKeys("Bank of Nova Scotia");
		dpd_userTypeId_label.sendKeys("Company");
		dpd_statusId_label.sendKeys("Active");
		dpd_adminTypeId_label.sendKeys("Single user");
		webNameId.sendKeys( "BNS Single User Company #1");
		addressId1.sendKeys( "321 Bank Street");
		addressId2.sendKeys("");
		cityId.sendKeys( "Toronto");
		dpd_provinceId_label.sendKeys( "Ontario");
		postalCodeId.sendKeys( "K0M1A0");
		contactId.sendKeys( "Andrew Pasquale");
		telephoneId.sendKeys("9999999999");
		faxId.sendKeys("9999999999");
		emailId.sendKeys( "andrew.pasquale@telus.com");
		dpd_languageId_label.sendKeys("English");
		mailingTransitId.sendKeys("0");
		enrollTransitId.sendKeys("1000");
		fiContactId.sendKeys("");
		fiContactTelephone.sendKeys("");
		fiContactNumbId.sendKeys("");
		fiCustRefId.sendKeys("");
		dpd_billingMethodId_label.sendKeys("");
		revenueExpId_input.sendKeys("");
		zeroTranFeeId_input.sendKeys("");
		numFirstTrxId_input.sendKeys("");
		firstTrxFeeId_input.sendKeys("");
		axftTrxFeeId_input.sendKeys("");
		axptTrxFeeId_input.sendKeys("");
		aapaFeeId_input.sendKeys("");
		nrlFeeId_input.sendKeys("");
		cclFeeId_input.sendKeys("");
		billingPanelId.sendKeys("");
		lbl_accountPanelId.sendKeys("");
		lbl_billingBranchNumId.sendKeys("");
		lbl_accountPanelId2.sendKeys("");
		branchInputId.sendKeys("");
		accInputId.sendKeys("");
		descInputId.sendKeys("");
		dpd_emailNotificationId_label.sendKeys("");
		lbl_CompanyLimit.sendKeys("");
		lbl_NumberOfAuthReq.sendKeys("");
		
		chkbox_aggregateIndicator.click();
		chkbox_aggregateIndicator2.click();
		
		chkbox_zeroTransactionFee.click();
		chkbox_NumberOfFirstTrx.click();
		chkbox_numberOfFirstTrxFeeIndicator.click();
		chkbox_IncludeFirstTrxIndicator.click();
		chkbox_IncludeFirstTrxIndicator2.click();
		chkbox_ExtraFilingTrxFee.click();
		chkbox_ExtraPaymentTrxFee.click();
		chkbox_AdditionalPaymentAdvFee.click();
		chkbox_ChargeAllAdditionalPaymentAdv.click();
		chkbox_ChargeAllAdditionalPaymentAdv2.click();
		chkbox_NewUserEnrollmentFee.click();
		chkbox_Cancellation_FeeIndicator.click();
		chkbox_ReversalFeeIndicator.click();
		chkbox_billingId.click();
		
		//btn_AddAccount.click();
		//btn_UpdateAccount.click();
		//btn_DeleteAccount.click();
		
		//btn_Add.click();
		//btn_ClearAll.click();
		//btn_Cancel.click();
	}

}
