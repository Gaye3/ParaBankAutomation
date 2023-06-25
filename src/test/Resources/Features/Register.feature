@RegressionTest
Feature: Registration of new users into the para bank
  	As a user
  	I want to register into the para bank
  	So that I can login to the application

  Scenario Outline: Registering users with valid data to para bank
    Given user navigates to the application
    When user clicks on register link
    Then validate user navigates to registration page
    When user enters firstname "<firstname>"
    And user enters lastname "<lastname>"
    And user enters address "<address>"
    And user enters city "<city>"
    And user enters state "<state>"
    And user enters zipcode "<zipcode>"
    And user enters PhoneNo "<phone>"
    And user enters SSN "<ssn>"
    And user enters username "<username>"
    And user enters password "<password>"
    And user enters confirmPassword "<password>"
    And user clicks on register button
    Then validate the user is registered

    Examples: 
      | firstname | lastname   | address    | city      | state     | zipcode | phone      | ssn | username           | password |
      | Swetha    | R          | MG road    | Bangalore | Karnataka |   56065 | 9654324567 | 876 | SwethaR            | Swetty65 |
      | Rita      | Kapoor     | Hosa road  | Bangalore | Karnataka |   56085 | 7654324567 | 876 | RitaKapoor         | Rita23   |
      | Samantha  | RuthPrabhu | Kormangala | Bangalore | Karnataka |   56062 | 8654324567 | 876 | SamanthaRuthPrabhu | Sam20    |
