@ScenarioOutline
Feature: ScenarioOutline feature

  Background: 
    Given I am On Techfios practical Exam page

  Scenario Outline: user should be able to set background
    Given "<BackgroundButton>" button exists
    When I click on the "<SetBackgroundButton>"
    Then The background color will change to "<color>"

    Examples: 
      | BackgroundButton       | SetBackgroundButton        | color    |
      | Set SkyBlue Background | SetSkyBlueBackgroundButton | sky blue |
      | Set White Background   | SetWhiteBackgroungButton   | white    |
