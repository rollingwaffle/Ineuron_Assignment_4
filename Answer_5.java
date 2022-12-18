package com.assignment.ineuron;

import java.util.Scanner;

//WAP to implement Anagram Checking least inbuilt methods being used.

public class Answer_5 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter 1st String");
	String str1 = scanner.nextLine();
	System.out.println("Enter second string");
	String str2 = scanner.nextLine();
	
	System.out.println(Answer_5.isAnagram(str1, str2));

	}
	
	public static boolean isAnagram(String str1, String str2) {
	 
	 if (str1.length() != str2.length()) {
			return false;
		}
	 else {
	 int[] nums = new int[26];
	  str1 = str1.toLowerCase();
	  str2 = str2.toLowerCase();
	  
	 for(int i = 0 ; i < str1.length(); i++) {
		 int index = (str1.charAt(i) - 'a') ;
		 nums[index]++;
	 }
	 
	 for(int i = 0 ; i < str2.length(); i++) {
		 int index = (str2.charAt(i) - 'a') ;
		 nums[index]--;
	 }
	 
	 for (int i = 0 ; i < 26; i++) {
		if (nums[i] != 0) {
			 return false;
		}
	} 
	 return true;
 }
	}
}
