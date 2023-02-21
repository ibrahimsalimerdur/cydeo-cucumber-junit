Feature: Wikipedia search functionality and verifications

  #WSF-4567

  Scenario: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the wiki title


  Scenario: Wikipedia Search Functionality Header Verification
  Given User is on Wikipedia home page
  When User types "Steve Jobs" in the wiki search box
  And User clicks wiki search button
  Then User sees "Steve Jobs" is in the main header

  @wip_salim

  Scenario Outline: Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When User types "<searchValues>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedTitle>" is in the main header
    Then User sees "<expectedMainHeader>" is in the main header

    Examples: search values we look for in this scenario