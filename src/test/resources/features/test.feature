#language: en

@TEST

Feature: Test. Сумма двух чисел
  @Test
  @DisplayName("1")
  @1Step
  Scenario:  1.1 Число A
    When Ввод первого числа 13

  @Test
  @DisplayName("2")
  @2Step
  Scenario: 1.2 Число B
    When Ввод второго числа 100
  @Test
  @DisplayName("3")
  @3Step
  Scenario: 1.3 Сложение
    Then Сложение числа

  @4Step
  Scenario: 1.4 Вывод результата
    And Вывести результат