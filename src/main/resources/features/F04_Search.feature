
@smoke
Feature: F04_Search | users will be able to search for products with different parameters

  Background: navigation to e-commerce website Home Page
    Given user navigate to homepage
  #First Scenario:
  Scenario: user could search using product name
    When  user click on search bar
    And   user search for product like "Apple iCam"
    And   user click on search Button
    Then  user could search and go to search page successfully
    #Second Scenario:
  Scenario: user search using SKU
    When    user click on search bar
    And     user search for product like "AP_MBP_13"
    And     user click on search Button
    Then    user could search with SKU successfully
    #Third Scenario:
  Scenario: user search using invalid product name
    When    user click on search bar
    And     user search for product like "anyThing"
    And     user click on search Button
    Then    user could not search