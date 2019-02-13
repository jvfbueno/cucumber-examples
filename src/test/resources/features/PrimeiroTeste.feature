Feature: User login
  Este feature está relacionado a tela de login de usuario

  Background:
    Given the user is on login page

  Scenario: User login with valid credentials
    Given the user is on login page
    When the user login using valid credentials
    Then the dashboard page is displayed

  @Outline
  Scenario Outline: user login with many different credentials
      * the user is on login page
      * the user enters the following credential "<credential>"
      * the user enters the following credential "1234"
      * the dashboard page is displayed

      Examples:
      |credential|
      |username1 |
      |username2 |
