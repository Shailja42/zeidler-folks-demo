@ProductCreation @product
Feature: Creation feature
  
  @deletion1
  Scenario: Create a new computer in database
    Given I have launch the browser
    Then I click on add a new computer button and enter the details to create a computer  
    And I click on add new computer verify added details in database
