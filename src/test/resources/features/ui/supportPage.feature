@ui
Feature: AffiniPayAssociations Support pages verification

  Scenario: User on one the home page should be able to go to support dropDown menu and find next pages
    Given User at home page
    Then User hover about menu and click following:
      |SupportSUM|
      |SupportSUM|
      |SupportSUM|
      |VideosSUM|
      |FaqSUM|
    When User clicks on Logo with link to home page