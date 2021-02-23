Feature: Vehicle insurance

  Scenario: Filling out vehicle insurance
    Given Open the Firefox and launch the application
    When I fill out Vehicle Insurance
    And I fill out Insurant
    And I fill out Product
    And I choose platinum
    And I send quote
    Then Email sent successfully

