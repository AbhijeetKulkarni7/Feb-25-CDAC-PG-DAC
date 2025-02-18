import java.util.Scanner;

class Test20{

 public static void main(String Args[]){
    
     int n , c= 0 ;
     Scanner sc = new Scanner(System.in) ;
    System.out.print("Enter input number:  ");
    n = sc.nextInt(); 
    int R  = n ;
  while(n !=0 ) 
{  
   int d  = n% 10 ; 
     c += 1 ;
    n/= 10 ;
}   
 

     
   
     System.out.println("The number  " + R + " has " + c + " digits ") ;
   
  
    }

}