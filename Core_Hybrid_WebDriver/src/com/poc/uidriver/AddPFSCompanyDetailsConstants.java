package com.poc.uidriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.poc.test.Constants;

public class AddPFSCompanyDetailsConstants extends Constants {
	
	//Enums
	public enum companyConstants {
		enum_dpd_fiNumberId,
		enum_dpd_userTypeId,
		enum_dpd_statusId,
		enum_dpd_adminTypeId,
		enum_webNameId,
		enum_addressId1,
		enum_addressId2,
		enum_cityId,
		enum_dpd_provinceId,
		enum_postalCodeId,
		enum_contactId,
		enum_telephoneId,
		enum_faxId,
		enum_emailId,
		enum_dpd_languageId,
		enum_mailingTransitId,
		enum_enrollTransitId,
		
		//Financial Institution information webElements
		enum_fiContactId,
		enum_fiContactTelephone,
		enum_fiContactNumbId,
		enum_fiCustRefId,
		//Billing Information webElements
		enum_dpd_billingMethodId,
		enum_revenueExpId_input,
		enum_chkbox_aggregateIndicator,
		enum_chkbox_aggregateIndicator2,
		enum_chkbox_zeroTransactionFee,
		enum_zeroTranFeeId,
		enum_chkbox_NumberOfFirstTrx,
		enum_numFirstTrxId_input,
		enum_chkbox_numberOfFirstTrxFeeIndicator,
		enum_firstTrxFeeId_input,
		enum_chkbox_IncludeFirstTrxIndicator,
		enum_chkbox_IncludeFirstTrxIndicator2,
		enum_chkbox_ExtraFilingTrxFee,
		enum_axftTrxFeeId,
		enum_chkbox_ExtraPaymentTrxFee,
		enum_axptTrxFeeId_input,
		enum_chkbox_AdditionalPaymentAdvFee,
		enum_aapaFeeId_input,
		enum_chkbox_ChargeAllAdditionalPaymentAdv,
		enum_chkbox_ChargeAllAdditionalPaymentAdv2,
		enum_chkbox_NewUserEnrollmentFee,
		enum_nrlFeeId_input,
		enum_chkbox_Cancellation_FeeIndicator,
		enum_cclFeeId,
		enum_chkbox_ReversalFeeIndicator,
		enum_rvsFeeId_input,
		enum_billingPanelId,
		//Bank account details webElements
		enum_lbl_accountPanelId,
		enum_lbl_billingBranchNumId,
		enum_lbl_accountPanelId2,
		enum_accFi,
		enum_chkbox_billingId,
		enum_branchInputId,
		enum_accInputId,
		enum_descInputId,

		//Authorization information webElements
		enum_dpd_emailNotificationId,
		enum_lbl_CompanyLimit,
		enum_lbl_NumberOfAuthReq,

	}
	
//----------------------------------------------------	
	//WebElements
	public static WebElement dpd_fiNumberId_label; 
	public static WebElement dpd_userTypeId_label;
	public static WebElement dpd_statusId_label;
	public static WebElement dpd_adminTypeId_label;
	public static WebElement webNameId;
	public static WebElement addressId1;
	public static WebElement addressId2;
	public static WebElement cityId;
	public static WebElement dpd_provinceId_label;
	public static WebElement postalCodeId;
	public static WebElement contactId;
	public static WebElement telephoneId;
	public static WebElement faxId;
	public static WebElement emailId;
	public static WebElement dpd_languageId_label;
	public static WebElement mailingTransitId;
	public static WebElement enrollTransitId;
	
