/*
Q1: Write a program to swap two numbers without using a third variable and without
using arithmetic operators like + or - .
Hint : Use bitwise XOR ^ operator.
 */
 
 import java.util.* ;


 class Q1
 {
	 
	 
     public static void main(String[] args)
	 { 
	      
		    Scanner scanner = new Scanner(System.in);
        
             System.out.print("Enter first number number: ");
             int a = scanner.nextInt();
		     System.out.print("Enter second number number: ");
			 int b = scanner.nextInt();
        
             
      
		   System.out.println("Before Swap : "  + "a : "+ a +" "+ "b: " +b);
		   
		   a = a ^ b ;
           b = a ^ b ;
           a = a ^ b ; 
           
           	System.out.println("After Swap : "  + "a : "+ a +" "+ "b: " +b); 
			
     }
 }