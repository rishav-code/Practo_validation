package com.atmecs.practo.dataprovider;

import org.testng.annotations.DataProvider;

import com.atmecs.practo.constant.FilePath;
import com.atmecs.practo.util.ProvideData;

public class SelectProductInput {
	@DataProvider(name = "productinput")
	public Object[][] getData() {
		ProvideData provideData = new ProvideData(FilePath.TESTDATA_FILE,1);
		Object[][] getData = provideData.provideData();
		return getData;
	}


}
