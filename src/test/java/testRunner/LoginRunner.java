package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/feature/login.feature"},
        dryRun = !true,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true,
        glue = { "steps" } //, "hooks", "pages"},
        //plugin =  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

//			plugin = {"pretty", "html:CucumberReports",
//					"json:reports/result.json",
//					"junit:reports/result.xml"}
//			tags = {"@smoke and  @reg"}
)

public class LoginRunner extends AbstractTestNGCucumberTests {

}