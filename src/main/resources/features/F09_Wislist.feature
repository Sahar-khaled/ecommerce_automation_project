
@smoke
Feature: F09_WishList  |  guest user could add products to wishlist

  Background: user login first
    When      user go to login page
    And       user login with valid "test@example.com" and "P@ssw0rd"
    Then      user press on login button
    And       user login to the system successfully


  Scenario: success message is visible after adding item to wishlist
    When    user add product to wishlist
    Then    wishlist notification success is visible


  Scenario: number of wishlist items in home page is increased
    When    user add product to wishlist
    Then    wishlist notification success is visible
    And     user get the number of wishlist items after adding item
    Then    the number of wishlist increased
