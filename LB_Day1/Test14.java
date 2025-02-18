import java.util.Scanner;

class Test14{

 public static void main(String Args[]){
    
     int n1 ;
     Scanner sc = new Scanner(System.in) ;
    System.out.print("Enter count of febbonacci series ");
    n1 = sc.nextInt();
    
   
  int first = 0, second = 1;
        
        System.out.print("Fibonacci Series: " + first + " " + second);
        
        for (int i = 2; i < n1; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
        

}

}