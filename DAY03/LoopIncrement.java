// Snippet 8:

public class LoopIncrement 
{
public static void main(String[] args) 
{
  int count = 0;
   for (int i = 0; i < 4; i++) 
  {
   count += i++ - ++i;
   }
  System.out.println(count);
}
}
// Guess the output of this code snippet. 
/*

 count  i   count                     o/p : -4
  0      0    -2    
  -2     2    -4           
   -4    4  ---------- terminated !

*/