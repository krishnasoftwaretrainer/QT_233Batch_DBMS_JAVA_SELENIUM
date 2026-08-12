Feature: SwagLabs Login Functionality

  Scenario: Login with different users from Excel
 
   Given The user is on the login page
    When The user enters username and password from Excel row "<row>"
    And The user clicks the swag login button
    Then The login result should be validated

    Examples:
      | row |
      | 1   |
      | 2   |
      | 3   |
      | 4   |
      | 5   |
      | 6   |
      | 7   |
      | 8   |
      | 9   |
      | 10  |