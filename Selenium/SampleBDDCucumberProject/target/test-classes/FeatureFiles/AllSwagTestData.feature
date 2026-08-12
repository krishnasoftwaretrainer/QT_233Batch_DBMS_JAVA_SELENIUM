Feature: Login Functionality

  Scenario Outline: Login Test
    Given The user is on the Swaglogin page
    When The user enters a any username "<username>"
    And The user enters a any password "<password>"
    And The user clicks the swaglogin button
    Then The user should be redirected to result page

    Examples:
      | username        | password      |
      | standard_user  | secret_sauce |
      | standard_user   | invalid_sauce |
      | invalid_user | secret_sauce |
	  | invalid_user | invalid_sauce |