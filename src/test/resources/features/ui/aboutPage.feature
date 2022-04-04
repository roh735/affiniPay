@ui
Feature: AffiniPayAssociations About pages verification

  Scenario: User on one the home page should be able to go to about dropDown menu and find next pages
    Given User at home page
    Then User hover support menu and click following:
      |StoryAUM|
      |NewsAUM|
      |BlogAUM|
      |ReferAUM|
      |ContactAUM|
    When User clicks on Logo with link to home page
    When User should be able to see footer