Feature: Google search
  @Selenium
  Scenario: Happy flow for search
    Given the user is on "https://www.google.com" page
    When the user searches for "xablablau"
    Then the page presents some valid results