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

Feature: feature to test search engine
 
  Scenario: validate flipkart page scrolling
    Given web browser is open
    When user navigates to flipkart website 
    And user enters text in search box and hits enter
    When user is on the desired web page
    And scrolls down to bottom
    When user scrolls back to top
    Then the webpage is closed
 
