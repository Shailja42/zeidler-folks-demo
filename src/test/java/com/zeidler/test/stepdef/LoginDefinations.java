package com.zeidler.test.stepdef;

import com.zeidler.test.seleniumFunctions.ProductLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;


public class LoginDefinations {
		
	ProductLogin obj = new ProductLogin();
	
@Given("I have launch the browser")
public void i_have_launch_the_browser() throws Throwable {
	obj.createDriver();	
}


}