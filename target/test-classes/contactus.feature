Feature: Contact Us

  Background:
    Given Go to the website
    And Click on Sign In Tab
    And type to "email" and "password"
    And Click on Sign In Button

  Scenario: Contact Us

    And Click on Contact Us
    And Select Subject Heading
    And Select Order Reference
    And Write a message
    And Click on Send button
