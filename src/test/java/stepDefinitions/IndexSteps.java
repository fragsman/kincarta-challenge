package stepDefinitions;

import POM.IndexPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class IndexSteps{
	
	private IndexPage indexPage;

	@Given("the user navigates to amazon")
	public void userNavigatesToAmazon(){
		indexPage = new IndexPage();
		indexPage.navigateToAmazon();
	}
	
	@And("searches for {string}")
	public void userSearchesFor(String keyword){
		indexPage.search(keyword);
	}

}


