package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"ui.stepdefinitions","api.stepdefinitions"},
        features = {"src/test/resources/ui-features/subscription.feature","src/test/resources/api-features/create-device.feature"},
        plugin = {
                "pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        monochrome = false,
        dryRun = false
)
public class Runner {

}
