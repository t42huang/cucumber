Feature: Feature to demo tags

  @Smoke
  Scenario: Scenario 1
    Given I am on the homepage
    When I click on the "Tags" link
    Then I should see "Tags" in the page title
    And I should see "Tags" in the page body
    And I should see "Tags" in the page footer