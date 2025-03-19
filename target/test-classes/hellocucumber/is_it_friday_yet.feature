Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  Scenario: Sunday isn't Friday # will not execute this line, because of the tag
    Given today is Sunday
    When I ask whether it's Friday yet
    Then I should be told "Nope"