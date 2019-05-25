Feature: Merge lead in Leaftaps application
Background: 
Given Enter the username as demosalesmanager
And Enter the password as crmsfa
And Click on login button
And user should navigate to homepage
And click on CRM/SFA
And click on Leads Tab
And clcik on Merge Leads

Scenario Outline: TC0007 positive Merge Lead
And Click on From Lead Icon
And Navigate to From Lead find leads page
And enter the From Lead Firt Name <firstName1>
And click on Find Leads button
And get lead ID of From Lead first result
And Enter the From Lead Lead ID
And click on Find Leads button
And Click on the From Lead first result displayed
And Click on To Lead Icon
And Navigate to To Lead find leads page
And enter the To Lead Firt Name <firstName2>
And click on Find Leads button
And get To Lead lead ID of first result
And Enter the To Lead Lead ID
And click on Find Leads button
And Click on the To Lead first result displayed
And Click on Merge Button
And Accept the alert popup
And clcik on Find Leads
And Enter the Lead ID to verify
When click on Find Leads button
Then Lead ID should not be available <ErrorMessage>

Examples:
|firstName1|firstName2|ErrorMessage|
|Gokul cucumber|Mayil cucumber|No record|
