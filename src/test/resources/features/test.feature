@Regression
Feature: Web Application Tests

  @TC1
  Scenario: Verify 'Its Gone!' after Remove is clicked
    Given the user is on the-internet.herokuapp.com
    When the user clicks on Dynamic Controls
    And the user clicks on Remove
    Then the text It's Gone! should be rendered

  @TC2
  Scenario: Verify button id's change after clicking the red button
    Given the user is on the-internet.herokuapp.com
    When the user clicks on Challenging DOM
    Then the user clicks on the Red button and ids should change



