package com.atmecs.practo.validation;

import org.testng.Assert;

import com.atmecs.practo.constant.Findloc;
import com.atmecs.practo.constant.ValidateData;
import com.atmecs.practo.helper.CommonUtlity;
import com.atmecs.practo.reports.LogReport;
import com.atmecs.practo.testbase.TestBase;

public class ProductCheckoutValidation extends TestBase {
	LogReport log = new LogReport();
	
	ValidateData vd= new ValidateData();
	Findloc loc = new Findloc();

	public void finalheckout() {
		String actual = CommonUtlity.getElement(loc.getlocator("loc.injection.txt")).getText();
		Assert.assertEquals(actual, ValidateData.getData("med1ValidateText"), "med1 not added");
	    log.info("med1 successfully added");
		String actual2 = CommonUtlity.getElement(loc.getlocator("loc.paionrelief.txt")).getText();
		Assert.assertEquals(actual2, ValidateData.getData("med2ValidateText"), "med2 not added");
		log.info("med2 successfully added");
		String actual3 = CommonUtlity.getElement(loc.getlocator("loc.doublepower.txt")).getText();
		Assert.assertEquals(actual3, ValidateData.getData("med3ValidateText"), "med3 not added");
		log.info("med3 successfully added");
		String actual4 = CommonUtlity.getElement(loc.getlocator("loc.mahastrong.txt")).getText();
		Assert.assertEquals(actual4, ValidateData.getData("med4ValidateText"), "med4 not added");
		log.info("med2 successfully added");

	

	}
	public void paybleAmountVAlidation() {
		String totalamount = CommonUtlity.getText(loc.getlocator("loc.paybleamount.txt"));
		System.out.println(totalamount);
		Assert.assertEquals(totalamount, ValidateData.getData("Paybleamount"),
			"Before Adding Extra total amount is not match");
		log.info("Final Amount matched ");
		CommonUtlity.clickElement(loc.getlocator("loc.checkout.click"));
	}

}
