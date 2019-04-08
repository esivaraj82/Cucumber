Feature: Login for LeafTaps Applcaition

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
