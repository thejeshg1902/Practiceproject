package runner3;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features3",
    glue = {"stepdefination3", "hooks3"},
    	publish=true,
    	dryRun=false,
    	monochrome = true,
    	//tags="@login1",
    plugin = {"pretty", "html:target/report.html"}
    
    
)
public class TestRunner3 {
}