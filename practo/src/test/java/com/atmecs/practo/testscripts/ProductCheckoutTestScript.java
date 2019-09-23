package com.atmecs.practo.testscripts;

import org.testng.annotations.Test;

import com.atmecs.practo.dataprovider.CityInput;
import com.atmecs.practo.dataprovider.SelectProductInput;
import com.atmecs.practo.pages.Pharmacy;
import com.atmecs.practo.pages.ProductCheckout;
import com.atmecs.practo.pages.SelectProduct;
import com.atmecs.practo.testbase.TestBase;
import com.atmecs.practo.validation.ProductCheckoutValidation;

public class ProductCheckoutTestScript extends TestBase {
	
	
	ProductCheckoutValidation pcheckoutvalidation = new ProductCheckoutValidation();
	ProductCheckout checkout= new ProductCheckout();
	SelectProduct selectproduct = new SelectProduct();
	Pharmacy pharm = new Pharmacy();
	@Test(priority = 4,dataProvider ="productinput",dataProviderClass =SelectProductInput.class)
	public void productSelect(String medicine) {
		SelectProduct selectproduct = new SelectProduct();
	
		pharm.selectDepartment();
		
		
		selectproduct.searcMedicine(medicine);
		
		selectproduct.productAdd();
		
	}
	@Test(priority = 5,dataProvider ="cityinput",dataProviderClass = CityInput.class)
	public void checkout(String city) throws InterruptedException {
		
		
		
		checkout.checkOut(city);
		
		pcheckoutvalidation .finalheckout();
		pcheckoutvalidation .paybleAmountVAlidation();
		
		
		
	}
}
