Feature: Sign in page CRM

   @regression @device_Window_10 @author_AnVo
   Scenario Outline: Sign in CRM with an email valid
      Given User navigate to url "<url>"
      When User login with username "<username>" and password "<password>" valid
      Then The user redirect to Dashboard page
      Examples:
         | url                               | username          | password |
         | https://www.saucedemo.com/ | admin@example.com | 123456   |

   @smoke @device_Window_10 @author_AnVo
   Scenario Outline: Sign in CRM with an email invalid
      Given User navigate to url "<url>"
      When User login with username "<username>" and password "<password>" invalid
      Then The user can not redirect to Dashboard page
      And The error message is displays
      Examples:
         | url                               | username         | password |
         | https://www.saucedemo.com/ | demo@example.com | 123456   |