package stepdefinations;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Hooks.Hooks;
import genericLibraries.ReadingDataPropertyFile;
import genericLibraries.WebDriverUtilies;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.orderpage;

public class orderingpage {
	WebDriver driver=Hooks.driver;
	WebDriverUtilies utilites=new WebDriverUtilies();
	ReadingDataPropertyFile property=new ReadingDataPropertyFile();
	orderpage op=new orderpage(driver);
	@Given("validating the order page by selecting all inputs")
	public void validating_the_order_page_by_selecting_all_inputs() throws FileNotFoundException, IOException {
	   driver.get(property.getData("url"));
	}

@When("user click on the order button")
public void user_click_on_the_order_button() {
	op.orderbtn();
}

	@When("user choose the food item {string}")
	public void user_choose_the_food_item(String fooditem1) throws FileNotFoundException, IOException {
	    utilites.dropDown(op.fooditem(),fooditem1);
	}

	@When("user choose the special item {string}")
	public void user_choose_the_special_item(String valid) {
	    utilites.dropDown(op.specialitem(),valid);
	}

	@When("user choose the quantity {string}")
	public void user_choose_the_quantity(String quantity) {
	   op.foodqt(quantity);
	}

	@When("user choose the deliverytype {string}")
	public void user_choose_the_deliverytype(String type) {
	  utilites.dropDown(op.deliverytype(), type);
	}

	@When("user choose the delivery area {string}")
	public void user_choose_the_delivery_area(String area) {
	    utilites.dropDown(op.deliveryarea(), area);
	}

	@Then("user choose the submit button")
	public void user_choose_the_submit_button() {
	   op.submit();
	}

	@Then("user click on reset button")
	public void user_click_on_reset_button() {
	   op.reset();
	}



}
