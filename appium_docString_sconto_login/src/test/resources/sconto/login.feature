@login
Feature: Sconto Login Feature
  In order to see the user area
  I log in to the website

  Scenario: Successful Login
    Given I am on the LoginPage
    When I insert valid user credentials
    And I click on Login button



