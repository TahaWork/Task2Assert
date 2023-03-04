import hooks.WebHooks;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import stepDefinition.TestSteps;

@RunWith(Cucumber.class)
@CucumberOptions

        (
                features = "src/test/resources/features",
                glue = {"/stepDefinition"},
                tags = "@TEST"
        )

@DisplayName("cucumber test")
public class  RunnerTest extends WebHooks {


}
