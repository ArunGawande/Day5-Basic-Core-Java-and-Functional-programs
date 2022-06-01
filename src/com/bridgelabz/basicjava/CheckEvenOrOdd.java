package com.bridgelabz.basicjava;

import java.util.Scanner;

public class CheckEvenOrOdd 
{
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get input from user

        System.out.println("Enter the Number");

        int num = scanner.nextInt();

        // check the remainder is 0 or not

        if (num % 2 == 0) {

            System.out.println("Given Number is even");

        } else

            System.out.println("Given Number is odd");
    }
}
