Feature:  BuffSci homepage
  Test the homepage of https://hr-testing.buffsci.org/home

  Background:
    Given I navigate to the login page

  @loginPage
  Scenario: BuffSci bar test
  This scenario is to login to BuffSci WebPage.
    Given I navigate to the login page
    Then I click on login button
    Then I enter the following for Login
    |userName                 |password    |
    |admin@staging-buffsci.org|admin123test|

#    Then I enter the username as "admin@staging-buffsci.org" and password as "admin123test"

