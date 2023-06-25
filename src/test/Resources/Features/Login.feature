@SmokeTest
Feature: Login to Para bank
  As a user
  I want to login to para bank
  So that I can use the application

  Scenario Outline: Login of registered users into para bank
    Given user navigates to the application
    When user enters registered username "<username>"
    And user enters registed password "<password>"
    And user clicks on login button
    Then validate user is logged in "<name>"

    Examples: 
      | username           | password | name                |
      | SwethaR            | Swetty65 | Swetha R            |
      | RitaKapoor         | Rita23   | Rita Kapoor         |
      | SamanthaRuthPrabhu | Sam20    | Samantha RuthPrabhu |
