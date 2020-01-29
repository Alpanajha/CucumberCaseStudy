package TestRunner1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions
(features="featurefile",
glue= {"StepDefination1"},tags="@login")
public class Runner {
	
}
