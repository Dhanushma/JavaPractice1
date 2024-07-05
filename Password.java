package com.prep.misc;

/*Program to check Strength of Password.
A password is said to be strong if it satisfies the following criteria:
	It contains at least one lowercase English character.
	It contains at least one uppercase English character.
	It contains at least one special character.
	The special charactersare:!@#$%^&*(Its length is at least 8. 
	It contains at least one digit.Given a string,find its strength.
	Let a strong password isone that satisfies all above conditions.
	A moderate password is onethat satisfies first three conditions and has length atleast 6. 
	Otherwise password is week.Input:"gfg!@12"Output:ModerateInput:“SapientGlobalMarkets!@12"Output : Strong
*/
public class Password {
	
	public static String passwordCheck(String input) {
		
		if( input.matches(".*[a-z]+.*") && input.matches(".*[A-Z]+.*") && input.matches(".*[0-9]+.*")&& input.length() >=8 && input.matches(".*[!@#$%^&*]+.*")) {
			return "Strong";
		}
		else if(input.matches(".*[a-z]+.*") && input.matches(".*[A-Z]+.*") && input.matches(".*[0-9]+.*")&& input.length() >=6 && input.matches(".*[!@#$%^&*]+.*")) {
			return "Moderate";
		}
		else
			return "Weak";
		
		
	}
	
	public static void main(String[] args) {
		
		//System.out.println(passwordCheck("gfg!@12"));
		//System.out.println(passwordCheck("SapientGlobalMarkets!@12"));
		System.out.println(passwordCheck("abdFghd1j@"));

		
	}

}
