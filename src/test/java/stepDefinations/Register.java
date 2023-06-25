package stepDefinations;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.RegisterPage;
import utilities.SeleniumDriver;

public class Register {
	
	LoginPage login;
	RegisterPage register;
	
	@Given("user navigates to the application")
	public void user_navigates_to_the_application() {
		login = SeleniumDriver.OpenUrl();
	}
	
	@When("user clicks on register link")
	public void user_clicks_on_register_link() {
	   
		register = login.goToRegistration();
		
	}
	
	@Then("validate user navigates to registration page")
	public void validate_user_navigates_to_registration_page() {
		
		Assert.assertEquals(register.getTitle(), "Signing up is easy!");
		
	}
	
	@When("user enters firstname {string}")
	public void user_enters_firstname(String firstname) {

		register.typeFirstName(firstname);
		
	}
	
	@And("user enters lastname {string}")
	public void user_enters_lastname(String lastname) {
		register.typeLastName(lastname);
	}
	
	@And("user enters address {string}")
	public void user_enters_address(String address) {
		register.typeAddress(address);
	}
	
	@And("user enters city {string}")
	public void user_enters_city(String city) {
		register.typeCity(city);
	}
	
	@And("user enters state {string}")
	public void user_enters_state(String state) {
	    register.typeState(state);
	}
	
	@And("user enters zipcode {string}")
	public void user_enters_zipcode(String zipcode) {
	    register.typeZipCode(zipcode);
	}
	
	@And("user enters PhoneNo {string}")
	public void user_enters_phone_no(String phoneNo) {
		register.typePhoneNo(phoneNo);
	}
	
	@And("user enters SSN {string}")
	public void user_enters_ssn(String ssn) {
	   register.typeSsn(ssn);
	}
	
	@And("user enters username {string}")
	public void user_enters_username(String username) {
	    register.typeUsername(username);
	}
	
	@And("user enters password {string}")
	public void user_enters_password(String password) {
	  register.typePassword(password);
	}
	
	@And("user enters confirmPassword {string}")
	public void user_enters_confirm_password(String password) {
	   register.typeConfirmPassword(password);
	}
	
	@When("user clicks on register button")
	public void user_clicks_on_register_button() {
	   register.clickRegister();
	}
	@Then("validate the user is registered")
	public void validate_the_user_is_registered() {
	    Assert.assertEquals(register.getSuccessMsg(), "Your account was created successfully. You are now logged in.");
	}


}
