@AddBasket
Feature: Add Product
  Scenario:as a user i want to add product to cart successfully
    Given i am on the home page
    And i see a logo banner
    When i click on sign in
    And i enter email in the email field
    And i enter password in the password field
    And i click on login button
    When i click on Dresses
    And i add the most expensive dress to my cart
    And i log out
    When i click on sign in
    And i enter email in the email field
    And i enter password in the password field
    And i click on login button
   Then i click on cart to check my product is still in the cart



