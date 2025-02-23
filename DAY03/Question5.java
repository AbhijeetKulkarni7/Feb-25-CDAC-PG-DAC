/*

Write a program to print the Fibonacci sequence up to the number 21.

*/


class Question5
{

public static void main(String Args[])
{

   int n1 = 0 , n2 = 1 , r  = 0 ; 

  System.out.print(n1 +" "+ n2) ;
  for(int i = 0 ; i<= 20 ; i++)
  {
     if(r == 21 )
    {
     break ; 
    }
    r = n1 + n2 ; 
    System.out.print(" "+ r +" ") ;
    n1 = n2 ;
    n2 = r ; 
   
   } 

}
}












