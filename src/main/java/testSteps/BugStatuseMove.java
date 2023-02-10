package testSteps;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import java.time.Duration;
import org.junit.Assert;
import pagesElements.*;

import static com.codeborne.selenide.Selenide.sleep;
import static pagesElements.TaskElements.*;

public class BugStatuseMove {
    public static void statusMove() {
        openTask.click();
        inTaskButton.click();
        businessProcess.shouldBe(Condition.visible).click();
        ready.shouldBe(Condition.visible, Duration.ofSeconds(40)).click();
        sleep(3000);
        String status = statusName.getText();
        Assert.assertEquals("не удалось перевести в готово", "ГОТОВО", status);
    }
}
