package com.adactin.helper;

public class FileReaderManager {

	public static FileReaderManager getInstance() {

		FileReaderManager file = new FileReaderManager();

		return file;
	}

	public Configuration_Reader getInstanceCR() throws Throwable {

		Configuration_Reader reader = new Configuration_Reader();

		return reader;
	}

}
