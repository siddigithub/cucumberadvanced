Feature: Registration
  As a user
  I need to regigser to guru99
  so that I am successfully login to the system
  Scenario: Registratio is successful.
    Given I navigate to the registration page
    When I attempt to register with user details
    Then the registration is sucessfull
  Scenario: Register failed
    Given I have '42' cucumber in my belly