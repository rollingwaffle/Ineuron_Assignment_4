package com.assignment.ineuron;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Duplicates characters from the String.

class Answer_2{
	public static void main(String[] args) {
		
		//1st Approach
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter a string whose duplicate characters should be printed");
//		String string = scanner.nextLine();
//		
//		int arr[] = new int[26];
//		
//		char[] c = string.toCharArray();
//				int index;
//				for(int i = 0; i<string.length();i++) {
//					 index = c[i] - 'a';
//					arr[index]++;
//				}
//			
//				for(int i = 0;i<26;i++) {
//					if (arr[i]>1) {
//						char a = ((char)(i+97));
//						System.out.println(a);
//					}
//					
//				}
				
		//2nd Approach
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string whose duplicate characters should be printed");
		String string = scanner.nextLine();
		
		
		StringBuilder sb = new StringBuilder();
		
		Set<Character> set = new HashSet<>();
		char[] arr = string.toCharArray();
		
		for(int i = 0; i< arr.length ; i++) {
			boolean repeated = false;
			
			for(int j = i+1 ; j <arr.length ; j++) {
				if (arr[i] == arr[j]) {
					repeated = true;
					break;
				}
			}
			if (repeated) {
				set.add(arr[i]);
			}
			
		}
		
		for (char c : set) {
			sb.append(c);
		}
		System.out.println(sb);
   }
}


