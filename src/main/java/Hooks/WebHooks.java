package Hooks;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.apache.hc.core5.http.nio.entity.StringAsyncEntityConsumer;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.closeWebDriver;

public class WebHooks {

    @BeforeEach
    public void allure()
    {

        new AllureSelenide().screenshots(true).savePageSource(false);
    }
    @org.junit.jupiter.api.AfterEach
    public void logout() {

        $x("//li[@id='user-options']").click();
        $x("//a[contains(text(),'Выйти')]").shouldBe(visible, Duration.ofSeconds(10)).click();



    }
}
