  Feature: Demo feature
    @Login
    Scenario: User login
      Given the user is on login page
      When the user enter valid credentials
      Then the my account page is displayed

    @Search
    Scenario Outline: User search
#      Given the user is logged in
      When the user searches for an item
      |name|price|
      |blouse| <itemPrice>  |
      |<itemName> | 15.0    |
      When the user enter item "blouse" with price "15.0"
      Then then the user adds the item to cart

      Examples:
      |itemName| itemPrice|
      |   primeiro     |1.0|
      |    segundo     |2.0|
      |    terceiro    |3.0|

