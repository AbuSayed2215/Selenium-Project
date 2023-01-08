Feature: Testing Login functionality to the application

Scenario Outline: This scenario tests all the invalid username and password
Description: We can use boundary tests, State Transition techniques, etc.

Given I open the browser and I navigate to the application
When I click on the sign in button on homepage
And I enter "<email>" and "<password>"
And I click on the login button
Then I am suppose to get an error message

Examples:
| email                     | password |
| abusaye@email.com  				| 123456   |
| abusayed1234567@email.com | 123456   |
| abusayed12345@email.com   | 123456   |
| abusayed@email.com        | 1234567  |
