package stepDefs;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.ResultPage;

public class AddItemsStepDef extends TestBase {

	@Given("user login into app")
	public void user_login_into_app() {
		LoginPage loginPage = new LoginPage(); 
		initialize();	
		loginPage.logIn();
	}
			
	@When("user add an item into cart")
	public void user_add_an_item_into_cart() {
		HomePage homePage = new HomePage();
		ResultPage resultPage = new ResultPage();
		
		homePage.selectItem1();
		resultPage.addToCart();
				
		homePage.selectItem2();
		resultPage.addToCart();
	}
		
	@Then ("items must be added to cart")
	public void items_must_be_added_to_cart() {
		
	}
	
}
