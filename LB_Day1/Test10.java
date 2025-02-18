import java.util.Scanner;

class Test10{

 public static void main(String Args[]){
    
     int a ;
     Scanner sc = new Scanner(System.in) ;
     System.out.print("Enter the number:  ");
     a = sc.nextInt();
    
     if(a%2==0){
     System.out.println("The number "+ a + " is Even.");
     }
    else{
       System.out.println("The number "+ a + " is odd.");

     }
} 

}