package com.assignment.ineuron;

//WAP to count the number of consonants, vowels, special characters in a String.

public class Answer_4 {
	public static void main(String[] args) {
		Answer_4.characterType("qwertyuiopasdfghjklmnbvcxz!2123#%^&*");
		
	}	
	
public static	void characterType(String str) {
		int consonants = 0, vowels = 0,specialCharacters = 0,digit = 0;
		str = str.toLowerCase();
		for(int i = 0 ; i < str.length(); i++) {
			if (str.charAt(i) >= (char)(97) && str.charAt(i) <= (char)(122)) {
				if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' 
						|| str.charAt(i) == 'o' || str.charAt(i) == 'u' ) 
					vowels++;
				
				else consonants++;
			}else if (str.charAt(i)>= '0' && str.charAt(i) <= '9') digit++;
			else if (str.charAt(i) != ' ') 
				specialCharacters++;
			else {
				continue;
			} 
		}
		
		System.out.println("Vowel : " + vowels);
		System.out.println("Consonants : " + consonants);
		System.out.println("Special Characters : " + specialCharacters);
		System.out.println("Digits : " + digit);
		
	}
}
