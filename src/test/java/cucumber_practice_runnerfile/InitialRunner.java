package cucumber_practice_runnerfile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = {"src/test/resources/LoginRememberMe.feature"},
				glue = {"cucumber_practice_stepdefination"}
)

public class InitialRunner extends AbstractTestNGCucumberTests{

}
