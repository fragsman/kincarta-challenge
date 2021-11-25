package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IndexPage {
	
	private static String searchBarId = "twotabsearchtextbox";
	private static String searchBarButtonId = "nav-search-submit-button";

	private WebElement getSearchBar(WebDriver driver){
		return driver.findElement(By.id(searchBarId));
	}

	private WebElement getSearchBarButton(WebDriver driver){
		return driver.findElement(By.id(searchBarButtonId));
	}

	public void search(WebDriver driver, String keyword){
		getSearchBar(driver).sendKeys(keyword);
		getSearchBarButton(driver).click();
	}
}
