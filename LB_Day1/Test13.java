import java.util.Scanner;

class Test13{

 public static void main(String Args[]){
    
     int n1 ,n2 , n3  ;
     Scanner sc = new Scanner(System.in) ;
     System.out.print("Enter First number ");
     n1 = sc.nextInt();
     
       System.out.print("Enter second number ");
     n2 = sc.nextInt();
 
        System.out.print("Enter third number ");
     n3 = sc.nextInt();

     float avg = (float) ( n1 + n2 + n3 )/ 3 ;
      System.out.println("The Avarage is "+ avg ) ;

}

}