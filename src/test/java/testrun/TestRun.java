package testrun;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/featureFile" , glue = {"stepdefinition","hooks"}
, monochrome = true, tags = "@allsite", dryRun = false)
public class TestRun {

}
