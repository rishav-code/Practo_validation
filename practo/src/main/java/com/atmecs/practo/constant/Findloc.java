package com.atmecs.practo.constant;

import java.io.IOException;
import java.util.Properties;

import com.atmecs.practo.util.ReadProp;

public class Findloc {
	static Properties phptravelsloc;

	public Findloc() {
		try {
			phptravelsloc = ReadProp.loadProperty(FilePath.LOCATOR_FILE);
		} catch (IOException e) {
			e.getMessage();
		}
	}

	public String getlocator(String key) {
		String value = phptravelsloc.getProperty(key);
		return value;

	}

}
