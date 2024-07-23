package com.task;

import java.util.Scanner;

public class Count_String {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        int vowelsCount = 0;
        int capitalLettersCount = 0;
        int smallLettersCount = 0;
        int numbersCount = 0;
        int spacesCount = 0;

        for (char ch : input.toCharArray()) {
            if (isVowel(ch)) {
                vowelsCount++;
            }
            if (Character.isUpperCase(ch)) {
                capitalLettersCount++;
            } else if (Character.isLowerCase(ch)) {
                smallLettersCount++;
            }
            if (Character.isDigit(ch)) {
                numbersCount++;
            }
            if (Character.isWhitespace(ch)) {
                spacesCount++;
            }
        }

        System.out.println("Vowels: " + vowelsCount);
        System.out.println("Capital Letters: " + capitalLettersCount);
        System.out.println("Small Letters: " + smallLettersCount);
        System.out.println("Numbers: " + numbersCount);
        System.out.println("Spaces: " + spacesCount);

        scanner.close();
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

}
