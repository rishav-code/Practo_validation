package com.atmecs.practo.testscripts;

import org.testng.annotations.Test;

import com.atmecs.practo.dataprovider.SelectProductInput;
import com.atmecs.practo.pages.SelectProduct;
import com.atmecs.practo.validation.SelectProductValidation;

public class SelectProductTestScript {
	SelectProductValidation sproductvalidation = new SelectProductValidation();

	@Test(priority = 3,dataProvider ="productinput",dataProviderClass =SelectProductInput.class)
	public void productSelect(String medicine) {
		SelectProduct selectproduct = new SelectProduct();
		
		selectproduct.searcMedicine(medicine);
		sproductvalidation.SerchSelectValidation();
		selectproduct.productAdd();
		
	}
}
