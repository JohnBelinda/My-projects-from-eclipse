package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features= {"src/test/resources/Login/Logindd.feature"},
glue= {"Definition"},

dryRun = true,

tags = "@PositiveTesting")
public class testrundd {

}
