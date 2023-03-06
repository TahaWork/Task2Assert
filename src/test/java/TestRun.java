import Hooks.WebHooks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.runners.Suite;
import testSteps.*;

import static data.TestData.login;
import static data.TestData.pass;
import static pagesElement.ProjectElements.newTask;
import static pagesElement.ProjectElements.task;


public class TestRun extends WebHooks {





    @Test

    @DisplayName("Считаем таски в Jira")
    public void testCountTask()  {
        JiraLogin.LogInJira(login, pass);
        OpenProject.GoToProject();
        TaskCount.TaskCountAll();
        TaskCount.TaskCountToDo();
        TaskCount.TaskCountInWork();
        TaskCount.TaskCountDone();
    }

    @Test

    @DisplayName("Проверяем статус и версию")
    public void testCheckTask() {
       JiraLogin.LogInJira(login, pass);
       OpenProject.GoToProject();
       OpenTask.OpenTask(task);
       CheckTask.CheckTaskVers();
       CheckTask.CheckTaskStatus();
    }

//    @Test

//    @DisplayName("создаем баг")
 //   public void testCreateBug() {
 //      JiraLogin.LogInJira(login, pass);
 //      OpenProject.GoToProject();
  //     CreateBug.createBug();
  //      OpenTask.OpenTask(newTask);
  //      BugStatusMove.statusMove();



 //   }

}


