package com.bridgelabz.basicjava;

import java.util.Scanner;

public class Factors 
{
 public static void main(String[] args) {
	
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter the number: ");
	 int num = scanner.nextInt();
	 System.out.println("Number to find prime factor is = " + num);
	 
	 for (int i = 2; i < num; i++ )
	 {
		 while( num % i == 0)
		 {
			 System.out.println(i);
			 
			 num = num / i; 
		 }
	 }
	 if (num > 2) {
		 System.out.println(num);
	 }
	 
} 
}
