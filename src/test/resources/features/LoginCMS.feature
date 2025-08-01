Feature: Login Test CMS

   Background: Navigate to Login page for Admin
      Given User navigate to Login Page for Admin "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"

   @regression @device_Window_11 @author_AnhTester
   Scenario: Login success
      When user enter email "admin@yourstore.com" password "admin"
      And click Login button
      Then user is redirected to the Dashboard page