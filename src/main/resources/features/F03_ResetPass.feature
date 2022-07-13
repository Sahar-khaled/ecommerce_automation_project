@smoke
Feature: F03_ResetPass | user could reset his/her password successfully

  Scenario: user could reset his/her password successfully
    Given user will go to login page
    When user enter valid email and invalid password
    And user clicks on login button
    And User clicks on forgot password button
    And enter his email address
    And enter recover button
    Then success message is shown


    