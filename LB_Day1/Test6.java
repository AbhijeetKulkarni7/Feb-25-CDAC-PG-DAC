import java.util.Scanner;

class Test6{

 public static void main(String Args[]){
    
     int a , b ;
     Scanner sc = new Scanner(System.in) ;
     System.out.print("Enter first number: ");
     a = sc.nextInt();
     System.out.print("Enter second number: ");
     b = sc.nextInt();

     System.out.println(" output: " + (a+b));
     System.out.println(" output: " + (a-b));
     System.out.println(" output: " + (a*b));
     System.out.println(" output: " + (a/b));
     System.out.println(" output: " + (a%b));
}

}