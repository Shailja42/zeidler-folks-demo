package com.zeidler.test.stepdef;

import com.zeidler.test.seleniumFunctions.ProductDeletionPage;

import io.cucumber.java.en.Then;


public class DeletionDefination {
	
	ProductDeletionPage delete = new ProductDeletionPage();
	
	@Then("I search a record in database")
	public void i_search_a_record_in_database() throws InterruptedException {
	   delete.search_product();
	}

	@Then("I delete a record")
	public void i_delete_a_record() throws InterruptedException {
	    delete.delete_product();
	}

	@Then("I verify product is succesfully deleted with message.")
	public void i_verify_product_is_succesfully_deleted_with_message() {
	  delete.verify_product();
	}



}
