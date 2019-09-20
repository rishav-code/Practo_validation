package com.atmecs.practo.testscripts;

import org.testng.annotations.Test;

import com.atmecs.practo.pages.Pharmacy;
import com.atmecs.practo.testbase.TestBase;
import com.atmecs.practo.validation.PharmacyValidation;

public class SelectPharmacyTestScript extends TestBase{
	
	Pharmacy pharm = new Pharmacy();
	PharmacyValidation pharmvalidation = new PharmacyValidation();

	@Test(priority = 1)
	public void isRedirectionCorrect() {
		pharmvalidation.homePageLanding();
	}

	@Test(priority = 2)
	public void clickDepartment() {
		pharm.selectDepartment();
		pharmvalidation.pharmacyVisible();
	}
}
