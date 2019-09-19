package com.atmecs.practo.validation;

import org.testng.Assert;
import com.atmecs.practo.constant.Findloc;
import com.atmecs.practo.constant.ValidateData;
import com.atmecs.practo.helper.CommonUtlity;
import com.atmecs.practo.testbase.TestBase;

public class PharmacyValidation extends TestBase {
	Findloc loc = new Findloc();

	public void homePageLanding() {
		String title = driver.getTitle();

		System.out.println(title);
		Assert.assertEquals(title, ValidateData.getData("HomeTitleExpected"),
				"Homepage redirection is not successfull");
		System.out.println("Successfully redirected to Homepage");

	}

	public void pharmacyVisible() {
		boolean selection = CommonUtlity.isDisplayed(loc.getlocator("loc.afterpharmacyviewcart.btn"));
		Assert.assertEquals(selection, true, "not landed in pharmacy");
		System.out.println("pharmacy is selected");
	}

}
