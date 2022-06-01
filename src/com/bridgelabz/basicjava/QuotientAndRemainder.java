package com.bridgelabz.basicjava;

import java.util.Scanner;

public class QuotientAndRemainder 
{
     public static void main(String[] args) 
     {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Divident Number : ");
		int divident = scanner.nextInt();
		
		System.out.print("Enter Divisor Number: ");
		int divisor = scanner.nextInt();
		
		int quotient = divident/ divisor;
		int remainder = divident % divisor;
		
		System.out.println("The Quotient is = " + quotient);
		System.out.println("THe Remainder is = " + remainder);
	}
}
