import java.util.Scanner;

class Test7{

 public static void main(String Args[]){
    
     int a , b ;
     Scanner sc = new Scanner(System.in) ;
     System.out.print("Enter The Number: ");
     a = sc.nextInt();
     
    for(int i=1 ; i<=10 ; i++) 
       {

            System.out.println(a+" * "+ i +" = " + (a * i) );
        }
}
}