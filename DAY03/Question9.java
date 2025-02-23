/*
Write a program to find and print the largest digit in the number 4825.


*/

class Question9
{
public static void main(String args[])
{

int n=  4825  ,  max = 0 ; 

  while(n!=0)
  {
  
  int d  = n%10 ; 
  if(d> max)  
   { 
     max = d  ;  
    
   }
   n/=10 ;
  }


System.out.println(max);

}

}

