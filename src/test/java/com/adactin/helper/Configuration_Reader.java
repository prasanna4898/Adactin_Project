package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;

	public Configuration_Reader() throws Throwable {

		File f = new File(
				"C:\\Users\\user\\eclipse-workspace\\Adactin_Project\\src\\test\\java\\com\\adactin\\properties\\Configuration.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);

	}

	public String browser() {

		String browser = p.getProperty("browser");
		return browser;
	}

	public String url() {

		String url = p.getProperty("url");
		return url;
	}

	public String creditCardNumber() {

		String ccNumber = p.getProperty("creditCardNumber");
		return ccNumber;
	}

	public String creditCardType() {

		String ccType = p.getProperty("creditCardType");
		return ccType;

	}

	public String ccExpiryMonth() {

		String ccExpMon = p.getProperty("ccExpiryMonth");
		return ccExpMon;
	}

	public String ccExpiryYear() {

		String ccExpYear = p.getProperty("ccExpiryYear");
		return ccExpYear;
	}

	public String creditCardCVV() {

		String cvv = p.getProperty("creditCardCVV");
		return cvv;
	}

}
