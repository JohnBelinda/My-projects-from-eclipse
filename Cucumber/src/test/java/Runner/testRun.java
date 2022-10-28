package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features= {"src/test/resources/Login/Loggingin.feature"},
glue= {"Definition"},
dryRun = true)
public class testRun {
	
	

}
