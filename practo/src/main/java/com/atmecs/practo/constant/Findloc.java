package com.atmecs.practo.constant;

import java.io.IOException;
import java.util.Properties;

import com.atmecs.practo.util.ReadProp;

public class Findloc {
	static Properties practoloc;

	public Findloc() {
		try {
			practoloc = ReadProp.loadProperty(FilePath.LOCATOR_FILE);
		} catch (IOException e) {
			e.getMessage();
		}
	}

	public String getlocator(String key) {
		String value = practoloc.getProperty(key);
		return value;

	}

}
