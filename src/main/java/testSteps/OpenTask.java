package testSteps;
import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import static pagesElements.ProjectElements.task;

public class OpenTask {
    public static void OpenTask(SelenideElement taskNm) {
        Assert.assertTrue("Задача не найдена", taskNm.exists());
        task.click();
    }
}
