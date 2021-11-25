package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchResultsPage extends BasePage{

	private String productImageXpath = "//div[@data-component-type='s-search-result']//span[@data-component-type='s-product-image']/a/div/img";

	public SearchResultsPage() {
		super();
	}
	
	private WebElement getProductImage(int nthProduct){
		List<WebElement> productsImage = driver.findElements(By.xpath(productImageXpath));
		return productsImage.get(nthProduct);
	}

	public void selectProductInPosition(int position){
		getProductImage(position).click();
	}
}
