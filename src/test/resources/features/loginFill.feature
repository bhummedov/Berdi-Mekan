Feature:  BuffSci homepage
  Test the homepage of https://hr-testing.buffsci.org/home

  Background:
    Given I am on the BuffSci homepage

  @buffScibar
  Scenario Outline: New Hire window test
    Given I am on the BuffSci homepage
    Then I click on the BuffSci bar
    Then I click on staff
    Then I land on the staff page
    When I validate New Hire button
    Then I click on New Hire button
    Then I land on New Hire window
    Examples:




