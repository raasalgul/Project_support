package com.conversion.PojoToJsonFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class App 
{
    public static void main( String[] args ) throws IOException
    {
		String jsonFile = System.getProperty("user.dir") + "\\Output.json";
		System.out.println(jsonFile);
		ObjectMapper mapper = new ObjectMapper();

		CommunicationMessageObject cm=new CommunicationMessageObject();
		CoverageDetailsObject coverageDetailsObject=new CoverageDetailsObject();
		DemographicDetailsObject demographicDetailsObject=new DemographicDetailsObject();
		ProductTypeObject productTypeObject=new ProductTypeObject();
		DocumentTypeObject doucmentTypeObject=new DocumentTypeObject();
		PaymentObject paymentObject=new PaymentObject();
		RecepientDetailsObject recepientDetailsObject=new RecepientDetailsObject();
		StatusObject statusObject=new StatusObject();
		cm.carrier="Caiser";
		cm.caseNumber=01;
		cm.cimNumber=01;
		cm.owningCarrier="Caiser";
		coverageDetailsObject.inceptionDate=new Date(System.currentTimeMillis());
		productTypeObject.coverageType="Detal";
		productTypeObject.effectiveDate=new Date(System.currentTimeMillis());
		productTypeObject.planId=03;
		productTypeObject.planName="ComeAndGo";
		productTypeObject.premiumAmount=809;
		productTypeObject.termDate=new Date(System.currentTimeMillis());
		coverageDetailsObject.productTypeObject=productTypeObject;
		cm.coverageDetailsObject=coverageDetailsObject;
		demographicDetailsObject.enrollmentId=04;
		demographicDetailsObject.firstName="Sathish";
		demographicDetailsObject.lastName="Kumar";
		cm.demographicDetailsObject=demographicDetailsObject;
		doucmentTypeObject.documentCode="0X";
		doucmentTypeObject.isEmail=true;
		doucmentTypeObject.isSMS=true;
		cm.doucmentTypeObject=doucmentTypeObject;
		paymentObject.amountDueDate=new Date(System.currentTimeMillis());
		paymentObject.billPeriod=new Date(System.currentTimeMillis());
		paymentObject.transactionAmount=490;
		paymentObject.transactionDate=new Date(System.currentTimeMillis());
		cm.paymentObject=paymentObject;
		cm.priority=7;
		recepientDetailsObject.firstName="Sathish";
		recepientDetailsObject.lastName="Kumar";
		recepientDetailsObject.mailId="saskuma@healthplan.com";
		recepientDetailsObject.mobileNo=948930245;
		cm.recepientDetailsObject=recepientDetailsObject;
		statusObject.statusCode="00xf";
		statusObject.statusMessage="Your good";
		cm.statusObject=statusObject;
		cm.trackingId=214543;
		
		try {
			// Convert object to JSON string and save into a file directly
			mapper.writeValue(new File(jsonFile), cm);

			// Convert object to JSON string
			String jsonInString = mapper.writeValueAsString(cm);
			System.out.println(jsonInString);

			// Convert object to JSON string and pretty print
			jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(cm);
			System.out.println(jsonInString);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	}   	
