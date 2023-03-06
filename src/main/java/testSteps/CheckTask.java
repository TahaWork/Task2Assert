package testSteps;

import Hooks.WebHooks;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.Assert;

import static pagesElement.ProjectElements.*;

public class CheckTask  {
    @Step("Проверяем статус задачи")
    public static void CheckTaskStatus () {

        String status = taskStatus.getText();
        Assert.assertEquals("Статус задачи", "ГОТОВО", status);

    }
    @Step("Проверяем версию задачи")
    public static void CheckTaskVers() {

        String vers = taskVers.getText();
        Assert.assertEquals("Затронутая версия не равна ожидаемой", "Version 2.0", vers);

    }
}
