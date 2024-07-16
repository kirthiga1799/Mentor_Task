package com.task;

import java.util.Scanner;

public class Palindrome_Number {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int n = sc.nextInt();
		
		int temp,r,sum=0;
		
		temp = n;
		while(n>0) {
			r=n%10;
			sum = (sum*10)+r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("The Given Number is Palindrome");
		}else {
			System.out.println("The Given Number is not a Palindrome");
		}
		

}
}
