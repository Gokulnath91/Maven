Feature: Edit lead in Leaftaps application
Background: 
Given Enter the username as demosalesmanager
And Enter the password as crmsfa
And Click on login button
And user should navigate to homepage
And click on CRM/SFA
And click on Leads Tab
And clcik on Find Leads

Scenario Outline: TC0005 positive EditLead
And enter the Firt Name <firstName>
And click on Find Leads button
And Click on the first result displayed
And Click on edit button
And update the company name <companyName>
When Click on the update button
Then Should update the company name <companyName>

Examples:
|firstName|companyName|
|Gokul cucumber|Datatracks Services Limited|
|Mayil cucumber|Datatracks Services Limited|

Scenario Outline: TC0006 negative EditLead
And enter the Firt Name <firstName>
And click on Find Leads button
And Click on the first result displayed
And Click on edit button
And update the company name <companyName>
When Click on the update button
But Should not update the company name <ErrorMessage>

Examples:
|firstName|companyName|ErrorMessage|
|Gokul cucumber||companyName|
|Mayil cucumber||companyName|
