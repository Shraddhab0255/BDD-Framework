@L
Feature: Lead Functionality



Scenario: CreateLead_TC04
Given User should be on login page
When user perform valid login
When user click on new lead link
When fill the valid data
When click on save button
Then user should be navigated to lead page


@Newtask 
Scenario: Lead_New Task_TC05
Given User should be on login page
When user click on new lead link and fill the data and click on save button
Then user should be navigated to lead page
Then user click on New Task and fill the data and click on save button.
Then user should be navigated to new task





