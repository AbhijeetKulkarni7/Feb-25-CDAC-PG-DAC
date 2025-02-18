import java.util.Scanner;

class Test15{

 public static void main(String Args[]){
    
     int n1 ;
     Scanner sc = new Scanner(System.in) ;
    System.out.print("Enter the number :  ");
    n1 = sc.nextInt();
   long fact = 1 ;
         
  for(int i = 1 ; i<= n1 ;i++)
   {
    fact *= i ; 
   }
  System.out.print("Factorial of "+ n1 + " is " + fact);
    }

}