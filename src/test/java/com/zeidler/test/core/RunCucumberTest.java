package com.zeidler.test.core;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/test/resources/features",
 glue={"com.zeidler.test.stepdef"},
 tags= {"@deletion1"},
 plugin = { "pretty", "html:target/cucumber-reports" },
 monochrome = true
 )
 
public class RunCucumberTest {
	
	
}
