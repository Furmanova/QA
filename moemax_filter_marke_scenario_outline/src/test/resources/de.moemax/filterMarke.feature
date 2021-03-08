Feature: Moemax  Filter marke

  Scenario Outline: Search Filter
    Given I am on the Search page
    When I search for the <make>
    And I am checking the <quantity> of goods
    Then I see the filter <make> is applied


    Examples:
      | make  |  | quantity   |
      | AEG   |  | 46 Artikel |
      | Amica |  | 16 Artikel |

