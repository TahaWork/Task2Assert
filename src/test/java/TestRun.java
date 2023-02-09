import Hooks.WebHooks;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import java.time.Duration;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;


public class TestRun extends WebHooks {

        public void logInJira() {


            open("https://edujira.ifellow.ru");
            $x("//*[@name='os_username']").sendKeys("ndavydova");
            $x("//*[@name='os_password']").sendKeys("Qwerty123");
            $x("//*[@value='Войти']").click();
            Assert.assertTrue("Войти в учетную запись не удалось", $x("//h3[contains(text(),'Добро пожаловать в Jira')]").exists());
        }



          public void goToProject() {

        $x("//a[text()='Проекты']").click();
        $x("//a[text()='Test (TEST)']").shouldBe(visible, Duration.ofSeconds(30)).click();
        $x("//*[contains(text(),'Активные спринты')]//parent::a//parent::li").shouldBe(visible, Duration.ofSeconds(30)).click();
        Assert.assertTrue("Войти в проект не удалось", $x("//span[contains(text(),'Доска TEST')]").shouldBe(visible, Duration.ofSeconds(3)).exists());
    }

    public void taskCount() {

        ElementsCollection allTasks = null;
        ElementsCollection toDo = null;
        ElementsCollection inWork = null;
        ElementsCollection done = null;

        allTasks = $$(By.className("ghx-issue-key-link"));
        System.out.println("Всего найдено задач на доске: " + allTasks.size());
        SelenideElement toDoList = $x("//li[@data-column-id='4']");
        toDo = toDoList.$$(By.className("ghx-issue-key-link"));
        System.out.println("Нужно сделать: " + toDo.size());
        SelenideElement inWorkList = $x("//li[@data-column-id='5']");
        inWork = inWorkList.$$(By.className("ghx-issue-key-link"));
        System.out.println("В работе: " + inWork.size());
        SelenideElement doneList = $x("//li[@data-column-id='6']");
        done = doneList.$$(By.className("ghx-issue-key-link"));
        System.out.println("Нужно сделать: " + done.size());

        Assert.assertFalse("Посчитать все задачи не удалось", allTasks.isEmpty());
        Assert.assertFalse("Посчитать задачи которые нужно сделать не удалось", toDo.isEmpty());
        Assert.assertFalse("Посчитать задачи в работе не удалось", inWork.isEmpty());
        Assert.assertFalse("Посчитать выполненные не удалось", done.isEmpty());


    }

    public void checkTaskStatus(String taskName) {

        $x("//span[contains(text(),'" + taskName + "')]//parent::div//preceding-sibling::div").click();
        String status = $x("//strong[contains(text(),'Статус:')]//parent::div//child::span[@id='status-val'] ").getText();
        Assert.assertEquals("Статус задачи", "ГОТОВО", status);

    }

    public void checkTaskVers(String taskName) {

        $x("//span[contains(text(),'" + taskName + "')]//parent::div//preceding-sibling::div").click();
        String vers = $x("//label[contains(text(),'Затронуты версии:')]//parent::strong//parent::div//child::span").getText();
        Assert.assertEquals("Затронутая версия не равна ожидаемой", "Version 2.0", vers);

    }

    public void createBug() {

        $x("//*[@title='Создать новую задачу']").click();
        $x("//label[contains(text(),'Тип задачи ')]//following-sibling::div[@id='issuetype-single-select']//child::input").sendKeys("Ошибка");
        $x("//label[contains(text(),'Тип задачи ')]//following-sibling::div[@id='issuetype-single-select']//child::input").pressEnter();
        $x("//label[contains(text(),'Спринт')]//following-sibling::div//child::div//child::input").clear();
        $x("//label[contains(text(),'Спринт')]//following-sibling::div//child::div//child::input").sendKeys("Доска Спринт 1");
         $x("//label[contains(text(),'Спринт')]//following-sibling::div//child::div//child::input").pressEnter();
        $x("//label[contains(text(),'Спринт')]//following-sibling::div//child::div//child::input").pressEnter();

        SelenideElement fr =  $x("//div[@id='description-wiki-edit']//iframe");
        switchTo().frame(fr);
        $x("//body[@id='tinymce']").sendKeys("Все отлично работает, просто хотела похвалить разработчиков");;
        switchTo().parentFrame();
        $x("//input[@name='summary']").setValue("Все отлично работает").pressEnter();
        //$x("//input[@title='Нажмите Alt + S, чтобы отправить эту форму']").shouldBe(visible, Duration.ofSeconds(30)).click();
        Assert.assertTrue("Не удалось создать задачу", $x("//li[@data-column-id='4']//span[contains(text(),'Все отлично работает')]").shouldBe(visible, Duration.ofSeconds(10)).exists());

    }

    public void statusMove() {

        $x("//li[@data-column-id='4']//span[contains(text(),'Все отлично работает')]//parent::div//preceding-sibling::div").click();
        $x("//*[@title='Просмотреть эту проблему']").click();
        $x("//span[contains(text(),'В работе')]").click();
        $x("//a[@id='opsbar-transitions_more']").shouldBe(visible).click();
        $x("//span[contains(text(),'Выполнено')]//parent::a//parent::aui-item-link").shouldBe(visible, Duration.ofSeconds(30)).click();
        sleep(2_000);
        String status = $x("//strong[contains(text(),'Статус')]//following-sibling::span//child::span").getText();
        Assert.assertEquals("не удалось перевести в готово","ГОТОВО", status );



    }


    @org.junit.jupiter.api.Test
    public void testCountTask()  {
        logInJira();
        goToProject();
        taskCount();
    }

    @org.junit.jupiter.api.Test
    public void testCheckTask() {
        logInJira();
        goToProject();
        checkTaskStatus("TestSelenium");
        checkTaskVers("TestSelenium");
    }

    @org.junit.jupiter.api.Test
    public void testCreateBug() {
       logInJira();
        goToProject();
        createBug();
        statusMove();


    }
}
