// Snippet 4:


public class DoWhileLoop 
{
  public static void main(String[] args) {
  int i = 1;
  do 
  {
     System.out.print(i + " ");
     i++;
    } while (i < 5);
   
    System.out.println(i);
}
}


// Guess the output of this do-while loop.

/*

i         conditioan              o/p           i++ 
1                                   1             2 
2            t                      2             3
3            t                      3             4  
4            t                      4             5    
5            F   --------------------- Terminated !

                                   5  
actual  o/p : 
1 2 3 4 5 



*/