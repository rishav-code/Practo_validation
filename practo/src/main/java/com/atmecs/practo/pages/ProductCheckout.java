package com.atmecs.practo.pages;

import com.atmecs.practo.constant.Findloc;
import com.atmecs.practo.helper.CommonUtlity;

public class ProductCheckout  {
	Findloc loc = new Findloc();
	public void checkOut() {
		CommonUtlity.clickAndSendText(loc.getlocator("loc.selectcity.click"), 30, "hyderabad");
		CommonUtlity.clickElement(loc.getlocator("loc.hyderabad.click"));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommonUtlity.clickElement(loc.getlocator("loc.checkout.click"));
	}

}
