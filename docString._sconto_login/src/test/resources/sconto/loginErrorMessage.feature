Feature: Sconto Login Feature
  In order to see the user area
  I log in to the website

  Scenario: Negative Login
    Given I am on the LoginPage

    When I insert invalid user credentials
    And I click on Login button
    Then I see error message:
    """
    Benutzername nicht gefunden oder Passwort falsch.
    """



