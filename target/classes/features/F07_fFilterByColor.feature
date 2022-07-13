@smoke

Feature: F07_FilterByColor | user could filter by color

  Scenario: Logged user could filter with color
    Given user will go to login page
    When user enter valid email and valid password
    And user click to login button
    And user select apparel category
    And user click on shoes
    And User select red color
    Then red one should be displayed


