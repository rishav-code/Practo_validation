package com.atmecs.practo.dataprovider;

import org.testng.annotations.DataProvider;

import com.atmecs.practo.constant.FilePath;
import com.atmecs.practo.util.ProvideData;

public class CityInput {
	@DataProvider(name = "cityinput")
	public Object[][] getData() {
		ProvideData provideData = new ProvideData(FilePath.TESTDATA_FILE,0);
		Object[][] getData = provideData.provideData();
		return getData;
	}


}
