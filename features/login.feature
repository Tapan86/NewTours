Feature: user login 

Scenario Outline:  valid userr login

Given  I  am  on the newtours homepage
When I enter "<user name>", "< password>"
And I click login 
Then I find flight reservation page

Examples:
|userr name|password  |
|guest     | guest    |
|Mahbub    | guest    |