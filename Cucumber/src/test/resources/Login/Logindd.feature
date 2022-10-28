
Feature: Test the Skillary App
1)Valid case
2)Invalid case
  
Background:
Given I should open the browser and navigate to the login page in skillary app


 # Scenario: To test the login with the user credential 
  #  When Enter the Username "user"
  #  And Enter the Password "user"
  #  And After Click on the loginbutton
  #  Then I should see the user name  "Harry Den"
    
     
 
   
   #  Scenario: To test the login with Admin credential 
  # When Enter Username "admin"
  # And Enter Password "admin"
  # And Click on the loginbutton
  # Then I should see the admin name as "SkillRary Admin"
    @NegativeTest
 #    Scenario: To test the login with invalid Credentials 
 #   When Enter Username "Admin"
 #   And Enter Password "Admin"
 #   And Click on the loginbutton
 #   Then i should navigate to the page "Register"
 
  @PositiveTesting
 Scenario Outline:To test with all postitive data
 When enter username "<name>"
 And enter password "<password>"
 And click on the login button 
 Then I should see the "<username>"
 
 Examples:
 name|password|username
 user|user|Harry Den
 user|user|Harry Den
