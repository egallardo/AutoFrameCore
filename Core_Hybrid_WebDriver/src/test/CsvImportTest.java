package test;

import java.util.List;
import java.util.ArrayList;
import org.testng.annotations.Test;

import com.poc.model.AddPFSCompanyDetails;
import com.poc.util.CsvReader;;

/**
 * @param args
 * @throws InterruptedException
 * @author elmer.gallardo
 */

public class CsvImportTest {

	@Test()
	public void csvTest() throws InterruptedException {

		CsvReader csvUtil = new CsvReader();
		AddPFSCompanyDetails compDetails = new AddPFSCompanyDetails();
		List<AddPFSCompanyDetails> ListOfCompanys = new ArrayList<AddPFSCompanyDetails>();
		ListOfCompanys = csvUtil.importWorkstationData("../Core_Hybrid_WebDriver/src/com/poc/csv/dataImport.csv");

		int i = 0;
		while (i < ListOfCompanys.size()) {
			System.out.println("------------- Company: #" + (i+1) + " --------------");
			System.out.println("Field1:" + ListOfCompanys.get(i).getFiNumber().trim());
			System.out.println("Field2:" + ListOfCompanys.get(i).getUsertype());
			System.out.println("Field3:" + ListOfCompanys.get(i).getStatus());
			System.out.println("Field4:" + ListOfCompanys.get(i).getAdmintype());
			System.out.println("Field5:" + ListOfCompanys.get(i).getWebName());
			System.out.println("Field6:" + ListOfCompanys.get(i).getAddress());
			System.out.println("Field7:" + ListOfCompanys.get(i).getCity());
			System.out.println("Field8:" + ListOfCompanys.get(i).getProvince());
			System.out.println("Field9:" + ListOfCompanys.get(i).getPostalcode());
			System.out.println("Field10:" + ListOfCompanys.get(i).getContact());
			System.out.println("Field11:" + ListOfCompanys.get(i).getTelephone());
			System.out.println("Field12:" + ListOfCompanys.get(i).getFax());
			System.out.println("Field13:" + ListOfCompanys.get(i).getEmail());
			System.out.println("Field14:" + ListOfCompanys.get(i).getLanguage());
			System.out.println("Field15:" + ListOfCompanys.get(i).getMailingTransit());
			System.out.println("Field16:" + ListOfCompanys.get(i).getEnrollmentServicingTransit());
			System.out.println("Field17:" + ListOfCompanys.get(i).getContact2());
			System.out.println("Field18:" + ListOfCompanys.get(i).getTelephone2());
			System.out.println("Field19:" + ListOfCompanys.get(i).getContactNumber());
			System.out.println("Field20:" + ListOfCompanys.get(i).getCustomerReferenceNumber());
			System.out.println("Field21:" + ListOfCompanys.get(i).getBillMethod());
			System.out.println("Field22:" + ListOfCompanys.get(i).getRevenueExpenseTransit());
			System.out.println("Field23:" + ListOfCompanys.get(i).getAggregateIndicator());
			System.out.println("Field24:" + ListOfCompanys.get(i).getAggregateIndicator2());
			System.out.println("Field25:" + ListOfCompanys.get(i).getZeroTransactionFee());
			System.out.println("Field26:" + ListOfCompanys.get(i).getZeroTransactionFee2());
			System.out.println("Field27:" + ListOfCompanys.get(i).getNumberOfFirstTrx());
			System.out.println("Field28:" + ListOfCompanys.get(i).getNumberOffirsttrx2());
			System.out.println("Field29:" + ListOfCompanys.get(i).getNumberOfFirstTrxFeeIndicator());
			System.out.println("Field30:" + ListOfCompanys.get(i).getNumberOfFirstTrxFee());
			System.out.println("Field31:" + ListOfCompanys.get(i).getIncludeFirstTrxIndicator());
			System.out.println("Field32:" + ListOfCompanys.get(i).getIncludeFirstTrxIndicator2());
			System.out.println("Field33:" + ListOfCompanys.get(i).getExtraFilingTrxFee());
			System.out.println("Field34:" + ListOfCompanys.get(i).getExtraFilingTrxFee2());
			System.out.println("Field35:" + ListOfCompanys.get(i).getExtraPaymentTrxFee());
			System.out.println("Field36:" + ListOfCompanys.get(i).getExtraPaymentTrxFee2());
			System.out.println("Field37:" + ListOfCompanys.get(i).getAdditionalPaymentAdvFee());
			System.out.println("Field38:" + ListOfCompanys.get(i).getAdditionalPaymentAdvFee2());
			System.out.println("Field39:" + ListOfCompanys.get(i).getChargeAllAdditionalPaymentAdv());
			System.out.println("Field40:" + ListOfCompanys.get(i).getChargeAllAdditionalPaymentAdv2());
			System.out.println("Field41:" + ListOfCompanys.get(i).getNewUserEnrollmentFee());
			System.out.println("Field42:" + ListOfCompanys.get(i).getNewuserEnrollmentFee2());
			System.out.println("Field43:" + ListOfCompanys.get(i).getCancellationFeeIndicator());
			System.out.println("Field44:" + ListOfCompanys.get(i).getCancellationFee());
			System.out.println("Field45:" + ListOfCompanys.get(i).getReversalFeeIndicator());
			System.out.println("Field46:" + ListOfCompanys.get(i).getReversalFee());
			System.out.println("Field47:" + ListOfCompanys.get(i).getAccountIsABillingAccount());
			System.out.println("Field48:" + ListOfCompanys.get(i).getBranch());
			System.out.println("Field49:" + ListOfCompanys.get(i).getAccount());
			System.out.println("Field50:" + ListOfCompanys.get(i).getDescription());
			System.out.println("Field51:" + ListOfCompanys.get(i).getEmailNotification());
			System.out.println("Field52:" + ListOfCompanys.get(i).getAdminName());
			System.out.println("Field53:" + ListOfCompanys.get(i).getEmailAddress());
			System.out.println("Field54:" + ListOfCompanys.get(i).getPhoneNumber());
			System.out.println("Field55:" + ListOfCompanys.get(i).getExtension());
			i++;
		}
	}
}
