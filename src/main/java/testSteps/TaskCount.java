package testSteps;

import io.qameta.allure.Step;
import org.junit.Assert;

import static com.codeborne.selenide.Selenide.$$;
import static pagesElement.ProjectElements.*;

public class TaskCount {
    @Step("Считаем все задачи")

    public static void TaskCountAll() {
        System.out.println("Всего найдено задач на доске: " + allTasks.size());
        Assert.assertFalse("Посчитать все задачи не удалось", allTasks.isEmpty());



    }
    @Step("Считаем задачи нужно сделать")
    public static void TaskCountToDo() {

        System.out.println("Нужно сделать: " + toDo.size());
        Assert.assertFalse("Посчитать задачи которые нужно сделать не удалось", toDo.isEmpty());


    }
    @Step("Считаем задачи в работе")
    public static void TaskCountInWork() {

        System.out.println("В работе: " + inWork.size());
        Assert.assertFalse("Посчитать задачи в работе не удалось", inWork.isEmpty());

    }
    @Step("Считаем задачи Выполнено")
    public static void TaskCountDone() {

        System.out.println("Нужно сделать: " + done.size());
        Assert.assertFalse("Посчитать выполненные не удалось", done.isEmpty());

    }
}
