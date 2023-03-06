package stepDefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;


public class TestSteps {
    static int A1;
    static int B1;
    static int AB;


    public TestSteps() {
    }

    @Step("Получаем число A{A}")
    @When("Ввод первого числа {int}")
    public static int getA(Integer A) {
        A1 = A;
        System.out.println("переменная A= " + A1);
        return A1;
    }
    @Step("Получаем число B{B}")
    @When("Ввод второго числа {int}")
    public static int getB(Integer B) {
        B1 = B;
        System.out.println("переменная B= " + B1);
        return B1;
    }
    @Step("Складываем числа")
    @Then("Сложение числа")
    public static int AddAB() {
        AB = A1 + B1;
        System.out.println("Складываем " + A1 + "+" + B1);
        return AB;
    }
    @Step("Выводим результат")
    @And("Вывести результат")
    public static void showResult() {
        int result = AB;
        System.out.println("Сумма:" + result);
    }
}
