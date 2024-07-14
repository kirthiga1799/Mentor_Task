package com.task;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int remainder, reverse = 0;

		while (n > 0) {
			remainder = n % 10;
			reverse = reverse * 10 + remainder;
			n = n / 10;

		}
		System.out.println("The reverse number is : " + reverse);

	}

}
