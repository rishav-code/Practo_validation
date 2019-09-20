package com.atmecs.practo.testbase;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.atmecs.practo.constant.FilePath;
import com.atmecs.practo.util.ReadProp;

public class TestBase {
	public static WebDriver driver;
	Properties baseClass;
	String url;
	public static String browser;
	int downloadFile;

	@BeforeSuite
	public void intitailizeBrowser() throws IOException {

		baseClass = ReadProp.loadProperty(FilePath.CONFIG_FILE);
		url = baseClass.getProperty("url");
		browser = baseClass.getProperty("browser");

		System.out.println("browser is " + browser);

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", FilePath.CHROME_PATH);

			driver = new ChromeDriver();

			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}

	}

	@AfterSuite
	public void clodeDriver() {
		driver.close();

	}

}
