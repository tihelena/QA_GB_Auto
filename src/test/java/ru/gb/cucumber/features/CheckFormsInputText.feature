  Feature: Forms

    Scenario Outline: Fill in the form input field

      Given User is on Forms page
      When User set field text:  <text>
      Then User should see test field: <test>

      Examples:
        | text     | test     |
        | hello    | hello    |
        | java     | java     |
        | cucumber | cucumber |



