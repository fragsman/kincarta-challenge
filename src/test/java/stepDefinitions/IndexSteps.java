package stepDefinitions;

import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import POM.IndexPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import utils.DriverManager;

public class IndexSteps{
	
	WebDriver driver = null;
	private IndexPage indexPage;

	@Given("the user navigates to amazon")
	public void userNavigatesToAmazon(){
		driver = DriverManager.getDriver();
		
		indexPage = new IndexPage();
		driver.navigate().to("http://www.amazon.com");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
	}
	
	@And("searches for {string}")
	public void userSearchesFor(String keyword){
		indexPage.search(driver, keyword);
	}

}


