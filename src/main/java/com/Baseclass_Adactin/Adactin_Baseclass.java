package com.Baseclass_Adactin;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Baseclass {

	public static WebDriver driver;

	public static WebDriver getBrowser(String type) {

		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Driver//chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (type.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//Driver//geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else if (type.equalsIgnoreCase("IE")) {

			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "//Driver//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		return driver;
	}

	public static void getURL(String url) {

		driver.get(url);

	}

	public static void inputValueElement(WebElement element, String value) {

		element.sendKeys(value);
	}

	public static void clickOnElement(WebElement element) {

		element.click();

	}

	public static void singleDropdown(WebElement element, String value, String type) {

		Select s = new Select(element);

		if (type.equalsIgnoreCase("byIndex")) {

			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		}

		else if (type.equalsIgnoreCase("byvalue")) {

			s.selectByValue(value);
		}

		else if (type.equalsIgnoreCase("byVisibleText")) {

			s.selectByVisibleText(value);
		}
	}

	public static void sleep(int time) throws InterruptedException {

		Thread.sleep(time);
	}

	public static void screenshot(String pathname) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(pathname);
		FileUtils.copyFile(source, destination);

	}

	public static void close() {

		driver.close();
	}

}
