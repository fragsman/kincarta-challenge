package POM;

import org.openqa.selenium.WebDriver;

import utils.DriverManager;

public class BasePage {
	static WebDriver driver;
	
	public BasePage(){
		driver = DriverManager.getDriver();
	}
}
