Feature: Login for LeafTaps Applicaition

Background:
Given Open the delete Browser
And Max the delete Browser 
And Set the delete TimeOut
And Navigate to delete URL
And Enter the delete UserName as DemoSalesManager
And Enter the delete Password as crmsfa 
And Click on delete Login Button
And Click on delete CRM/SFA Link 

Scenario Outline: TC01 Delete Lead Application
And Click Leads button for Delete
And Click Find Leads Button
And Click Phone Number Tab as <pNum>
And Click Find Leads Button for Search
And Click the First Lead ID after Search
And click Delete Button
And Click Find Leads in LNav
And Enter the Lead ID as <LeadID>
And Click Find Lead button in bottom
When verify the error message
Then Close delete Browser

Examples:
|pNum|LeadID|
|9176619388|10042|