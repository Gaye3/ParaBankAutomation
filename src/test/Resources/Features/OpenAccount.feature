@SmokeTest
Feature: Open new account
  As a registered user 
  I want to open a new account
  So that i can use banking services

  Scenario Outline: Opening new account for registered users
    Given user navigates to the application
    When user login with valid username and password "<username>" "<password>"
    Then validate user navigated to account services "<name>"
    And user clicks on open new account
    And selects the account type "<accountType>"
    And selects the account number "<accountNumber>"
    When user click on open new account
    Then validate new account is setup for the user

    Examples: 
      | username           | password | name                | accountType | accountNumber |
      | SwethaR            | Swetty65 | Swetha R            | SAVINGS     |         14898 |
      | RitaKapoor         | Rita23   | Rita Kapoor         | SAVINGS     |         14898 |
      | SamanthaRuthPrabhu | Sam20    | Samantha RuthPrabhu | SAVINGS     |         14898 |
