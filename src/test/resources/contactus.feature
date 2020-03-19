Feature: Contact Us 

  Background:

    Given Go to the website
    And Click on Sign In Tab
    And type to "email" and "password"
    And Click on Sign In Button

  Scenario: Contact us

    And Click on Contact Us Tab
    And Select Subject Heading
    And Select Order Reference
    And Select Product
    And Type the "Message"
    And Click on Send Button
    Then Verify message has been successfully sent is displayed




