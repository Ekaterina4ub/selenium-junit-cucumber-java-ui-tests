Feature: As a user
  I want to input two natural numbers and add them together

  Scenario Outline: Two natural numbers
    Given I create a new function object
    When I add <a> and <b> into the function
    Then I get <result> as a result

    Examples:
    | a | b | result |
    | 1 | 1 |    2   |
    | 2 | 2 |    4   |