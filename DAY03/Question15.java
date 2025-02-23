/*
15. Write a program to print the following pattern:
*
**
***
****
*****

*/

class Question15
{
 public static void main(String args[])
{


  for(int i = 0 ; i<5 ; i++ )
    {
          // number of rows in pattern
  
          for(int j = 0 ; j<=i ; j++)
         {  
              System.out.print("*");
         }
       System.out.println();
    }
    
   
}
}