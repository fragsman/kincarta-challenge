package stepDefinitions;

import POM.SearchResultsPage;
import io.cucumber.java.en.When;

public class SearchResultSteps {

	private SearchResultsPage searchResultsPage;

	@When("the user selects the product in position {int} in the result page")
	public void userSelectProductInPosition(Integer position){
		searchResultsPage = new SearchResultsPage();
		searchResultsPage.selectProductInPosition(position);
	}
	
}
