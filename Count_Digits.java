package com.task;

import java.util.Scanner;

public class Count_Digits {
	
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers : ");
		int n = sc.nextInt();
		int digits = 0;
		
		while(n>0) {
			n=n/10;
			digits++;
		}
		
		System.out.println("The Number of digits is "  + digits);
	}

}
