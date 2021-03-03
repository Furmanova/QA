Feature: Sconto Products Feature
  In order to see the user area
  I log in to the website

  Scenario: Successful Products
    Given I am on the Homepage
    When I click on the Sofa
    Then I click on the wish list icon

    When I click anmeldun
    Then I log in

    When I click merkliste icon
    Then I text check



