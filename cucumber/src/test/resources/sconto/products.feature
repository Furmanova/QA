Feature: Sconto Products Feature
  In order to see the user area
  I log in to the website

  Scenario: Successful Products
    Given I am on the Homepage
    When I click on the Sofas
    Then I should see catalog page with Sofas

    When I click on sofa's favourite icon
    Then I should see dialog box with anmelden button

    When I click anmelden button
    Then I should see login page

    When I'm logging in
    And I click merkliste icon
    Then I should see Palina sofa



