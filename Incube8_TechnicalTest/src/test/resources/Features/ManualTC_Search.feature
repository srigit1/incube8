#Question 1:
# 1.Below are the few manual testcases for Search Functionality in Application

Feature: Search Functionality in IMDB Application
 

 ScenarioOutline : As a new user,should be able to search with any keyword in Search IMDb field
 
    Given User navigates to IMDb home page
    When  User selects All Option and searches with any "<keyword>"  in search IMDb field
    Then  Corresponding results matching with search criteria should be displayed.
    
     Example
    
     |keyword|
     |Sheldon|
     |AamirKhan|
    
       

 ScenarioOutline: As a new user,should be able to search with titles/TV Episodes/celebs/Companies
 
    Given User navigates to IMDb home page
    When  User  selects Titles Option and  searches with "<title>"
    Then  Corresponding results matching with "<title>" should be displayed.
    When  User  selects TV Episodes Option and searches with "<TV Episodes>" 
    Then  Corresponding results matching with "<TV Episodes>"  should be displayed.
    When  User selects Celebs Option and searches with "<Celebs>" 
    Then  Corresponding results matching with "<Celebs>"  should be displayed. 
    When  User selects Companies Option and searches with "<Companies>" 
    Then  Corresponding results matching with "<Companies>"  should be displayed.
    
    Example
    
    |title|TV Episodes|Celebs|Companies|
    
    |young sheldon|Birthday|Sharukh|Lasher Group|   
    
     
 Scenario Outline: As a new user,should be able to perform Advanced Title Search
 
    Given User navigates to IMDb home page
    When  User selects Advanced Search 
    Then  Advanced Search Page should be displayed. 
    When  User selects Advanced Title Search and search with any option
    Then  Corresponding results matching with search criteria should be displayed.
    
    
 Scenario Outline: As a new user,should be able to perform Advanced Name Search
 
    Given User navigates to IMDb home page
    When  User selects Advanced Search 
    Then  Advanced Search Page should be displayed. 
    When  User selects Advanced Name Search and search with any option
    Then  Corresponding results matching with search criteria should be displayed.   
    
 Scenario Outline: As a new user,should be able to perform Search Collabarations
 
    Given User navigates to IMDb home page
    When  User selects Advanced Search 
    Then  Advanced Search Page should be displayed. 
    When  User selects Search Collabarations and searched with name or title
    Then  Corresponding results matching with search criteria should be displayed.     
    
 Scenario Outline: As a new user,should be able to perform Search Within a Topic
 
    Given User navigates to IMDb home page
    When  User selects Advanced Search 
    Then  Advanced Search Page should be displayed. 
    When  User searches with any topic
    Then  Corresponding results matching with search criteria should be displayed.     
       