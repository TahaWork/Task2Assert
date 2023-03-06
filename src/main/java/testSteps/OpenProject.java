package testSteps;

import io.qameta.allure.Step;
import org.junit.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static pagesElement.ProjectElements.*;

public class OpenProject {
    @Step("Открываем проект")
    public static void GoToProject() {

        projectMenu.click();
        projectName.shouldBe(visible, Duration.ofSeconds(30)).click();
        activeSprints.shouldBe(visible, Duration.ofSeconds(30)).click();
        Assert.assertTrue("Войти в проект не удалось", boardName.shouldBe(visible, Duration.ofSeconds(3)).exists());
    }
}
