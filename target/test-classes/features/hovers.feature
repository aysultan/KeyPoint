@hoverOver
Feature: Hover Over


  Scenario: Hover Over
    Given the user is on the TOOLSQA main page
    When the user clicks on Widgets
    And the user clicks on ToolTips
    And the user hovers on the green button
    Then the user should see "You hovered over the Button" message next to the green  button

  Scenario: Hover text field verification
    Given the user is on the TOOLSQA main page
    When the user clicks on Widgets
    And the user clicks on ToolTips
    And the user hovers  on the text field
    Then the user should see "You hovered over the text field" message