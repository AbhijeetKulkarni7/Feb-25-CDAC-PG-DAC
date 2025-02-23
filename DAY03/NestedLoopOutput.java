
public class NestedLoopOutput
{
 public static void main(String[] args) 
{
    for (int i = 1; i <= 3; i++) 
     {
       for (int j = 1; j <= 2; j++) 
      {
        System.out.print(i + " " + j + " ");
        }
       System.out.println();
    }
}
}
// Guess the output of this nested loop.

/*

DRY RUN ::- 

i    j             o/p 
1    1             1 1 
1    2             1 2 
1    3             terminated !

2    1             2 1 
2    2             2 2 
2    3             terminated !

3    1              3 1 
3    2              3 2 
3    3              terminated !

actual output  : 
1 1 1 2
2 1 2 2 
3 1 3 2


*/