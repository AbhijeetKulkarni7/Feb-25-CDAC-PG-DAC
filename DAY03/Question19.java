/*
19. Write a program to print the following pattern:
1
1*2
1*2*3
1*2*3*4
1*2*3*4*5


*/

class Question19
{
 public static void main(String args[])
{

   int n = 5 ;
   int k = 1 ; 
 
 // for printing 1 to 5 
  for(int i = 1 ; i<=n ; i++ )
    {
      for(int j = 1 ; j<=i ; j++)
      {
        System.out.print(k);
         k++ ;
        if(j<i)
       {   
         System.out.print("*");

        }
      }
        k = 1 ; 
      System.out.println("");
   }




}
}

