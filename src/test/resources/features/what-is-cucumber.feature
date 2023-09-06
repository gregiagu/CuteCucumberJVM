Feature: What is Cucumber?

  Cucumber reads executable specifications written in plain text and validates that the software does what those specifications say. The specifications consists of multiple examples, or scenarios.

  Scenario: Breaker guesses a word
    Given the Maker has chosen a word
    When the Breaker makes a guess
    Then the Maker is asked to score