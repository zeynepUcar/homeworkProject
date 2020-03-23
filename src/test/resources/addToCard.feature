Feature: Add to cart and remove
  Scenario: Add to cart and remove


    Given Go to the website
    And Click on Sign In Tab
    And type to "email" and "password"
    And Click on Sign In Button
    And navigate over the titles
    And click to women button
    And choose a random product
    When click to Proceed to checkout
    Then cart shouldn't be empty
    When click to remove button
    Then cart should be empty

