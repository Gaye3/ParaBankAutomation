package stepDefinations;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.OpenAccountPage;
import utilities.SeleniumDriver;

public class OpenAccount {
	
	LoginPage login;
	OpenAccountPage openAcc;
	
	@When("user login with valid username and password {string} {string}")
	public void user_login_with_valid_username_and_password(String username,String password) {
		login = SeleniumDriver.OpenUrl();
		login.typeUsername(username);
		login.typePassword(password);
		openAcc = login.clickLogin();
	}
	
	@Then("validate user navigated to account services {string}")
	public void validate_user_navigated_to_account_services(String name) {
	    Assert.assertEquals(openAcc.getWelcomeMsg(), "Welcome "+name);
	}
	
	@And("user clicks on open new account")
	public void user_clicks_on_open_new_account() {
	    openAcc.clickopenAcc();
	}
	
	@And("selects the account type {string}")
	public void selects_the_account_type(String accType) {
	    openAcc.selectAccType(accType);
	}
	
	@And("selects the account number {string}")
	public void selects_the_account_number(String accNumber) {
	    openAcc.selectAccNo(accNumber);
	}
	
	@When("user click on open new account")
	public void user_click_on_open_new_account() {
	   openAcc.clickOpenNewAcc();
	}
	
	@Then("validate new account is setup for the user")
	public void validate_new_account_is_setup_for_the_user() {
	   Assert.assertEquals(openAcc.getSuccessMsg(),"Account Opened!");
	}

}
