Feature: Verify Order History

  Background:
    Given Go to the website
    And Click on Sign In Tab
    And type to "email" and "password"
    And Click on Sign In Button
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


  Scenario: Verifying Order History
    And Get the reference number from text
    And Click on Tugba Aydin tab
    And Click on Order History and Details
    Then Confirm order reference number is same after click on my order button
