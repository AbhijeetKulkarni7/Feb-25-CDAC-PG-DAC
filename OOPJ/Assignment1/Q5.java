/*
Write a program to demonstrate binary, octal, hexadecimal, and 
floating-point literals in Java.

*/


 class Q5
 {
	 
	 
     public static void main(String[] args)
	 {
	      
        // Binary literal (prefix: 0b or 0B)
        int binaryNum = 0b1010; // 10 in decimal
        
        // Octal literal (prefix: 0)
        int octalNum = 012; // 10 in decimal
        
        // Hexadecimal literal (prefix: 0x or 0X)
        int hexNum = 0xA; // 10 in decimal
        
        // Floating-point literals
        float floatNum = 10.5f; // 'f' suffix denotes float
        double doubleNum = 20.99; // Default is double
        double scientificNum = 1.23e3; // Scientific notation (1.23 × 10^3 = 1230.0)
        
        // Display the values
        System.out.println("Binary Literal (0b1010): " + binaryNum);
        System.out.println("Octal Literal (012): " + octalNum);
        System.out.println("Hexadecimal Literal (0xA): " + hexNum);
        System.out.println("Float Literal (10.5f): " + floatNum);
        System.out.println("Double Literal (20.99): " + doubleNum);
        System.out.println("Scientific Notation (1.23e3): " + scientificNum);
 
         
          
		 
     }
 }