package com.task;

import java.util.Scanner;

public class SumAndAverage {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements: ");
		int n = scanner.nextInt();

		int sum = 0;
		System.out.println("Enter the numbers: ");
		for (int i = 0; i < n; i++) {
			int num = scanner.nextInt();
			sum += num;
		}

		double average = (double) sum / n;

		System.out.println("Sum: " + sum);
		System.out.println("Average: " + average);

		scanner.close();
	}

}
