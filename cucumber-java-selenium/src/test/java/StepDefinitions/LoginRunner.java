package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
/*
@CucumberOptions(features="src/test/resources/Features/login.feature", glue={"StepDefinitions"},
				monochrome = true,
				//plugin = {"pretty","html:target/HtmlReports/"}
				//plugin = {"pretty","json:target/JSonReports/report.json"}
				plugin = {"pretty","junit:target/JUnitReports/report.xml"},
				tags="@SmokeTest"
				
				*/
						@CucumberOptions(features="src/test/resources/Features/login.feature", glue={"StepDefinitions"},
						plugin= {"pretty","junit:target/JUnitReports/reports.xml"}
				)

public class LoginRunner 
{

}
