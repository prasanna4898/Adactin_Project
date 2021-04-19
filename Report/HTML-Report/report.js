$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login Page Functionality",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enters The \"\u003cUsername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enters The \"\u003cPassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Click On The Login Button And It Navigates To Hotel Search Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page-functionality;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-application;login-page-functionality;;1"
    },
    {
      "cells": [
        "Hello",
        "123"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-application;login-page-functionality;;2"
    },
    {
      "cells": [
        "Hye",
        "646"
      ],
      "line": 14,
      "id": "hotel-booking-in-adactin-application;login-page-functionality;;3"
    },
    {
      "cells": [
        "prasanna4898",
        "ullaepo"
      ],
      "line": 15,
      "id": "hotel-booking-in-adactin-application;login-page-functionality;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Login Page Functionality",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enters The \"Hello\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enters The \"123\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Click On The Login Button And It Navigates To Hotel Search Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 7815904179,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Enters_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 149118952,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Enters_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 77165542,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigates_To_Hotel_Search_Page()"
});
formatter.result({
  "duration": 2354031587,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Login Page Functionality",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enters The \"Hye\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enters The \"646\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Click On The Login Button And It Navigates To Hotel Search Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 229621936,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hye",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Enters_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 117760822,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "646",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Enters_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 73732573,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigates_To_Hotel_Search_Page()"
});
formatter.result({
  "duration": 2293706173,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Login Page Functionality",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-page-functionality;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user Enters The \"prasanna4898\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user Enters The \"ullaepo\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Click On The Login Button And It Navigates To Hotel Search Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 210490266,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "prasanna4898",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Enters_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 132216523,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ullaepo",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Enters_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 82569109,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigates_To_Hotel_Search_Page()"
});
formatter.result({
  "duration": 2698010071,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Hotel Searching Functionality",
  "description": "",
  "id": "hotel-booking-in-adactin-application;hotel-searching-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@Sanitytest"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "user Chooses The Location Of Hotel",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "user Chooses The Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Chooses The Type Of Room In The Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Chooses The Number Of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Enters The Checkin Date",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Enters The Checkout Date",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Chooses The Number Of Adults Present Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user Chooses The Number Of Children Present Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user Click On Search Button And It Navigates To The Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Chooses_The_Location_Of_Hotel()"
});
formatter.result({
  "duration": 136024431,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Chooses_The_Hotel()"
});
formatter.result({
  "duration": 126902444,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Chooses_The_Type_Of_Room_In_The_Hotel()"
});
formatter.result({
  "duration": 103670242,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Chooses_The_Number_Of_Rooms()"
});
formatter.result({
  "duration": 108335259,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enters_The_Checkin_Date()"
});
formatter.result({
  "duration": 80387066,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enters_The_Checkout_Date()"
});
formatter.result({
  "duration": 76787583,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Chooses_The_Number_Of_Adults_Present_Per_Room()"
});
formatter.result({
  "duration": 163868789,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Chooses_The_Number_Of_Children_Present_Per_Room()"
});
formatter.result({
  "duration": 1125904873,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page()"
});
formatter.result({
  "duration": 2459032803,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Hotel Selecting Functionality",
  "description": "",
  "id": "hotel-booking-in-adactin-application;hotel-selecting-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@Sanitytest"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "user Click On The Radio Button And Selecting The Hotel",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "user Click On The Continue Button And It Navigates To Hotel Booking Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Radio_Button_And_Selecting_The_Hotel()"
});
formatter.result({
  "duration": 71038153,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Continue_Button_And_It_Navigates_To_Hotel_Booking_Page()"
});
formatter.result({
  "duration": 2466224217,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "Hotel Booking Functionality",
  "description": "",
  "id": "hotel-booking-in-adactin-application;hotel-booking-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 36,
      "name": "@Sanitytest"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "user Enters The First Name",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "user Enters The Last Name",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user Enters The Billing Address",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user Enters The Sixteen Digit Credit Card Number",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user Chooses The Credit Card Type",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user Chooses The Expiry Month Of The Credit Card",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user Choses The Expiry Year Of The Credit Card",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "user Enters The Cvv Number Of The Credit Card",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "user Clicks On The Book Now Button And It Navigates To Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Enters_The_First_Name()"
});
formatter.result({
  "duration": 103191846,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enters_The_Last_Name()"
});
formatter.result({
  "duration": 88428793,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enters_The_Billing_Address()"
});
formatter.result({
  "duration": 135406708,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enters_The_Sixteen_Digit_Credit_Card_Number()"
});
formatter.result({
  "duration": 96335347,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Chooses_The_Credit_Card_Type()"
});
formatter.result({
  "duration": 110890352,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Chooses_The_Expiry_Month_Of_The_Credit_Card()"
});
formatter.result({
  "duration": 102361545,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Choses_The_Expiry_Year_Of_The_Credit_Card()"
});
formatter.result({
  "duration": 105877960,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enters_The_Cvv_Number_Of_The_Credit_Card()"
});
formatter.result({
  "duration": 96552078,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Clicks_On_The_Book_Now_Button_And_It_Navigates_To_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 5064538845,
  "status": "passed"
});
formatter.scenario({
  "line": 50,
  "name": "Hotel Booking Confirmation Functionality",
  "description": "",
  "id": "hotel-booking-in-adactin-application;hotel-booking-confirmation-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 49,
      "name": "@Sanitytest"
    }
  ]
});
formatter.step({
  "line": 52,
  "name": "user Clicks On The My Itinerary Button And It Navigates To Booked Itinerary Page",
  "keyword": "When "
});
formatter.match({
  "location": "Step_Definition.user_Clicks_On_The_My_Itinerary_Button_And_It_Navigates_To_Booked_Itinerary_Page()"
});
formatter.result({
  "duration": 1685100942,
  "status": "passed"
});
});