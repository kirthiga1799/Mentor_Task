package com.task;

import java.util.Scanner;

public class LowerToUpper {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		
		String converted = convertString(str);
        System.out.println(converted);

    }

    public static String convertString(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                char firstChar = Character.toLowerCase(word.charAt(0));
                String remainingChars = word.substring(1).toUpperCase();
                result.append(firstChar).append(remainingChars).append(" ");
            }
        }

        return result.toString().trim();
		
	}

}
