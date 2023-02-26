Feature: Web table user order feature

  @wip_salim
  Scenario: Order place scenario
    Given user is already logged in to web table app
    When user select product type "Familybea"
    And user enters quantity "2"
    And user enters customer name "Sherlock Holmes"
    And user enters street "221B Baker Street"
    And user enters city "London"
    And user enters state "England"
    And user enters zipcode "50505"
    And user select credit card type "MasterCard":
    And user enters  credit card number "1111222233334444"
    And user enters expiry date "12/23"
    And user enters process order button
    Then user should see "Sherlock Holmes" in first row of the web table

