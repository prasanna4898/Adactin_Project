package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.POM.BookingConfirm_Page;
import com.POM.HoteSelect_Page;
import com.POM.HotelBooking_Page;
import com.POM.HotelSearch_Page;
import com.POM.Login_Page;
import com.POM.Logout_Page;

public class PageObjectManager {

	public WebDriver driver;

	private Login_Page login;
	private HotelSearch_Page search;
	private HoteSelect_Page select;
	private HotelBooking_Page book;
	private BookingConfirm_Page confirm;
	private Logout_Page logout;

	public PageObjectManager(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public Login_Page getInstanceLogin_Page() {

		login = new Login_Page(driver);
		return login;

	}

	public HotelSearch_Page getInstanceHotelSearch_Page() {

		search = new HotelSearch_Page(driver);
		return search;
	}

	public HoteSelect_Page getInstanceHotelSelect_Page() {

		select = new HoteSelect_Page(driver);
		return select;
	}

	public HotelBooking_Page getInstanceHotelBooking_Page() {

		book = new HotelBooking_Page(driver);
		return book;
	}

	public BookingConfirm_Page getInstanceBookingConfirmation_Page() {

		confirm = new BookingConfirm_Page(driver);
		return confirm;
	}

	public Logout_Page getInstanceLogout_Page() {

		logout = new Logout_Page(driver);
		return logout;
	}

}
