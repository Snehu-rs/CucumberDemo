
	package com.runner;
	 
	import org.junit.runner.RunWith;
	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;
	 
	@RunWith(Cucumber.class)
	//@CucumberOptions(features="src/test/resources/features/flipkart.feature", glue={"com.stepdef"},
	//@CucumberOptions(features="src/test/resources/features/demoAuto.feature", glue={"com.stepdef"},
	@CucumberOptions(features="src/test/resources/features/scrollingflipkart.feature", glue={"com.stepdef"},
	plugin= {"pretty","junit:target/JUnitReports/reports.xml",
			"json:target/JSONReports/report.json",
	"html:target/HtmlReports"}
			)
	public class TestRunner {
	 
	}
