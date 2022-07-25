Feature: Navigating the web

  Scenario Outline: Navigating to a web page
    Given I have a browser open
    When I enter <url>
    Then I am on page <title>

    Examples: 
      | url                                | title                 |
      | "http://www.google.com"            | "Google"              |
      | "http://ultimateqa.com/automation" | "Automation Practice" |
