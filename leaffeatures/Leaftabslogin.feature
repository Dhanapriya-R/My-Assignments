Feature: leaftabs flow
Scenario Outline: Create Lead with valid lead details 
Given Open browser
And Load the application URL
And maximize and timeout is handled
And enter the username as <username>
And enter the password as <password>
And Click login
When Clicking login button
Then login home page will gets navigated
And click on leads
And click create leads
And Enter first name as <firstname>
And Enter last name as <lastname>
And Enter company name as <companyname>
When Create lead button is clicked
Then New lead should be created successfully
Examples: 
|username|password|firstname|lastname|companyname|
|'Demosalesmanager'|'crmsfa'|'Babu'|'M'|'TL'|

