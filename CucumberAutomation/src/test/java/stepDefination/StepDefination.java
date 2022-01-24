package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepDefination {
	
	  @Given("^User is on Booking Page$")
	    public void user_is_on_booking_page() throws Throwable {
		  System.out.println("login page");
	        
	    }

	    @When("^User Login into Booking with username and password$")
	    public void user_login_into_booking_with_username_and_password() throws Throwable {
	    	System.out.println("enter valid username and password");
	    }

	    @Then("^Home page is opened$")
	    public void home_page_is_opened() throws Throwable {
	    	System.out.println("login successfully");
	        
	    }

	    @And("^Showing Destination from where to where$")
	    public void showing_destination_from_where_to_where() throws Throwable {
	    	System.out.println("enter Destination");
	        
	    }

	    @And("^Details of passengers$")
	    public void details_of_passengers() throws Throwable {
	    	System.out.println("enter passenger detail");
	        
	    }

	   

	}


