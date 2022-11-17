Feature: Application Login
  @Login
  Scenario: Home page default login
    Given User is on landing page
    When User login into application with username "User1" and password "1234"
    Then Home page is populated
    And Cards are displayed

  Scenario: Home page default login
    Given User is on landing page
    When User login into application with username "User2" and password "4321"
    Then Home page is populated
    And Cards are displayed
