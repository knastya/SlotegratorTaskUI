Feature: Sorting players

  Scenario: Sorting of players

    Given Open Casino login page
    When Enter the Username and Password
    When Click Sign In
    Then User successfully logged in and admin panel opens

    When User opens list of players
    Then Table with players is loaded

    When User sorts table on Username Maria
    Then Table are sorted correctly by Maria Username
