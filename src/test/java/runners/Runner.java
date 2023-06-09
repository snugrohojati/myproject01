package runners;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/test/resources/features",
	glue= {"stepDefs"},
	monochrome = true ,
	plugin = {"pretty","json:target/cucumber.json"})

public class Runner {

}

	

