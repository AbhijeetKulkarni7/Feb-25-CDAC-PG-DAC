import java.util.Scanner;

class Test9{

 public static void main(String Args[]){
    
     int a , r ;
     float pi = 3.14f ;
     Scanner sc = new Scanner(System.in) ;
     System.out.print("Enter the radius of circle: ");
     r = sc.nextInt();
    
     System.out.println("Area of the circle: " + (pi*r*r));
} 

}