package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class IndexPage extends BasePage{
	
	private static String searchBarId = "twotabsearchtextbox";
	private static String searchBarButtonId = "nav-search-submit-button";
	
	public IndexPage() {
		super();
	}
	private WebElement getSearchBar(){
		return driver.findElement(By.id(searchBarId));
	}

	private WebElement getSearchBarButton(){
		return driver.findElement(By.id(searchBarButtonId));
	}

	public void search(String keyword){
		getSearchBar().sendKeys(keyword);
		getSearchBarButton().click();
	}
	
	public void navigateToAmazon() {
		driver.navigate().to("http://www.amazon.com");
	}
}
