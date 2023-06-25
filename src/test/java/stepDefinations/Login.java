package stepDefinations;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.OpenAccountPage;
import utilities.SeleniumDriver;

public class Login{
	
	LoginPage login;
	OpenAccountPage openAcc;
	
	@When("user enters registered username {string}")
	public void user_enters_registered_username(String username) {
		login = SeleniumDriver.OpenUrl();
	   login.typeUsername(username);
	}
	@And("user enters registed password {string}")
	public void user_enters_registed_password(String password) {
	    login.typePassword(password);
	}
	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		openAcc = login.clickLogin();
	}
	@Then("validate user is logged in {string}")
	public void validate_user_is_logged_in(String name) {
	    Assert.assertEquals(openAcc.getWelcomeMsg(), "Welcome "+name);
	}

}
