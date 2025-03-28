Feature: Test Login

  @smoke
  Scenario Outline: Login with valid credentials
    Given browser is open
    And I am on the login page
    When I enter "<username>" as username
    And I enter "<password>" as password
    And I click the login button
    Then I should see the home page

    Examples:
      | username     | password  |
      | tinahuang2019@sina.cn | Htt20190101!te |
#    | user     | password |