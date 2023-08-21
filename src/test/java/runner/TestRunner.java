package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/DemoFeatures",glue="orangeHRM.steps", tags="@reg", plugin= {"pretty","html:target/cucumber-reports/report.html"},monochrome=true)
public class TestRunner extends AbstractTestNGCucumberTests {
	
}
