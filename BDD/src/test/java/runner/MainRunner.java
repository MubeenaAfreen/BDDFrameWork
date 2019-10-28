package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions
(
	features = {"src/test/java/CucumberFramework/"},
	glue = {"testsFile" },
	plugin =  { "html:target/cucumber",
			   "json:target/cucumber.json",
			   "com.cucumber.listener.ExtentCucumberFormatter:target/report.html"
			  } 
)

public class MainRunner {

}
