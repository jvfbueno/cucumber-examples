import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ={"src/test/resources/features/FirstFeature.feature"},
        glue={"steps"},
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json"}
        //tags = {"~@Selenium"}
        //tags = {"not @Selenium"}
)
public class RunnerTest {

}