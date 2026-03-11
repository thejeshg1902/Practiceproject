Feature: Parallel execution with different browsers

@login
Scenario: Test login functionality with valid credentials 
Given  User enter valid Username "rajendranayakbv@gmail.com"
And User enter valid Password "password"
Then User clicks on login button

@register
Scenario: User creates an account only with mandatory fields 
Given User navigates to Register Account page
When User enters the details into below fields
|First Name|Rajendra|
|Last Name|nayak|
|E-Mail|rajendranayak300696@gmail.com|
|Telephone|7090375567|
|Password|Rajendra@123|
|Password Confirm|Rajendra@123|
And User selects Privacy Policy
And User clicks on Continue button
Then User account should get created successfully

@login1
Scenario: To test login functionality with valid Username and password 
Given  User enter valid EMailAddress "rajendranayakbv@gmail.com"
And User entered valid Password "Rajendra@123"
Then User click on login Button
