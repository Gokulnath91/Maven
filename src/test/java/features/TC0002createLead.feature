Feature: Create lead in Leaftaps application
Background: 
Given Enter the username as demosalesmanager
And Enter the password as crmsfa
And Click on login button
And user should navigate to homepage
And click on CRM/SFA
And clcik on Create Lead

Scenario Outline: TC0003 positive crate lead
And enter the Company Name <companyName>
And enter the First name <firstName>
And enter the Last name <lastName>
When click on Create Lead button
Then should create the lead <firstName>

Examples:
|companyName|firstName|lastName|
|datatracks|Gokul cucumber|J|
|datatracks|Mayil cucumber|N|

Scenario Outline: TC0004 Negative crate lead
And enter the Company Name <companyName>
And enter the First name <firstName>
When click on Create Lead button
But should not create the lead

Examples:
|companyName|firstName|
|datatracks|Gokul cucumber|
|datatracks|Mayil cucumber|
