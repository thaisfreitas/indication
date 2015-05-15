Feature: Create Indications

  Scenario: Create a new indication
    Given I have an access to the system
    When I submit a new valid indication information
    Then The system should return a success message