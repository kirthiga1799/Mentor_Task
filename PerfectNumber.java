package com.task;

import java.util.Scanner;

public class PerfectNumber {
	
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter the number: ");
	        int number = scanner.nextInt();
	        
	        if (isPerfect(number)) {
	            System.out.println(number + " is a perfect number.");
	        } else {
	            System.out.println(number + " is not a perfect number.");
	        }
	    }

	    public static boolean isPerfect(int number) {
	        int sum = 0;
	        
	        for (int i = 1; i <= number / 2; i++) {
	            if (number % i == 0) {
	                sum += i;
	            }
	        }
	        
	        return sum == number;
	    }

}
