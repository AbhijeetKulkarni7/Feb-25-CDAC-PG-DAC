/*
Write a program to demonstrate the use of assignment operators (=, +=, -=, *=, /=, %=)
 on two integers.
 */
 
 import java.util.* ;


 class Q12
 {
	 
	 
     public static void main(String[] args)
	 { 
	      
		    Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();
        
        // Check if the number is positive and even using logical operators
        int b = 0 , c= 0 , d = 1 , e = 0 , f = 1  ;
         b  +=  a ;
		 c  -=  a ;
		 d  *= a ;
		 e  /= a ;
		 f  %= a ; 
		 
		   int z  = a ; 
		   
		   System.out.println(b  + " +=  "+c +" : "+ + b);
		   System.out.println(c  + " -=  " + c);
	       System.out.println(d  + " *=  " + d);
		   System.out.println(e  +" /=  " + e);
		   System.out.println(f  +" %=  " + f);
		   System.out.println(z  +" =  " + z );
     }
 }