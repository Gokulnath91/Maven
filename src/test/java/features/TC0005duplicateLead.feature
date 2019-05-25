Feature: Duplicate lead in Leaftaps application
Background: 
Given Enter the username as demosalesmanager
And Enter the password as crmsfa
And Click on login button
And user should navigate to homepage
And click on CRM/SFA
And click on Leads Tab
And clcik on Find Leads


Scenario Outline: TC0008 positive Duplicate Lead
And enter the Firt Name <firstName>
And click on Find Leads button
And Save the first Name to verify
And Click on the first result displayed
And Click on Duplicate Lead Icon
When click on Create Lead button
Then Verify the first name




Examples:
|firstName|
|Mayil cucumber|
