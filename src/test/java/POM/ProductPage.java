package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage{
	
	private String addToCartBtnId = "add-to-cart-button";
	private String loadingSpinnerXpath = "//div[@id='attach-add-to-cart-message-spinner']/span[contains(@class,'a-spinner')]";
	private String addedToCartMsgXPath = "//div[@id='attach-added-to-cart-message']//h4[@class='a-alert-heading']";
	private String successfullyAddedToCartMsgSpanish = "Agregado al carrito";
	private String successfullyAddedToCartMsgEnglish = "Added to Cart";
	
	public ProductPage() {
		super();
	}
	
	private WebElement getAddToCartButton(){
		return driver.findElement(By.id(addToCartBtnId));
	}

	private WebElement getAddedToCartMessage(){
		return driver.findElement(By.xpath(addedToCartMsgXPath));
	}

	public boolean itemCanBeAddedToCart(){
		getAddToCartButton().click();
		waitForSpinnerToDissapear();
		String addedToCartMsg = getAddedToCartMessage().getText();
		return addedToCartMsg.equals(successfullyAddedToCartMsgSpanish) || addedToCartMsg.equals(successfullyAddedToCartMsgEnglish);	
	}

	private void waitForSpinnerToDissapear(){
		//I do it this wait because I find it personally more stable than selenium wait functions
		//I usually have more complex and reusable waits methods for different situations in a Helper file

		try {
			WebElement spinner = driver.findElement(By.id(loadingSpinnerXpath));
			while(spinner.isDisplayed()){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}catch (NoSuchElementException e){
			System.out.println("spinner wasn't there or it dissapeared too fast");
		}
		
	}
}
