@Login
Feature:Login
  Scenario:as a user i want to login successfully
    Given i am on the home page
    And i see a logo banner
   When i click on sign in
   And i enter email in the email field
   And i enter password in the password field
   And i click on login button
   Then i should be successfully logged in






