Feature: Hotel login application

Scenario: login page credential
Given user can able to launch the browser
When user can able to write the username
And user can able to write the password
Then user can able to login the page

Scenario: Hotel Search application
When user can able to Select the Location
And user can able to Select the Hotels
And user can able to Select the Room Type
And user can able to Select the Number of Rooms
And user can able to Select the Check In Date
And user can able to Select the Check Out Date
And user can able to Select the Adults per Room
And user can able to Select the Children per Room
Then user can able to click  Search option and move to next page

Scenario: Select Hotel Page
When user can able to click Radio button
Then user can able to click the continue and move to next page

Scenario: Select Book A Hotel application
When user can able to write the First Name 
And user can able to write the Last Name
And user can able to write the Billing Address
And user can able to write the Credit Card No
And user can able to write the Credit Card Type
And user can able to Select Expiry Date by Month
And user can able to Select Expiry Date by year
And user can able to click CCV number
Then user can able to click Book Now and move to nextpage

Scenario: Select the Booking Confirmation
When user can able to click the My itinerary
Then user can able to screenshot the page and logout

