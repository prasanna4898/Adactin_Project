package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirm_Page {

	public WebDriver driver;
	
	@FindBy(name = "my_itinerary")
	private WebElement itinerary_btn;

	public BookingConfirm_Page(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getItinerary_btn() {
		return itinerary_btn;
	}
	
	
	
	
	
	
	
	
	
	
}
