
  @CreateAccount
Feature: Create Account
  Scenario:as a user i want to Create account successfully
    Given i am on the home page
    And i see a logo banner
    When i click on sign in
    And i enter email address in the create account field
    And i click on create account
   When i enter personal information details
   And i enter date of birth
   And i enter address details and phone number
   Then i click register
