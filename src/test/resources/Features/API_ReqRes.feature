Feature: Rest API testing for ReqRes application

Scenario: list all users
Given Url is ""
When user perform GET opration
Then user can validate the status code
And user can validate response data


Scenario: list single users
Given Url is ""
When user perform GET operation
Then user can validate the status code
And user can validate response data

Scenario Outline: User opertaions_"<TCName>"
Given Url is "<URL>"
When user perform "<Method>" operation
Then user can validate the status code as "<statuscode>"
And user can validate response data
Examples:
|TCName |  URL    | Method | statuscode |
|TC01   |http://  | POST   | 201        |
|TC02   |http://  | PUT    | 200        |
|TC03   |http://  | PATCH  | 200        |

