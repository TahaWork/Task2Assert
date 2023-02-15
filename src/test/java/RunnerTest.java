import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import stepDefinition.TestSteps;

@RunWith(Cucumber.class)
@CucumberOptions

        (
                features = "src/test/resources/features",
                glue = {"/stepDefinition"},
                tags = "@TEST"
        )
public class RunnerTest {


}
