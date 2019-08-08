package testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features= "Features",
		glue = "stepdef"
		
		)




public class TestRunner extends AbstractTestNGCucumberTests {

	
	

	

}
