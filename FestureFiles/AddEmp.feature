Feature:Add employee module
Scenario Outline:
Validate add employee with multiple data
Given User navigates to orangehrm url
When User logs in username as "Admin" and password as "Qedge123!@#"
When user click login button
When user click pim button
When user click Add Employee button
When user enter fullname as "<Fname>" and middlename as "<Mname>" and lastname as "<Lname>"
When user click on save button
Then user validates url
Then user close the browser
Examples:
|Fname|Mname|Lname|
|Renu|c|g|
|rohi|test|ing|
|ramu|r|reddy|
|ravindra|c|reddy|


