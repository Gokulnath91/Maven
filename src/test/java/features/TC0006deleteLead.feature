Feature: Delete lead in Leaftaps application
Background: 
Given Enter the username as demosalesmanager
And Enter the password as crmsfa
And Click on login button
And user should navigate to homepage
And click on CRM/SFA
And click on Leads Tab
And clcik on Find Leads


Scenario Outline: TC0009 positive Delete Lead
And enter the Firt Name <firstName>
And click on Find Leads button
And Save the first lead ID to verify
And Click on the first result displayed
When Click on Delete Lead Icon
And clcik on Find Leads
And Enter the Lead ID
And click on Find Leads button
Then Verify the Lead ID <ErrorMessage>




Examples:
|firstName|ErrorMessage|
|Mayil cucumber|No records to display|
|Mayil cucumber|No records to display|
