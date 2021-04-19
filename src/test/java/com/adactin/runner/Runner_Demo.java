package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.Baseclass_Adactin.Adactin_Baseclass;
import com.adactin.helper.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature_file", glue = "com.adactin.step_definition", 
	monochrome = true, 
	dryRun = false, 
	strict = true, 
	tags = ("~@Regressiontest"), 
	plugin = {"html:Report/HTML-Report", 
			 "pretty",
			 "json:Reports/json-Report.json",
			 "com.cucumber.listener.ExtentCucumberFormatter:Report/Extent-Report.html" })

public class Runner_Demo {

	@BeforeClass
	public static void set_Up() throws Throwable {

		String browser = FileReaderManager.getInstance().getInstanceCR().browser();
		Adactin_Baseclass.getBrowser(browser);

	}

	@AfterClass
	public static void tear_Down() {

		Adactin_Baseclass.close();
	}

}
