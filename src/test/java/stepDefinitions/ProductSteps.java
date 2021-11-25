package stepDefinitions;

import org.junit.Assert;

import POM.ProductPage;
import io.cucumber.java.en.Then;
import utils.DriverManager;

public class ProductSteps {
	
	private ProductPage productPage;

	@Then("the product can be added to the cart")
	public void theProductCanBeAddedToTheCart(){
		productPage = new ProductPage();
		Assert.assertTrue(productPage.itemCanBeAddedToCart());
		DriverManager.closeDriver();
	}
}
