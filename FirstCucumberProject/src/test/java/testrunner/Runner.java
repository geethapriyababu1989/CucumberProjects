package testrunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\my\\eclipse-workspace\\FirstCucumberProject\\src\\test\\java\\feature\\sample.feature",
				glue= {"C:\\Users\\my\\eclipse-workspace\\FirstCucumberProject\\src\\test\\java\\stepdefinition\\Test.java"}, 
				dryRun=false, 
				strict=true, 
				monochrome=true)

public class Runner {

}
