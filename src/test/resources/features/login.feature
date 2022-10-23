Feature: Users should be able to login to the application to access its contents

  Background: For the scenarios in this login.feature file the user should initially be on the login page
    Given user is on the login page

  Scenario: verify that user (PosManager) can log in with valid credentials
    When user enter the email "posmanager10@info.com" into the email input box
    And user enter the password "posmanager" into the password input box
    And user click the Log in button that is located below the password input box
    Then user should be able to verify that the title is
