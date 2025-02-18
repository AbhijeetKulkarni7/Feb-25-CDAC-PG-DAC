import java.util.Scanner;

class Test12{

 public static void main(String Args[]){
    
     int n ,d ,r =0  ;
     Scanner sc = new Scanner(System.in) ;
     System.out.print("Enter the number ");
     n = sc.nextInt();
     int num = n ;
    while(n!=0){
       d = n%10 ;
       r = r*10+ d ;
       n /= 10 ;
       }
   System.out.println("The reverse of "+ num + " is " + r) ;

}

}