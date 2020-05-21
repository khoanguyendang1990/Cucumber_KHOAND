@bankGuru
Feature: Login to system

  @valid
  Scenario Outline: Login with valid email and password
    Given I open the liveGuru application
    When I click on my account page
    And Input to email textbox "<email>"
    And Input to password textbox "<password>"
    And Click on Login button
    Then Verify error message display at email textbox
    And Verify error message display at password textbox

    Examples: 
      | email           | password |
      | email@gmail.com |   123123 |
