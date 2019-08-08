package stepdef;

import org.openqa.selenium.WebDriver;

import common.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginNewTours extends BaseClass {
WebDriver driver;
	@Given("^I  am  on the newtours homepage$")
	public void i_am_on_the_newtours_homepage()  {
	  driver = getBrowser();  
	}

	@When("^I enter \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_enter(String userName, String userPassword)  {
	    
	}

	@When("^I click login$")
	public void i_click_login()  {
	    
	}

	@Then("^I find flight reservation page$")
	public void i_find_flight_reservation_page()  {
	    
	}

}
