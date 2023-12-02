Feature: verify login page
  Scenario: user enter valid credential
    Given User open browser and enter username and password
    When User Enter username"qacart"and the password"Test123!"
    Then User logged in successfully