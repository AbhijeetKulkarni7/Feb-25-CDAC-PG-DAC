/* Write a program to calculate the sum of the first 50 natural numbers */

public class Natural
{
public static void main(String[] args) 
{
  int sum = 0 ; 
   for (int i = 1; i <= 50; i++) 
  {
     sum  = sum + i  ;
   }
  System.out.println(sum);
}
}

// NOTE: sum of first n natural numbers : (n(n+1)) / 2 