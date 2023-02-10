package testSteps;
import com.codeborne.selenide.Condition;
import java.time.Duration;
import org.junit.Assert;
import static pagesElements.ProjectElements.*;

public class OpenProject {
    public static void GoToProject() {
        projectMenu.click();
        projectName.shouldBe(Condition.visible, Duration.ofSeconds(30)).click();
        activeSprints.shouldBe(Condition.visible, Duration.ofSeconds(30)).click();
        Assert.assertTrue("Войти в проект не удалось", boardName.shouldBe(Condition.visible, Duration.ofSeconds(3)).exists());
    }
}
