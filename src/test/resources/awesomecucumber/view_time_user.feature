Feature: view time manda user

  Scenario: View the Timesheet for  user
    Given I'm on the Time Page
    When I click on view in the last period
    Then I access the user's Time Sheet