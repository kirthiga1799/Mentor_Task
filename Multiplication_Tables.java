package com.task;

import java.util.Scanner;

public class Multiplication_Tables {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number for multiplication table: ");
        int number = scanner.nextInt();
        
        System.out.println("Multiplication table for " + number + ":");
        printMultiplicationTable(number);
    }

    public static void printMultiplicationTable(int number) {
        for (int i = 1; i <= 16; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

}
