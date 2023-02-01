import Hooks.WebHooks;
import org.junit.Assert;


import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class TestRun extends WebHooks {
    @org.junit.jupiter.api.Test
    public void test1()
    {

        String FindString = "Кантата";
        open("https://2gis.ru/tomsk");
        $x("//*[@class='_1gvu1zk']").sendKeys(FindString);
        $x("//*[@class='_1gvu1zk']").pressEnter();
        String FindResult = $x("//*[@class='_6vzrncr']").getText();
        Assert.assertEquals("Мы не нашли то что искали",FindResult,FindString);


    }
    @org.junit.jupiter.api.Test
    public void test2()
    {


        open("https://2gis.ru/tomsk");
        $x("//*[@title='Поесть']").click();
        Assert.assertTrue("Не нашли где поесть бесплатно", $x("//*[@textContent='Бесплатно']").exists());


    }
}
