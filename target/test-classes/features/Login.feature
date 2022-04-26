Feature: Login Functionality

  @login
  Scenario Outline: User should be able to login with various valid usernames and password

    Given user is on the SWAGLABS login page
    When  user enters username "<username>"
    And   user enters password "secret_sauce"
    And   user click login button
    Then  user should see "PRODUCTS" header on the homepage

    Examples:
      | username                |
      | standard_user           |
      | problem_user            |
      | performance_glitch_user |


    Scenario: User should not be able to login with invalid username or password

      Given user is on the SWAGLABS login page
      When  user enters username "locked_out_user"
      And   user enters password "secret_sauce"
      And   user click login button
      Then  user should see "Epic sadface: Sorry, this user has been locked out" message