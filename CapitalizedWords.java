package com.task;

import java.util.Scanner;

public class CapitalizedWords {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter a string:");
	        String input = scanner.nextLine();

	        String capitalized = capitalizeEachWord(input);
	        System.out.println(capitalized);

	    }
	public static String capitalizeEachWord(String str) {
		String[] words = str.split("\\s+");
		StringBuilder capitalizedString = new StringBuilder();

		for (String word : words) {
			if (word.length() > 0) {
				capitalizedString.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase())
						.append(" ");
			}
		}

		// Remove the trailing space
		return capitalizedString.toString().trim();
	}
}