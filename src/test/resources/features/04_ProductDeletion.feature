@ProductDeletion @product
Feature: Delete feature file
  
  @deletion1
  Scenario:  Delete a computer in database
    Given I have launch the browser
    Then I search a record in database 
    Then I delete a record 
   And I verify product is succesfully deleted with message.
    

  
