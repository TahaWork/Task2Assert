package pagesElement;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TaskElements {
    public static SelenideElement openTask =  $x("//*[@title='Просмотреть эту проблему']");
    public static SelenideElement inTaskButton = $x("//span[contains(text(),'В работе')]");
    public static SelenideElement businessProcess = $x("//a[@id='opsbar-transitions_more']");
    public static SelenideElement ready =$x("//span[contains(text(),'Выполнено')]//parent::a//parent::aui-item-link");
    public static SelenideElement statusName= $x("//strong[contains(text(),'Статус')]//following-sibling::span//child::span");
}
