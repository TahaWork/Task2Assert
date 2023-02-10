package hooks;
import com.codeborne.selenide.Condition;
import java.time.Duration;
import static pagesElements.LoginElements.logoutButton;
import static pagesElements.LoginElements.userMenu;

public class WebHooks {


    @org.junit.jupiter.api.AfterEach
    public void logout() {
        userMenu.click();
        logoutButton.shouldBe(Condition.visible, Duration.ofSeconds(10)).click();
    }
}

