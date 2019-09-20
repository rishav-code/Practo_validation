package com.atmecs.practo.validation;

import org.testng.Assert;

import com.atmecs.practo.constant.Findloc;
import com.atmecs.practo.constant.ValidateData;
import com.atmecs.practo.helper.CommonUtlity;
import com.atmecs.practo.reports.LogReport;
import com.atmecs.practo.testbase.TestBase;

public class PharmacyValidation extends TestBase {
	Findloc loc = new Findloc();
	ValidateData vd = new ValidateData();
	LogReport log = new LogReport();

	public void homePageLanding() {

		String title = driver.getTitle();
		log.info("Redirection validation");
		System.out.println(title);
		Assert.assertEquals(title, ValidateData.getData("HomeTitleExpected"),
				"Homepage redirection is not successfull");
		log.info("Successfully redirected to Homepage");

	}

	public void pharmacyVisible() {
		boolean selection = CommonUtlity.isDisplayed(loc.getlocator("loc.afterpharmacyviewcart.btn"));
		Assert.assertEquals(selection, true, "not landed in pharmacy");
		log.info("pharmacy is selected");
	}

}
