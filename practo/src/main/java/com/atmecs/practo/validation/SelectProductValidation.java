package com.atmecs.practo.validation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.atmecs.practo.constant.Findloc;
import com.atmecs.practo.helper.CommonUtlity;
import com.atmecs.practo.reports.LogReport;
import com.atmecs.practo.testbase.TestBase;

public class SelectProductValidation extends TestBase {
	Findloc loc = new Findloc();
	LogReport log = new LogReport();

	public void ContainTextPainValidation() {
		List<WebElement> allOptions = driver.findElements(By.xpath(loc.getlocator("loc.paindpdnfirst.select")));
		int noOfElements=allOptions.size();
	for(int index=0;index<noOfElements;index++)
	{
		String name=allOptions.get(index).getText();
		System.out.println(name);
		boolean condition=name.contains("pain");
		Assert.assertEquals(condition, true, "input functionality not correct");
		log.info("pain matched");
	}
	
	}

	public void SerchSelectValidation() {

		boolean selectpainmed = CommonUtlity.isDisplayed(loc.getlocator("loc.selectmed.dpdn"));
		Assert.assertEquals(selectpainmed, true, "not displayed medicine");
		log.info("medicine is displayed");
	}

}
