package pagesElements;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import data.TestData;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$x;

public class ProjectElements {
    public static SelenideElement projectMenu = $x("//a[text()='Проекты']");
    public static SelenideElement projectName = $x("//a[text()='Test (TEST)']");
    public static SelenideElement activeSprints = $x("//*[contains(text(),'Активные спринты')]//parent::a//parent::li");
    public static SelenideElement boardName = $x("//span[contains(text(),'Доска TEST')]");
    public static ElementsCollection allTasks = Selenide.$$(By.className("ghx-issue-key-link"));
    public static SelenideElement toDoList = $x("//li[@data-column-id='4']");
    public static ElementsCollection toDo = toDoList.$$(By.className("ghx-issue-key-link"));
    public static SelenideElement inWorkList = $x("//li[@data-column-id='5']");
    public static ElementsCollection inWork = inWorkList.$$(By.className("ghx-issue-key-link"));
    public static SelenideElement doneList = $x("//li[@data-column-id='6']");
    public static ElementsCollection done = doneList.$$(By.className("ghx-issue-key-link"));
    public static SelenideElement task = $x("//span[contains(text(),'" + TestData.taskName + "')]//parent::div//preceding-sibling::div");
    public static SelenideElement taskStatus = $x("//strong[contains(text(),'Статус:')]//parent::div//child::span[@id='status-val'] ");
    public static SelenideElement taskVers = $x("//label[contains(text(),'Затронуты версии:')]//parent::strong//parent::div//child::span");
    public static SelenideElement createTaskButton = $x("//*[@title='Создать новую задачу']");
    public static SelenideElement taskTypeInput = $x("//label[contains(text(),'Тип задачи ')]//following-sibling::div[@id='issuetype-single-select']//child::input");
    public static SelenideElement  taskSprintInput = $x("//label[contains(text(),'Спринт')]//following-sibling::div//child::div//child::input");
    public static SelenideElement fr = $x("//div[@id='description-wiki-edit']//iframe");
    public static SelenideElement  taskTextInput = $x("//body[@id='tinymce']");
    public static SelenideElement  taskSubjInput = $x("//input[@name='summary']");
    public static SelenideElement  createdTask = $x("//li[@data-column-id='4']//span[contains(text(),'" + TestData.taskSubj + "')]");
    public static SelenideElement  newTask = $x("//span[contains(text(),'" + TestData.taskSubj + "')]//parent::div//preceding-sibling::div");


}
