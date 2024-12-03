Feature: Leaftaps Login functionality

Background:
  Given Launch the Browser
    And Load the application url

  Scenario: TC001_Login in Functionality - Positive
  
    And Enter Username as 'Demosalesmanager'
    And Enter password as 'crmsfa'
    When Click on Login button
    Then Homepage should be displayed
    
      Scenario: TC002_Login in Functionality - Negative
   
    And Enter Username as 'Demosalesmanager'
    And Entering password as 'crmsfa1'
    When Click on Login button
    Then Homepage should be displayed
