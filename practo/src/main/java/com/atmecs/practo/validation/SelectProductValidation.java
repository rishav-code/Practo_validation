package com.atmecs.practo.validation;

import org.testng.Assert;

import com.atmecs.practo.constant.Findloc;
import com.atmecs.practo.helper.CommonUtlity;
import com.atmecs.practo.reports.LogReport;

public class SelectProductValidation {
	Findloc loc = new Findloc();
	LogReport log = new LogReport();
	
	public void SerchSelectValidation() {
		boolean selectpainmed = CommonUtlity.isDisplayed(loc.getlocator("loc.selectmed.dpdn"));
		Assert.assertEquals(selectpainmed, true, "not displayed medicine");
		log.info("medicine is displayed");

	}



}
