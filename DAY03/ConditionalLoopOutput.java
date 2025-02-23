//Snippet 5:

public class ConditionalLoopOutput {
public static void main(String[] args) {
int num = 1;
  for (int i = 1; i <= 4; i++) 
  {
     if (i % 2 == 0) 
      {
        num += i;
       } 
     else
       {
        num -= i;
       }
   }

   System.out.println(num);
}
}
// Guess the output of this loop

/*

num     i       (inc/ dec)num      o/p    
1       1            0             
0       2            2             
2       3            -1               
-1      4             3              
6       5  -------------  terminated !
                             
                                     3 
*/