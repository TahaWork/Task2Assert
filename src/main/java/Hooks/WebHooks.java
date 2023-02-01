package Hooks;



public class WebHooks {
    @org.junit.jupiter.api.BeforeAll
    public static void Before() {
        System.out.println("Этот тест проверяет поиск на 2Gis");

    }

    @org.junit.jupiter.api.AfterAll
    public static void After() {
        System.out.println("Все");
    }
}
