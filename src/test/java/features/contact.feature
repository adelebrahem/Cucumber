Feature: Contact page features

Scenario: Make sure that the email text field is visible
    Given User open browser and enter username and password
    When User Enter username"qacart"and the password"Test123!"
    And Clicks on contacts
    Then Email text field should be visible

    Scenario: Add a new contact
        Given User open browser and enter username and password
        When User Enter username"qacart"and the password"Test123!"
        And Clicks on contacts
        And Clicks on add contact
        And Fill the first name password
        Then A new contact should be added
