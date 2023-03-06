import hooks.WebHooks;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions

        (
                features = "src/test/resources/features",
                glue = {"/stepDefinition", "/hooks"},

                plugin = {"pretty", "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"},
                snippets = CucumberOptions.SnippetType.CAMELCASE
        )


public class  RunnerTest extends WebHooks {


}

