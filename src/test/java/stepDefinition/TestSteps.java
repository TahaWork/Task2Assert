package stepDefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class TestSteps {

    @When("^Ввод числа a$")
    public static int getA()
    {

        int A = 13;
        return A;
    }

    @When("^Ввод числа b$")
    public static int getB()
    {
        int B = 100;
        return B;
    }

    @Then("^Сложение чисел$")
    public static int addAB()
    {
       int AB = getA() + getB();
       return AB;
    }

    @And("^Вывести результат$")
    public static void showResult()
    {
       int result = addAB();
       System.out.println(result);
    }
}
