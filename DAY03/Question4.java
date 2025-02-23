
/*
Write a program to reverse the digits of the number 1234. The output should be 4321

*/

class Question4 
{

public static void main(String Args[])
{

   int n = 1234 ; 
   int res= 0 ; 

   while(n!=0)
   {
       
     int   d  =  n % 10 ;
      res = res* 10 + d ;
      n/= 10 ;

    
    }
  System.out.println(res) ;
}
}