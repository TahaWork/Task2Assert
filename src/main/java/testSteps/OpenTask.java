package testSteps;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.Assert;

import static pagesElement.ProjectElements.task;

public class OpenTask {
    @Step("Открываем задачу {taskNm}")

    public static void OpenTask(SelenideElement taskNm) {

        Assert.assertTrue("Задача не найдена", taskNm.exists());
        task.click();

    }
}
