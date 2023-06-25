package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"loginPanel\"]/form/div[1]/input")
	private WebElement usernameTxtBox;
	
	@FindBy(xpath="//*[@id=\"loginPanel\"]/form/div[2]/input")
	private WebElement passwordTxtBox;
	
	@FindBy(xpath="//*[@id=\"loginPanel\"]/form/div[3]/input")
	private WebElement logInBtn;
	
	@FindBy(xpath="//*[@id=\"loginPanel\"]/p[2]/a")
	private WebElement registerLink;
	
	public RegisterPage goToRegistration() {
		click(registerLink);
		return new RegisterPage(driver);
	}
	
	public void typeUsername(String username) {
		type(usernameTxtBox,username);
	}
	
	public void typePassword(String password) {
		type(passwordTxtBox,password);
	}
	
	public OpenAccountPage clickLogin() {
		click(logInBtn);
		return new OpenAccountPage(driver);
	}

}
