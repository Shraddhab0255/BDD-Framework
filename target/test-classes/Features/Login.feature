@C
Feature: Login Functionality

Background:
Given user is on login page


@smoke @sanity @regression
Scenario: valid login
When User enters valid user id
And enters valid Password 
And click on login button
Then user should be navigated to home page
And user can see logout link
And close browser



@B
Scenario: Invalid login
When User enters Invalid user id
And enters valid Password 
And click on login button
Then user should be navigated to login page
And user can see error message
And close browser



@D
Scenario Outline:
Invalid login with multiple data
When User enters Invalid user id as "<userid>"
And enters valid Password as "<password>"
And click on login button
Then user should be navigated to login page
And user can see error message
And close browser

Examples:

| userid | password |
| admin1 | pass1 |
| admin2 | pass2 |
| admin3 | pass3 |
| admin4 | pass4 |

@A
Scenario: create Lead
Given user should be on home page
When user click on new lead link and fill valid data and click on save button
|name    | company | 
|Aasha  | Amazon  |
|Aahana | Google  |
Then user should click on delete button
Then can see lead deleted or not

    

