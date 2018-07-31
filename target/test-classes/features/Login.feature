Feature: Login
  As a user
  I need to login to guru99
  so that I am successfully login to the system
  Scenario:
    Given I navigate to the login page
    When I attempt to login with username and password
    Then I can see the welcome screen