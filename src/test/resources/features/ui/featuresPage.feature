@ui
Feature: AffiniPayAssociations Features pages verification

  Scenario: User on one the home page should be able to go to features dropDown menu and find next pages
    Given User at home page
    Then User hover features menu and click following:
      |PaymentsFUM|
      |ReportingFUM|
      |SecurityFUM|
      |IntegrationsFUM|
      |DifferenceFUM|
      |DemoFUM|
    When User clicks on Logo with link to home page
    When User should be able to see footer