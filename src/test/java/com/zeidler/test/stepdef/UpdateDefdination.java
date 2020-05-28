package com.zeidler.test.stepdef;

import com.zeidler.test.seleniumFunctions.ProductUpdationPage;

import io.cucumber.java.en.Then;

public class UpdateDefdination {
	ProductUpdationPage update = new ProductUpdationPage();

	@Then("I edit all the deatils and verify all the details updated sucessfully")
	public void i_edit_all_the_deatils_and_verify_all_the_details_updated_sucessfully() throws InterruptedException {
	   update.edit_product();
	}


	}


