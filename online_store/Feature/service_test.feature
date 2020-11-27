Feature: Service testing
@regression
@service	
Scenario: Test webdervice
	Given User in Google API page
	When User perform get method
	Then retrieve places
	
