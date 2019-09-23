package com.atmecs.practo.validation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

import com.atmecs.practo.constant.Findloc;
import com.atmecs.practo.constant.ValidateData;
import com.atmecs.practo.helper.CommonUtlity;
import com.atmecs.practo.reports.LogReport;
import com.atmecs.practo.testbase.TestBase;

public class PharmacyValidation extends TestBase {
	Findloc loc = new Findloc();
	ValidateData validdata = new ValidateData();
	LogReport log = new LogReport();

	public void homePageLanding() {

		String title = driver.getTitle();
		
		log.info("Redirection validation");
		System.out.println(title);
		Assert.assertEquals(title, ValidateData.getData("HomeTitleExpected"),
				"Homepage redirection is not successfull");
		log.info("Successfully redirected to Homepage");
	}

	public void colourvalidate() {
		WebElement w=CommonUtlity.getElement(loc.getlocator("loc.pharmacycolor.btn"));
		String colorvalue=w.getCssValue("color");
		System.out.println(colorvalue);
		String hexcolorValue=Color.fromString(colorvalue).asHex();
		System.out.println(hexcolorValue);
		String[] s=hexcolorValue.split("#");
		System.out.println(s[0]);
		Assert.assertEquals(hexcolorValue,ValidateData.getData("Expectedcolour"),"not matched");
		log.info("matched");
	}
	public void pharmacyVisible() {
		boolean selection = CommonUtlity.isDisplayed(loc.getlocator("loc.afterpharmacyviewcart.btn"));
		Assert.assertEquals(selection, true, "not landed in pharmacy");
		log.info("pharmacy is selected");
	}

}
