/*
Write a program to check if a number is positive and even using logical operators
 (&&, ||, !).

*/
import java.util.* ;


 class Q11
 {
	 
	 
     public static void main(String[] args)
	 { 
	      
		    Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Check if the number is positive and even using logical operators
        if (num > 0 && num % 2 == 0) {
            System.out.println("The number is positive and even.");
        } else if (num > 0 || num % 2 == 0) {
            System.out.println("The number is either positive or even, but not both.");
        } else {
            System.out.println("The number is neither positive nor even.");
        }
        
		   
     }
 }