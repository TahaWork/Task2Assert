package testSteps;

import org.junit.Assert;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static pagesElement.LoginElements.*;

public class JiraLogin {

    public static void LogInJira(String login, String pass) {

        open("https://edujira.ifellow.ru");
        loginInput.sendKeys(login);
        passwordInput.sendKeys(pass);
        loginEnter.click();
        Assert.assertTrue("Войти в учетную запись не удалось", wellcomeText.exists());
    }
}
