package com.task;

import java.util.Scanner;

public class Strong_Number {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter the number: ");
	        int number = scanner.nextInt();
	        
	        if (isStrongNumber(number)) {
	            System.out.println(number + " is a strong number.");
	        } else {
	            System.out.println(number + " is not a strong number.");
	        }
	    }

	    public static boolean isStrongNumber(int number) {
	        int sum = 0;
	        int temp = number;
	        
	        while (temp > 0) {
	            int digit = temp % 10;
	            sum += factorial(digit);
	            temp /= 10;
	        }
	        
	        return sum == number;
	    }

	    public static int factorial(int digit) {
	        int fact = 1;
	        for (int i = 1; i <= digit; i++) {
	            fact *= i;
	        }
	        return fact;
	    }
	}