	//Financial Institution information webElements
	public static WebElement fiContactId;
	public static WebElement fiContactTelephone;
	public static WebElement fiContactNumbId;
	public static WebElement fiCustRefId;
	//Billing Information webElements
	public static WebElement dpd_billingMethodId_label;
	public static WebElement revenueExpId_input;
	public static WebElement chkbox_aggregateIndicator;
	public static WebElement chkbox_aggregateIndicatorFlag;
	public static WebElement chkbox_aggregateIndicator2;
	public static WebElement chkbox_aggregateIndicator2Flag;
	public static WebElement chkbox_zeroTransactionFee;
	public static WebElement chkbox_zeroTransactionFeeFlag;
	public static WebElement zeroTranFeeId_input;
	public static WebElement chkbox_NumberOfFirstTrx;
	public static WebElement chkbox_NumberOfFirstTrxFlag;
	public static WebElement numFirstTrxId_input;
	public static WebElement chkbox_numberOfFirstTrxFeeIndicator;
	public static WebElement chkbox_numberOfFirstTrxFeeIndicatorFlag;
	public static WebElement firstTrxFeeId_input;
	public static WebElement chkbox_IncludeFirstTrxIndicator;
	public static WebElement chkbox_IncludeFirstTrxIndicatorFlag;
	public static WebElement chkbox_IncludeFirstTrxIndicator2;
	public static WebElement chkbox_IncludeFirstTrxIndicator2Flag;
	public static WebElement chkbox_ExtraFilingTrxFee;
	public static WebElement chkbox_ExtraFilingTrxFeeFlag;
	public static WebElement axftTrxFeeId_input;
	public static WebElement chkbox_ExtraPaymentTrxFee;
	public static WebElement chkbox_ExtraPaymentTrxFeeFlag;
	public static WebElement axptTrxFeeId_input;
	public static WebElement chkbox_AdditionalPaymentAdvFee;
	public static WebElement chkbox_AdditionalPaymentAdvFeeFlag;
	public static WebElement aapaFeeId_input;
	public static WebElement chkbox_ChargeAllAdditionalPaymentAdv;
	public static WebElement chkbox_ChargeAllAdditionalPaymentAdvFlag;
	public static WebElement chkbox_ChargeAllAdditionalPaymentAdv2;
	public static WebElement chkbox_ChargeAllAdditionalPaymentAdv2Flag;
	public static WebElement chkbox_NewUserEnrollmentFee;
	public static WebElement chkbox_NewUserEnrollmentFeeFlag;
	public static WebElement nrlFeeId_input;
	public static WebElement chkbox_Cancellation_FeeIndicator;
	public static WebElement chkbox_Cancellation_FeeIndicatorFlag;
	public static WebElement cclFeeId_input;
	public static WebElement chkbox_ReversalFeeIndicator;
	public static WebElement chkbox_ReversalFeeIndicatorFlag;
	public static WebElement rvsFeeId_input;
	public static WebElement billingPanelId;
	//Bank account details webElements
	public static WebElement lbl_accountPanelId;
	public static WebElement lbl_billingBranchNumId;
	public static WebElement lbl_accountPanelId2;
	public static WebElement accFi;
	public static WebElement chkbox_billingId;
	public static WebElement chkbox_billingIdFlag;
	public static WebElement branchInputId;
	public static WebElement accInputId;
	public static WebElement descInputId;
	public static WebElement btn_AddAccount;
	public static WebElement btn_UpdateAccount; 
	public static WebElement btn_DeleteAccount;

	//Authorization information webElements
	public static WebElement dpd_emailNotificationId_label;
	public static WebElement lbl_CompanyLimit;
	public static WebElement lbl_NumberOfAuthReq;

	// Form Buttons webElements
	public static WebElement btn_Add;
	public static WebElement btn_ClearAll;
	public static WebElement btn_Cancel;
	//-------------------------------

