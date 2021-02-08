Feature: Testing API for BIN Look up

Scenario: Check if the BIN LookUp APIis working correctly
When User sends a POSt request to BIN Look Up API with a Valid BIN


Scenario Outline: Check the API POST request reponse for multiple request
	When User sends the POST request with the information for BIN <BIN> and response with Status code 200 received
	Then Display card details for the given BIN

	Examples:
	| BIN|
	| 461879 |
	| 562345 |

Scenario: Negative Test when API POST request is made with no parameter for required key
When User sends a POST request without any value for parameter BIN status code 400 is returned


Scenario: Negative Test when API POST Request with invalid api-key
When User sends a POST request with a invalid api-key and valid userid and required valid parameter,403 status code is obtained

