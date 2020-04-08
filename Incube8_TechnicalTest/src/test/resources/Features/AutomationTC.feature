Feature: IMDB Application Automation Testcases

 
#Question 1,section 2a and 2b,3

Scenario Outline: As a new user,should be able to search 'Game of Thrones' and select the LastWatch link and verify the title,review and ratings
 
    Given User navigates to IMDb home page
    And  Menu button is clicked
    And Top Rated Shows Link is selected
    When Search for "<input>" and  select ‘Game of Thrones: The LastWatch’ link from the suggestion window
    Then episode title,ratings and reviews should be displayed
   
    
    Examples:  
   |input|
   |Game Of Thrones|
      
#Question 2 

Scenario Outline: As a guestuser,should be able to create new user Account

    Given User navigates to IMDb home page
    When  create new account is clicked
    And   User fills in all the registration details with "<username>" and "<email>" and submits
    Then  New User Account should be created successfully
    
    Examples:
    |username|email|
    |sri|test@g.com|
  
    
    
  Scenario Outline:Verify Newly Registered User is able to login to the Application
  
   #Given User navigates to IMDb home page
    When  signIn is clicked ans signin with Existing IMDB is selected
    And   User enters "<email>" and pasword  and submits
    Then  Newly Registered User should be able to login to the Application successfully
    
    Examples:
    |email|
    |test@g.com|
