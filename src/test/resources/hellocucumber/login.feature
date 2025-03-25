Feature: Test Login

  Scenario Outline: Login with valid credentials
    Given browser is open
    And I am on the login page
    When I enter "<username>" as username
    And I enter "<password>" as password
    And I click the login button
    Then I should see the home page

    Examples:
      | username     | password  |
      | test@sina.cn | test!test |
#    | user     | password |