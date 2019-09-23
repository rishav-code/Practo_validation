package com.atmecs.practo.pages;

import com.atmecs.practo.constant.Findloc;
import com.atmecs.practo.helper.CommonUtlity;

public class Pharmacy {
	Findloc loc = new Findloc();

	public void selectDepartment() {
		try {
			CommonUtlity.isElementVisible(loc.getlocator("loc.homepage.pharmacy.click"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception came");
		}
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		CommonUtlity.clickElement(loc.getlocator("loc.homepage.pharmacy.click"));
	}
}
