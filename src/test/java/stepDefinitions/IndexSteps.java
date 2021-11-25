package stepDefinitions;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import POM.IndexPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class IndexSteps{
	
	WebDriver driver = null;
	private IndexPage indexPage;

	@Given("the user navigates to amazon")
	public void userNavigatesToAmazon(){
		System.setProperty("webdriver.edge.driver","src/test/resources/drivers/msedgedriver.exe");
		driver = new EdgeDriver();
		
		indexPage = new IndexPage();
		driver.navigate().to("http://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
	}
	
	@And("searches for {string}")
	public void userSearchesFor(String keyword){
		indexPage.search(driver, keyword);
	}

}


