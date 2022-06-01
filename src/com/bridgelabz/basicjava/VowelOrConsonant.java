package com.bridgelabz.basicjava;

import java.util.Scanner;

public class VowelOrConsonant 
{
     public static void main(String[] args) {
    	 char ch;
    	 Scanner scanner = new Scanner(System.in);
    	 System.out.println("Enter the Alphabet: " );
    	 
    	 ch = scanner.next().charAt(0);
    	 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'|| ch=='A' || ch=='E' || ch=='I'|| ch=='O' || ch=='U')
    	 {
    		 System.out.println("This Alphabet is vowel : " + ch);
          }else
          {
        	  System.out.println("This Alphabet is Consonant: ");
          }
 

	}
     
     
}
