package com.atmecs.practo.pages;

import com.atmecs.practo.constant.Findloc;
import com.atmecs.practo.helper.CommonUtlity;
import com.atmecs.practo.testbase.TestBase;

public class SelectProduct extends TestBase {
	Findloc loc = new Findloc();

	public void searcMedicine() {
		
		CommonUtlity.clickElement(loc.getlocator("loc.homepage.pain.click"));
	
		for (String handle : driver.getWindowHandles()) {

			driver.switchTo().window(handle);
		}
		CommonUtlity.isElementVisible("loc.selectproduct.balm.click");
		CommonUtlity.clickAndSendText(loc.getlocator("loc.searchmed.click"), 30, "pain");
		CommonUtlity.clickElement(loc.getlocator("loc.searchmed.click"));

		CommonUtlity.isElementVisible("loc.selectmed.dpdn");
		CommonUtlity.clickElement(loc.getlocator("loc.selectmed.dpdn"));
		CommonUtlity.clickElement(loc.getlocator("loc.viewcart.click"));
		driver.navigate().back();
	}

	public void productAdd() {
		
		CommonUtlity.isElementVisible("loc.selectproduct.balm.click");
		CommonUtlity.scrollDownPage(300);
		CommonUtlity.clickElement(loc.getlocator("loc.selectproduct.balm.click"));
		CommonUtlity.clickElement(loc.getlocator("loc.selectproduct.oil.click"));
		CommonUtlity.clickElement(loc.getlocator("loc.selectproduct.apolpainoil.click"));
		CommonUtlity.clickElement(loc.getlocator("loc.viewcart.click"));

	}
}
