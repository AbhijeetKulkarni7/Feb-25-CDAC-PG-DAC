import java.util.*; 

class Calculator{

public static void main(String Args[])
{

 Scanner sc = new Scanner(System.in);
 
  System.out.println("Welcome to calculator ! ");
  System.out.println("enter 1 : for addition ");
  System.out.println("enter 2 : for substraction ");
  System.out.println("enter 3 : for multiplication ");
  System.out.println("enter 4 : for division ");
  System.out.println(" Choose one from above to calculate ");
       int op =  sc.nextInt(); 
   System.out.println("enter the  first number : ");
    int num1 = sc.nextInt(); 
   
    System.out.println("enter the  second  number: ");
    int num2 = sc.nextInt(); 
   int set = 0 ;

  if((op==4) && (num2 == 0))
  {
   System.out.print(" undefined !");
   set = 1 ; 
  }

  switch(op)
  {

  case 1 :
            
           System.out.print("Result : " + (num1 + num2));
           break;


  case 2 :
          System.out.print("Result : " + (num1 - num2));
           break;

 case 3 :  
           System.out.print("Result : " + (num1 * num2));
           break;
  case 4 : 
            if(set == 0){
           System.out.print("Result : " + (num1 / num2));
           }
           break;

    default: 
           System.out.print(" please choose between 1- 4 " );
           break;
  }




}
}