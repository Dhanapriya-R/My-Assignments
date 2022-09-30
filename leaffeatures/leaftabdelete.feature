Feature: leaftabs deleteflow
Scenario Outline: Delete Lead with valid lead details 
Given Open browser1
And Load the application URL1
And maximize and timeout is handled1
And enter the username1 as <username>
And enter the password1 as <password>
And Click login1
When Clicking login button1
Then login home page will gets navigated1
And click on leads1
And click Find leads
And Click phone
And Enter phone number as <pnum>
And click find leads button
And Get the lead id
And click on the selected lead id
And click delete button
And click find lead button
And enter lead id <leadid>
And click find leads
When alert shows as no result found
Then Lead deleted successfully
Examples: 
|username|password|pnum|leadid|
|'Demosalesmanager'|'crmsfa'|'9'|'14089'|