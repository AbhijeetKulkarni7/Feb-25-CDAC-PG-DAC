public class WhileLoopBreak 
{
public static void main(String[] args) 
{
  int count = 0;
  while (count < 5)
  {
    System.out.print(count + " ");
    count++;
    if (count == 3) break;
  }
 
   System.out.println(count);
 
 }
}
// Guess the output of this while loop.

/*


count        condition                o/p 
0                t                     0
1                t                     1 
2                t                     2 
3   ------------------------------  terminated !

                                         3
o.p actual :
0 1 2 3        

Note : 

Key Difference Between print() and println()
System.out.print(x); → Prints x on the same line and does not move to a new line.
System.out.println(x); → Prints x and moves to the next line.




*/