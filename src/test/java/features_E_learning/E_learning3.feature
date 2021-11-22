Feature: Login functionality



Scenario Outline: E-learning login functionality



Given Initialize the browser with chrome
Given Navigate to "http://elearningm1.upskills.in/" Site
Then User enters <username> and <password> and logs in
Then Verify that login is succesful completed
And close the window



Examples:
|username|password|
|Pavan|pavan12!@34#$|




Scenario Outline: Signin operation



Given Initialize the browser with chrome
Given Navigate to "http://elearningm1.upskills.in/" Site
When User click on signup new page should open
And User should be able to enter <newusername>, <newpassword>
Then User should be able to complete regsistration



Examples:
|newusername|newpassword|
|Pavan|pavan12!@34#$|