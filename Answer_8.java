package com.assignment.ineuron;

import javax.swing.plaf.metal.MetalInternalFrameTitlePane;

//WAP to find the maximum occurring character in a String.

public class Answer_8 {
	public static void main(String[] args) {
		
		String str1 = "abcdeabaeeaeffff";
		
		int[] nums1 = new int[127];
		
		for (int i = 0; i < str1.length(); i++) {
			nums1[str1.charAt(i)] = nums1[str1.charAt(i)] + 1;
		}
		
		System.out.println(nums1[str1.charAt(0)]);
		
//
//		for (int i = 0; i < str1.length(); i++) {
//			int index = (str1.charAt(i) - 'a') ;
//			 nums1[index]++;
//		}
//		for (int i = 0; i < 26; i++) {			
//			System.out.print(nums1[i]);
//		}
//		System.out.println();
//		System.out.println("***********************************");
//		int max = nums1[0];
//		int index1 = 0;
//		for (int i = 0; i < 26; i++) {			
//			if (max < nums1[i]) {
//				max = nums1[i];
//			}		
//		}
//	
//		System.out.println((char)(index1+97));
	}
}
