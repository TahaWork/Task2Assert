package testSteps;

import com.codeborne.selenide.Condition;
import java.time.Duration;
import org.junit.Assert;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.switchTo;
import static data.TestData.*;
import static pagesElements.ProjectElements.*;

public class CreateBug {

    public static void createBug() {
        createTaskButton.click();
        sleep(1000);
        taskTypeInput.setValue(taskType);
        taskTypeInput.pressEnter();
        taskSprintInput.setValue(taskSprint);
        sleep(1000);
        taskSprintInput.pressEnter();
        switchTo().frame(fr);
        taskTextInput.sendKeys(taskText);
        switchTo().parentFrame();
        taskSubjInput.click();
        taskSubjInput.sendKeys(taskSubj);
        taskSubjInput.pressEnter();
        Assert.assertTrue("Не удалось создать задачу", createdTask.shouldBe(Condition.visible, Duration.ofSeconds(10)).exists());
    }
}

