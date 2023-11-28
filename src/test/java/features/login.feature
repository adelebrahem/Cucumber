Feature: Test Login functionality

  Scenario: Make sure that the email field is visible
    Given User-ID must not be blank and Password must not be blank
    When Enter username"qacart"and"Test123!"password
    And  click on contact
    Then Email should be visible