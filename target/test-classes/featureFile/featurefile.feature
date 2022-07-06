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
@overall
Feature: Open the browser and search

Background:
Given print the Background

  @googleonly @allsite
  Scenario: open google and search a product
    Given I want to open google
    When I search the product in google
    Then get the page title

  @allsite
  Scenario Outline: open multiple browsers
    Given open the given url "<url>"

    Examples: 
      | url            |
      | www.google.com       |
      | www.yahoo.com  |
      | www.bing.com   |
