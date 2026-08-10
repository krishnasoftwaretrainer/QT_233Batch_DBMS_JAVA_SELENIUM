Feature: Login Functionality
Scenario Outline: Login Test
    Given The user is on the login page
    When The user enters a valid username "<username>"
    And The user enters a valid password "<password>"
    And The user clicks the swag login button
    Then The user should be redirected to the dashboard

    Examples:
      | username        | password      |
      | standard_user  	| secret_sauce |
      | invalid_user   	| secret_sauce |
      | standard_user 	| invalid_pwd |
      | invalid_user   	| invalid_pwd|
