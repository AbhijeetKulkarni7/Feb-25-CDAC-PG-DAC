/*
20. Write a program to print the following pattern:

5
5*4
5*4*3
5*4*3*2
5*4*3*2*1

*/

class Question20
{
 public static void main(String args[])
{

   int n = 5 ;
   int k = 5 ; 
 
 // for printing 1 to 5 
  for(int i = 1 ; i<=n ; i++ )
    {
      for(int j = 1 ; j<=i ; j++)
      {
        System.out.print(k);
         k-- ;

        if(j<i)
       {   
         System.out.print("*");
        }
      }
        k = 5;
 
      System.out.println("");
   }




}
}

