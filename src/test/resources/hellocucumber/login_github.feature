Feature: Test githhub Login

  Scenario Outline: Login with valid credentials
    Given open browser
    And on login page
    When enter "<username>" as username
    And enter "<password>" as password
    Then click the login button
    And close browser

    Examples:
      | username       | password |
      | test@gmail.com | test     |
#    | user     | password |