package com.bridgelabz.basicjava;

import java.util.Scanner;

public class PowerOf2 
{
     public static void main(String[] args) 
     {
    	  Scanner scanner = new Scanner(System.in);
    			
          System.out.println("Enter the number power of 2 value: ");
    			
    	  int num = scanner.nextInt();	

    	  int temp = num;
    	  
    	  for ( int i =1; i<2; i++)
    	  {
    		  num = num * num;
    	  }
    	  System.out.println(temp + " Power of 2 is : " + num);
    }

 }