package com.task;

import java.util.Scanner;

public class Armstrong_100To999 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter the starting number of the range: ");
	        int start = scanner.nextInt();
	        
	        System.out.println("Enter the ending number of the range: ");
	        int end = scanner.nextInt();
	        
	        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
	        for (int number = start; number <= end; number++) {
	            if (isArmstrong(number)) {
	                System.out.print(number + " ");
	            }
	        }
	    }

	    public static boolean isArmstrong(int number) {
	        int sum = 0;
	        int temp = number;
	        int length = String.valueOf(number).length();

	        while (temp > 0) {
	            int digit = temp % 10;
	            sum += Math.pow(digit, length);
	            temp /= 10;
	        }

	        return sum == number;
	    }
	}
