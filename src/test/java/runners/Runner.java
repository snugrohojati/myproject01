package runners;

import org.junit.runner.RunWith;
//import io.cucumber.testng.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
	features = "resources//features//",
	glue= {"stepDefs"},
	monochrome = true)

public class Runner {


}

	

