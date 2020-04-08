package runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import commons.Init;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions(strict=false,features="src/test/resources/Features",glue="stepdefinitions", plugin = { "pretty","json:target/cucumber-json/cucumber.json",
        "junit:target/cucumber-reports/Cucumber.xml", "html:target/cucumber-reports"},


dryRun = false,
monochrome = true)		


public class TestRunner 				
{		
     
	
	@BeforeClass
	public static void launchApplication() throws IOException
	{
		Init.openBrowser();
		Init.launchApp();
	}
	
	@AfterClass
	public static void cleanup()
	{
		Init.driver.close();
		Init.driver.quit();
	}
}


