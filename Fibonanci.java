package com.task;

import java.util.Scanner;

public class Fibonanci {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int count = scanner.nextInt();

        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2); // print the first two terms

        for (int i = 2; i < count; ++i) { // start loop from 2 because first two terms are already printed
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
	}

}
