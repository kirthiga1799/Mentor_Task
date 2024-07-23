package com.task;

import java.util.Scanner;

public class String_Uppercase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = sc.nextLine();
		// System.out.println("The Uppercase String is : " + str.toUpperCase());
		System.out.println("Original: " + str);
		System.out.println("Uppercase: " + toUpperCase(str));
	}

	public static String toUpperCase(String str) {
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] >= 'a' && chars[i] <= 'z') {
				chars[i] = (char) (chars[i] - 32);
			}
		}
		return new String(chars);
	}

}
