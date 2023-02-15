#language: en

@TEST

Feature: Test. Сумма двух чисел

  @1Step
  Scenario:  1.1 Число A
    When Ввод числа a

  @2Step
  Scenario: 1.2 Число B
    When Ввод числа b

  @3Step
  Scenario: 1.3 Сложение AB
    Then Сложение чисел

  @4Step
  Scenario: 1.4 Вывод результата
    And Вывести результат