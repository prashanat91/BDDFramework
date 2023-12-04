Feature: Login page Automation of saucedemo App

Scenario Outline: Check login is successful with valid credentials
Given User is on Login Page 
When User enters valid "<username>" and "<password>"
And Click on Login Button
Then User is navigated to Home Page 
And Close the browser

Examples:

| username | password |
| standard_user | secret_sauce | 


