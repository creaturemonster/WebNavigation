Feature:  Manipulating web elements

Scenario:
    Given I have a browser open
    When I enter "http://ultimateqa.com/automation"
    And I click on the "simple elements" link
    And I click on the button by ID
    Then I am on page "Button success"