package runners;

import org.junit.runner.RunWith;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features = "resources//features//",
	glue= {"stepDefs"},
	monochrome = true)

public class Runner {


}

	

