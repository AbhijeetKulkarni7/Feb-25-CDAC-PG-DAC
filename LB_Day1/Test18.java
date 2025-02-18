import java.util.Scanner;

class Test18{

 public static void main(String Args[]){
    
     int n1 ;
     Scanner sc = new Scanner(System.in) ;
    System.out.print("Enter temperature in celsius :  ");
    n1 = sc.nextInt();
        
  float fara = (n1 * 9/5 ) + 32 ;    
 
       System.out.print(n1 + " C is equal to "+ fara +" F ");
        
   
    
   
  
    }

}