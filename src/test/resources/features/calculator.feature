@tag
Feature: Calculator
  Scenario Outline: add two numbers
    Given Two input values, <first> and <second>
    When I add the two values
    Then I expect the result <result>
  Examples:
    | first | second | result |
    | 1     | 12     | 13     |
    | -1    | 6      | 5      |
    | 2     | 2      | 4      |
    | 0     | 0      | 0      |
  Scenario: simple operation
    Given part2 Two inputs, 2 and rvs
    When part2 I do the operation
    Then part2 I expect the result 0.5
  Scenario: simple operation
    Given part2 Two inputs, 9 and sqr
    When part2 I do the operation
    Then part2 I expect the result 3.0
  Scenario Outline: simple operation
    Given part2 Two inputs, <input> and <opt>
    When part2 I do the operation
    Then part2 I expect the result <result>
  Examples:
    | input | opt      | result |
    | 4     | rvs      | 0.25   |
    | 5     | rvs      | 0.2    |
    | 4     | sqr      | 2      |
    | 5     | sqr      | 2.236  |
    | 0     | sqr      | 0      |
    | -2    | rvs      | -0.5   |
