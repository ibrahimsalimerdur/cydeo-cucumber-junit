Feature: Examples of Cucumber data table implementation


  Scenario: List of fruits I like
    Then user should see the fruits I like
      | Kiwi        |
      | banana      |
      | cucumber    |
      | orange      |
      | mango       |
      | grape       |
      | pomegranate |  