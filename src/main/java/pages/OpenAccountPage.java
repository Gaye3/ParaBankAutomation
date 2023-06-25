package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenAccountPage extends BasePage{
	
	public OpenAccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"leftPanel\"]/p")
	private WebElement welcomeMsg;
	
	@FindBy(xpath="//*[@id=\"leftPanel\"]/ul/li[1]/a")
	private WebElement openAccLink;
	
	@FindBy(id="type")
	private WebElement accTypeCheckBox;
	
	@FindBy(id="fromAccountId")
	private WebElement accIdCheckBox;
	
	@FindBy(xpath="/html/body/div[1]/div[3]/div[2]/div/div/form/div")
	private WebElement openNewAccBtn;
	
	@FindBy(xpath="//*[@id=\"rightPanel\"]/div/div/h1")
	private WebElement accOpenSuccessMsg;
	
	@FindBy(xpath="//*[@id=\"leftPanel\"]/ul/li[3]/a")
	private WebElement transferFundLink;
	
	public String getWelcomeMsg() {
		return getTextValue(welcomeMsg);
	}

	public void clickopenAcc() {
		click(openAccLink);
	}
	
	public void selectAccType(String text) {
		selectByText(accTypeCheckBox,text);
	}
	
	public void selectAccNo(String text) {
		selectByText(accIdCheckBox,text);
	}
	
	public void clickOpenNewAcc() {
		click(openNewAccBtn);
	}
	
	public String getSuccessMsg() {
		return getTextValue(accOpenSuccessMsg);
	}
	
	
	
}
