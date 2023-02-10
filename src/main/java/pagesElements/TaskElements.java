package pagesElements;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class TaskElements {
    public static SelenideElement openTask = Selenide.$x("//*[@title='Просмотреть эту проблему']");
    public static SelenideElement inTaskButton = Selenide.$x("//span[contains(text(),'В работе')]");
    public static SelenideElement businessProcess = Selenide.$x("//a[@id='opsbar-transitions_more']");
    public static SelenideElement ready = Selenide.$x("//span[contains(text(),'Выполнено')]//parent::a//parent::aui-item-link");
    public static SelenideElement statusName = Selenide.$x("//strong[contains(text(),'Статус')]//following-sibling::span//child::span");

}

