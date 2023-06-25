package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pages.LoginPage;

public class SeleniumDriver {
	
	private static SeleniumDriver seleniumDriver;
	private static Properties config;
	private static WebDriver driver;
	
	
	private SeleniumDriver() {
		
		try {
			FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\Resouces\\config.properties");
			config = new Properties();
			config.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(config.getProperty("browser").equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\Resouces\\executables\\chromedriver.exe" );
			driver = new ChromeDriver();
			
		}
		else if(config.getProperty("browser").equalsIgnoreCase("edge")) {
			
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\src\\main\\Resouces\\executables\\msedgedriver.exe");
			driver = new EdgeDriver();
			
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
	}
	
	public static void setSeleniumDriver() {
		seleniumDriver = new SeleniumDriver();
	}
	
	public static WebDriver getSeleniumDriver() {
		return driver;
	}
	
	public static LoginPage OpenUrl() {
		driver.get(config.getProperty("testUrl"));
		return new LoginPage(driver);
	}
	
	public static void quitBrowser() {
		driver.quit();
	}
	
}
