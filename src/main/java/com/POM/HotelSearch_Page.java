package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelSearch_Page {
	public WebDriver driver;

	@FindBy(name = "location")
	private WebElement location;

	@FindBy(name = "hotels")
	private WebElement hotels;

	@FindBy(name = "room_type")
	private WebElement roomType;

	@FindBy(name = "room_nos")
	private WebElement number_Of_Rooms;

	@FindBy(name = "datepick_in")
	private WebElement checkin_Date;

	@FindBy(name = "datepick_out")
	private WebElement checkout_Date;

	@FindBy(name = "adult_room")
	private WebElement adults_Per_Room;

	@FindBy(name = "child_room")
	private WebElement children_Per_Room;

	@FindBy(name = "Submit")
	private WebElement search_btn;

	public HotelSearch_Page(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumber_Of_Rooms() {
		return number_Of_Rooms;
	}

	public WebElement getCheckin_Date() {
		return checkin_Date;
	}

	public WebElement getCheckout_Date() {
		return checkout_Date;
	}

	public WebElement getAdults_Per_Room() {
		return adults_Per_Room;
	}

	public WebElement getChildren_Per_Room() {
		return children_Per_Room;
	}

	public WebElement getSearch_btn() {
		return search_btn;
	}

}
