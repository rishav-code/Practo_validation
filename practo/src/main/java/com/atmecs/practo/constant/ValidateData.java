package com.atmecs.practo.constant;

import java.io.IOException;
import java.util.Properties;

import com.atmecs.practo.util.ReadProp;

public class ValidateData {

	static Properties practovalidate;

	public ValidateData() {
		try {
			practovalidate = ReadProp.loadProperty(FilePath.VALIDATION_FILE);
		} catch (IOException e) {
			e.getMessage();
		}
	}

	public static String getData(String key) {
		String value = practovalidate.getProperty(key);
		return value;

	}

}
