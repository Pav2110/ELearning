
Feature: Opening social networking
@socialnetworking


Scenario Outline: Social Networking
Given Start the browser with chrome
And goto to "http://elearningm1.upskills.in/"
When enter credentials <username> and <password> and login
Given My courses page will be present
When User clicks on socialnetwork
Then Social Networking page will be opened
Examples:
| username | password |
| Pavan | pavan12!@34#$ |




@socialwall
Scenario Outline: Social Wall
Given Start the browser with chrome
And goto to "http://elearningm1.upskills.in/"
When enter credentials <username> and <password> and login
Given My courses page will be present
When User clicks on socialnetwork
Then Social Networking page will be opened
When User enters text in the textbox
And clicks on the post button
And then the text will get posted
Then close the tab


Examples:
| username | password |
| Pavan | pavan12!@34#$|





@myfriends
Scenario Outline: Social Wall
Given Start the browser with chrome
And goto to "http://elearningm1.upskills.in/"
When enter credentials <username> and <password> and login
Given My courses page will be present
When User clicks on socialnetwork
Then Social Networking page will be opened
When user searches name of a person in the search box
And hits search key
Then list of names are displayed
When user to sends invitation to a person given down in the list by clicking on invitation
And the message has to be written
And the sendmessage box has to be hit
Then close the windows

Examples:
| username | password |
| Pavan | pavan12!@34#$ |






@skillset
Scenario Outline: Skill Set
Given Start the browser with chrome
And goto to "http://elearningm1.upskills.in/"
When enter credentials <username> and <password> and login
Given My courses page will be present
When User clicks on socialnetwork
Then Social Networking page will be opened
When user clicks on dropdown button and selects skill report
And clicks on skill wheel,Get new skill,Display options
Then changes the color
Then clicks on Your skill ranking

Examples:
| username | password |
| Pavan | pavan12!@34#$ |






@myprofile
Scenario Outline: Social Networking
Given Start the browser with chrome
And goto to "http://elearningm1.upskills.in/"
When enter credentials <username> and <password> and login
Given My courses page will be present
When User clicks on socialnetwork
Then Social Networking page will be opened
When User clicks on profile and edit profile
Then enters credentials and saves

Examples:
| username | password |
| Pavan | pavan12!@34#$ |






@groups
Scenario Outline: Groups
Given Start the browser with chrome
And goto to "http://elearningm1.upskills.in/"
When enter credentials <username> and <password> and login
Given My courses page will be present
When User clicks on socialnetwork
Then Social Networking page will be opened
When user clicks on the social groups and selects groups
Then user clicks on one of the groups




Examples:
| username | password |
| Pavan | pavan12!@34#$ |