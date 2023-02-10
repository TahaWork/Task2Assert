package testSteps;

import org.junit.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.sleep;
import static pagesElement.TaskElements.*;

public class BugStatusMove {
    public static void statusMove() {


        openTask.click();
        inTaskButton.click();
        businessProcess.shouldBe(visible).click();
        ready.shouldBe(visible, Duration.ofSeconds(40)).click();
        sleep(3000);
        String status = statusName.getText();
        Assert.assertEquals("не удалось перевести в готово","ГОТОВО", status );


    }
}
