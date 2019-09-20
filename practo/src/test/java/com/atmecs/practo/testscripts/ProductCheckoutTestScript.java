package com.atmecs.practo.testscripts;

import org.testng.annotations.Test;

import com.atmecs.practo.dataprovider.CityInput;
import com.atmecs.practo.pages.ProductCheckout;
import com.atmecs.practo.validation.ProductCheckoutValidation;

public class ProductCheckoutTestScript {
	
	
	ProductCheckoutValidation pcheckoutvalidation = new ProductCheckoutValidation();
	ProductCheckout checkout= new ProductCheckout();
	@Test(priority = 4,dataProvider ="cityinput",dataProviderClass = CityInput.class)
	public void checkout(String city) {
		checkout.checkOut(city);
		
		pcheckoutvalidation .finalheckout();
		pcheckoutvalidation .paybleAmountVAlidation();
		
		
		
	}
}
