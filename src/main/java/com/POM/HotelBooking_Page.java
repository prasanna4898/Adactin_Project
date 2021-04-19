package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelBooking_Page {

	public WebDriver driver;
	@FindBy(name = "first_name")
	private WebElement firstname;

	@FindBy(name = "last_name")
	private WebElement lastname;

	@FindBy(name = "address")
	private WebElement billing_Address;

	@FindBy(name = "cc_num")
	private WebElement creditcard_Num;

	@FindBy(name = "cc_type")
	private WebElement creditcard_Type;

	@FindBy(name = "cc_exp_month")
	private WebElement cc_exp_month;

	@FindBy(name = "cc_exp_year")
	private WebElement cc_exp_year;

	@FindBy(name = "cc_cvv")
	private WebElement cc_cvv_num;

	@FindBy(name = "book_now")
	private WebElement book_btn;

	public HotelBooking_Page(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getBilling_Address() {
		return billing_Address;
	}

	public WebElement getCreditcard_Num() {
		return creditcard_Num;
	}

	public WebElement getCreditcard_Type() {
		return creditcard_Type;
	}

	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}

	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}

	public WebElement getCc_cvv_num() {
		return cc_cvv_num;
	}

	public WebElement getBook_btn() {
		return book_btn;
	}

}
