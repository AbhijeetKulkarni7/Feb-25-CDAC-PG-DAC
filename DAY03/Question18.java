/*

18. Write a program to print the following pattern:
*
***
*****
*******
*****
***
*

*/


class Question18
{
 public static void main(String args[])
{

   int n = 5 ;

 //  normal triangle of *
  for(int i = 1 ; i<= n-1 ; i++)
  {

   for(int j = 1 ; j<=i ; j++)
         {  
              System.out.print("*");
         }
       System.out.println();


  }


// inverted triangel of *
  for(int i = n ; i>=1 ; i-- )
    {
          
          for(int j = 1 ; j<=i ; j++)
         {  
              System.out.print("*");
         }
       System.out.println();
    }
    
   
}
}



















