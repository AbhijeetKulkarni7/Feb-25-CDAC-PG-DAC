/*
Write a program to calculate the sum of the digits of the number 9876. The output should be
30 (9 + 8 + 7 + 6).


*/

class Question7 
{

public static void main(String args[])
{


int n = 9876 , res  = 0   ; 

while(n!=0 )
{

  int d = n % 10 ; 
  res = res + d  ; 
  n/=10 ; 


}
 
System.out.println(" " + res);

}
}

















