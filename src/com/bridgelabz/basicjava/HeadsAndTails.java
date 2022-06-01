package com.bridgelabz.basicjava;

import java.util.Random;

public class HeadsAndTails 
{
     public static void main(String[] args) 
     {
	     Random randome = new Random();
	     
	     int number = randome.nextInt(2);  //generate random number 0,1
	     
	     if (number==1)
	    	 System.out.println("Head..");
	     else 
	    	 System.out.println("Tail..");
	 }
}
