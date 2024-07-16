package com.task;

import java.util.Scanner;

public class Largest_Number {

public static void main(String[] args) {
		
		int largest, temp;  
	 
		Scanner sc = new Scanner(System.in);  
	  
		System.out.println("Enter the first number:");  
		int a = sc.nextInt();  
		System.out.println("Enter the second number:");  
		int b = sc.nextInt();  
		System.out.println("Enter the third number:");  
		int c = sc.nextInt();  
		
//		temp=a>b?a:b;  
//		largest=c>temp?c:temp;   

        if (a > b) {
            temp = a;
        } else {
            temp = b;
        }

        if (temp > c) {
            largest = temp;
        } else {
            largest = c;
        }
		 
		System.out.println("The largest number is: "+largest);  
	}


}
