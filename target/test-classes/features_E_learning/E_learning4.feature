Feature:  Course catalog 

Scenario: Login with valid details and verifying all other sections
Given  Initialize the browser with chrome
Given Navigate to "http://elearningm1.upskills.in/" Site
When User enters "Pavan" and "pavan12!@34#$" and click on login
And User firstly verifys Course catalog section by clicking on it
And User enters "Technology" as a course name
Then User will go through course catalog










