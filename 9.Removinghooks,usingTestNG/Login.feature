Feature: Leaftaps Login functionality



  Scenario Outline: TC001_Login in Functionality - Positive
  
    And Enter Username as <userNa>
    And Enter password as  <passw>
    When Click on Login button
    Then Homepage should be displayed
    
    Examples:
    |userNa|passw|
    |'Demosalesmanager'|'crmsfa'|
    |'Democsr'|'crmsfa'|
    
    
    

      Scenario: TC002_Login in Functionality - Negative
   
    And Enter Username as 'Demosalesmanager'
    And Entering password as 'crmsfa1'
    When Click on Login button
    Then Homepage should be displayed
