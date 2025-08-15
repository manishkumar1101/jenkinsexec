package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Test
@CucumberOptions(features = {"src/test/resources/ordering.feature"},
glue= {"stepdefinations","Hooks"}
)

public class orderrunner extends AbstractTestNGCucumberTests{

}
