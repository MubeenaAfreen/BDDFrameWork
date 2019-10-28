Feature: User Login
    Existing user should be able to login stackoverflow using correct credentials
    
Scenario: Login into account with correct credentials
    Given User navigates to stackoverflow Website
    And User clicks login button on homepage
    And User enters valid username
    And user enters valid password
    When user clicks on Login button
    Then User should be taken to successful login page
    
      