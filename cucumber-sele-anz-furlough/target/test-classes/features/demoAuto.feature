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
Feature: Demo Automation login feature
  

Scenario: Positive Login Scenario
Given : Open the demo automation website
When : User needs to enter first name and hit enter
And : User needs to enter last name and hit enter
Then : User enters the Email address
And : User clicks on Submit button
Then : Login breaks and the Browser is closed
