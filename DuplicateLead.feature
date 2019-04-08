Feature: Login for LeafTaps Application

Background:
Given Open the dup Browser
And Max the dup Browser 
And Set the dup TimeOut
And Navigate to dup URL
And Enter the dup UserName as DemoSalesManager
And Enter the dup Password as crmsfa 
And Click on dup Login Button
And Click on dup CRM/SFA Link 

Scenario Outline: TC01 Duplicate Lead Application
And Click Leads button for Duplicate
And Click Find Leads Button Duplicate
And Click Email tab as <eMailID>
And Click Find Leads Button for Search Duplicate
And Get the First name for result
And Click the first result link
And Click the Duplicate Lead button
And Get the Browser Title
When Get the CreateLead form name
Then Close the duplicate Lead browser


Examples:
|eMailID|
|e.siva.raj@gmail.com|