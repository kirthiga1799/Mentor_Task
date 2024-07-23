package com.task;

import java.util.Scanner;

public class String_Lowercase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str = sc.nextLine();
		// System.out.println("The Lowercase String is : " + str.toLowerCase());
		System.out.println("Original: " + str);
		System.out.println("Lowercase: " + toLowerCase(str));
	}

	public static String toLowerCase(String str) {
		char[] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] >= 'A' && chars[i] <= 'Z') {
				chars[i] = (char) (chars[i] + 32);
			}
		}
		return new String(chars);
	}

}
