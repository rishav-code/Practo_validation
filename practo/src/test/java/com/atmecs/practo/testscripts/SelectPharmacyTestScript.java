package com.atmecs.practo.testscripts;

import org.testng.annotations.Test;

import com.atmecs.practo.constant.ValidateData;
import com.atmecs.practo.pages.Pharmacy;
import com.atmecs.practo.testbase.TestBase;
import com.atmecs.practo.validation.PharmacyValidation;

public class SelectPharmacyTestScript extends TestBase{
	ValidateData vd = new ValidateData();
	Pharmacy pharm = new Pharmacy();
	PharmacyValidation pv = new PharmacyValidation();

	@Test(priority = 1)
	public void isRedirectionCorrect() {
		pv.homePageLanding();
	}

	@Test(priority = 2)
	public void clickDepartment() {
		pharm.selectDepartment();
		pv.pharmacyVisible();
	}
}
