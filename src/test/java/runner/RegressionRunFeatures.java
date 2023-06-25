package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/Resources/Features",glue= {"stepDefinations"},plugin= {"html:target/cucumber-reports/cucumber-html-report.html",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},tags="@RegressionTest")
public class RegressionRunFeatures extends AbstractTestNGCucumberTests{

}
