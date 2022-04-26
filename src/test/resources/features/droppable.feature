Feature: Droppable

  @dragDrop
  Scenario: Drag & Drop
    Given the user is on the TOOLSQA main page
    When the user clicks Interactions
    And the user clicks Droppable
    And the user drags the box and drops into the dropbox
    Then the user sees Dropped message on the dropbox
