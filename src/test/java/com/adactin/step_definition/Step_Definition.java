package com.adactin.step_definition;

import java.io.FileReader;

import org.openqa.selenium.WebDriver;

import com.Baseclass_Adactin.Adactin_Baseclass;
import com.POM.BookingConfirm_Page;
import com.POM.HoteSelect_Page;
import com.POM.HotelBooking_Page;
import com.POM.HotelSearch_Page;
import com.POM.Login_Page;
import com.POM.Logout_Page;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.PageObjectManager;
import com.adactin.runner.Runner_Demo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Adactin_Baseclass {

	public static PageObjectManager pom = new PageObjectManager(driver);

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {

		String url = FileReaderManager.getInstance().getInstanceCR().url();
		getURL(url);
	}

	@When("^user Enters The \"([^\"]*)\" In Username Field$")
	public void user_Enters_The_In_Username_Field(String username) throws Throwable {

		inputValueElement(pom.getInstanceLogin_Page().getUsername(), username);
	}

	@When("^user Enters The \"([^\"]*)\" In Password Field$")
	public void user_Enters_The_In_Password_Field(String pwd) throws Throwable {

		inputValueElement(pom.getInstanceLogin_Page().getPwd(), pwd);
	}

	@When("^user Enters The Username In Username Field$")
	public void user_Enters_The_Username_In_Username_Field() throws Throwable {

		inputValueElement(pom.getInstanceLogin_Page().getUsername(), "prasanna4898");
	}

	@When("^user Enters The Password In Password Field$")
	public void user_Enters_The_Password_In_Password_Field() throws Throwable {

		inputValueElement(pom.getInstanceLogin_Page().getPwd(), "ullaepo");
	}

	@Then("^user Click On The Login Button And It Navigates To Hotel Search Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_Hotel_Search_Page() throws Throwable {

		clickOnElement(pom.getInstanceLogin_Page().getLogin_btn());
		sleep(2000);
	}

	@When("^user Chooses The Location Of Hotel$")
	public void user_Chooses_The_Location_Of_Hotel() throws Throwable {

		singleDropdown(pom.getInstanceHotelSearch_Page().getLocation(), "Melbourne", "byValue");
	}

	@When("^user Chooses The Hotel$")
	public void user_Chooses_The_Hotel() throws Throwable {

		singleDropdown(pom.getInstanceHotelSearch_Page().getHotels(), "Hotel Hervey", "byvisibleText");
	}

	@When("^user Chooses The Type Of Room In The Hotel$")
	public void user_Chooses_The_Type_Of_Room_In_The_Hotel() throws Throwable {

		singleDropdown(pom.getInstanceHotelSearch_Page().getRoomType(), "Super Deluxe", "byvalue");
	}

	@When("^user Chooses The Number Of Rooms$")
	public void user_Chooses_The_Number_Of_Rooms() throws Throwable {

		singleDropdown(pom.getInstanceHotelSearch_Page().getNumber_Of_Rooms(), "3 - Three", "byvisibletext");
	}

	@When("^user Enters The Checkin Date$")
	public void user_Enters_The_Checkin_Date() throws Throwable {

		inputValueElement(pom.getInstanceHotelSearch_Page().getCheckin_Date(), "25/04/2021");
	}

	@When("^user Enters The Checkout Date$")
	public void user_Enters_The_Checkout_Date() throws Throwable {

		inputValueElement(pom.getInstanceHotelSearch_Page().getCheckout_Date(), "28/04/2021");
	}

	@When("^user Chooses The Number Of Adults Present Per Room$")
	public void user_Chooses_The_Number_Of_Adults_Present_Per_Room() throws Throwable {

		singleDropdown(pom.getInstanceHotelSearch_Page().getAdults_Per_Room(), "4", "byindex");
	}

	@When("^user Chooses The Number Of Children Present Per Room$")
	public void user_Chooses_The_Number_Of_Children_Present_Per_Room() throws Throwable {

		singleDropdown(pom.getInstanceHotelSearch_Page().getChildren_Per_Room(), "1", "byindex");
		sleep(1000);
	}

	@Then("^user Click On Search Button And It Navigates To The Select Hotel Page$")
	public void user_Click_On_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page() throws Throwable {

		clickOnElement(pom.getInstanceHotelSearch_Page().getSearch_btn());
		sleep(2000);
	}

	@When("^user Click On The Radio Button And Selecting The Hotel$")
	public void user_Click_On_The_Radio_Button_And_Selecting_The_Hotel() throws Throwable {

		clickOnElement(pom.getInstanceHotelSelect_Page().getSelect_btn());
	}

	@Then("^user Click On The Continue Button And It Navigates To Hotel Booking Page$")
	public void user_Click_On_The_Continue_Button_And_It_Navigates_To_Hotel_Booking_Page() throws Throwable {

		clickOnElement(pom.getInstanceHotelSelect_Page().getContinue_btn());
		sleep(2000);
	}

	@When("^user Enters The First Name$")
	public void user_Enters_The_First_Name() throws Throwable {

		inputValueElement(pom.getInstanceHotelBooking_Page().getFirstname(), "Monica");
	}

	@When("^user Enters The Last Name$")
	public void user_Enters_The_Last_Name() throws Throwable {

		inputValueElement(pom.getInstanceHotelBooking_Page().getLastname(), "Geller");
	}

	@When("^user Enters The Billing Address$")
	public void user_Enters_The_Billing_Address() throws Throwable {

		inputValueElement(pom.getInstanceHotelBooking_Page().getBilling_Address(),
				"16, Pivot Street, Park Town, States");
	}

	@When("^user Enters The Sixteen Digit Credit Card Number$")
	public void user_Enters_The_Sixteen_Digit_Credit_Card_Number() throws Throwable {

		String ccNumber = FileReaderManager.getInstance().getInstanceCR().creditCardNumber();
		inputValueElement(pom.getInstanceHotelBooking_Page().getCreditcard_Num(), ccNumber);
	}

	@When("^user Chooses The Credit Card Type$")
	public void user_Chooses_The_Credit_Card_Type() throws Throwable {

		String ccType = FileReaderManager.getInstance().getInstanceCR().creditCardType();
		singleDropdown(pom.getInstanceHotelBooking_Page().getCreditcard_Type(), ccType, "byvisibletext");
	}

	@When("^user Chooses The Expiry Month Of The Credit Card$")
	public void user_Chooses_The_Expiry_Month_Of_The_Credit_Card() throws Throwable {

		String ccExpiryMonth = FileReaderManager.getInstance().getInstanceCR().ccExpiryMonth();
		singleDropdown(pom.getInstanceHotelBooking_Page().getCc_exp_month(), ccExpiryMonth, "byvisibletext");
	}

	@When("^user Choses The Expiry Year Of The Credit Card$")
	public void user_Choses_The_Expiry_Year_Of_The_Credit_Card() throws Throwable {

		String ccExpiryYear = FileReaderManager.getInstance().getInstanceCR().ccExpiryYear();
		singleDropdown(pom.getInstanceHotelBooking_Page().getCc_exp_year(), ccExpiryYear, "byvalue");
	}

	@When("^user Enters The Cvv Number Of The Credit Card$")
	public void user_Enters_The_Cvv_Number_Of_The_Credit_Card() throws Throwable {

		String creditCardCVV = FileReaderManager.getInstance().getInstanceCR().creditCardCVV();
		inputValueElement(pom.getInstanceHotelBooking_Page().getCc_cvv_num(), creditCardCVV);
	}

	@Then("^user Clicks On The Book Now Button And It Navigates To Booking Confirmation Page$")
	public void user_Clicks_On_The_Book_Now_Button_And_It_Navigates_To_Booking_Confirmation_Page() throws Throwable {

		clickOnElement(pom.getInstanceHotelBooking_Page().getBook_btn());
		sleep(5000);
	}

	@When("^user Clicks On The My Itinerary Button And It Navigates To Booked Itinerary Page$")
	public void user_Clicks_On_The_My_Itinerary_Button_And_It_Navigates_To_Booked_Itinerary_Page() throws Throwable {

		clickOnElement(pom.getInstanceBookingConfirmation_Page().getItinerary_btn());
	}

	@When("^user Takes Screenshot Of Booked Itinerary Page$")
	public void user_Takes_Screenshot_Of_Booked_Itinerary_Page() throws Throwable {

		screenshot("C:\\Users\\user\\eclipse-workspace\\Adactin_Project\\Screenshot\\Confirmation.png");

	}

	/*@Then("^user Clicks On Logout Button And It Navigates To Homepage$")
	public void user_Clicks_On_Logout_Button_And_It_Navigates_To_Homepage() throws Throwable {

		clickOnElement(pom.getInstanceLogout_Page().getLogout_btn());
		sleep(5000);
	}*/

}
