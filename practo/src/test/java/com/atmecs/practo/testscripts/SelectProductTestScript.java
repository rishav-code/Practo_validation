package com.atmecs.practo.testscripts;

import org.testng.annotations.Test;

import com.atmecs.practo.pages.SelectProduct;

public class SelectProductTestScript {

	@Test(priority = 3)
	public void productSelect() {
		SelectProduct Sp = new SelectProduct();
		
		Sp.searcMedicine();
		Sp.productAdd();
		
	}
}
