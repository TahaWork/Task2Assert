package Hooks;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class WebHooks {
    @org.junit.jupiter.api.AfterEach
    public void logout() {

        $x("//li[@id='user-options']").click();
        $x("//a[contains(text(),'Выйти')]").shouldBe(visible, Duration.ofSeconds(10)).click();


    }
}
