package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BassClass.BassClass;
import com.BassClass.Pompage;
import com.runner.RunnerClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BassClass {
public static WebDriver driver=RunnerClass.driver;
public static Pompage p;
	@Given("user can able to launch the browser")
	public void user_can_able_to_launch_the_browser() {
	   geturl("https://adactinhotelapp.com/");
	}

	@When("user can able to write the username")
	public void user_can_able_to_write_the_username() {
			p=new Pompage(driver);

	    Input(p.getUsername(), "prabhube");
	    
	}

	@When("user can able to write the password")
	public void user_can_able_to_write_the_password() {
	   Input(p.getPassword(), "Kasthuriraja1!");
	}

	@Then("user can able to login the page")
	
	public void user_can_able_to_login_the_page() {
		click(p.getLogin());
//		WebElement login = driver.findElement(By.id("login"));
//		login.click();
	}
	

@When("user can able to Select the Location")
public void user_can_able_to_select_the_location() {
    
}

@When("user can able to Select the Hotels")
public void user_can_able_to_select_the_hotels() {
    
}

@When("user can able to Select the Room Type")
public void user_can_able_to_select_the_room_type() {
    
}

@When("user can able to Select the Number of Rooms")
public void user_can_able_to_select_the_number_of_rooms() {
    
}

@When("user can able to Select the Check In Date")
public void user_can_able_to_select_the_check_in_date() {
    
}

@When("user can able to Select the Check Out Date")
public void user_can_able_to_select_the_check_out_date() {
    
}

@When("user can able to Select the Adults per Room")
public void user_can_able_to_select_the_adults_per_room() {
    
}

@When("user can able to Select the Children per Room")
public void user_can_able_to_select_the_children_per_room() {
    
}

@Then("user can able to click  Search option and move to next page")
public void user_can_able_to_click_search_option_and_move_to_next_page() {
    
}

@When("user can able to click Radio button")
public void user_can_able_to_click_radio_button() {
    
}

@Then("user can able to click the continue and move to next page")
public void user_can_able_to_click_the_continue_and_move_to_next_page() {
    
}

@When("user can able to write the First Name")
public void user_can_able_to_write_the_first_name() {
    
}

@When("user can able to write the Last Name")
public void user_can_able_to_write_the_last_name() {
    
}

@When("user can able to write the Billing Address")
public void user_can_able_to_write_the_billing_address() {
    
}

@When("user can able to write the Credit Card No")
public void user_can_able_to_write_the_credit_card_no() {
    
}

@When("user can able to write the Credit Card Type")
public void user_can_able_to_write_the_credit_card_type() {
    
}

@When("user can able to Select Expiry Date by Month")
public void user_can_able_to_select_expiry_date_by_month() {
    
}

@When("user can able to Select Expiry Date by year")
public void user_can_able_to_select_expiry_date_by_year() {
    
}

@When("user can able to click CCV number")
public void user_can_able_to_click_ccv_number() {
    
}

@Then("user can able to click Book Now and move to nextpage")
public void user_can_able_to_click_book_now_and_move_to_nextpage() {
    
}

@When("user can able to click the My itinerary")
public void user_can_able_to_click_the_my_itinerary() {
    
}

@Then("user can able to screenshot the page and logout")
public void user_can_able_to_screenshot_the_page_and_logout() {
   
}


}
