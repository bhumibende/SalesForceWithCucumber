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
@tag
Feature: SalesForceLogin
  I want to use this template for my feature file

  @tag1
  Scenario: while entering wrong login id and password message Login unsuccessful message is shown
    Given url
    And invalid user id is entered
    When invalid user password is entered
    And login button is clicked
    Then user should get login unsuccessfully error message
   
