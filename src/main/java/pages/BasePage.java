package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
	WebDriver driver;
	
	public BasePage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public void type(WebElement element,String data) {
		element.sendKeys(data);
	}

	public boolean isElementPresent(WebElement element) {
		return element.isDisplayed();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public void mouseHover() {
		
	}
	
	public void selectByText(WebElement element,String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	public String getTextValue(WebElement element) {
		return element.getText();
	}
}
