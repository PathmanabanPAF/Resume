package cucumber_test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature"
		,glue={"stepDefinition"}
		, tags = {"@regression"},
		//, tags = {"@service"},
		//, tags = {"@login"},
		plugin = { "pretty", "html:target/cucumber-reports" }
		,monochrome = true
		)

public class TestRunner {

}
