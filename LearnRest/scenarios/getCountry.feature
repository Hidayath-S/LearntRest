Feature: Title of your feature
  I want to use this template for my feature file
  
  
  Scenario Outline: Title of your scenario outline
    Given I want to get country details with country name as <country>
    When I check for the <ISOCOde> in step
    Then I verify the <name> in step

    Examples: 
      | country  | ISOCOde | name |
      | India |     IN | India |
      | USA |     US | United States of America    |