	public void loadAddCompanyWebElments(WebDriver driver){
		//Company information webElements
		dpd_fiNumberId_label = driver.findElement(By.xpath("//*[@id='addCompanyFormId']/div[3]/div/div[1]/div[1]/table/tbody/tr/td[2]/div[1]/div[2]/select")); 
		dpd_userTypeId_label = driver.findElement(By.xpath("//*[@id='addCompanyFormId:userTypeId_input']"));
		dpd_statusId_label = driver.findElement(By.xpath("//*[@id='addCompanyFormId:statusId_input']"));
		dpd_adminTypeId_label = driver.findElement(By.xpath("//*[@id='addCompanyFormId:adminTypeId_input']"));
		webNameId = driver.findElement(By.xpath("//*[@id='addCompanyFormId:webNameId']"));
		addressId1 = driver.findElement(By.xpath("//*[@id='addCompanyFormId:addressId1']"));
		addressId2 = driver.findElement(By.xpath("//*[@id='addCompanyFormId:addressId2']"));
		cityId = driver.findElement(By.xpath("//*[@id='addCompanyFormId:cityId']"));
		dpd_provinceId_label = driver.findElement(By.xpath(".//*[@id='addCompanyFormId:provinceId_input']"));
		postalCodeId = driver.findElement(By.xpath("//*[@id='addCompanyFormId:postalCodeId']"));
		contactId = driver.findElement(By.xpath("//*[@id='addCompanyFormId:contactId']"));
		telephoneId = driver.findElement(By.xpath("//*[@id='addCompanyFormId:telephoneId']"));
		faxId = driver.findElement(By.xpath("//*[@id='addCompanyFormId:faxId']"));
		emailId = driver.findElement(By.xpath("//*[@id='addCompanyFormId:emailId']"));
		dpd_languageId_label = driver.findElement(By.xpath(".//*[@id='addCompanyFormId:languageId_input']"));
		mailingTransitId = driver.findElement(By.xpath("//*[@id='addCompanyFormId:mailingTransitId']"));
		enrollTransitId = driver.findElement(By.xpath("//*[@id='addCompanyFormId:enrollTransitId']"));
		//				Financial Institution information webElements
		fiContactId = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:fiContactId']"));
		fiContactTelephone = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:fiContactTelephone']"));
		fiContactNumbId = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:fiContactNumbId']"));
		fiCustRefId = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:fiCustRefId']"));
		//		Billing Information webElements
		dpd_billingMethodId_label = driver.findElement(By.xpath(".//*[@id='addCompanyFormId:accordion:billingMethodId_input']"));
		revenueExpId_input = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:revenueExpId_input']"));
		
		chkbox_aggregateIndicator = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[3]/td[1]/div/div[2]/span"));///div[2]/span 
		chkbox_aggregateIndicatorFlag = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[3]/td[1]/div/div[1]/input"));///div[2]/span
		
		chkbox_aggregateIndicator2 = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[3]/td[2]/div/div[2]/span"));///div[2]/span
		chkbox_aggregateIndicator2Flag = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[3]/td[2]/div/div[1]/input"));
		
		chkbox_zeroTransactionFee = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[4]/td[1]/div/div[2]/span"));///div[2]/span
		chkbox_zeroTransactionFeeFlag = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[4]/td[1]/div/div[1]/input"));
		
		zeroTranFeeId_input = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:zeroTranFeeId_input']"));
		
		chkbox_NumberOfFirstTrx = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[5]/td[1]/div/div[2]/span"));
		chkbox_NumberOfFirstTrxFlag = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[5]/td[1]/div/div[1]/input"));
		
		numFirstTrxId_input = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:numFirstTrxId_input']"));
		
		chkbox_numberOfFirstTrxFeeIndicator = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[6]/td[1]/div/div[2]/span"));
		chkbox_numberOfFirstTrxFeeIndicatorFlag = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[6]/td[1]/div/div[1]/input"));
		
		firstTrxFeeId_input = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:firstTrxFeeId_input']"));
		
		chkbox_IncludeFirstTrxIndicator = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[7]/td[1]/div/div[2]/span"));
		chkbox_IncludeFirstTrxIndicatorFlag = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[7]/td[1]/div/div[1]/input"));
		
		chkbox_IncludeFirstTrxIndicator2 = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[7]/td[2]/div/div[2]/span"));
		chkbox_IncludeFirstTrxIndicator2Flag = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[7]/td[2]/div/div[1]/input"));
		
		chkbox_IncludeFirstTrxIndicator2 = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[7]/td[2]/div/div[2]/span"));
		chkbox_IncludeFirstTrxIndicator2Flag = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[7]/td[2]/div/div[1]/input"));
		
		chkbox_ExtraFilingTrxFee = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[8]/td[1]/div/div[2]/span"));
		chkbox_ExtraFilingTrxFeeFlag = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[8]/td[1]/div/div[1]/input"));
		
		axftTrxFeeId_input = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:axftTrxFeeId_input']"));
		
		chkbox_ExtraPaymentTrxFee = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[9]/td[1]/div/div[2]/span"));
		chkbox_ExtraPaymentTrxFeeFlag = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[9]/td[1]/div/div[1]/input"));
		
		axptTrxFeeId_input = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:axptTrxFeeId_input']"));
		
		chkbox_AdditionalPaymentAdvFee = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[10]/td[1]/div/div[2]/span"));
		chkbox_AdditionalPaymentAdvFeeFlag = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[10]/td[1]/div/div[1]/input"));
		
		aapaFeeId_input = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:aapaFeeId_input']"));
		
		chkbox_ChargeAllAdditionalPaymentAdv = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[11]/td[1]/div/div[2]/span"));
		chkbox_ChargeAllAdditionalPaymentAdvFlag = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[11]/td[1]/div/div[1]/input"));
		
		chkbox_ChargeAllAdditionalPaymentAdv2 = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[11]/td[2]/div/div[2]/span"));
		chkbox_ChargeAllAdditionalPaymentAdv2Flag = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[11]/td[2]/div/div[1]/input"));
		
		chkbox_NewUserEnrollmentFee = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[12]/td[1]/div/div[2]/span"));
		chkbox_NewUserEnrollmentFeeFlag = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[12]/td[1]/div/div[1]/input"));
		
		nrlFeeId_input = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:nrlFeeId_input']"));
		
		chkbox_Cancellation_FeeIndicator = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[13]/td[1]/div/div[2]/span"));
		chkbox_Cancellation_FeeIndicatorFlag = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[13]/td[1]/div/div[1]/input"));
		
		cclFeeId_input = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:cclFeeId_input']"));
		
		chkbox_ReversalFeeIndicator = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[14]/td[1]/div/div[2]/span"));
		chkbox_ReversalFeeIndicatorFlag = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingInfoTab']/table/tbody/tr[14]/td[1]/div/div[1]/input"));
		
		rvsFeeId_input = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:rvsFeeId_input']"));
		billingPanelId = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingPanelId']/tbody/tr[14]/td[3]"));
		//		Bank Account Information
		lbl_accountPanelId= driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:accountPanelId']/tbody/tr[2]/td[2]"));
		lbl_billingBranchNumId= driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:billingBranchNumId']"));

		//		Bank account details
		lbl_accountPanelId2= driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:accountPanelId2']/tbody/tr[2]/td[2]"));
		accFi = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:accFI']"));
		
		chkbox_billingId = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:accountTab']/table[2]/tbody/tr[2]/td[3]/div/div[2]/span"));
		chkbox_billingIdFlag = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:accountTab']/table[2]/tbody/tr[2]/td[3]/div/div[1]/input"));
		
		branchInputId = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:branchInputId']"));
		accInputId = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:accInputId']"));
		descInputId = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:descInputId']"));
		btn_AddAccount = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:accountTab']/table[3]/tbody/tr/td[1]/button"));
		btn_UpdateAccount = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:accountTab']/table[3]/tbody/tr/td[2]/button"));
		btn_DeleteAccount = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:accountTab']/table[3]/tbody/tr/td[3]/button"));

		//		Authorization information
		dpd_emailNotificationId_label = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:emailNotificationId_input']"));
		lbl_CompanyLimit = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:adminPanelId']/tbody/tr[1]/td[5]"));
		lbl_NumberOfAuthReq = driver.findElement(By.xpath("//*[@id='addCompanyFormId:accordion:adminPanelId']/tbody/tr[2]/td[3]"));

		//		Form Buttons
		btn_Add = driver.findElement(By.xpath("//*[@id='addCompanyFormId']/div[3]/div[1]/div[1]/div[2]/table/tbody/tr/td[1]/button"));
		btn_ClearAll = driver.findElement(By.xpath("//*[@id='addCompanyFormId']/div[3]/div[1]/div[1]/div[2]/table/tbody/tr/td[2]/button"));
		btn_Cancel = driver.findElement(By.xpath("//*[@id='addCompanyFormId']/div[3]/div[1]/div[1]/div[2]/table/tbody/tr/td[3]/button"));	}
}
