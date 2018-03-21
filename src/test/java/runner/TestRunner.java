package runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions(
	       // format = {"pretty", "json:target/"},
	        features = "features",
	        //glue = {"src/test/java"},
	        //tags = "",
	        plugin = {"html:target/cucumber-html-report"}
	)
	
public class TestRunner {

}
