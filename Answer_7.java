package com.assignment.ineuron;

import java.util.Scanner;

//WAP to find if String contains all unique characters.

public class Answer_7 {

	public static void main(String[] args) {
//		String str = " World ";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string to check if it contains all unique characters");
		String str = scanner.nextLine();
		System.out.println(containsUniqueChar(str));
	}

	public static boolean containsUniqueChar(String str) {

	str = str.toLowerCase();

	int[] alpha = new int[26];
	
	for(int i = 0 ; i < str.length() ; i++) {
		if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' ) {
			int index = (str.charAt(i) - 'a') ;
			 alpha[index]++;
		}
		 
	 }	
	for(int  i = 0 ; i < 26 ;i++) {
		
		if (!(alpha[i] <= 1)) {
			return false;		
		}
	}
	return true;
}
}
	

