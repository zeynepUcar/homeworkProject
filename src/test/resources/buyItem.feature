Feature: Buy Item

  Background:
    Given Go to the website
    And Click on Sign In Tab
    And type to "email" and "password"
    And Click on Sign In Button

  Scenario: Buying an item
    And Search  for the "Dress"
    And Click on Search Button
    And Click on List View
    And Click on any dress
    And Click on add to cart button
    And Click on Proceed to Checkout Button
    And Click on Proceed to Checkout Button of Sign In Part
    And Click on Proceed to Checkout Button of Adress Part
    And Click on Terms of Service Box
    And Click on Proceed to Checkout Button Last Part
    And Click on Pay by bank wire tab
    And Click on I confirm my order button
    Then Verify your order is complete
