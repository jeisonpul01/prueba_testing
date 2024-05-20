Feature: login Test


  Scenario: Login to the main page
    Given I'm on the login Page
    When I identify myself with my credentials
    Then I access the user dashboard
