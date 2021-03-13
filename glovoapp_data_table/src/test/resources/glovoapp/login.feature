Feature: Glovoapp login

  Scenario: Login page
    Given I am on the Signup page
    When I fill input data in the login form:
      | Name | Email          | Password |
      | olga | a12s@gmail.com | 12345678 |
    And I click Button signup
    When I click agreement Checkbox
    And I click continue and register Button
    Then I should see message:

    """
     Enter your mobile phone number to enable
    """









