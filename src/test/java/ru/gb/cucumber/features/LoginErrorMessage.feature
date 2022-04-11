Feature: Login

  Scenario: Login with invalid email

    Given User is on Login page
    When User set login:  <name>
    And User set password: <password>
    And User click login button
    Then User should see error message "Please enter a valid email address"

    Examples:
      | name | password  |
      | Bill  | 12345678  |
      | Ann   | 876544321 |
      | Elena | tikhonova777 |



