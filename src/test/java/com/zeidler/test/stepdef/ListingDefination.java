package com.zeidler.test.stepdef;


import com.zeidler.test.seleniumFunctions.ProductListing;

import io.cucumber.java.en.Then;


public class ListingDefination {
	ProductListing list = new ProductListing();
	
	@Then("I verify all products are sucessfully displayed")
	public void i_verify_all_products_are_sucessfully_displayed() throws InterruptedException {
	   list.list_product();
	}


}
