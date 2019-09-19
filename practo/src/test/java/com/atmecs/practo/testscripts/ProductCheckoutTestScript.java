package com.atmecs.practo.testscripts;

import org.testng.annotations.Test;

import com.atmecs.practo.pages.ProductCheckout;

public class ProductCheckoutTestScript {
	@Test(priority = 4)
	public void checkout() {
		ProductCheckout pc= new ProductCheckout();
		pc.checkOut();
		
	}

}
