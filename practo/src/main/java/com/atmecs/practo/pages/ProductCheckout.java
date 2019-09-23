package com.atmecs.practo.pages;

import com.atmecs.practo.constant.Findloc;
import com.atmecs.practo.helper.CommonUtlity;
import com.atmecs.practo.testbase.TestBase;

public class ProductCheckout extends TestBase {
	Findloc loc = new Findloc();
	
	
	public void checkOut(String city) throws InterruptedException {
		
		CommonUtlity.clickAndSendText(loc.getlocator("loc.selectcity.click"), 30, city);
		//Thread.sleep(3000);
		CommonUtlity.clickElement(loc.getlocator("loc.hyderabad.click"));
	
			Thread.sleep(4000);
		
	}

}
