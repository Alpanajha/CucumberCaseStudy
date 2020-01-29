Feature: Register 
@register 
Scenario: Register on TestMeApp 
	Given user open TestMeApp 
	When user click signup 
	And enter username as "Alpana" 
	And enter first name as "Alpana" 
	And enter last name as "Jha" 
	And enter password as "Alpana" 
	And enter confirm password as "Alpana" 
	And user select gender as "Female" 
	And enter email as "alpanajha@gmail.com" 
	And enter mobile number as "9007169501" 
	And enter dob as "03/02/1997" 
	And enter address as "Pune,Maharashtra" 
	And enter security question 
	And enter answer as "Blue" 
	Then user registered sucessfully 
	
	
@login 
Scenario: Login using datatable 
	Given user open TestMeApp 
	When user click signin 
	And user enter credentials as 
		|lalitha|
		|Password123|
@search
Scenario: user search products
When user enters product
|Head|
And user finds product
Then user add product to cart

 	
		