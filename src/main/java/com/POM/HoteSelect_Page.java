package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HoteSelect_Page {
	public WebDriver driver;

	@FindBy(name = "radiobutton_0")
	private WebElement select_btn;

	@FindBy(name = "continue")
	private WebElement continue_btn;

	public HoteSelect_Page(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSelect_btn() {
		return select_btn;
	}

	public WebElement getContinue_btn() {
		return continue_btn;
	}

}
