package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:/Users/Shanthi/eclipse-workspace/shanthi/BDDFrameWork/src/test/java/Feature",
         glue = "C:\\Users\\Shanthi\\eclipse-workspace\\shanthi\\BDDFrameWork\\src\\test\\java\\SDefinition",
         format= {"pretty","html:test-outout"},
         dryRun = true
         )
public class TestRunner {

}
