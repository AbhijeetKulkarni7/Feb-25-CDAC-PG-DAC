/*
   14. Write a program to print the following pattern:
*
**
***
*****
*******
*********

*/

class Question14
{
 public static void main(String args[])
{


  for(int i = 0 ; i<3 ; i++ )
    {
          for(int j = 0 ; j<=i ; j++)
         {
            System.out.print("*");
         }
       System.out.println();
    }
    for(int i = 4 ; i<10 ; i= i+2)
    {
          for(int j = 0 ; j<=i ; j++)
         {
            System.out.print("*");
         }
       System.out.println();
    }

   
  




}
}