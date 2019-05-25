Feature: Login in Leaftaps application
Scenario: TC0001 positive Login
Given Enter the username as demosalesmanager
And Enter the password as crmsfa
When Click on login button
Then Should Navigate to home page as demosalesmanager

Scenario: TC0002 nagative Login
Given Enter the username as demosalesmanager
And Enter the password as crmsfa1
When Click on login button
But Should stay in login page
