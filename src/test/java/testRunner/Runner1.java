package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"FestureFiles"},monochrome=true,glue= {"stepDefinitions"},format= {"pretty","html:target/cucmber-reports"})
public class Runner1 {
	

}
