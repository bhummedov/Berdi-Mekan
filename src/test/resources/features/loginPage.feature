Feature:  BuffSci homepage
  Test the homepage of https://hr-testing.buffsci.org/home

  Background:
    Given I am on the BuffSci homepage

  @loginPage
  Scenario:BuffSci bar test
  This scenario is to login to BuffSci WebPage .
    Given I am on the BuffSci homepage
    Then I click on username bar
    Then I fill in username
    Then I click password bar
    Then I fill in password
