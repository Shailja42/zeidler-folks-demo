package com.zeidler.test.stepdef;
import java.net.MalformedURLException;

import com.zeidler.test.seleniumFunctions.ProductCreationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class CreateDefinations {
	
	ProductCreationPage create = new ProductCreationPage();
	

	@Then("I click on add a new computer button and enter the details to create a computer")
	public void i_verify_that_i_naviagte_to_correct_url() throws MalformedURLException, InterruptedException {
	   create.createprdct();
	}

	@Then("I click on add new computer verify added details in database")
	public void i_verify_added_details_in_database() {
	   create.verifyprdct();
	}

}
