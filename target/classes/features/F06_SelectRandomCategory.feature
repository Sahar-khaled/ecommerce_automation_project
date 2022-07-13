@smoke
  Feature: F06_SelectRandomCategory | user could select different Categories and select sub category
    Scenario: Select random category then hover and open sub-Category if found
      Given user navigate to homepage
      When user hover random category and select subcategory
      And user click on subcategory if found
      Then user go to relative product page



