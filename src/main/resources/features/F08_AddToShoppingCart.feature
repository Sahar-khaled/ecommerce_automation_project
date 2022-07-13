@smoke
  Feature: F08_ShoppingCart | Logged user could add different products to Shopping cart
    Scenario: User add different products to Shopping cart successfully
      When user add product to shopping cart from main page
      And user enter mandatory data about the product
      And user add product to shopping cart from product page
      Then shopping cart notification success is visible