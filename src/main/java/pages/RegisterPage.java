package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{
	
	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"rightPanel\"]/h1")
	private WebElement title;
	
	@FindBy(id="customer.firstName")
	private WebElement firstnameTxtBox;
	
	@FindBy(id="customer.lastName")
	private WebElement lastnameTxtBox;
	
	@FindBy(id="customer.address.street")
	private WebElement addressTxtBox;
	
	@FindBy(id="customer.address.city")
	private WebElement cityTxtBox;
	
	@FindBy(id="customer.address.state")
	private WebElement stateTxtBox;

	@FindBy(id="customer.address.zipCode")
	private WebElement zipcodeTxtBox;

	@FindBy(id="customer.phoneNumber")
	private WebElement phoneNoTxtBox;

	@FindBy(id="customer.ssn")
	private WebElement ssnTxtBox;

	@FindBy(id="customer.username")
	private WebElement usernameTxtBox;
	
	@FindBy(id="customer.password")
	private WebElement passwordTxtBox;
	
	@FindBy(id="repeatedPassword")
	private WebElement confirmPasswordTxtBox;
	
	@FindBy(xpath="//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input")
	private WebElement registerBtn;
	
	@FindBy(xpath="//*[@id=\"rightPanel\"]/p")
	private WebElement successMsg;
	
	public String getTitle() {
		return getTextValue(title);
	}
	
	public void typeFirstName(String firstname) {
		type(firstnameTxtBox,firstname);
	}
	
	public void typeLastName(String lastname) {
		type(lastnameTxtBox,lastname);
	}
	
	public void typeAddress(String address) {
		type(addressTxtBox,address);
	}
	
	public void typeCity(String city) {
		type(cityTxtBox,city);
	}
	
	public void typeState(String state) {
		type(stateTxtBox,state);
	}
	
	public void typeZipCode(String zipcode) {
		type(zipcodeTxtBox,zipcode);
	}
	
	public void typePhoneNo(String phone) {
		type(phoneNoTxtBox,phone);
	}
	
	public void typeSsn(String ssn) {
		type(ssnTxtBox,ssn);
	}
	
	public void typeUsername(String username) {
		type(usernameTxtBox,username);
	}
	
	public void typePassword(String password) {
		type(passwordTxtBox,password);
	}
	
	public void typeConfirmPassword(String password) {
		type(confirmPasswordTxtBox,password);
	}
	
	public void clickRegister() {
		click(registerBtn);
	}
	
	public String getSuccessMsg() {
		return getTextValue(successMsg);
	}

}
