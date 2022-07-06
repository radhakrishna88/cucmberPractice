package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionClass {

	/**
	 * Added new comment
	 */
	@Given("I want to open google")
	public void i_want_to_open_google() {
	   System.out.println("opening google");
	}

	@When("I search the product in google")
	public void i_search_the_product_in_google() {
	    System.out.println("searching for a product");
	}

	@Then("get the page title")
	public void get_the_page_title() {
	   System.out.println("Printing the page title");
	}
	
	/**
	 * Added new comment
	 */
	@Given("open the given url {string}")
	public void open_the_given_url(String url) {
	    System.out.println(url);
	}
	
	@Given("print the Background")
	public void print_the_background() {
	    System.out.println("Background Executed");
	}
}
