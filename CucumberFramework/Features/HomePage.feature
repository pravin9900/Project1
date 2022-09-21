#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@HomeScenario
Feature:  Verify home page functionality

  @HomeScenario1
  Scenario: Search for flights
    Given Open makemyTrip website
    When click on flights header
    And  enter from and to city
    And  click on search button
    Then verify available flight on flight result page
  
   @HomeScenario2
  Scenario Outline: search for flights
    Given Open makemyTrip website
    When click on flights header
    And  enter from "<fromCity>" and "<toCity>" to city
    And  click on search button
    Then  apply filter "<flightName>" to flight result page 
  
  Examples:
    | fromCity | toCity | flightName |
    | Mumbai   | Pune   | Go First |
    | Bengaluru | Mumbai | IndiGo |
    | Chennai  | Mumbai | Air India |
    
    
    
