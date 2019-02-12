import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ={"src/test/resources/features/Webservice.feature"},
        glue={"steps"}
)
public class RunnerTest {

    @Before
    public void setUp(){
    }


    @After
    public void tearDown(){
    }

}