Feature: Hotel Booking In Adactin Application 

@Smoketest 
Scenario Outline: Login Page Functionality 

	Given user Launch The Application 
	When user Enters The "<Username>" In Username Field 
	And user Enters The "<Password>" In Password Field 
	Then user Click On The Login Button And It Navigates To Hotel Search Page 
	
	Examples: 
		|Username|Password|
		|Hello|123|
		|Hye|646|
		|prasanna4898|ullaepo|
		
		@Sanitytest 
		Scenario: Hotel Searching Functionality 
		
			When user Chooses The Location Of Hotel 
			And user Chooses The Hotel 
			And user Chooses The Type Of Room In The Hotel 
			And user Chooses The Number Of Rooms 
			And user Enters The Checkin Date 
			And user Enters The Checkout Date 
			And user Chooses The Number Of Adults Present Per Room 
			And user Chooses The Number Of Children Present Per Room 
			Then user Click On Search Button And It Navigates To The Select Hotel Page 
			
		@Sanitytest 
		Scenario: Hotel Selecting Functionality 
		
			When user Click On The Radio Button And Selecting The Hotel 
			Then user Click On The Continue Button And It Navigates To Hotel Booking Page 
			
		@Sanitytest 
		Scenario: Hotel Booking Functionality 
		
			When user Enters The First Name 
			And user Enters The Last Name 
			And user Enters The Billing Address 
			And user Enters The Sixteen Digit Credit Card Number 
			And user Chooses The Credit Card Type 
			And user Chooses The Expiry Month Of The Credit Card 
			And user Choses The Expiry Year Of The Credit Card 
			And user Enters The Cvv Number Of The Credit Card 
			Then user Clicks On The Book Now Button And It Navigates To Booking Confirmation Page 
			
		@Sanitytest 
		Scenario: Hotel Booking Confirmation Functionality 
		
			When user Clicks On The My Itinerary Button And It Navigates To Booked Itinerary Page 
			
		@Regressiontest 
		Scenario: Logout Page Functionality 
		
			When user Takes Screenshot Of Booked Itinerary Page 
			Then user Clicks On Logout Button And It Navigates To Homepage 
			
			
			
			
			
			
