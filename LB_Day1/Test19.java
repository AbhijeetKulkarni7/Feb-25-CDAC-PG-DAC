import java.util.Scanner;

class Test19{

 public static void main(String Args[]){
    
     int B , P , R = 1;
     Scanner sc = new Scanner(System.in) ;
    System.out.print("Enter Base number:  ");
    B = sc.nextInt(); 
  
   System.out.print("Enter exponent number:  ");
    P = sc.nextInt();
        
   

   for(int i = 1  ; i<= P ; i++)
     {
         R *= B ;
      }        
   
     System.out.println(B + " raised to the power " + P + " is " + R) ;
   
  
    }

}