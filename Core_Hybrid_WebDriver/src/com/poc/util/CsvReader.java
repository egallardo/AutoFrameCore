package com.poc.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.poc.model.AddPFSCompanyDetails;

/**
 * 
 * @author elmer.gallardo
 *
 */

public class CsvReader {

	public static Logger APP_LOGS;
	
	

	public List<AddPFSCompanyDetails> importWorkstationData(String csvFile){
		
		AddPFSCompanyDetails compDetails;
		List<AddPFSCompanyDetails> ListCompanyDetails = new ArrayList<AddPFSCompanyDetails>();
		
		APP_LOGS = Logger.getLogger("devpinoyLogger");
		APP_LOGS.debug("Starting csv import process....");

		APP_LOGS.debug("Reading csv file");
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";

		
		try {


			br = new BufferedReader(new FileReader(csvFile));
			// read the headers
			br.readLine();

			int i = 0;
			while ((line = br.readLine()) != null) {
				compDetails = new AddPFSCompanyDetails();
				// use comma as separator
				String[] fields = line.split(cvsSplitBy);

				compDetails.setFiNumber(fields[0]);
				compDetails.setUsertype(fields[1]);
				compDetails.setStatus(fields[2]);
				compDetails.setAdmintype(fields[3]);
				compDetails.setWebName(fields[4]);
				compDetails.setAddress(fields[5]);
				compDetails.setCity(fields[6]);
				compDetails.setProvince(fields[7]);
				compDetails.setPostalcode(fields[8]);
				compDetails.setContact(fields[9]);
				compDetails.setTelephone(fields[10]);
				compDetails.setFax(fields[11]);
				compDetails.setEmail(fields[12]);
				compDetails.setLanguage(fields[13]);
				compDetails.setMailingTransit(fields[14]);
				compDetails.setEnrollmentServicingTransit(fields[15]);
				compDetails.setContact2(fields[16]);
				compDetails.setTelephone2(fields[17]);
				compDetails.setContactNumber(fields[18]);
				compDetails.setCustomerReferenceNumber(fields[19]);
				compDetails.setBillMethod(fields[20]);
				compDetails.setRevenueExpenseTransit(fields[21]);
				compDetails.setAggregateIndicator(fields[22]);
				compDetails.setAggregateIndicator2(fields[23]);
				compDetails.setZeroTransactionFee(fields[24]);
				compDetails.setZeroTransactionFee2(fields[25]);
				compDetails.setNumberOfFirstTrx(fields[26]);
				compDetails.setNumberOffirsttrx2(fields[27]);
				compDetails.setNumberOfFirstTrxFeeIndicator((fields[28]));				
				compDetails.setNumberOfFirstTrxFee(fields[29]);
				compDetails.setIncludeFirstTrxIndicator(fields[30]);
				compDetails.setIncludeFirstTrxIndicator2(fields[31]);
				compDetails.setExtraFilingTrxFee(fields[32]);
				compDetails.setExtraFilingTrxFee2(fields[33]);
				compDetails.setExtraPaymentTrxFee(fields[34]);
				compDetails.setExtraPaymentTrxFee2(fields[35]);
				compDetails.setAdditionalPaymentAdvFee(fields[36]);
				compDetails.setAdditionalPaymentAdvFee2(fields[37]);
				compDetails.setChargeAllAdditionalPaymentAdv(fields[38]);
				compDetails.setChargeAllAdditionalPaymentAdv2(fields[39]);
				compDetails.setNewUserEnrollmentFee(fields[40]);
				compDetails.setNewuserEnrollmentFee2(fields[41]);
				compDetails.setCancellationFeeIndicator(fields[42]);
				compDetails.setCancellationFee(fields[43]);
				compDetails.setReversalFeeIndicator(fields[44]);
				compDetails.setReversalFee(fields[45]);
				compDetails.setAccountIsABillingAccount(fields[46]);
				compDetails.setBranch(fields[47]);
				compDetails.setAccount(fields[48]);
				compDetails.setDescription(fields[49]);
				compDetails.setEmailNotification(fields[50]);
				compDetails.setAdminName(fields[51]);
				compDetails.setEmailAddress(fields[52]);
				compDetails.setPhoneNumber(fields[53]);
				compDetails.setExtension(fields[54]);
				compDetails.setFiNumber2(fields[55]);
				ListCompanyDetails.add(compDetails);
				
				i++;
			}

		} catch (FileNotFoundException e) {
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));
			APP_LOGS.debug(errors.toString());
			System.exit(0);
		} catch (IOException e) {
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));
			System.out.println(errors.toString());
			APP_LOGS.debug(errors.toString());
			System.exit(0);
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					StringWriter errors = new StringWriter();
					e.printStackTrace(new PrintWriter(errors));
					System.out.println(errors.toString());
					APP_LOGS.debug(errors.toString());
					System.exit(0);
				}
			}
		}

		APP_LOGS.debug("CSV File imported, ok");
		return ListCompanyDetails;
		
		

	}


}
