package hooks;
import com.codeborne.selenide.junit.ScreenShooter;

import com.codeborne.selenide.junit.ScreenShooter;
import com.codeborne.selenide.junit5.ScreenShooterExtension;
import io.qameta.allure.selenide.AllureSelenide;

import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;

public class WebHooks {
 
    @BeforeEach
    public void allure()
    {



        new AllureSelenide().screenshots(true).savePageSource(false);


    }



}
