import Hooks.WebHooks;
import testSteps.*;

import static data.TestData.login;
import static data.TestData.pass;
import static pagesElement.ProjectElements.newTask;
import static pagesElement.ProjectElements.task;


public class TestRun extends WebHooks {





    @org.junit.jupiter.api.Test
    public void testCountTask()  {
        JiraLogin.LogInJira(login, pass);
        OpenProject.GoToProject();
        TaskCount.TaskCountAll();
        TaskCount.TaskCountToDo();
        TaskCount.TaskCountInWork();
        TaskCount.TaskCountDone();
    }

    @org.junit.jupiter.api.Test
    public void testCheckTask() {
       JiraLogin.LogInJira(login, pass);
       OpenProject.GoToProject();
       OpenTask.OpenTask(task);
       CheckTask.CheckTaskVers();
       CheckTask.CheckTaskStatus();
    }

    @org.junit.jupiter.api.Test
    public void testCreateBug() {
       JiraLogin.LogInJira(login, pass);
       OpenProject.GoToProject();
       CreateBug.createBug();
        OpenTask.OpenTask(newTask);
        BugStatusMove.statusMove();



    }

}


