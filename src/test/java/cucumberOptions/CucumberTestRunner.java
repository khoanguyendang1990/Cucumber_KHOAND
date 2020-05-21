package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/bankGuru/features","src/test/java/commons/features"},
		glue = "bankGuru.stepDefinitions",
		monochrome = true,
		plugin = {"pretty","html:target/site/cucumber-html-reporting","json:target/site/cucumber.json"},
		snippets = SnippetType.CAMELCASE,
		tags = {"@newCustomer"})


public class CucumberTestRunner {

}
