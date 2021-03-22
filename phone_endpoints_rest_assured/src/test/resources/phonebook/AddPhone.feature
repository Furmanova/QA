Feature: Add Phone

  Background:
    Given I have access token

  @api @add_phone
  Scenario: Add new phone

    When I make POST request for the endpoint 'phone'
    Then I see status code 200

  @api
  Scenario: Get phone

    Given I have existing phone
    When I make GET request for the endpoint 'phone'
    Then I see status code 200
