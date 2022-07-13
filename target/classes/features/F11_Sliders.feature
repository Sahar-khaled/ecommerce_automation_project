Feature: F11_Sliders | users will be able to open sliders in home page

  Background: navigation to e-commerce website Home Page
    Given user navigate to homepage

  Scenario: Test first slider
    When  user clicks on first slider
    Then  relative product for first slider is displayed

  Scenario: Test Second slider
    When  user clicks on second slider
    Then  relative product for second slider is displayed