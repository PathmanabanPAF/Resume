Feature: Login Action
@regression
@login	
Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters Credentials to LogIn
	| Username   | Password |
    | pathmanaban.govindhan1984@gmail.com | testing |
	Then Message displayed Login Successfully
	
	Scenario: Successful Login with inValid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters Credentials to LogIn
	| Username   | Password |
    | pathmanaban.govindhan1984@gmail.com | testing |
	Then Message displayed Login unSuccessfully