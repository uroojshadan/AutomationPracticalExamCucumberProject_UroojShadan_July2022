@Regression
Feature: TechfiosAutomationFeature

  Background: 
    Given I am On Techfios practical Exam page

  @SetBlueBackground
  Scenario: Sky Blue Background
    Given "Set SkyBlue Background" button exists
    When I click on the "SetSkyBlueBackgroundButton"
    Then The background color will change to "sky blue"

  @SetWhiteBackground
  Scenario: Sky White Background
    Given "Set White Background" button exists
    When I click on the "SetWhiteBackgroungButton"
    Then The background color will change to "white"
