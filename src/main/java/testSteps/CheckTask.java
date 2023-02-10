package testSteps;

import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;

import static pagesElement.ProjectElements.*;

public class CheckTask {

    public static void CheckTaskStatus() {

        String status = taskStatus.getText();
        Assert.assertEquals("Статус задачи", "ГОТОВО", status);

    }

    public static void CheckTaskVers() {

        String vers = taskVers.getText();
        Assert.assertEquals("Затронутая версия не равна ожидаемой", "Version 2.0", vers);

    }
}
