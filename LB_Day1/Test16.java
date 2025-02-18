import java.util.Scanner;

class Test16{

 public static void main(String Args[]){
    
     int n1 ;
     Scanner sc = new Scanner(System.in) ;
    System.out.print("Enter the number :  ");
    n1 = sc.nextInt();
            int count = 0 ;
  for(int i = 2 ; i< n1 ;i++)
   {
      if(n1 % i == 0) { count += 1 ; } 
   }
   if(count == 0 ) 
   {
      System.out.println("The number "+ n1 +" is Prime.");
    }
  
    }

}