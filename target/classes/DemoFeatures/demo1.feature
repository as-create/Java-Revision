#Feature: Log in function

#Scenario Outline: Verify user ID and Password with valid inputs

#Given open the application "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
#When user gives valid cridentials "<username>" and "<password>"
#Then validate user is landed on dashboard "Dashboard" or "Invalid credentials"

#Examples:           
#|username|password|
#|Admin   |admin123|      
#|shiv    |admin123|
#|Admin   |pass123 |

@reg
Feature: Log in function

@valid
Scenario: Verify user ID and Password with valid inputs

Given open the application "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When user gives valid cridentials "Admin" and "admin123"
Then validate user is landed on dashboard "Dashboard" or "Invalid credentials"

@invalid
Scenario: Verify user ID and Password with invalid user Id

Given open the application "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When user gives valid cridentials "Ashwini" and "admin123"
Then validate user is landed on dashboard "Dashboard" or "Invalid credentials"

@invalid
Scenario: Verify user ID and Password with invalid password

Given open the application "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When user gives valid cridentials "Admin" and "pass123"
Then validate user is landed on dashboard "Dashboard" or "Invalid credentials"


