Feature: Login for LeafTaps Applicaition

Background:
Given Open the Browser
And Max the Browser 
And Set the TimeOut
And Navigate to URL
And Enter the UserName as DemoSalesManager
And Enter the Password as crmsfa
And Click on Login Button
And Click on CRM/SFA Link 

Scenario Outline: TC01 Create Lead Application
And click Leads Button
And Enter the CompanyName as <cname>
And Enter the FirstName as <fname>
And Enter the LastName as <lname>
And Enter PhoneNumber as <pNumber>
And Enter EmailID as <eMail> 
When Click submitButton
Then Close the Browser

Examples:
|cname|fname|lname|pNumber|eMail|
|CTS|Siva|Raj|9176619388|e.siva.raj@gmail.com|
|IBM|Sridhar|R|9176619388|e.siva.raj@gmail.com|

Scenario Outline: TC02 Edit Lead Application
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
