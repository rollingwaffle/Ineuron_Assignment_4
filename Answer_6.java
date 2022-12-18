package com.assignment.ineuron;

import java.util.Arrays;
import java.util.Scanner;

//WAP to implement Pangram Checking with least inbuilt methods being used.

public class Answer_6 {

	public static void main(String[] args) {
//		String str = "The quick brown  fox jumps over the lazy do";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence to check pangram");
		String str = scanner.nextLine();
		System.out.println(isPangram(str));
	}

	public static boolean isPangram(String str) {

	str = str.toLowerCase();

	int[] alpha = new int[26];
	
	for(int i = 0 ; i < str.length() ; i++) {
		if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' ) {
			int index = (str.charAt(i) - 'a') ;
			 alpha[index]++;
		}
		 
	 }	
	for(int  i = 0 ; i < 26 ;i++) {
		
		if ((alpha[i] == 0)) {
			return false;		
		}
	}
	return true;
}
}
	

