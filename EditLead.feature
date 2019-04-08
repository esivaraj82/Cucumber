Feature: Login for LeafTaps Applcaition

Background:
Given Open the Chrome Browser
And Max the Chrome Browser 
And Set the Chrome TimeOut
And Navigate to Chrome URL
And Enter the Chrome UserName as DemoSalesManager
And Enter the Chrome Password as crmsfa 
And Click on Chrome Login Button
And Click on Chrome CRM/SFA Link 

Scenario Outline: TC01 Edit Lead Application
And click Edit Leads Button 
And click Find Leads Button
And Enter First Name as <firstName>
And click Find Button
And click First Lead ID link
And click Edit Button
And clear the company name
And Enter the new company name as <companyName>
And click update Button
Then Close edit Browser 

Examples:
|firstName|companyName|
|Siva|IBM|
