@tag
Feature: Opt
  Scenario Outline: calculate root/reverse of numbers
    Given one input value and type of operation, <input> and <opt>
    When I do the operation <opt>
    Then I expect the result <result>
  Examples:
    | input | opt    | result |
    | 4     | rvs    | 0.25   |
    | 4     | sqr    | 2      |
