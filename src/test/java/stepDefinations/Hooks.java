package stepDefinations;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pages.LoginPage;
import pages.OpenAccountPage;
import pages.RegisterPage;
import utilities.SeleniumDriver;

public class Hooks {
	
	
	@Before
	public void setBrowser() {
		SeleniumDriver.setSeleniumDriver();
		
	}
	
	@After
	public void tearDown(Scenario scenario) {
		
		if(scenario.isFailed()) {
			byte[] screenshot = ((TakesScreenshot) SeleniumDriver.getSeleniumDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
		}
		
		SeleniumDriver.quitBrowser();
	}

}
