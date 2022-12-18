package com.assignment.ineuron;

//palindrome 

public class Answer_3 {
	public static void main(String[] args) {
		                        
		int num = 2552;	
		String string = String.valueOf(num);
		StringBuilder sb = new StringBuilder();
		
		for(int i = string.length()-1 ; i >= 0 ; i--) {
			sb.append(string.charAt(i));
		}
		String string2 = sb.toString();
		if (string.equals(string2)) {
			System.out.println(num + " is a palindrome");
		}else {
			System.out.println(num +  " not a palindrome");
		}
	}
}
