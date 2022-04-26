@alerts

  Feature: Handling Alerts

  Background:
    Given the user is on the TOOLSQA main page
    When  the user clicks on Alerts, Frame and Windows
    And   the user clicks on Alerts

    Scenario: Alert-1
      When the user clicks on first Click me button
      Then  You clicked a button message displayed
      And   the user clicks OK to make it disappear

      Scenario: Alert-2
        When the user clicks on second Click me button
        Then  This alert appeared after 5 seconds message displayed
        And   the user clicks OK to make it disappear


        Scenario: Alert-3
          When the user clicks on third Click me button
          Then Do you confirm action? message is displayed
          And   the user clicks OK to make it disappear
          Then the user sees You Selected OK message

          Scenario: Alert-4
            When the user clicks on fourth Click me button
            Then  input box appears with Please enter your name message
            And the user enters "Aysoltan" in the input box
            And   the user clicks OK to make it disappear
            Then the user sees You entered "Aysoltan" message




