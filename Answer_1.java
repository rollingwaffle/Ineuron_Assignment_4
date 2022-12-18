package com.assignment.ineuron;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Remove duplicate character from a string

public class Answer_1 {
	public static void main(String[] args) {
		
		// 1st Approach
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a String from which duplicate characters to be removed");
//		String str = sc.nextLine();
//		
//		StringBuilder sb = new StringBuilder();
//		
//		for(int i = 0; i<str.length();i++) {
//			char ch = str.charAt(i);
//			int index = str.indexOf(ch,i+1);
//			
//			if (index == -1) {
//				sb.append(ch);
//			}
//		}
//		System.out.println(sb);
		
		//2nd Approach
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a String from which duplicate characters to be removed");
//		String str = sc.nextLine();
//		
//		StringBuilder sb = new StringBuilder();
//		
//		char[] arr = str.toCharArray();
//	
//		for(int i = 0;i < arr.length ; i++) {
//			boolean repeated = false;
//			for(int j = i+1 ; j<arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					repeated = true;
//					break;	
//				}
//			}
//			if (!repeated) {
//				sb.append(arr[i]);
//			}
//		}
//		System.out.println(sb);
		
//      3rd Approach
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String from which duplicate characters to be removed");
		String str = sc.nextLine();
		
		StringBuilder sb = new StringBuilder();
		
		Set<Character> set = new HashSet<>();
		
		for(int i = 0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		for (Character character : set) {
			sb.append(character);
		}
		System.out.println(sb);
	}
}
