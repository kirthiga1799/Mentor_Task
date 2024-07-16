package com.task;

import java.util.Scanner;

public class Palindrome_String {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String : ");
		String original = sc.nextLine();

		String reverse = "";

		int length = original.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);

		if (original.equals(reverse))
			System.out.println("The given string is palindrome");
		else
			System.out.println("The given string is not palindrome");

	}

}
