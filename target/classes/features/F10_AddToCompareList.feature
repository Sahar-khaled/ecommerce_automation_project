@smoke
Feature: F10_CompareList | guest user could add products to compareList

  Scenario: product added to compareList successfully
    When user add product to compareList
    Then compareList notification success