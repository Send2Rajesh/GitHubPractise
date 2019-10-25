Feature: Automation practice

@test1
Scenario: Verify valid login
Given User should be in Web Application
Then User should see the Application logo
And User click the Sign-in the home_page
When User enter the Email_id
And User enter the Password
And login_button
And User click the Signout_button

@test2
Scenario: Verify search functionality
Given Valid Url
And User click the Sign in the homepage
When User enter the Emailid
And User enters the Passwd
And User click the login button
And User search for the product
And User click the search icon
And User sort the product by lowest first
And User click the product
And User Increase the quality
And User Click add to cart
And User Click the Continue shopping
And User Click the sign-out button

@test3
Scenario: Verify Add Cart functionality
Given User Enter the valid_Url
And User click the Sign button
When User enter the valid Email
And User enters the valid Password
And User login the Application
And User Mouse Hover the cart
And User click the product
And User change the Product size
And User change the Product color
And Click add to cart
And click continue shopping 
And User click the home button
And Click the sign out

@test4
Scenario: Modify Add Cart 
Given Get valid URL
And Click the Sign button
When Enter the valid Email
And Enter the valid Password
And User click login button
And Mouse hover  to the cart
And Click check out
And delete any one product from the cart
And Click process to checkout
And click again process to checkout
And User click Agree to the terms and conditions
And User click the payment option
And User click the confirm my order button 
And signout