package pagesElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginElements {
    public static SelenideElement loginInput = $x("//*[@name='os_username']");
    public static SelenideElement passwordInput = $x("//*[@name='os_password']");
    public static SelenideElement loginEnter = $x("//*[@value='Войти']");
    public static SelenideElement wellcomeText = $x("//h3[contains(text(),'Добро пожаловать в Jira')]");
    public static SelenideElement userMenu = $x("//li[@id='user-options']");
    public static SelenideElement logoutButton= $x("//a[contains(text(),'Выйти')]");
    }
