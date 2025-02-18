import java.util.Scanner;

class Test11{

 public static void main(String Args[]){
    
     int a , b,c  ;
     Scanner sc = new Scanner(System.in) ;
     System.out.print("Enter first number ");
     a = sc.nextInt();
     System.out.print("Enter second number ");
     b = sc.nextInt();
     System.out.print("Enter third number ");
     c = sc.nextInt();


   if(a>b && a>c) {   
     System.out.println("the largest number is :  " + a);
       } 
    else if (b>a && b>c)
    {
     System.out.println("the largest number is :  " + b);
    } 
   else {
     System.out.println("the largest number is :  " + c);
 }
}

}