import java.util.Scanner;

class Test8{

 public static void main(String Args[]){
    
     int a , b , c ;
     Scanner sc = new Scanner(System.in) ;
     System.out.print("Enter The first Number: ");
     a = sc.nextInt();
      System.out.print("Enter The second Number: ");
     b = sc.nextInt();

       System.out.println(" Before swap :  ");
       System.out.println(" first Number:  " + a );
       System.out.println(" Second Number  " + b );

     
      a = a ^ b ;
      b= a ^ b ; 
      a= a ^ b ; 
   
     System.out.println(" After swap :   ");
     System.out.println(" first Number:  " + a );
     System.out.println(" Second Number: " + b );


    
  
   }
}