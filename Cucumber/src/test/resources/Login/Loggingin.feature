
Feature: Test the Skillary App
1)Valid case
2)Invalid case
  
Background:
Given I should open the browser and navigate to the login page in skillary app

  Scenario: To test the login with user credential 
    When Enter Username "user"
    And Enter Password "user"
    And Click on the loginbutton
    Then I should see the user name as "Harry Den"
    
     Scenario: To test the login with Admin credential 
    When Enter Username "admin"
    And Enter Password "admin"
    And Click on the loginbutton
    Then I should see the admin name as "SkillRary Admin"
    
     Scenario: To test the login with invalid Credentials 
    When Enter Username "Admin"
    And Enter Password "Admin"
    And Click on the loginbutton
    Then i should navigate to the page "Register"
 