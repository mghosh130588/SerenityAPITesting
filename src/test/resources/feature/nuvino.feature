Feature: Testing API for Bad Text Filter

Scenario: Check if the Bad Text Filter APLI is working correctly
When User sends a POST request

Scenario: Negative Test when API POST request is made with no parameter for required key
When User sends a POST request without any value for parameter status code 400 is returned

Scenario: Negative Test when API POST Request with invalid api-key
When User sends a POST request with a invalid api-key and valid userid and required valid parameter

Scenario Outline: Check the API POST request reponse for multiple request
	When User sends the POST request with the information for content <content> and cencored character <cencoredcharac> and response with Status code 200 received
	Then Display cencored content on console

	Examples:
	| content | cencoredcharac |
	| Sheely goes to home fuck monday | @ |
	| hellow world | # |
	