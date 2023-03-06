package testSteps;

import io.qameta.allure.Step;
import org.junit.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.switchTo;
import static data.TestData.*;
import static pagesElement.ProjectElements.*;

public class CreateBug {
    @Step("Создаем задачу {taskText}")

    public static void createBug() {

        createTaskButton.click();
        taskTypeInput.setValue (taskType);
        taskTypeInput.pressEnter();
        taskSprintInput.setValue(taskSprint);
        sleep(1000);
        taskSprintInput.pressEnter();
        switchTo().frame(fr);
        taskTextInput.sendKeys(taskText);;
        switchTo().parentFrame();
        taskSubjInput.click();
        taskSubjInput.sendKeys(taskSubj);
        taskSubjInput.pressEnter();
        Assert.assertTrue("Не удалось создать задачу", createdTask.shouldBe(visible, Duration.ofSeconds(10)).exists());

    }

}
